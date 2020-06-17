/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo.Dao;

import Modelo.Conexion.Conexion;
import static java.lang.Integer.parseInt;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author REYCOG
 */

public class EvaluacionInteligenciaDao extends Conexion {

    private ResultSet rs = null;
    private Connection con = null;
    private String consulta = null;
    private PreparedStatement predSta = null;

    public int ConsultarTotalPreguntas() {
        int numeroPreguntas = 0;
        try {
            this.con = conectar();
            consulta = "Select COUNT(idPregunta) from CuestionarioInteligencia";
            rs = con.prepareStatement(consulta).executeQuery();
            numeroPreguntas=parseInt(rs.getString(1));
            con.close();

        } catch (SQLException ex) {
            System.out.println(ex);
            Logger.getLogger(EvaluacionInteligenciaDao.class.getName()).log(Level.SEVERE, null, ex);
        }
        return numeroPreguntas;
    }
}
