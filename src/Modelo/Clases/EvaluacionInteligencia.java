/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo.Clases;

import Controlador.Coordinador;
import Modelo.Dao.EvaluacionInteligenciaDao;
import Modelo.Vo.EvaluacionInteligenciaVo;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author REYCOG
 */
public class EvaluacionInteligencia {

    private String resultado;
    EvaluacionInteligenciaDao miEvaluacionInteligenciaDao;
    Coordinador miCoordinador;

    public EvaluacionInteligencia() {
        this.miEvaluacionInteligenciaDao = new EvaluacionInteligenciaDao();
    }

    public boolean consultaCuestionaEvaluacion(EvaluacionInteligenciaVo miEvaluacionInteligenciaVo) {
        return miEvaluacionInteligenciaDao.consultaCuestionaEvaluacion(miEvaluacionInteligenciaVo);
    }

    public boolean registrarEvaluacionIntBd(EvaluacionInteligenciaVo miEvaluacionInteligenciaVo, int idPersonal) {
        miEvaluacionInteligenciaVo.setResultado(determinarResultadoPuntajeEvaluacion(miEvaluacionInteligenciaVo));
        return miEvaluacionInteligenciaDao.registrarEvaluacionIntBd(miEvaluacionInteligenciaVo, idPersonal);
    }

    public String determinarResultadoPuntajeEvaluacion(EvaluacionInteligenciaVo miEvaluacionInteligenciaVo) {
        if (miEvaluacionInteligenciaVo.getPuntaje() <= 16) {
            resultado = "DEFICIENTE";
            return resultado;
        } else if (miEvaluacionInteligenciaVo.getPuntaje() > 16 && miEvaluacionInteligenciaVo.getPuntaje() <= 25) {
            resultado = "INFERIOR AL TERMINO MEDIO";
            return resultado;
        } else if (miEvaluacionInteligenciaVo.getPuntaje() > 25 && miEvaluacionInteligenciaVo.getPuntaje() <= 31) {
            resultado = "TERMINO MEDIO";
            return resultado;
        } else if (miEvaluacionInteligenciaVo.getPuntaje() > 31 && miEvaluacionInteligenciaVo.getPuntaje() <= 40) {
            resultado = "SUPERIOR TERMINO MEDIO";
            return resultado;

        } else if (miEvaluacionInteligenciaVo.getPuntaje() > 40 && miEvaluacionInteligenciaVo.getPuntaje() <= 48) {
            resultado = "SUPERIOR";
            return resultado;
        } else {
            resultado = "RESULTADO NO VALIDO";
            return resultado;
        }
    }

    public boolean validarBusquedaIdPersonalConsultado(int idPersonal, JTable miTableEvaluacionBusquedad) {

        ResultSetMetaData rsMd = null;

        ResultSet rs = miEvaluacionInteligenciaDao.consultarBusquedaIdPersonalBd(idPersonal);
        if (rs == null) {//si la consulta es nula, mostrara
            JOptionPane.showMessageDialog(null, "No se encontro el personal con IdPerosnal: " + idPersonal + ", en los registros.");
            return false;
        } else {
            try {
                //Para establecer el modelo al JTable
                DefaultTableModel tabla = new DefaultTableModel() {
                    @Override
                    public boolean isCellEditable(int rowIndex, int vColIndex) {
                        return false; //Para que no se puedan editar los datos desde la tabla
                    }
                };
                miTableEvaluacionBusquedad.setModel(tabla);//se obtiene el modelo
                //Obteniendo la informacion de las columnas que estan siendo consultadas
                rsMd = rs.getMetaData();
                //La cantidad de columnas que tiene la consulta
                int cantidadColumnas = rsMd.getColumnCount();
                //Establecer como cabezeras el nombre de las colimnas
                for (int i = 1; i <= cantidadColumnas; i++) {
                    tabla.addColumn(rsMd.getColumnLabel(i));
                }
                //mostrar los datos encontrados
                while (rs.next()) {
                    Object[] fila = new Object[cantidadColumnas];
                    for (int i = 0; i < cantidadColumnas; i++) {
                        fila[i] = rs.getObject(i + 1);
                    }
                    tabla.addRow(fila);//se agregan fila por fika
                }
                return true;

            } catch (SQLException ex) {
                Logger.getLogger(EvaluacionInteligencia.class.getName()).log(Level.SEVERE, null, ex);
                System.out.println(ex);
                return false;
            }

        }
    }

    public boolean validarConsultaEvaluacionesPersonalConsultado(JTable miTableEvaluacionBusquedad) {

        ResultSetMetaData rsMd = null;

        ResultSet rs = miEvaluacionInteligenciaDao.consultarEvaluacionesPersonalBd();
        if (rs == null) {//si la consulta es nula, mostrara
            JOptionPane.showMessageDialog(null, "No se encontro ningun registro.");
            return false;
        } else {
            try {
                //Para establecer el modelo al JTable
                DefaultTableModel tabla = new DefaultTableModel() {
                    @Override
                    public boolean isCellEditable(int rowIndex, int vColIndex) {
                        return false; //Para que no se puedan editar los datos desde la tabla
                    }
                };
                miTableEvaluacionBusquedad.setModel(tabla);//se obtiene el modelo
                //Obteniendo la informacion de las columnas que estan siendo consultadas
                rsMd = rs.getMetaData();
                //La cantidad de columnas que tiene la consulta
                int cantidadColumnas = rsMd.getColumnCount();
                //Establecer como cabezeras el nombre de las colimnas
                for (int i = 1; i <= cantidadColumnas; i++) {
                    tabla.addColumn(rsMd.getColumnLabel(i));
                }
                //mostrar los datos encontrados
                while (rs.next()) {
                    Object[] fila = new Object[cantidadColumnas];
                    for (int i = 0; i < cantidadColumnas; i++) {
                        fila[i] = rs.getObject(i + 1);
                    }
                    tabla.addRow(fila);//se agregan fila por fika
                }
                return true;

            } catch (SQLException ex) {
                Logger.getLogger(EvaluacionInteligencia.class.getName()).log(Level.SEVERE, null, ex);
                System.out.println(ex);
                return false;
            }

        }
    }

    public void validarEliminarEvaluacionIntBd(int idEvaluacion) {
        if (miEvaluacionInteligenciaDao.eliminarEvaluacionIntBd(idEvaluacion)) {
            JOptionPane.showMessageDialog(null, "La evaluacion con Id: "+idEvaluacion+ " ha sido eliminada");
        } else {
             JOptionPane.showMessageDialog(null, "La evaluacion con Id: "+idEvaluacion+ ", fallo en la eliminacion");
        }
    }

    public int consultarTotalPreguntas() {
        return miEvaluacionInteligenciaDao.consultarTotalPreguntas();
    }

    public void setMiCoordinador(Coordinador miCoordinador) {
        this.miCoordinador = miCoordinador;
    }

}
