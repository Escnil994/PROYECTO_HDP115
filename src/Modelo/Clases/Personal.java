/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo.Clases;

import Controlador.Coordinador;
import Modelo.Dao.PersonalDao;
import Modelo.Vo.PersonalVo;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import static jdk.nashorn.internal.objects.NativeString.trim;

/**
 *
 * @author REYCOG
 */
public class Personal {

    Coordinador miCoordinador;
    PersonalDao miPersonalDao;
    private int edadMinima = 18;

    public Personal() {
        this.miPersonalDao = new PersonalDao();
    }

    public int validarCalculoEdad(String fechaNacimiento, String fechaEvaluar) {
        int edad = 0;
        DateTimeFormatter fmt = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        LocalDate fechaNac = LocalDate.parse(fechaNacimiento, fmt);
        LocalDate fechaEva = LocalDate.parse(fechaEvaluar, fmt);

        Period periodo = Period.between(fechaNac, fechaEva);
        edad = periodo.getYears();
        return edad;
    }

    public boolean validarCorreo(String correo) {
        Pattern pat = null;
        Matcher mat = null;
        pat = Pattern.compile("^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$");
        mat = pat.matcher(correo);
        if (mat.find()) {
            return true;
        } else {
            return false;
        }
    }

    public boolean validarRegistrarPersonal(PersonalVo miPersonalVo, int idAdmi, String fechaActual) {
        if ((miPersonalVo.getApellido().isEmpty()) || (miPersonalVo.getNombre().isEmpty())
                || (miPersonalVo.getCelular() == 0) || (miPersonalVo.getSexo() == "Seleccionar")
                || (miPersonalVo.getEstudio() == "Seleccionar") || (miPersonalVo.getCorreo().isEmpty())
                || (miPersonalVo.getTelefono() == 0) || (miPersonalVo.getDui() == 0)
                || (miPersonalVo.getDireccion().isEmpty()) || (miPersonalVo.getFechaNacimiento().isEmpty())) //Se valida que no esten vacios los campos
        {
            JOptionPane.showMessageDialog(null, "Faltan campos por llenar");
            return false;
        } else if (!validarCorreo(miPersonalVo.getCorreo())) {
            JOptionPane.showMessageDialog(null, "El campo de correo electronico tiene que tener el siguiente formato nombreUsuario@dominio.com: " + miPersonalVo.getCorreo());
            return false;
        } else if (!(validarCalculoEdad(miPersonalVo.getFechaNacimiento(), fechaActual) >= edadMinima)) {
            JOptionPane.showMessageDialog(null, "La fecha nacimiento a ingresada, no  cumple con el requisito de  edad minima del peronal: \"" + edadMinima + "\" años, "
                    + "para realizar las evaluaciones, edad ingresada: " + validarCalculoEdad(miPersonalVo.getFechaNacimiento(), fechaActual) + " años");
            return false;
        } else if (!(miPersonalDao.consultarValidarDuiUnicoBd(miPersonalVo))) {
            JOptionPane.showMessageDialog(null, "El numero de Dui ingresado, ya se encuentra registrado: " + miPersonalVo.getDui());
            return false;
        } else {
            return miPersonalDao.registrarPersonalBd(miPersonalVo, idAdmi);
        }

    }
     public void validarEliminarPersonalBd(int idPersonal){
     
      if (miPersonalDao.eliminarPersonalBd(idPersonal)) {
            JOptionPane.showMessageDialog(null, "El personal con Id: "+idPersonal+ " ha sido eliminada");
        } else {
             JOptionPane.showMessageDialog(null, "El personal  con Id: "+idPersonal+ ", fallo en la eliminacion");
        }
     }
    public boolean validarActualizarPersonal(PersonalVo miPersonalVo,int duiSelec, String fechaActual) {
        if ((miPersonalVo.getApellido().isEmpty()) || (miPersonalVo.getNombre().isEmpty())
                || (miPersonalVo.getCelular() == 0) || (miPersonalVo.getSexo() == "Seleccionar")
                || (miPersonalVo.getEstudio() == "Seleccionar") || (miPersonalVo.getCorreo().isEmpty())
                || (miPersonalVo.getTelefono() == 0) || (miPersonalVo.getDui() == 0)
                || (miPersonalVo.getDireccion().isEmpty()) || (miPersonalVo.getFechaNacimiento().isEmpty())) //Se valida que no esten vacios los campos
        {
            JOptionPane.showMessageDialog(null, "Faltan campos por llenar");
            return false;
        } else if (!validarCorreo(miPersonalVo.getCorreo())) {
            JOptionPane.showMessageDialog(null, "El campo de correo electronico tiene que tener el siguiente formato nombreUsuario@dominio.com: " + miPersonalVo.getCorreo());
            return false;
        } else if (!(validarCalculoEdad(miPersonalVo.getFechaNacimiento(), fechaActual) >= edadMinima)) {
            JOptionPane.showMessageDialog(null, "La fecha nacimiento a ingresada, no  cumple con el requisito de  edad minima del peronal: \"" + edadMinima + "\" años, "
                    + "para realizar las evaluaciones, edad ingresada: " + validarCalculoEdad(miPersonalVo.getFechaNacimiento(), fechaActual) + " años");
            return false;
        } else if (!(miPersonalDao.consultarValidarDuiUnicoModificacionBd(duiSelec,miPersonalVo))) {
            JOptionPane.showMessageDialog(null, "El numero de Dui ingresado, ya se encuentra registrado: " + miPersonalVo.getDui());
            return false;
        } else {
            return miPersonalDao.actualizarPersonalBd(miPersonalVo);
        }

    }

