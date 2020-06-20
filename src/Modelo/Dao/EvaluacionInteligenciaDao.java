/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo.Dao;

import Modelo.Conexion.Conexion;
import Modelo.Vo.EvaluacionInteligenciaVo;
import static java.lang.Integer.parseInt;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author REYCOG
 */
public class EvaluacionInteligenciaDao extends Conexion {

    private ResultSet rs = null;
    private Connection con = null;
    private String consulta = null;
    private PreparedStatement prepSta = null;

    public int consultarTotalPreguntas() {
        int numeroPreguntas = 0;
        try {
            this.con = conectar();
            consulta = "Select COUNT(IdPregunta) as NumeroPreguntas from CuestionarioInteligencia";
            rs = con.prepareStatement(consulta).executeQuery();
            if (rs.next()) {
                numeroPreguntas = parseInt(rs.getString("NumeroPreguntas"));
            } else {
                numeroPreguntas = 0;
            }

            con.close();

        } catch (SQLException ex) {
            System.out.println(ex);
            Logger.getLogger(EvaluacionInteligenciaDao.class.getName()).log(Level.SEVERE, null, ex);
        }
        return numeroPreguntas;
    }

    public boolean registrarEvaluacionIntBd(EvaluacionInteligenciaVo miEvaluacionInteligenciaVo, int idPersonal) {

        try {
            this.con = conectar(); //se instancia la conexion

            consulta = "INSERT INTO EvaluacionesInteligencia (IdPersonal,Puntaje,Resultado,FechaRealizacion)"
                    + " VALUES (?,?,?,?)";
            prepSta = con.prepareStatement(consulta);
            prepSta.setInt(1, idPersonal);
            prepSta.setInt(2, miEvaluacionInteligenciaVo.getPuntaje());
            prepSta.setString(3, miEvaluacionInteligenciaVo.getResultado());
            prepSta.setString(4, miEvaluacionInteligenciaVo.getFechaRealizacion());
            prepSta.executeUpdate();
            con.close();

            return true;
        } catch (SQLException ex) {
            ;
            Logger.getLogger(PersonalDao.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "error" + ex);
            return false;
        }

    }

    public boolean eliminarEvaluacionIntBd(int idEvaluacion) {

        try {
            this.con = conectar(); 

            consulta = "DELETE FROM EvaluacionesInteligencia WHERE IdEvaluacion = ?";
            prepSta = con.prepareStatement(consulta);
            prepSta.setInt(1, idEvaluacion);
            prepSta.executeUpdate();
            con.close();
            return true;
        } catch (SQLException ex) {
            ;
            Logger.getLogger(PersonalDao.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "error" + ex);
            return false;
        }

    }

    public boolean consultaCuestionaEvaluacion(EvaluacionInteligenciaVo miEvaluacionInteligenciaVo) {
        int sw = 0;
        try {
            consulta = "select * from CuestionarioInteligencia where IdPregunta= ? and Respuesta= ? ";

            this.con = conectar();
            prepSta = con.prepareStatement(consulta);
            prepSta.setInt(1, miEvaluacionInteligenciaVo.getIdPregunta());
            prepSta.setString(2, miEvaluacionInteligenciaVo.getRespuesta());
            rs = prepSta.executeQuery();
            while (rs.next()) {  //Se usa un ciclo while para determinar si hay similitud
                if (rs.getString(1) == null) //Si es null asigna a sw=0 que indica,
                { //que no se encontro ninguna coincidencia
                    sw = 0;
                } else {
                    sw = 1; //Pero si no es igual a null entonces, se asigna sw=1, que indica que se enocntro un regist

                }//con ese nombre de usuario y contrasña.
            }
            con.close();
        } catch (SQLException ex) {
            Logger.getLogger(AdministradorDao.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println(ex);
        }
        if (sw == 1) {
            return true; //retorna true si, sw es igual a 1
        } else {
            return false;        //Se retorna false  si, sw diferente de 1
        }

    }

    public ResultSet consultarBusquedaIdPersonalBd(int idPersonal) {

        try {
            this.con = conectar();
            consulta = "Select * from EvaluacionesInteligencia where IdPersonal = ? order by Puntaje DESC ";
            //se consulta en la tabla productos las descripciones, similares a las ingresadas
            prepSta = con.prepareStatement(consulta);
            prepSta.setInt(1, idPersonal);
            rs = prepSta.executeQuery();
            if (rs == null)//si la consulta es nula, mostrara
            {
                System.out.print("No hay ningun registro con ese idPersonal");
                return rs = null;
            } else {
                return rs;
            }

        } catch (SQLException ex) {
            Logger.getLogger(PersonalDao.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println(ex);
            return rs = null;
        }

    }

    public ResultSet consultarFechaReliazacionEvaluacionesBd(String fechaRealizacion) {

        try {
            this.con = conectar();
            consulta = "Select * from EvaluacionesInteligencia where FechaRealizacion = ? order by Puntaje DESC ";
            //se consulta en la tabla productos las descripciones, similares a las ingresadas
            prepSta = con.prepareStatement(consulta);
            prepSta.setString(1, fechaRealizacion);
            rs = prepSta.executeQuery();
            if (rs == null)//si la consulta es nula, mostrara
            {
                System.out.print("No hay ninguna evaluacion realizada en esa fecha");
                return rs = null;
            } else {
                return rs;
            }

        } catch (SQLException ex) {
            Logger.getLogger(PersonalDao.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println(ex);
            return rs = null;
        }

    }

    public ResultSet consultarEvaluacionesPersonalBd() {

        try {
            this.con = conectar();
            consulta = "Select * from EvaluacionesInteligencia order by Puntaje DESC ";
            //se consulta en la tabla productos las descripciones, similares a las ingresadas
            prepSta = con.prepareStatement(consulta);
            rs = prepSta.executeQuery();
            return rs;
        } catch (SQLException ex) {
            Logger.getLogger(PersonalDao.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println(ex);
            return rs = null;
        }

    }
}
