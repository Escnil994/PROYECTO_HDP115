/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo.Clases;

import Controlador.Coordinador;
import Modelo.Dao.AdministradorDao;
import Modelo.Dao.PersonalDao;
import Modelo.Vo.AdministradorVo;
import java.sql.SQLException;
import javax.swing.JOptionPane;


/**
 *
 * @author REYCOG
 */
public class Administrador {
 Coordinador miCoordinador;
 AdministradorDao miAdministradorDao;
 public Administrador(){
  this.miAdministradorDao= new AdministradorDao(); 
 }
 public boolean validarIngresarComoAdmi(AdministradorVo miAdministradorVo) throws SQLException{
     
if((miAdministradorVo.getNombre().isEmpty())||(miAdministradorVo.getContrasena().isEmpty())) //Se valida que no esten vacios los campos
        {
            JOptionPane.showMessageDialog(null, "Ingrese su nombre de usuario y contraseña"); //Se muestra el mensaje de que estan vacios
            return false;
        }
        else
        {       //se valida si al usar el metodo de validacion retorna verdadero
                if(miAdministradorDao.consultaValidarAdministrador(miAdministradorVo)){
                     //se asigna el Id del administrador
                    JOptionPane.showMessageDialog(null,"Bienvenido: "+miAdministradorVo.getNombre());//Muestra el mensaje de bienvenida mas el nombre de usuario  
                    return true;
                }
                else{
                    JOptionPane.showMessageDialog(null,"Clave o usuario incorrectos"); //pero si la validacion retorna falso se muestra este mensaje
              return false; //limpia campos
        }
 }
 }

    public void setMiCoordinador(Coordinador miCoordinador) {
        this.miCoordinador = miCoordinador;
    }
 
}
