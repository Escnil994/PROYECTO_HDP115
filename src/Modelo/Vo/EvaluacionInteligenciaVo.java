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
public class EvaluacionInteligenciaVo {
    private int IdPregunta=0;
    private int puntaje=0;
    private String respuesta;
    private String resultado;
  private String fechaRealizacion;

    public String getFechaRealizacion() {
        return fechaRealizacion;
    }

    public void setFechaRealizacion(String fechaReliacion) {
        this.fechaRealizacion = fechaReliacion;
    }
    public int getIdPregunta() {
        return IdPregunta;
    }

    public void setIdPregunta(int IdPregunta) {
        this.IdPregunta = IdPregunta;
    }

    public int getPuntaje() {
        return puntaje;
    }

    public void setPuntaje(int puntaje) {
        this.puntaje = puntaje;
    }

    public String getRespuesta() {
        return respuesta;
    }

    public void setRespuesta(String respuesta) {
        this.respuesta = respuesta;
    }

    public String getResultado() {
        return resultado;
    }

    public void setResultado(String resultado) {
        this.resultado = resultado;
    }
     
} 
