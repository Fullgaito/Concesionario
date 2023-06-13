/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author 
 */
public class Volquetas extends Automovil{
    private String tamvol;

    public Volquetas() {
    }

    public Volquetas(String tamvol, String placa, int numerodecilindros, float cilindraje, String marca, float precio, String color, int numchasis, int nummotor, int numpuertas, int tamllanta, String transmisión, int numcambios, float galoneskilometro, String tipogasolina) {
        super(placa, numerodecilindros, cilindraje, marca, precio, color, numchasis, nummotor, numpuertas, tamllanta, transmisión, numcambios, galoneskilometro, tipogasolina);
        this.tamvol = tamvol;
    }

    public String getTamvol() {
        return tamvol;
    }

    public void setTamvol(String tamvol) {
        this.tamvol = tamvol;
    }

    @Override
    public String toString() {
        return "Volquetas{" + "tamvol=" + tamvol + '}'+super.toString();
    }

    
    
}
