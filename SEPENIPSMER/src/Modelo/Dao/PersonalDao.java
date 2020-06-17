/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo.Dao;

import Modelo.Conexion.Conexion;
import Modelo.Vo.PersonalVo;
import static java.lang.Integer.parseInt;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author REYCOG
 */
public class PersonalDao extends Conexion {

    private ResultSet rs = null;
    private Connection con = null;
    private String consulta = null;
    private PreparedStatement prepSta = null;

    public boolean registrarPersonalBd(PersonalVo miPersonalVo, int idAdmi) {

        try {
            this.con = conectar(); //se instancia la conexion

            consulta = "INSERT INTO Personal (IdAdmi,Dui, Nombres,Apellidos,Sexo,Estudios,FechaNacimiento,Telefono, Celular, Correo, Direccion)"
                    + " VALUES (?,?,?,?,?,?,?,?,?,?,?)";
            prepSta = con.prepareStatement(consulta);
            prepSta.setInt(1, idAdmi);
            prepSta.setInt(2, miPersonalVo.getDui());
            prepSta.setString(3, miPersonalVo.getNombre());
            prepSta.setString(4, miPersonalVo.getApellido());
            prepSta.setString(5, miPersonalVo.getSexo());
            prepSta.setString(6, miPersonalVo.getEstudio());
            prepSta.setString(7, miPersonalVo.getFechaNacimiento());
            prepSta.setInt(8, miPersonalVo.getTelefono());
            prepSta.setInt(9, miPersonalVo.getCelular());
            prepSta.setString(10, miPersonalVo.getCorreo());
            prepSta.setString(11, miPersonalVo.getDireccion());
            prepSta.executeUpdate();
            con.close();
            //se ejecuta el comando para insertar los datos en la tabla productos
            //se muestra el mensaje de confirmacion
            return true;
        } catch (SQLException ex) {
            ;
            Logger.getLogger(PersonalDao.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "error" + ex);
            return false;
        }

    }

