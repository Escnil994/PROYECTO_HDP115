/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo.Vo;

/**
 *
 * @author REYCOG
 */
public class AdministradorVo {
   private int idAdmi;
   private String nombre;
   private String contrasena;

    public int getIdAdmin() {
        return idAdmi;
    }

    public void setIdAdmin(int codAdmin) {
        this.idAdmi = codAdmin;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getContrasena() {
        return contrasena;
    }

    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }
}