    public boolean validarrBusquedaNombresPersonalConsultado(PersonalVo miPersonalVo, JTable miTablePersonalBusquedad) {

        ResultSetMetaData rsMd = null;

        ResultSet rs = miPersonalDao.consultarBusquedaNombrePersonalBd(miPersonalVo);
        if (rs == null) {//si la consulta es nula, mostrara
            JOptionPane.showMessageDialog(null, "No se encontro el personal con IdPerosnal: " + miPersonalVo.getNombre() + ", en los registros.");
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
                miTablePersonalBusquedad.setModel(tabla);//se obtiene el modelo
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
            } catch (SQLException ex) {
                Logger.getLogger(Personal.class.getName()).log(Level.SEVERE, null, ex);
                return false;
            } finally {

                return true;
            }
        }
    }

    public boolean validarBusquedaIdPersonalConsultado(PersonalVo miPersonalVo, JTable miTablePersonalBusquedad) {

        ResultSetMetaData rsMd = null;

        ResultSet rs = miPersonalDao.consultarBusquedaIdPersonalBd(miPersonalVo);
        if (rs == null) {//si la consulta es nula, mostrara
            JOptionPane.showMessageDialog(null, "No se encontro el personal con IdPerosnal: " + miPersonalVo.getIdPersonal() + ", en los registros.");
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
                miTablePersonalBusquedad.setModel(tabla);//se obtiene el modelo
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
                Logger.getLogger(Personal.class.getName()).log(Level.SEVERE, null, ex);
                return false;
            }
        }
    }

    public boolean validarIngresoComoPersonal(PersonalVo miPersonalVo) throws SQLException {

        if ((miPersonalVo.getDui() == 0) || (miPersonalVo.getIdPersonal() == 0)) //Se valida que no esten vacios los campos
        {
            JOptionPane.showMessageDialog(null, "Ingrese su ID de personal y Dui"); //Se muestra el mensaje de que estan vacios
            return false;
        } else {       //se valida si al usar el metodo de validacion retorna verdadero
            if (miPersonalDao.consultaValidarIngresoPersonal(miPersonalVo)) {
                //se asigna el Id del administrador
                JOptionPane.showMessageDialog(null, "Bienvenido: " +trim(miPersonalVo.getNombre())+" "+trim(miPersonalVo.getApellido()));
//Muestra el mensaje de bienvenida mas el nombre de usuario  
                return true;
            } else {
                JOptionPane.showMessageDialog(null, "ID de personal o Dui incorrectos"); //pero si la validacion retorna falso se muestra este mensaje
                return false; //limpia campos
            }
        }
    }
    

    

    public void setMiCoordinador(Coordinador miCoordinador) {
        this.miCoordinador = miCoordinador;
    }
}
