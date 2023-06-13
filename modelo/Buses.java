/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

import java.util.Objects;

/**
 *
 * @author
 */
public class Buses extends Automovil{
    
    private int numpasajeros;
    private float pesoequipaje;
    private String tamaño;

    public Buses() {
    }
    
    

    public Buses(int numpasajeros, float pesoequipaje, String tamaño, String placa, int numerodecilindros, float cilindraje, String marca, float precio, String color, int numchasis, int nummotor, int numpuertas, int tamllanta, String transmisión, int numcambios, float galoneskilometro, String tipogasolina) {
        super(placa, numerodecilindros, cilindraje, marca, precio, color, numchasis, nummotor, numpuertas, tamllanta, transmisión, numcambios, galoneskilometro, tipogasolina);
        this.numpasajeros = numpasajeros;
        this.pesoequipaje = pesoequipaje;
        this.tamaño=tamaño;
    }

    public int getNumpasajeros() {
        return numpasajeros;
    }

    public void setNumpasajeros(int numpasajeros) {
        this.numpasajeros = numpasajeros;
    }

    public float getPesoequipaje() {
        return pesoequipaje;
    }

    public void setPesoequipaje(float pesoequipaje) {
        this.pesoequipaje = pesoequipaje;
    }

    public String getTamaño() {
        return tamaño;
    }

    public void setTamaño(String tamaño) {
        this.tamaño = tamaño;
    }

    @Override
    public String toString() {
        return "Buses{" + "numpasajeros=" + numpasajeros + ", pesoequipaje=" + pesoequipaje + ", tamaño=" + tamaño + '}'+super.toString();
    }
    
}
