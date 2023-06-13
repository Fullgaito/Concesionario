/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import controlador.ControladorCamiones;
import static controlador.ControladorCamiones.arreglocamion;
import java.util.Scanner;
import modelo.Camiones;


/**
 *
 *
 */
public class MenuCamiones {
    
      private Scanner leerdatos; 
      private ControladorCamiones contcamion;

    public MenuCamiones() {
        //Separar memoria para esos objetos
        leerdatos = new Scanner(System.in);
        contcamion = new ControladorCamiones();
        insertarDatosDefecto();
    }
    private void insertarDatosDefecto(){
   
        Camiones camion = new Camiones(3,"Metalica", "OPR432", 1, 2, "Mazda", 4, "Gris", 6, 7, 3, 1, "Mecanica", 2, 4, "Diesel");
        contcamion.insertar(camion);
        camion= new Camiones (2, "Contenedor", "KNM093", 5, 3, "Toyota", 1, "Morado", 2, 4, 6, 2, "Mecanica", 1, 7, "Diesel");
        contcamion.insertar(camion);
         camion = new Camiones (1, "Madera", "AED785", 3, 7, "Honda", 8, "Verde", 4, 1, 2, 5, "Mecanica", 6, 2, "Diesel");
        contcamion.insertar(camion);
    }
    private void modificaruno(){
    System.out.println("Ingrese la placa a modificar");
    Camiones camion = new Camiones();
    camion.setPlaca(leerdatos.next());
    int pos = contcamion.binarySearch(arreglocamion, camion.getPlaca());//saca del array y lo agrega nuevamente sin modificar
    camion.setCilindraje(arreglocamion.get(pos).getCilindraje());
    camion.setGaloneskilometro(arreglocamion.get(pos).getGaloneskilometro());
    camion.setNumcambios(arreglocamion.get(pos).getNumcambios());
    camion.setNummotor(arreglocamion.get(pos).getNummotor());
    camion.setTamllanta(arreglocamion.get(pos).getTamllanta());
    camion.setTransmisión(arreglocamion.get(pos).getTransmisión());
    camion.setPrecio(arreglocamion.get(pos).getPrecio());
    camion.setMarca(arreglocamion.get(pos).getMarca());
    camion.setColor(arreglocamion.get(pos).getColor());
    camion.setNumpuertas(arreglocamion.get(pos).getNumpuertas());
    camion.setTipogasolina(arreglocamion.get(pos).getTipogasolina());
    camion.setNumchasis(arreglocamion.get(pos).getNumchasis());
    camion.setCapcarga(arreglocamion.get(pos).getCapcarga());
    camion.setTipocarro(arreglocamion.get(pos).getTipocarro());
    System.out.println("ingrese Numero de cilindros"); //modifica color 
    camion.setNumerodecilindros(leerdatos.nextInt());
    contcamion.modificar(camion);
   
}
    private void modificardos(){
    System.out.println("Ingrese la placa a modificar");
    Camiones camion = new Camiones();
    camion.setPlaca(leerdatos.next());
    int pos = contcamion.binarySearch(arreglocamion, camion.getPlaca());//saca del array y lo agrega nuevamente sin modificar
    camion.setNumerodecilindros(arreglocamion.get(pos).getNumerodecilindros());
    camion.setGaloneskilometro(arreglocamion.get(pos).getGaloneskilometro());
    camion.setNumcambios(arreglocamion.get(pos).getNumcambios());
    camion.setNummotor(arreglocamion.get(pos).getNummotor());
    camion.setTamllanta(arreglocamion.get(pos).getTamllanta());
    camion.setTransmisión(arreglocamion.get(pos).getTransmisión());
    camion.setPrecio(arreglocamion.get(pos).getPrecio());
    camion.setMarca(arreglocamion.get(pos).getMarca());
    camion.setColor(arreglocamion.get(pos).getColor());
    camion.setNumpuertas(arreglocamion.get(pos).getNumpuertas());
    camion.setTipogasolina(arreglocamion.get(pos).getTipogasolina());
    camion.setNumchasis(arreglocamion.get(pos).getNumchasis());
    camion.setCapcarga(arreglocamion.get(pos).getCapcarga());
    camion.setTipocarro(arreglocamion.get(pos).getTipocarro());
    System.out.println("ingrese Cilindraje"); //modifica color 
    camion.setCilindraje(leerdatos.nextInt());
    contcamion.modificar(camion);
   
}
    private void modificartres(){
    System.out.println("Ingrese la placa a modificar");
    Camiones camion = new Camiones();
    camion.setPlaca(leerdatos.next());
    int pos = contcamion.binarySearch(arreglocamion, camion.getPlaca());//saca del array y lo agrega nuevamente sin modificar
    camion.setCilindraje(arreglocamion.get(pos).getCilindraje());
    camion.setGaloneskilometro(arreglocamion.get(pos).getGaloneskilometro());
    camion.setNumcambios(arreglocamion.get(pos).getNumcambios());
    camion.setNummotor(arreglocamion.get(pos).getNummotor());
    camion.setTamllanta(arreglocamion.get(pos).getTamllanta());
    camion.setTransmisión(arreglocamion.get(pos).getTransmisión());
    camion.setPrecio(arreglocamion.get(pos).getPrecio());
    camion.setNumerodecilindros(arreglocamion.get(pos).getNumerodecilindros());
    camion.setColor(arreglocamion.get(pos).getColor());
    camion.setNumpuertas(arreglocamion.get(pos).getNumpuertas());
    camion.setTipogasolina(arreglocamion.get(pos).getTipogasolina());
    camion.setNumchasis(arreglocamion.get(pos).getNumchasis());
    camion.setCapcarga(arreglocamion.get(pos).getCapcarga());
    camion.setTipocarro(arreglocamion.get(pos).getTipocarro());
    System.out.println("ingrese Marca"); //modifica color 
    camion.setMarca(leerdatos.next());
    contcamion.modificar(camion);
   
}
    private void modificarcuatro(){
    System.out.println("Ingrese la placa a modificar");
    Camiones camion = new Camiones();
    camion.setPlaca(leerdatos.next());
    int pos = contcamion.binarySearch(arreglocamion, camion.getPlaca());//saca del array y lo agrega nuevamente sin modificar
    camion.setCilindraje(arreglocamion.get(pos).getCilindraje());
    camion.setGaloneskilometro(arreglocamion.get(pos).getGaloneskilometro());
    camion.setNumcambios(arreglocamion.get(pos).getNumcambios());
    camion.setNummotor(arreglocamion.get(pos).getNummotor());
    camion.setTamllanta(arreglocamion.get(pos).getTamllanta());
    camion.setTransmisión(arreglocamion.get(pos).getTransmisión());
    camion.setNumerodecilindros(arreglocamion.get(pos).getNumerodecilindros());
    camion.setMarca(arreglocamion.get(pos).getMarca());
    camion.setColor(arreglocamion.get(pos).getColor());
    camion.setNumpuertas(arreglocamion.get(pos).getNumpuertas());
    camion.setTipogasolina(arreglocamion.get(pos).getTipogasolina());
    camion.setNumchasis(arreglocamion.get(pos).getNumchasis());
    camion.setCapcarga(arreglocamion.get(pos).getCapcarga());
    camion.setTipocarro(arreglocamion.get(pos).getTipocarro());
    System.out.println("ingrese Precio"); //modifica color 
    camion.setPrecio(leerdatos.nextFloat());
    contcamion.modificar(camion);
   
}
    private void modificarcinco(){
    System.out.println("Ingrese la placa a modificar");
    Camiones camion = new Camiones();
    camion.setPlaca(leerdatos.next());
    int pos = contcamion.binarySearch(arreglocamion, camion.getPlaca());//saca del array y lo agrega nuevamente sin modificar
    camion.setCilindraje(arreglocamion.get(pos).getCilindraje());
    camion.setGaloneskilometro(arreglocamion.get(pos).getGaloneskilometro());
    camion.setNumcambios(arreglocamion.get(pos).getNumcambios());
    camion.setNummotor(arreglocamion.get(pos).getNummotor());
    camion.setTamllanta(arreglocamion.get(pos).getTamllanta());
    camion.setTransmisión(arreglocamion.get(pos).getTransmisión());
    camion.setPrecio(arreglocamion.get(pos).getPrecio());
    camion.setMarca(arreglocamion.get(pos).getMarca());
    camion.setNumerodecilindros(arreglocamion.get(pos).getNumerodecilindros());
    camion.setNumpuertas(arreglocamion.get(pos).getNumpuertas());
    camion.setTipogasolina(arreglocamion.get(pos).getTipogasolina());
    camion.setNumchasis(arreglocamion.get(pos).getNumchasis());
    camion.setCapcarga(arreglocamion.get(pos).getCapcarga());
    camion.setTipocarro(arreglocamion.get(pos).getTipocarro());
    System.out.println("ingrese Color"); //modifica color 
    camion.setColor(leerdatos.next());
    contcamion.modificar(camion);
   
}
    private void modificarseis(){
    System.out.println("Ingrese la placa a modificar");
    Camiones camion = new Camiones();
    camion.setPlaca(leerdatos.next());
    int pos = contcamion.binarySearch(arreglocamion, camion.getPlaca());//saca del array y lo agrega nuevamente sin modificar
    camion.setCilindraje(arreglocamion.get(pos).getCilindraje());
    camion.setGaloneskilometro(arreglocamion.get(pos).getGaloneskilometro());
    camion.setNumcambios(arreglocamion.get(pos).getNumcambios());
    camion.setNummotor(arreglocamion.get(pos).getNummotor());
    camion.setTamllanta(arreglocamion.get(pos).getTamllanta());
    camion.setTransmisión(arreglocamion.get(pos).getTransmisión());
    camion.setPrecio(arreglocamion.get(pos).getPrecio());
    camion.setMarca(arreglocamion.get(pos).getMarca());
    camion.setColor(arreglocamion.get(pos).getColor());
    camion.setNumpuertas(arreglocamion.get(pos).getNumpuertas());
    camion.setTipogasolina(arreglocamion.get(pos).getTipogasolina());
    camion.setNumerodecilindros(arreglocamion.get(pos).getNumerodecilindros());
    camion.setCapcarga(arreglocamion.get(pos).getCapcarga());
    camion.setTipocarro(arreglocamion.get(pos).getTipocarro());
    System.out.println("ingrese Numero de chasis"); //modifica color 
    camion.setNumchasis(leerdatos.nextInt());
    contcamion.modificar(camion);
   
}
    private void modificarsiete(){
    System.out.println("Ingrese la placa a modificar");
    Camiones camion = new Camiones();
    camion.setPlaca(leerdatos.next());
    int pos = contcamion.binarySearch(arreglocamion, camion.getPlaca());//saca del array y lo agrega nuevamente sin modificar
    camion.setCilindraje(arreglocamion.get(pos).getCilindraje());
    camion.setGaloneskilometro(arreglocamion.get(pos).getGaloneskilometro());
    camion.setNumcambios(arreglocamion.get(pos).getNumcambios());
    camion.setNumerodecilindros(arreglocamion.get(pos).getNumerodecilindros());
    camion.setTamllanta(arreglocamion.get(pos).getTamllanta());
    camion.setTransmisión(arreglocamion.get(pos).getTransmisión());
    camion.setPrecio(arreglocamion.get(pos).getPrecio());
    camion.setMarca(arreglocamion.get(pos).getMarca());
    camion.setColor(arreglocamion.get(pos).getColor());
    camion.setNumpuertas(arreglocamion.get(pos).getNumpuertas());
    camion.setTipogasolina(arreglocamion.get(pos).getTipogasolina());
    camion.setNumchasis(arreglocamion.get(pos).getNumchasis());
    camion.setCapcarga(arreglocamion.get(pos).getCapcarga());
    camion.setTipocarro(arreglocamion.get(pos).getTipocarro());
    System.out.println("ingrese Numero de motor"); //modifica color 
    camion.setNummotor(leerdatos.nextInt());
    contcamion.modificar(camion);
   
}
     private void modificarocho(){
      System.out.println("Ingrese la placa a modificar");
    Camiones camion = new Camiones();
    camion.setPlaca(leerdatos.next());
    int pos = contcamion.binarySearch(arreglocamion, camion.getPlaca());//saca del array y lo agrega nuevamente sin modificar
    camion.setCilindraje(arreglocamion.get(pos).getCilindraje());
    camion.setGaloneskilometro(arreglocamion.get(pos).getGaloneskilometro());
    camion.setNumcambios(arreglocamion.get(pos).getNumcambios());
    camion.setNummotor(arreglocamion.get(pos).getNummotor());
    camion.setTamllanta(arreglocamion.get(pos).getTamllanta());
    camion.setTransmisión(arreglocamion.get(pos).getTransmisión());
    camion.setPrecio(arreglocamion.get(pos).getPrecio());
    camion.setMarca(arreglocamion.get(pos).getMarca());
    camion.setColor(arreglocamion.get(pos).getColor());
    camion.setNumpuertas(arreglocamion.get(pos).getNumpuertas());
    camion.setTipogasolina(arreglocamion.get(pos).getTipogasolina());
    camion.setNumchasis(arreglocamion.get(pos).getNumchasis());
    camion.setCapcarga(arreglocamion.get(pos).getCapcarga());
    camion.setTipocarro(arreglocamion.get(pos).getTipocarro());
    System.out.println("ingrese Numero de motor"); //modifica color 
    camion.setNummotor(leerdatos.nextInt());
    contcamion.modificar(camion);
   
}
  
