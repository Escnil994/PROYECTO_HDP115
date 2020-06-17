/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo.Conexion;

import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Conexion {

    private Connection con = null;
 
    String database = "dBSepenipsmer";
    String URL_bd = "jdbc:sqlserver://localhost:1433;databaseName=" + database;
    String usuario = "ues";
    String contraseña = "sepe";

    public Connection conectar() {
        try {
            String controlador = "com.microsoft.sqlserver.jdbc.SQLServerDriver";
            Class.forName(controlador);
            //datos necesarios para la conexion

            //conexion con la bd
            con = DriverManager.getConnection(URL_bd, usuario, contraseña);
        } catch (SQLException ex) {
            Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, ex);
        }
        return con;
    }

}