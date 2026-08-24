package Modelo;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import Modelo.Figura_Geometrica;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author LENOVO
 */
public class Superficie_Plana {
    private List<Figura_Geometrica> figurasGeometricas;
    
    public Superficie_Plana(){
        figurasGeometricas = new ArrayList<>();
    }

    public Superficie_Plana(List<Figura_Geometrica> FigurasGeometricas) {
        this.figurasGeometricas = FigurasGeometricas;
    }

    public List<Figura_Geometrica> getFigurasGeometricas() {
        return figurasGeometricas;
    }

    public void setFigura_Geometrica(List<Figura_Geometrica> Figura_Geometrica) {
        this.figurasGeometricas = Figura_Geometrica;
    }
    
    public void agregarFigura (Figura_Geometrica figura){
        figurasGeometricas.add(figura);
    }
    
    public List<Double> obtenerAreas(){
        List<Double> areas = new ArrayList<>();
        
        for (Figura_Geometrica figura : figurasGeometricas){
            areas.add(figura.calcularArea());
        }
        
        return areas;
    }

}
