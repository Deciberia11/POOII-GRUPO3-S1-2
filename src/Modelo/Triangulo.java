package Modelo;


import Modelo.Punto;
import Modelo.Figura_Geometrica;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author LENOVO
 */
public class Triangulo extends Figura_Geometrica{
    private Punto punto1;
    private Punto punto2;
    private Punto punto3;

    public Triangulo() {
        super();
    }

    public Triangulo(String nombre, Punto punto1, Punto punto2, Punto punto3) {
        super(nombre);
        this.punto1 = punto1;
        this.punto2 = punto2;
        this.punto3 = punto3;
    }

    public Punto getPunto1() {
        return punto1;
    }

    public Punto getPunto2() {
        return punto2;
    }

    public Punto getPunto3() {
        return punto3;
    }

    public void setPunto1(Punto punto1) {
        this.punto1 = punto1;
    }

    public void setPunto2(Punto punto2) {
        this.punto2 = punto2;
    }

    public void setPunto3(Punto punto3) {
        this.punto3 = punto3;
    }

    @Override
    public String toString() {
        return "Triángulo: " + getNombre()
            + " tiene 3 Puntos: "
            + getPunto1().toString() + ","
            + getPunto2().toString() + ","
            + getPunto3().toString();
    }
    
    @Override
    public double calcularArea() {

        double lado1 = punto1.calcularDistancia(punto2);
        double lado2 = punto2.calcularDistancia(punto3);
        double lado3 = punto3.calcularDistancia(punto1);

        double semiperimetro =
                (lado1 + lado2 + lado3) / 2;

        return Math.sqrt(
                semiperimetro
                * (semiperimetro - lado1)
                * (semiperimetro - lado2)
                * (semiperimetro - lado3)
        );
    }
    
    @Override
    public boolean esRegular() {

        double lado1 = punto1.calcularDistancia(punto2);
        double lado2 = punto2.calcularDistancia(punto3);
        double lado3 = punto3.calcularDistancia(punto1);

        return Math.abs(lado1 - lado2) < 0.000001
                && Math.abs(lado2 - lado3) < 0.000001;
    }
}
