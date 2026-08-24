package Modelo;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author LENOVO
 */
public class Punto {
    private int coordenada_x;
    private int coordenada_y;

    public Punto() {
      
    }
    
    public Punto(int coordenada_x, int coordenada_y) {
        this.coordenada_x = coordenada_x;
        this.coordenada_y = coordenada_y;
    }

    public int getCoordenada_x() {
        return coordenada_x;
    }
    
    public int getCoordenada_y() {
        return coordenada_y;
    }

    public void setCoordenada_x(int coordenada_x) {
        this.coordenada_x = coordenada_x;
    }

    public void setCoordenada_y(int coordenada_y) {
        this.coordenada_y = coordenada_y;
    }

    @Override
    public String toString() {
        return "Punto{" + "coordenada_x=" + coordenada_x + ", coordenada_y=" + coordenada_y + '}';
    }
    
    public double calcularDistancia(){
       return calcularDistancia(new Punto(0, 0));
    }
    
    public double calcularDistancia(Punto otroPunto){
        int dx = otroPunto.getCoordenada_x() - coordenada_x;
        int dy = otroPunto.getCoordenada_y() - coordenada_y;
        
        return Math.sqrt(dx * dx + dy * dy);
    }
}