    private void modificarnueve(){
       System.out.println("Ingrese la placa a modificar");
    Camiones camion = new Camiones();
    camion.setPlaca(leerdatos.next());
    int pos = contcamion.binarySearch(arreglocamion, camion.getPlaca());//saca del array y lo agrega nuevamente sin modificar
    camion.setCilindraje(arreglocamion.get(pos).getCilindraje());
    camion.setGaloneskilometro(arreglocamion.get(pos).getGaloneskilometro());
    camion.setNumcambios(arreglocamion.get(pos).getNumcambios());
    camion.setNummotor(arreglocamion.get(pos).getNummotor());
    camion.setTamllanta(arreglocamion.get(pos).getTamllanta());
    camion.setTransmisión(arreglocamion.get(pos).getTransmisión());
    camion.setPrecio(arreglocamion.get(pos).getPrecio());
    camion.setMarca(arreglocamion.get(pos).getMarca());
    camion.setColor(arreglocamion.get(pos).getColor());
    camion.setNumpuertas(arreglocamion.get(pos).getNumpuertas());
    camion.setTipogasolina(arreglocamion.get(pos).getTipogasolina());
    camion.setNumchasis(arreglocamion.get(pos).getNumchasis());
    camion.setCapcarga(arreglocamion.get(pos).getCapcarga());
    camion.setTipocarro(arreglocamion.get(pos).getTipocarro());
    System.out.println("ingrese el nuevo tamaño de la llanta"); //modifica color 
    camion.setTamllanta(leerdatos.nextInt());
    contcamion.modificar(camion);
   
}
    private void modificardiez(){
       System.out.println("Ingrese la placa a modificar");
    Camiones camion = new Camiones();
    camion.setPlaca(leerdatos.next());
    int pos = contcamion.binarySearch(arreglocamion, camion.getPlaca());//saca del array y lo agrega nuevamente sin modificar
    camion.setCilindraje(arreglocamion.get(pos).getCilindraje());
    camion.setGaloneskilometro(arreglocamion.get(pos).getGaloneskilometro());
    camion.setNumcambios(arreglocamion.get(pos).getNumcambios());
    camion.setNummotor(arreglocamion.get(pos).getNummotor());
    camion.setTamllanta(arreglocamion.get(pos).getTamllanta());
    camion.setTransmisión(arreglocamion.get(pos).getTransmisión());
    camion.setPrecio(arreglocamion.get(pos).getPrecio());
    camion.setMarca(arreglocamion.get(pos).getMarca());
    camion.setColor(arreglocamion.get(pos).getColor());
    camion.setNumpuertas(arreglocamion.get(pos).getNumpuertas());
    camion.setTipogasolina(arreglocamion.get(pos).getTipogasolina());
    camion.setNumchasis(arreglocamion.get(pos).getNumchasis());
    camion.setCapcarga(arreglocamion.get(pos).getCapcarga());
    camion.setTipocarro(arreglocamion.get(pos).getTipocarro());
    System.out.println("ingrese la nueva transmision"); //modifica color 
    camion.setTransmisión(leerdatos.next());
    contcamion.modificar(camion);
   
}
    private void modificaronce(){
       System.out.println("Ingrese la placa a modificar");
    Camiones camion = new Camiones();
    camion.setPlaca(leerdatos.next());
    int pos = contcamion.binarySearch(arreglocamion, camion.getPlaca());//saca del array y lo agrega nuevamente sin modificar
    camion.setCilindraje(arreglocamion.get(pos).getCilindraje());
    camion.setGaloneskilometro(arreglocamion.get(pos).getGaloneskilometro());
    camion.setNumcambios(arreglocamion.get(pos).getNumcambios());
    camion.setNummotor(arreglocamion.get(pos).getNummotor());
    camion.setTamllanta(arreglocamion.get(pos).getTamllanta());
    camion.setTransmisión(arreglocamion.get(pos).getTransmisión());
    camion.setPrecio(arreglocamion.get(pos).getPrecio());
    camion.setMarca(arreglocamion.get(pos).getMarca());
    camion.setColor(arreglocamion.get(pos).getColor());
    camion.setNumpuertas(arreglocamion.get(pos).getNumpuertas());
    camion.setTipogasolina(arreglocamion.get(pos).getTipogasolina());
    camion.setNumchasis(arreglocamion.get(pos).getNumchasis());
    camion.setCapcarga(arreglocamion.get(pos).getCapcarga());
    camion.setTipocarro(arreglocamion.get(pos).getTipocarro());
    System.out.println("ingrese Numero de cambios"); //modifica color 
    camion.setNumcambios(leerdatos.nextInt());
    contcamion.modificar(camion);
   
}
    private void modificardoce(){
        System.out.println("Ingrese la placa a modificar");
    Camiones camion = new Camiones();
    camion.setPlaca(leerdatos.next());
    int pos = contcamion.binarySearch(arreglocamion, camion.getPlaca());//saca del array y lo agrega nuevamente sin modificar
    camion.setCilindraje(arreglocamion.get(pos).getCilindraje());
    camion.setGaloneskilometro(arreglocamion.get(pos).getGaloneskilometro());
    camion.setNumcambios(arreglocamion.get(pos).getNumcambios());
    camion.setNummotor(arreglocamion.get(pos).getNummotor());
    camion.setTamllanta(arreglocamion.get(pos).getTamllanta());
    camion.setTransmisión(arreglocamion.get(pos).getTransmisión());
    camion.setPrecio(arreglocamion.get(pos).getPrecio());
    camion.setMarca(arreglocamion.get(pos).getMarca());
    camion.setColor(arreglocamion.get(pos).getColor());
    camion.setNumpuertas(arreglocamion.get(pos).getNumpuertas());
    camion.setTipogasolina(arreglocamion.get(pos).getTipogasolina());
    camion.setNumchasis(arreglocamion.get(pos).getNumchasis());
    camion.setCapcarga(arreglocamion.get(pos).getCapcarga());
    camion.setTipocarro(arreglocamion.get(pos).getTipocarro());
    System.out.println("ingrese los nuevos galones por kilometro"); //modifica color 
    camion.setGaloneskilometro(leerdatos.nextFloat());
    contcamion.modificar(camion);
   
}
    private void modificartrece(){
      System.out.println("Ingrese la placa a modificar");
    Camiones camion = new Camiones();
    camion.setPlaca(leerdatos.next());
    int pos = contcamion.binarySearch(arreglocamion, camion.getPlaca());//saca del array y lo agrega nuevamente sin modificar
    camion.setCilindraje(arreglocamion.get(pos).getCilindraje());
    camion.setGaloneskilometro(arreglocamion.get(pos).getGaloneskilometro());
    camion.setNumcambios(arreglocamion.get(pos).getNumcambios());
    camion.setNummotor(arreglocamion.get(pos).getNummotor());
    camion.setTamllanta(arreglocamion.get(pos).getTamllanta());
    camion.setTransmisión(arreglocamion.get(pos).getTransmisión());
    camion.setPrecio(arreglocamion.get(pos).getPrecio());
    camion.setMarca(arreglocamion.get(pos).getMarca());
    camion.setColor(arreglocamion.get(pos).getColor());
    camion.setNumpuertas(arreglocamion.get(pos).getNumpuertas());
    camion.setTipogasolina(arreglocamion.get(pos).getTipogasolina());
    camion.setNumchasis(arreglocamion.get(pos).getNumchasis());
    camion.setCapcarga(arreglocamion.get(pos).getCapcarga());
    camion.setTipocarro(arreglocamion.get(pos).getTipocarro());
    System.out.println("ingrese el nuevo tipo de gasolina"); //modifica color 
    camion.setTipogasolina(leerdatos.next());
    contcamion.modificar(camion);
   
}
 private void modificarcatorce(){
    System.out.println("Ingrese la placa a modificar");
    Camiones camion = new Camiones();
    camion.setPlaca(leerdatos.next());
    int pos = contcamion.binarySearch(arreglocamion, camion.getPlaca());//saca del array y lo agrega nuevamente sin modificar
    camion.setCilindraje(arreglocamion.get(pos).getCilindraje());
    camion.setGaloneskilometro(arreglocamion.get(pos).getGaloneskilometro());
    camion.setNumcambios(arreglocamion.get(pos).getNumcambios());
    camion.setNummotor(arreglocamion.get(pos).getNummotor());
    camion.setTamllanta(arreglocamion.get(pos).getTamllanta());
    camion.setTransmisión(arreglocamion.get(pos).getTransmisión());
    camion.setPrecio(arreglocamion.get(pos).getPrecio());
    camion.setMarca(arreglocamion.get(pos).getMarca());
    camion.setColor(arreglocamion.get(pos).getColor());
    camion.setNumpuertas(arreglocamion.get(pos).getNumpuertas());
    camion.setTipogasolina(arreglocamion.get(pos).getTipogasolina());
    camion.setNumchasis(arreglocamion.get(pos).getNumchasis());
    camion.setNumerodecilindros(arreglocamion.get(pos).getNumerodecilindros());
    camion.setTipocarro(arreglocamion.get(pos).getTipocarro());
    System.out.println("ingrese Capacidad de carga"); //modifica color 
    camion.setCapcarga(leerdatos.nextFloat());
    contcamion.modificar(camion);
   
}   
  private void modificarquince(){
    System.out.println("Ingrese la placa a modificar");
    Camiones camion = new Camiones();
    camion.setPlaca(leerdatos.next());
    int pos = contcamion.binarySearch(arreglocamion, camion.getPlaca());//saca del array y lo agrega nuevamente sin modificar
    camion.setCilindraje(arreglocamion.get(pos).getCilindraje());
    camion.setGaloneskilometro(arreglocamion.get(pos).getGaloneskilometro());
    camion.setNumcambios(arreglocamion.get(pos).getNumcambios());
    camion.setNummotor(arreglocamion.get(pos).getNummotor());
    camion.setTamllanta(arreglocamion.get(pos).getTamllanta());
    camion.setTransmisión(arreglocamion.get(pos).getTransmisión());
    camion.setPrecio(arreglocamion.get(pos).getPrecio());
    camion.setMarca(arreglocamion.get(pos).getMarca());
    camion.setColor(arreglocamion.get(pos).getColor());
    camion.setNumpuertas(arreglocamion.get(pos).getNumpuertas());
    camion.setTipogasolina(arreglocamion.get(pos).getTipogasolina());
    camion.setNumchasis(arreglocamion.get(pos).getNumchasis());
    camion.setCapcarga(arreglocamion.get(pos).getCapcarga());
    camion.setNumerodecilindros(arreglocamion.get(pos).getNumerodecilindros());
    System.out.println("ingrese Puertas de cabina"); //modifica color 
    camion.setTipocarro(leerdatos.next());
    contcamion.modificar(camion);
   
}  
    
