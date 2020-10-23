/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab2_douglasrubi;

/**
 *
 * @author famii
 */
public class Caso {
    String lugar;
    String descripcion;
    String tipo;
    Detective detective;
    String estado;

    public Caso() {
    }

    public Caso(String lugar, String descripcion, String tipo, Detective detective, String estado) {
        this.lugar = lugar;
        this.descripcion = descripcion;
        this.tipo = tipo;
        this.detective = detective;
        this.estado = estado;
    }

    public String getLugar() {
        return lugar;
    }

    public void setLugar(String lugar) {
        this.lugar = lugar;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public Detective getDective() {
        return detective;
    }

    public void setDective(Detective dective) {
        this.detective = dective;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
    
    
}
