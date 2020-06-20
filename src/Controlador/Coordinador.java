/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Modelo.Clases.*;
import Modelo.Dao.PersonalDao;
import Modelo.Vo.*;
import Vista.*;
import java.sql.SQLException;
import javax.swing.JLabel;
import javax.swing.JTable;

/**
 *
 * @author REYCOG
 */
public class Coordinador {

    FrmInicioSesion miFrmInicioSesion;
    FrmMenuPrincipal miFrmMenuPrincipal;
    FrmMenuEvaluacion miFrmMenuEvaluacion;
    FrmEvaluacionInteligencia miFrmEvaluacionInt;
    Administrador miAdministrador;
    EvaluacionInteligencia miEvaluacionInteligencia;
    FrmMenuEvaluacion miMenuEvaluacion;
    Personal miPersonal;
    AdministradorVo miCorAdministradorVo;
    PersonalVo miCorPersonalVo;

    //------------Metodos-----------------------------
    
    public void realizarvalidarEliminarPersonalBd(int idPersonal) {
    miPersonal.validarEliminarPersonalBd(idPersonal);
    }
    
    public void realizaValidarEliminarEvaluacionIntBd(int idEvaluacion) {
     miEvaluacionInteligencia.validarEliminarEvaluacionIntBd(idEvaluacion);
    }
    public int relizarconsultarTotalPreguntas() {
        return miEvaluacionInteligencia.consultarTotalPreguntas();
    }
    public boolean cargarConsultaPersonalEvaluacion( JTable miTableEvaluacionBusquedad) {
        return miEvaluacionInteligencia.validarConsultaEvaluacionesPersonalConsultado(miTableEvaluacionBusquedad);
    }

    public boolean cargarBusquedaIdPersonalEvaluacion(int idPersonal, JTable miTableEvaluacionBusquedad) {
        return miEvaluacionInteligencia.validarBusquedaIdPersonalConsultado(idPersonal, miTableEvaluacionBusquedad);
    }

    public boolean realizarRegistrarEvaluacionIntBd(EvaluacionInteligenciaVo miEvaluacionInteligenciaVo, int idPersonal) {
        return miEvaluacionInteligencia.registrarEvaluacionIntBd(miEvaluacionInteligenciaVo, idPersonal);
    }

    public boolean realizarConsultaCuestionaEvaluacion(EvaluacionInteligenciaVo miEvaluacionInteligenciaVo) {
        return miEvaluacionInteligencia.consultaCuestionaEvaluacion(miEvaluacionInteligenciaVo);

    }

    public boolean realizarIngresoComoAdmi(AdministradorVo miAdministradorVo) throws SQLException {
        return miAdministrador.validarIngresarComoAdmi(miAdministradorVo);
    }

    public boolean realizarIngresoComoPersonal(PersonalVo miPersonalVo) throws SQLException {
        return miPersonal.validarIngresoComoPersonal(miPersonalVo);
    }

    public boolean realizarRegistrarPersonal(PersonalVo miPersonalVo, int idAdmi, String fechaActual) {
        return miPersonal.validarRegistrarPersonal(miPersonalVo, idAdmi, fechaActual);
    }

    public boolean realizarActualizarPersonal(PersonalVo miPersonalVo, int duiSelec, String fechaActual) {
        return miPersonal.validarActualizarPersonal(miPersonalVo, duiSelec, fechaActual);
    }

    public boolean cargarBusquedaNombresPersonal(PersonalVo miPersonalVo, JTable miTablePersonalBusquedad) {
        return miPersonal.validarrBusquedaNombresPersonalConsultado(miPersonalVo, miTablePersonalBusquedad);
    }

    public boolean cargarBusquedaIdPersonal(PersonalVo miPersonalVo, JTable miTablePersonalBusquedad) {
        return miPersonal.validarBusquedaIdPersonalConsultado(miPersonalVo, miTablePersonalBusquedad);
    }

    //-------------------Control de vistas------------------------------------
    public void mostrarFmrMenuEvaluacion() {
        this.miFrmMenuEvaluacion.setVisible(true);
    }

    public void cerrarFmrMenuEvaluacion() {
        this.miFrmMenuEvaluacion.setVisible(false);
    }

    public void mostrarFmrEvaluacionInt() {
        this.miFrmEvaluacionInt.setVisible(true);
    }

    public void cerrarFmrEvaluacionInt() {
        this.miFrmEvaluacionInt.setVisible(false);
    }

    public void mostrarFmrInicioSesion() {
        this.miFrmInicioSesion.setVisible(true);
    }

    public void mostrarFrmMenuPrincipal() {
        this.miFrmMenuPrincipal.setVisible(true);
    }

    public void cerrarFrmInicioSesion() {
        this.miFrmInicioSesion.setVisible(false);
    }

    public void cerrarFrmMenuPrincipal() {
        miFrmMenuPrincipal.setVisible(false);
    }

    //-------------------Getter and Setter------------------------------------
    public void setMiPersonal(Personal miPersonal) {
        this.miPersonal = miPersonal;
    }

    public void setMiFrmInicioSesion(FrmInicioSesion miFrmInicioSesion) {
        this.miFrmInicioSesion = miFrmInicioSesion;

    }

    public void setMiFrmMenuPrincipal(FrmMenuPrincipal miFmrMenuPrincipal) {
        this.miFrmMenuPrincipal = miFmrMenuPrincipal;
    }

    public void setMiFrmMenuEvaluacion(FrmMenuEvaluacion miFrmMenuEvaluacion) {
        this.miFrmMenuEvaluacion = miFrmMenuEvaluacion;
    }

    public void setMiFrmEvaluacionInt(FrmEvaluacionInteligencia miFrmEvaluacionInt) {
        this.miFrmEvaluacionInt = miFrmEvaluacionInt;
    }

    public void setMiAdministrador(Administrador miAdministrador) {
        this.miAdministrador = miAdministrador;
    }

    public void setMiEvaluacionInteligencia(EvaluacionInteligencia miEvaluacionInteligencia) {
        this.miEvaluacionInteligencia = miEvaluacionInteligencia;
    }

    public AdministradorVo getMiCorAdministradorVo() {
        return miCorAdministradorVo;
    }

    public void setMiCorAdministradorVo(AdministradorVo miAdministradorVo) {
        this.miCorAdministradorVo = miAdministradorVo;
    }

    public PersonalVo getMiCorPersonalVo() {
        return miCorPersonalVo;
    }

    public void setMiCorPersonalVo(PersonalVo miCorPersonalVo) {
        this.miCorPersonalVo = miCorPersonalVo;
    }

}