    private void BorrarUnAuto(){
        System.out.println("Digite la placa a borrar");
        Camiones camion= new Camiones();
        camion.setPlaca(leerdatos.next());
        if (contcamion.borrar(camion))
            System.out.println("Objeto Borrado");
        else
            System.out.println("No pudo borrar el objeto");
    }        
    
    private void leerAutomovil()
    {
         Camiones camion= new Camiones();
        
        System.out.println("Numero de placa");  
        String placa = leerdatos.next(); 
        camion.setPlaca(placa);
        
        System.out.println("Marca");
        camion.setMarca(leerdatos.next());
        
        System.out.println("Color");
        camion.setColor(leerdatos.next());
        
        System.out.println("Precio");
        camion.setPrecio(leerdatos.nextFloat());
        
        System.out.println("Numero de cilindros");
        camion.setNumerodecilindros(leerdatos.nextInt());
        
        System.out.println("Numero de puertas");
        camion.setNumpuertas(leerdatos.nextInt());
        
        System.out.println("Numero de cilindraje");
        camion.setCilindraje(leerdatos.nextFloat());
        
        System.out.println("Numero de chasis");
        camion.setNumchasis(leerdatos.nextInt());
        
        System.out.println("Numero de motor");
        camion.setNummotor(leerdatos.nextInt());
        
        System.out.println("Tamaño de Llanta");
        camion.setTamllanta(leerdatos.nextInt());
        
        System.out.println("Transmision");
        camion.setTransmisión(leerdatos.next());
        
        System.out.println("Numero de cambios");
        camion.setNumcambios(leerdatos.nextInt());
        
        System.out.println("Galones de kilometro");
        camion.setGaloneskilometro(leerdatos.nextFloat());
        
        System.out.println("Tipo gasolina");
        camion.setTipogasolina(leerdatos.next());
        
        System.out.println("Capacidad de carga");
        camion.setCapcarga(leerdatos.nextFloat());
        
        System.out.println("Puertas de cabina");
        camion.setTipocarro(leerdatos.next());

        if(contcamion.insertar(camion))
        {
            System.out.println("Camion insertado");
        }
        else
            System.out.println("Camion NO insertado - placa esta duplicada");
        
    }
    public void consultarunAutomovil()
    {
    System.out.println("Ingrese la placa a consultar");
    Camiones camion = new Camiones();
    camion.setPlaca(leerdatos.next());
    int pos = contcamion.binarySearch(arreglocamion, camion.getPlaca());//saca del array y lo agrega nuevamente sin modificar
    camion.setCilindraje(arreglocamion.get(pos).getCilindraje());
    camion.setGaloneskilometro(arreglocamion.get(pos).getGaloneskilometro());
    camion.setNumcambios(arreglocamion.get(pos).getNumcambios());
    camion.setNummotor(arreglocamion.get(pos).getNummotor());
    camion.setTamllanta(arreglocamion.get(pos).getTamllanta());
    camion.setTransmisión(arreglocamion.get(pos).getTransmisión());
    camion.setPrecio(arreglocamion.get(pos).getPrecio());
    camion.setMarca(arreglocamion.get(pos).getMarca());
    camion.setColor(arreglocamion.get(pos).getColor());
    camion.setNumpuertas(arreglocamion.get(pos).getNumpuertas());
    camion.setTipogasolina(arreglocamion.get(pos).getTipogasolina());
    camion.setNumchasis(arreglocamion.get(pos).getNumchasis());
    camion.setCapcarga(arreglocamion.get(pos).getCapcarga());
    camion.setTipocarro(arreglocamion.get(pos).getTipocarro());
    camion.setNumerodecilindros(arreglocamion.get(pos).getNumerodecilindros());
    camion = (Camiones)contcamion.consultarUno(camion);
    System.out.println(camion);
    }
 public void MenuModif()
{
    System.out.println("1. Modificar Numero de cilindros");
    System.out.println("2. Modificar Cilindraje");
    System.out.println("3. Modificar Marca");
    System.out.println("4. Modificar Precio");
    System.out.println("5. Modificar Color");
    System.out.println("6. Modificar Numero de chasis");
    System.out.println("7. Modificar Numero de motor");
    System.out.println("8. Modificar Numero de puertas");
    System.out.println("9. Modificar Tamaño de llantas");
    System.out.println("10. Modificar Transmision");
    System.out.println("11. Modificar Numero de cambios");
    System.out.println("12. Modificar Galones por kilometro");
    System.out.println("13. Modificar Tipo de gasolina");
    System.out.println("14. Modificar Capacidad de carga");
    System.out.println("15. Modificar Puertas de capina");
    System.out.println("16. Regresar a Menu Principal");
    System.out.println(" Digite su opcion");
    
    int opc = leerdatos.nextInt();    
    switch (opc)
    {
        case 1: 
            modificaruno();
            contcamion.consultarTodos();
            MenuModif();
            break;
        case 2: 
            modificardos();
            contcamion.consultarTodos();
            MenuModif();
            break;
        case 3: 
            modificartres();
            contcamion.consultarTodos();
            MenuModif();
            break;
        case 4:
            modificarcuatro();
            contcamion.consultarTodos();
            MenuModif();
        case 5: 
            modificarcinco();
            contcamion.consultarTodos();
            MenuModif();
            break;
        case 6: 
            modificarseis();
            contcamion.consultarTodos();
            MenuModif();
            break;
        case 7:
            modificarsiete();
            contcamion.consultarTodos();
            MenuModif();
            break;
        case 8:
            modificarocho();
            contcamion.consultarTodos();
            MenuModif();
            break;
        case 9:
            modificarnueve();
            contcamion.consultarTodos();
            MenuModif();
            break;
        case 10:
            modificardiez();
            contcamion.consultarTodos();
            MenuModif();
            break;
        case 11:
            modificaronce();
            contcamion.consultarTodos();
            MenuModif();
            break;
        case 12:
            modificardoce();
            contcamion.consultarTodos();
            MenuModif();
            break;
        case 13:
            modificartrece();
            contcamion.consultarTodos();
            MenuModif();
            break;
        case 14:
            modificarcatorce();
            contcamion.consultarTodos();
            MenuModif();
            break;
        case 15:
            modificarquince();
            contcamion.consultarTodos();
            MenuModif();
            break;
        case 16:
            MenuCamiones();
            break;
           
        default: 
            System.out.println("Opcion no válida");
            System.exit(0);
            break;
        }
    }      
public void MenuCamiones()
{
    System.out.println("1. Insertar Camion");
    System.out.println("2. Consultar todos");
    System.out.println("3. Consultar uno");
    System.out.println("4. Modificar Camiones");
    System.out.println("5. Ordenar Camiones - por Marca Ascendente");
    System.out.println("6. Ordenar Camiones - por Marca Desecendente");
    System.out.println("7. Ordenar Camiones - por Numero de motor");
    System.out.println("8. Borrar Camion");
    System.out.println("9. Regresar a Menu General");
    System.out.println(" Digite su opcion");
    
    int opc = leerdatos.nextInt();    
    switch (opc)
    {
        case 1: 
            leerAutomovil();
            MenuCamiones();
            break;
        case 2: 
            contcamion.consultarTodos();
            MenuCamiones();
            break;
        case 3: 
            consultarunAutomovil();
            MenuCamiones();
            break;
        case 4: 
            MenuModif();
            MenuCamiones();
            break;
        case 5: 
            contcamion.ordenar();
            contcamion.consultarTodos();
            MenuCamiones();
            break;
         case 6:
            contcamion.burbuja();
            contcamion.consultarTodos();
            MenuCamiones();
            break;
        case 7:
            contcamion.ordenar(0,ControladorCamiones.arreglocamion.size()-1);
            contcamion.consultarTodos();
            MenuCamiones();
        case 8: 
            BorrarUnAuto();
            contcamion.consultarTodos();
            MenuCamiones();
            break;
        case 9:
            MenuGeneral regres = new MenuGeneral();
            regres.MenuGeneral();
        default: 
            System.out.println("Opcion no válida");
            System.exit(0);
            break;
        }
    }    

}