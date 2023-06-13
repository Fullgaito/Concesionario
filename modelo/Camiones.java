/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author
 */
public class Camiones extends Automovil{
    private float capcarga;
    private String tipocarro;

    public Camiones() {
    }
    
    
    public Camiones(int capcarga,String tipocarro, String placa, int numerodecilindros, float cilindraje, String marca, float precio, String color, int numchasis, int nummotor, int numpuertas, int tamllanta, String transmisión, int numcambios, float galoneskilometro, String tipogasolina) {
        super(placa, numerodecilindros, cilindraje, marca, precio, color, numchasis, nummotor, numpuertas, tamllanta, transmisión, numcambios, galoneskilometro, tipogasolina);
        this.capcarga = capcarga;
        this.tipocarro=tipocarro;
    }

    public float getCapcarga() {
        return capcarga;
    }

    public void setCapcarga(float capcarga) {
        this.capcarga = capcarga;
    }

    public String getTipocarro() {
        return tipocarro;
    }

    public void setTipocarro(String tipocarro) {
        this.tipocarro = tipocarro;
    }
    
    

   

   

    @Override
    public String toString() {
        return "Camiones{" + "capcarga=" + capcarga + ", tipocarro=" + tipocarro + '}'+super.toString();
    }
    
    
    
}
