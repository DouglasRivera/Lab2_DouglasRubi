/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab2_douglasrubi;

import java.util.ArrayList;

/**
 *
 * @author famii
 */
public class Detective {
    String nombre;
    int edad;
    String nacionalidad;
    int aniosLaborales;
    int nivel;
    ArrayList<Caso> casos;

    public Detective() {
    }

    public Detective(String nombre, int edad, String nacionalidad, int aniosLaborales, int nivel) {
        this.nombre = nombre;
        this.edad = edad;
        this.nacionalidad = nacionalidad;
        this.aniosLaborales = aniosLaborales;
        this.nivel = nivel;
    }

    public ArrayList<Caso> getCasos() {
        return casos;
    }

    public void setCasos(ArrayList<Caso> casos) {
        this.casos = casos;
    }
    
    

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getNacionalidad() {
        return nacionalidad;
    }

    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }

    public int getAniosLaborales() {
        return aniosLaborales;
    }

    public void setAniosLaborales(int aniosLaborales) {
        this.aniosLaborales = aniosLaborales;
    }

    public int getNivel() {
        return nivel;
    }

    public void setNivel(int nivel) {
        this.nivel = nivel;
    }
    
    
}
