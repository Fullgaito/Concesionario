/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.util.Objects;

/**
 *
 * @auth
 */
public class Automovil implements Comparable <Automovil> {
    //Atributos son de instancia de clase
     private   String placa;   
     private   int    numerodecilindros;
     private   float  cilindraje;
     private   String marca;
     private   float  precio;
     private   String color;
     private   int    numchasis;
     private   int    nummotor; 
     private   int    numpuertas; 
     private   int    tamllanta;
     private   String transmisión;  
     private   int    numcambios;
     private   float  galoneskilometro;
     private   String tipogasolina;

    public Automovil() {
    }

    public Automovil(String placa, int numerodecilindros, float cilindraje, String marca, float precio, String color, int numchasis, int nummotor, int numpuertas, int tamllanta, String transmisión, int numcambios, float galoneskilometro, String tipogasolina) {
        this.placa = placa;
        this.numerodecilindros = numerodecilindros;
        this.cilindraje = cilindraje;
        this.marca = marca;
        this.precio = precio;
        this.color = color;
        this.numchasis = numchasis;
        this.nummotor = nummotor;
        this.numpuertas = numpuertas;
        this.tamllanta = tamllanta;
        this.transmisión = transmisión;
        this.numcambios = numcambios;
        this.galoneskilometro = galoneskilometro;
        this.tipogasolina = tipogasolina;
    }

     
    
     

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public int getNumerodecilindros() {
        return numerodecilindros;
    }

    public void setNumerodecilindros(int numerodecilindros) {
        this.numerodecilindros = numerodecilindros;
    }

    public float getCilindraje() {
        return cilindraje;
    }

    public void setCilindraje(float cilindraje) {
        this.cilindraje = cilindraje;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getNumchasis() {
        return numchasis;
    }

    public void setNumchasis(int numchasis) {
        this.numchasis = numchasis;
    }

    public int getNummotor() {
        return nummotor;
    }

    public void setNummotor(int nummotor) {
        this.nummotor = nummotor;
    }

    public int getNumpuertas() {
        return numpuertas;
    }

    public void setNumpuertas(int numpuertas) {
        this.numpuertas = numpuertas;
    }

    public int getTamllanta() {
        return tamllanta;
    }

    public void setTamllanta(int tamllanta) {
        this.tamllanta = tamllanta;
    }

    public String getTransmisión() {
        return transmisión;
    }

    public void setTransmisión(String transmisión) {
        this.transmisión = transmisión;
    }

    public int getNumcambios() {
        return numcambios;
    }

    public void setNumcambios(int numcambios) {
        this.numcambios = numcambios;
    }

    public float getGaloneskilometro() {
        return galoneskilometro;
    }

    public void setGaloneskilometro(float galoneskilometro) {
        this.galoneskilometro = galoneskilometro;
    }

    public String getTipogasolina() {
        return tipogasolina;
    }

    public void setTipogasolina(String tipogasolina) {
        this.tipogasolina = tipogasolina;
    }

    @Override
    public String toString() {
        return "Automovil{" + "placa=" + placa + ", numerodecilindros=" + numerodecilindros + ", cilindraje=" + cilindraje + ", marca=" + marca + ", precio=" + precio + ", color=" + color + ", numchasis=" + numchasis + ", nummotor=" + nummotor + ", numpuertas=" + numpuertas + ", tamllanta=" + tamllanta + ", transmision=" + transmisión + ", numcambios=" + numcambios + ", galoneskilometro=" + galoneskilometro + ", tipogasolina=" + tipogasolina + "}";
    }
     
    

    
    @Override
    public int compareTo(Automovil auto){
        
        return(this.getMarca().compareToIgnoreCase(auto.getPlaca())> 1 ? 1:
              (this.getMarca().compareToIgnoreCase(auto.getPlaca())==0 ? 0 :-1));
 
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Automovil other = (Automovil) obj;
        return Objects.equals(this.placa, other.placa);
    }

    
     
     
     
     
    








}//Fin de la clase
