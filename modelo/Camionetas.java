/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author 
 */
public class Camionetas extends Automovil{
    private String traccion;

    public Camionetas() {
    }


    public Camionetas(String traccion, String placa, int numerodecilindros, float cilindraje, String marca, float precio, String color, int numchasis, int nummotor, int numpuertas, int tamllanta, String transmisión, int numcambios, float galoneskilometro, String tipogasolina) {
        super(placa, numerodecilindros, cilindraje, marca, precio, color, numchasis, nummotor, numpuertas, tamllanta, transmisión, numcambios, galoneskilometro, tipogasolina);
        this.traccion = traccion;
    }

    public String getTraccion() {
        return traccion;
    }

    public void setTraccion(String traccion) {
        this.traccion = traccion;
    }

    @Override
    public String toString() {
        return "Camionetas{" + "traccion=" + traccion + '}'+super.toString();
    }
    
    
    

    

  
    
    
    
}
