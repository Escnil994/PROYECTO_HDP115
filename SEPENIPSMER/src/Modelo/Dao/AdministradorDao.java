/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo.Dao;

import Modelo.Conexion.Conexion;
import Modelo.Vo.AdministradorVo;
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
public class AdministradorDao extends Conexion {

    private ResultSet rs = null;
    private Connection con = null;
    private String consulta = null;
    private PreparedStatement ps = null;

    public boolean ConsultaValidarAdministrador(AdministradorVo miAdministradorVo) {
         int idAdmi=0;
            int sw = 0;
        try {
            consulta = "select * from Administrador where Nombre= ? and Contrasena= ? ";
//Se consulta si el nombte y contraseña del
//usuario coninciden con un registro de la base de datos
//Se selecciona la tabla usuario de la base de datos "dBSepenispmer"

            this.con = conectar();
            ps = con.prepareStatement(consulta);
            ps.setString(1, miAdministradorVo.getNombre());
            ps.setString(2, miAdministradorVo.getContrasena());
            rs = ps.executeQuery();
            while (rs.next()) {  //Se usa un ciclo while para determinar si hay similitud
                if (rs.getString(1) == null) //Si es null asigna a sw=0 que indica,
                { //que no se encontro ningun usuario con el registro ingresado anteriormente
                    sw = 0;
                } else {
                    sw = 1; //Pero si no es igual a null entonces, se asigna sw=1, que indica que se enocntro un registro,
                    idAdmi = parseInt(rs.getString("IdAdmi"));
                    miAdministradorVo.setIdAdmin(idAdmi); //Asignamos el id

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
