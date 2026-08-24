package Modelo;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author LENOVO
 */
public abstract class Figura_Geometrica {
    
    protected String nombre;

    public Figura_Geometrica() {
    }

    public Figura_Geometrica(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombreFigura) {
        this.nombre = nombreFigura;
    }
    
    public abstract double calcularArea();
    
    public abstract boolean esRegular ();
}