    public boolean consultarValidarDuiUnicoBd(PersonalVo PersonalVo) {
        int sw = 0;
        try {    //metodo para validar que el numero de Dui no este registrado a un miembro del peronal
            consulta = "select Nombres from Personal where Dui= ?";
            this.con = conectar();
            prepSta = con.prepareStatement(consulta);
            prepSta.setInt(1, PersonalVo.getDui());
            rs = prepSta.executeQuery();
            while (rs.next()) {  //Se usa un ciclo while para determinar si hay similitud
                if (rs.getString(1) == null) //Si es null asigna a sw=0 que indica,
                { //que no se encontro ningun usuario con el Dui registrado ingresado anteriormente
                    sw = 0;
                } else {
                    sw = 1; //Pero si no es igual a null entonces, se asigna sw=1, que indica que se enocntro un registron del personal,
                }//con ese Dui.
            }
            con.close();
        } catch (SQLException ex) {
            Logger.getLogger(PersonalDao.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println(ex);
        }
        if (sw == 0) {
            return true; //retorna true si, sw es igual a 1
        } else {
            return false;        //Se retorna false  si, sw diferente de 1
        }

    }

    public ResultSet consultarBusquedaIdPersonalBd(PersonalVo miPersonalVo) {

        try {
            this.con = conectar();
            consulta = "Select * from Personal where IdPersonal=?";
            //se consulta en la tabla productos las descripciones, similares a las ingresadas
            prepSta = con.prepareStatement(consulta);
            prepSta.setInt(1, miPersonalVo.getIdPersonal());
            rs=prepSta.executeQuery();
            if (rs == null)//si la consulta es nula, mostrara
            {
                System.out.print("No hay ningun registro con ese IdPersonal");
                return rs=null;
            } else {
                return rs;
            }
        } catch (SQLException ex) {
            Logger.getLogger(PersonalDao.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println(ex);
            return rs=null;
        } 

    }
    public ResultSet consultarBusquedaNombrePersonalBd(PersonalVo miPersonalVo) {

        try {
            this.con = conectar();
            consulta = "Select * from Personal where Nombres Like '%"+miPersonalVo.getNombre()+"%'";
            //se consulta en la tabla productos las descripciones, similares a las ingresadas
            prepSta = con.prepareStatement(consulta);
            rs=prepSta.executeQuery();
            if (rs == null)//si la consulta es nula, mostrara
            {
                System.out.print("No hay ningun registro con ese Nombre");
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
    
    public boolean actualizarPersonalBd(PersonalVo miPersonalVo) {

        try {
            this.con = conectar(); //se instancia la conexion

            consulta = "Update Personal Set Dui=?,Nombres=?,Apellidos=?,Sexo=?,Estudios=?,FechaNacimiento=?,Telefono=?, Celular=?, Correo=?, Direccion=? Where IdPersonal=?";
            prepSta = con.prepareStatement(consulta);
            prepSta.setInt(1, miPersonalVo.getDui());
            prepSta.setString(2, miPersonalVo.getNombre());
            prepSta.setString(3, miPersonalVo.getApellido());
            prepSta.setString(4, miPersonalVo.getSexo());
            prepSta.setString(5, miPersonalVo.getEstudio());
            prepSta.setString(6, miPersonalVo.getFechaNacimiento());
            prepSta.setInt(7, miPersonalVo.getTelefono());
            prepSta.setInt(8, miPersonalVo.getCelular());
            prepSta.setString(9, miPersonalVo.getCorreo());
            prepSta.setString(10, miPersonalVo.getDireccion());
            prepSta.setInt(11, miPersonalVo.getIdPersonal());
            prepSta.executeUpdate();
            con.close();
            //se ejecuta el comando para insertar los datos en la tabla productos
            //se muestra el mensaje de confirmacion
            return true;
        } catch (SQLException ex) {
            ;
            Logger.getLogger(PersonalDao.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "error" + ex);
            return false;
        }

    }
    public boolean consultaValidarIngresoPersonal(PersonalVo miPersonalVo) {
            int sw = 0;
        try {
            consulta = "select * from Personal where IdPersonal= ? and Dui= ? ";
//Se consulta si el nombte y contraseña del
//usuario coninciden con un registro de la base de datos
//Se selecciona la tabla usuario de la base de datos "dBSepenispmer"

            this.con = conectar();
            prepSta = con.prepareStatement(consulta);
            prepSta.setInt(1, miPersonalVo.getIdPersonal());
            prepSta.setInt(2, miPersonalVo.getDui());
            rs = prepSta.executeQuery();
            while (rs.next()) {  //Se usa un ciclo while para determinar si hay similitud
                if (rs.getString(1) == null) //Si es null asigna a sw=0 que indica,
                { //que no se encontro ningun usuario con el registro ingresado anteriormente
                    sw = 0;
                } else {
                    sw = 1; //Pero si no es igual a null entonces, se asigna sw=1, que indica que se enocntro un registro,
                    miPersonalVo.setIdPersonal( parseInt(rs.getString("IdPersonal"))); //Asignamos el id
                    miPersonalVo.setDui(parseInt(rs.getString("Dui")));
                    miPersonalVo.setNombre(rs.getString("Nombres"));
                     miPersonalVo.setApellido(rs.getString("Apellidos"));
                              miPersonalVo.setSexo(rs.getString("Sexo"));
                              miPersonalVo.setEstudio(rs.getString("Estudios"));
                              miPersonalVo.setFechaNacimiento(rs.getString("FechaNacimiento"));
                              miPersonalVo.setTelefono(parseInt(rs.getString("Telefono")));
                              miPersonalVo.setCelular(parseInt(rs.getString("Celular")));
                              miPersonalVo.setDireccion(rs.getString("Direccion"));                           
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
}
