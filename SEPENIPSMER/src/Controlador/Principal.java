/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Modelo.Clases.*;
import Vista.*;

/**
 *
 * @author REYCOG
 */
public class Principal {

    Coordinador miCoordinador;
    FrmInicioSesion miFrmInicioSesion;
    FrmMenuPrincipal miFrmMenuPrincipal;
    FrmMenuEvaluacion miFrmMenuEvaluacion;
    FrmEvaluacionInteligencia miFrmEvaluacionInt;
    Administrador miAdministrador;
    EvaluacionInteligencia miEvaluacionInteligencia;
    Personal miPersonal;

    public static void main(String[] args) {
        Principal miPrincipal = new Principal();
        miPrincipal.iniciar();
        //   inicio.setVisible(true);
    }

    private void iniciar() {

        this.miCoordinador = new Coordinador();
        this.miFrmMenuPrincipal = new FrmMenuPrincipal();
        this.miFrmEvaluacionInt = new FrmEvaluacionInteligencia();
        this.miFrmInicioSesion = new FrmInicioSesion();
        this.miFrmMenuEvaluacion = new FrmMenuEvaluacion();
        this.miAdministrador = new Administrador();
        this.miEvaluacionInteligencia = new EvaluacionInteligencia();
        this.miPersonal = new Personal();
        
        miAdministrador.setMiCoordinador(miCoordinador);
        miPersonal.setMiCoordinador(miCoordinador);
        miFrmMenuPrincipal.setMiCoordinador(miCoordinador);
        miFrmInicioSesion.setMiCoordinador(miCoordinador);
        miFrmEvaluacionInt.setMiCoordinador(miCoordinador);
        miFrmMenuEvaluacion.setMiCoordinador(miCoordinador);
        miEvaluacionInteligencia.setMiCoordinador(miCoordinador);

        miCoordinador.setMiAdministrador(miAdministrador);
        miCoordinador.setMiEvaluacionInteligencia(miEvaluacionInteligencia);
        miCoordinador.setMiFrmInicioSesion(miFrmInicioSesion);
        miCoordinador.setMiFrmMenuPrincipal(miFrmMenuPrincipal);
        miCoordinador.setMiFrmEvaluacionInt(miFrmEvaluacionInt);
        miCoordinador.setMiFrmMenuEvaluacion(miFrmMenuEvaluacion);
        miCoordinador.setMiPersonal(miPersonal);
        miCoordinador.mostrarFmrInicioSesion();
    }

}
