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
public class data_center {
    private String nombre;
    private Double coordX;
    private Double coordY;
    private empresa empresa;
    private int capacidadCPUenHoras;
    private int costoCPUporHora;

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

    public empresa getEmpresa() {
        return empresa;
    }

    public void setEmpresa(empresa empresa) {
        this.empresa = empresa;
    }

    public int getCapacidadCPUenHoras() {
        return capacidadCPUenHoras;
    }

    public void setCapacidadCPUenHoras(int capacidadCPUenHoras) {
        this.capacidadCPUenHoras = capacidadCPUenHoras;
    }

    public int getCostoCPUporHora() {
        return costoCPUporHora;
    }

    public void setCostoCPUporHora(int costoCPUporHora) {
        this.costoCPUporHora = costoCPUporHora;
    }

    public data_center(String nombre, Double coordX, Double coordY, empresa empresa, int capacidadCPUenHoras, int costoCPUporHora) {
        this.nombre = nombre;
        this.coordX = coordX;
        this.coordY = coordY;
        this.empresa = empresa;
        this.capacidadCPUenHoras = capacidadCPUenHoras;
        this.costoCPUporHora = costoCPUporHora;
    }
    
}
