/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

/**
 *
 * @author franc
 */
public class ciudad {
    private String nombre;
    private Double coordX;
    private Double coordY;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Double getCoordX() {
        return coordX;
    }

    public void setCoordX(Double coordX) {
        this.coordX = coordX;
    }

    public Double getCoordY() {
        return coordY;
    }

    public void setCoordY(Double coordY) {
        this.coordY = coordY;
    }

    public ciudad(String nombre, Double coordX, Double coordY) {
        this.nombre = nombre;
        this.coordX = coordX;
        this.coordY = coordY;
    }
    
}
