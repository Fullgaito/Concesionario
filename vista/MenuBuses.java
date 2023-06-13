/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import controlador.ControladorBuses;
import static controlador.ControladorBuses.arreglobuses;
import java.util.Scanner;
import modelo.Buses;


/**
 *
 *
 */
public class MenuBuses {
    
      private Scanner leerdatos; 
      private  ControladorBuses contbuses;

    public MenuBuses() {
        //Separar memoria para esos objetos
        leerdatos = new Scanner(System.in);
        contbuses = new ControladorBuses();
        insertarDatosDefecto();
    }
    private void insertarDatosDefecto(){
   
        Buses bus = new Buses(18, 2,"Grande", "SCL314", 6, 5, "Renault", 2000000, "Blanco", 5, 8, 9, 5, "Mecanica", 4, 7, "Diesel");
        contbuses.insertar(bus);
        bus= new Buses (16, 3, "Mediano", "ZCI902", 5, 2, "Audi", 30000000, "Amarillo", 2, 9, 3, 4, "Mecanica", 1, 3, "Diesel");
        contbuses.insertar(bus);
         bus = new Buses(22, 6, "Pequeño", "HJE325", 7, 9, "Mazda", 4000000, "Verde", 3, 2, 1, 8, "Mecanica", 2, 6, "Diesel");
        contbuses.insertar(bus);
    }
    private void modificaruno(){
    System.out.println("Ingrese la placa a modificar");
    Buses bus = new Buses();
    bus.setPlaca(leerdatos.next());
    int pos = contbuses.binarySearch(arreglobuses, bus.getPlaca());//saca del array y lo agrega nuevamente sin modificar
    bus.setCilindraje(arreglobuses.get(pos).getCilindraje());
    bus.setGaloneskilometro(arreglobuses.get(pos).getGaloneskilometro());
    bus.setNumcambios(arreglobuses.get(pos).getNumcambios());
    bus.setNummotor(arreglobuses.get(pos).getNummotor());
    bus.setTamllanta(arreglobuses.get(pos).getTamllanta());
    bus.setTransmisión(arreglobuses.get(pos).getTransmisión());
    bus.setPrecio(arreglobuses.get(pos).getPrecio());
    bus.setMarca(arreglobuses.get(pos).getMarca());
    bus.setColor(arreglobuses.get(pos).getColor());
    bus.setNumpuertas(arreglobuses.get(pos).getNumpuertas());
    bus.setTipogasolina(arreglobuses.get(pos).getTipogasolina());
    bus.setNumchasis(arreglobuses.get(pos).getNumchasis());
    bus.setTamaño(arreglobuses.get(pos).getTamaño());
    bus.setPesoequipaje(arreglobuses.get(pos).getPesoequipaje());
    bus.setNumpasajeros(arreglobuses.get(pos).getNumpasajeros());    
    System.out.println("ingrese Numero de cilindros"); //modifica color 
    bus.setNumerodecilindros(leerdatos.nextInt());
    contbuses.modificar(bus);
   
}
    private void modificardos(){
    System.out.println("Ingrese la placa a modificar");
    Buses bus = new Buses();
    bus.setPlaca(leerdatos.next());
    int pos = contbuses.binarySearch(arreglobuses, bus.getPlaca());//saca del array y lo agrega nuevamente sin modificar
    bus.setNumerodecilindros(arreglobuses.get(pos).getNumerodecilindros());
    bus.setGaloneskilometro(arreglobuses.get(pos).getGaloneskilometro());
    bus.setNumcambios(arreglobuses.get(pos).getNumcambios());
    bus.setNummotor(arreglobuses.get(pos).getNummotor());
    bus.setTamllanta(arreglobuses.get(pos).getTamllanta());
    bus.setTransmisión(arreglobuses.get(pos).getTransmisión());
    bus.setPrecio(arreglobuses.get(pos).getPrecio());
    bus.setMarca(arreglobuses.get(pos).getMarca());
    bus.setColor(arreglobuses.get(pos).getColor());
    bus.setNumpuertas(arreglobuses.get(pos).getNumpuertas());
    bus.setTipogasolina(arreglobuses.get(pos).getTipogasolina());
    bus.setNumchasis(arreglobuses.get(pos).getNumchasis());
    bus.setTamaño(arreglobuses.get(pos).getTamaño());
    bus.setPesoequipaje(arreglobuses.get(pos).getPesoequipaje());
    bus.setNumpasajeros(arreglobuses.get(pos).getNumpasajeros()); 
    System.out.println("ingrese Cilindraje"); //modifica color 
    bus.setCilindraje(leerdatos.nextInt());
    contbuses.modificar(bus);
   
}
    private void modificartres(){
    System.out.println("Ingrese la placa a modificar");
    Buses bus = new Buses();
    bus.setPlaca(leerdatos.next());
    int pos = contbuses.binarySearch(arreglobuses, bus.getPlaca());//saca del array y lo agrega nuevamente sin modificar
    bus.setCilindraje(arreglobuses.get(pos).getCilindraje());
    bus.setGaloneskilometro(arreglobuses.get(pos).getGaloneskilometro());
    bus.setNumcambios(arreglobuses.get(pos).getNumcambios());
    bus.setNummotor(arreglobuses.get(pos).getNummotor());
    bus.setTamllanta(arreglobuses.get(pos).getTamllanta());
    bus.setTransmisión(arreglobuses.get(pos).getTransmisión());
    bus.setPrecio(arreglobuses.get(pos).getPrecio());
    bus.setNumerodecilindros(arreglobuses.get(pos).getNumerodecilindros());
    bus.setColor(arreglobuses.get(pos).getColor());
    bus.setNumpuertas(arreglobuses.get(pos).getNumpuertas());
    bus.setTipogasolina(arreglobuses.get(pos).getTipogasolina());
    bus.setNumchasis(arreglobuses.get(pos).getNumchasis());
    bus.setTamaño(arreglobuses.get(pos).getTamaño());
    bus.setPesoequipaje(arreglobuses.get(pos).getPesoequipaje());
    bus.setNumpasajeros(arreglobuses.get(pos).getNumpasajeros()); 
    System.out.println("ingrese Marca"); //modifica color 
    bus.setMarca(leerdatos.next());
    contbuses.modificar(bus);
   
}
    private void modificarcuatro(){
   System.out.println("Ingrese la placa a modificar");
    Buses bus = new Buses();
    bus.setPlaca(leerdatos.next());
    int pos = contbuses.binarySearch(arreglobuses, bus.getPlaca());//saca del array y lo agrega nuevamente sin modificar
    bus.setCilindraje(arreglobuses.get(pos).getCilindraje());
    bus.setGaloneskilometro(arreglobuses.get(pos).getGaloneskilometro());
    bus.setNumcambios(arreglobuses.get(pos).getNumcambios());
    bus.setNummotor(arreglobuses.get(pos).getNummotor());
    bus.setTamllanta(arreglobuses.get(pos).getTamllanta());
    bus.setTransmisión(arreglobuses.get(pos).getTransmisión());
    bus.setNumerodecilindros(arreglobuses.get(pos).getNumerodecilindros());
    bus.setMarca(arreglobuses.get(pos).getMarca());
    bus.setColor(arreglobuses.get(pos).getColor());
    bus.setNumpuertas(arreglobuses.get(pos).getNumpuertas());
    bus.setTipogasolina(arreglobuses.get(pos).getTipogasolina());
    bus.setNumchasis(arreglobuses.get(pos).getNumchasis());
    bus.setTamaño(arreglobuses.get(pos).getTamaño());
    bus.setPesoequipaje(arreglobuses.get(pos).getPesoequipaje());
    bus.setNumpasajeros(arreglobuses.get(pos).getNumpasajeros()); 
    System.out.println("ingrese Precio"); //modifica color 
    bus.setPrecio(leerdatos.nextFloat());
    contbuses.modificar(bus);
   
}
    private void modificarcinco(){
    System.out.println("Ingrese la placa a modificar");
    Buses bus = new Buses();
    bus.setPlaca(leerdatos.next());
    int pos = contbuses.binarySearch(arreglobuses, bus.getPlaca());//saca del array y lo agrega nuevamente sin modificar
    bus.setCilindraje(arreglobuses.get(pos).getCilindraje());
    bus.setGaloneskilometro(arreglobuses.get(pos).getGaloneskilometro());
    bus.setNumcambios(arreglobuses.get(pos).getNumcambios());
    bus.setNummotor(arreglobuses.get(pos).getNummotor());
    bus.setTamllanta(arreglobuses.get(pos).getTamllanta());
    bus.setTransmisión(arreglobuses.get(pos).getTransmisión());
    bus.setPrecio(arreglobuses.get(pos).getPrecio());
    bus.setMarca(arreglobuses.get(pos).getMarca());
    bus.setNumerodecilindros(arreglobuses.get(pos).getNumerodecilindros());
    bus.setNumpuertas(arreglobuses.get(pos).getNumpuertas());
    bus.setTipogasolina(arreglobuses.get(pos).getTipogasolina());
    bus.setNumchasis(arreglobuses.get(pos).getNumchasis());
    bus.setTamaño(arreglobuses.get(pos).getTamaño());
    bus.setPesoequipaje(arreglobuses.get(pos).getPesoequipaje());
    bus.setNumpasajeros(arreglobuses.get(pos).getNumpasajeros()); 
    System.out.println("ingrese Color"); //modifica color 
    bus.setColor(leerdatos.next());
    contbuses.modificar(bus);
   
}
    private void modificarseis(){
    System.out.println("Ingrese la placa a modificar");
    Buses bus = new Buses();
    bus.setPlaca(leerdatos.next());
    int pos = contbuses.binarySearch(arreglobuses, bus.getPlaca());//saca del array y lo agrega nuevamente sin modificar
    bus.setCilindraje(arreglobuses.get(pos).getCilindraje());
    bus.setGaloneskilometro(arreglobuses.get(pos).getGaloneskilometro());
    bus.setNumcambios(arreglobuses.get(pos).getNumcambios());
    bus.setNummotor(arreglobuses.get(pos).getNummotor());
    bus.setTamllanta(arreglobuses.get(pos).getTamllanta());
    bus.setTransmisión(arreglobuses.get(pos).getTransmisión());
    bus.setPrecio(arreglobuses.get(pos).getPrecio());
    bus.setMarca(arreglobuses.get(pos).getMarca());
    bus.setColor(arreglobuses.get(pos).getColor());
    bus.setNumpuertas(arreglobuses.get(pos).getNumpuertas());
    bus.setTipogasolina(arreglobuses.get(pos).getTipogasolina());
    bus.setNumerodecilindros(arreglobuses.get(pos).getNumerodecilindros());
    bus.setTamaño(arreglobuses.get(pos).getTamaño());
    bus.setPesoequipaje(arreglobuses.get(pos).getPesoequipaje());
    bus.setNumpasajeros(arreglobuses.get(pos).getNumpasajeros()); 
    System.out.println("ingrese Numero de chasis"); //modifica color 
    bus.setNumchasis(leerdatos.nextInt());
    contbuses.modificar(bus);
   
}
    private void modificarsiete(){
    System.out.println("Ingrese la placa a modificar");
    Buses bus = new Buses();
    bus.setPlaca(leerdatos.next());
    int pos = contbuses.binarySearch(arreglobuses, bus.getPlaca());//saca del array y lo agrega nuevamente sin modificar
    bus.setCilindraje(arreglobuses.get(pos).getCilindraje());
    bus.setGaloneskilometro(arreglobuses.get(pos).getGaloneskilometro());
    bus.setNumcambios(arreglobuses.get(pos).getNumcambios());
    bus.setNumerodecilindros(arreglobuses.get(pos).getNumerodecilindros());
    bus.setTamllanta(arreglobuses.get(pos).getTamllanta());
    bus.setTransmisión(arreglobuses.get(pos).getTransmisión());
    bus.setPrecio(arreglobuses.get(pos).getPrecio());
    bus.setMarca(arreglobuses.get(pos).getMarca());
    bus.setColor(arreglobuses.get(pos).getColor());
    bus.setNumpuertas(arreglobuses.get(pos).getNumpuertas());
    bus.setTipogasolina(arreglobuses.get(pos).getTipogasolina());
    bus.setNumchasis(arreglobuses.get(pos).getNumchasis());
    bus.setTamaño(arreglobuses.get(pos).getTamaño());
    bus.setPesoequipaje(arreglobuses.get(pos).getPesoequipaje());
    bus.setNumpasajeros(arreglobuses.get(pos).getNumpasajeros()); 
    System.out.println("ingrese Numero de motor"); //modifica color 
    bus.setNummotor(leerdatos.nextInt());
    contbuses.modificar(bus);
   
}
    private void modificarocho(){
    System.out.println("Ingrese la placa a modificar");
    Buses bus = new Buses();
    bus.setPlaca(leerdatos.next());
    int pos = contbuses.binarySearch(arreglobuses, bus.getPlaca());//saca del array y lo agrega nuevamente sin modificar
    bus.setCilindraje(arreglobuses.get(pos).getCilindraje());
    bus.setGaloneskilometro(arreglobuses.get(pos).getGaloneskilometro());
    bus.setNumcambios(arreglobuses.get(pos).getNumcambios());
    bus.setNummotor(arreglobuses.get(pos).getNummotor());
    bus.setTamllanta(arreglobuses.get(pos).getTamllanta());
    bus.setTransmisión(arreglobuses.get(pos).getTransmisión());
    bus.setPrecio(arreglobuses.get(pos).getPrecio());
    bus.setMarca(arreglobuses.get(pos).getMarca());
    bus.setColor(arreglobuses.get(pos).getColor());
    bus.setNumerodecilindros(arreglobuses.get(pos).getNumerodecilindros());
    bus.setTipogasolina(arreglobuses.get(pos).getTipogasolina());
    bus.setNumchasis(arreglobuses.get(pos).getNumchasis());
    bus.setTamaño(arreglobuses.get(pos).getTamaño());
    bus.setPesoequipaje(arreglobuses.get(pos).getPesoequipaje());
    bus.setNumpasajeros(arreglobuses.get(pos).getNumpasajeros()); 
    System.out.println("ingrese Numero de puertas"); //modifica color 
    bus.setNumpuertas(leerdatos.nextInt());
    contbuses.modificar(bus);
   
}
  
    private void modificarnueve(){
       System.out.println("Ingrese la placa a modificar");
    Buses bus = new Buses();
    bus.setPlaca(leerdatos.next());
    int pos = contbuses.binarySearch(arreglobuses, bus.getPlaca());//saca del array y lo agrega nuevamente sin modificar
    bus.setCilindraje(arreglobuses.get(pos).getCilindraje());
    bus.setGaloneskilometro(arreglobuses.get(pos).getGaloneskilometro());
    bus.setNumcambios(arreglobuses.get(pos).getNumcambios());
    bus.setNummotor(arreglobuses.get(pos).getNummotor());
    bus.setTamllanta(arreglobuses.get(pos).getTamllanta());
    bus.setTransmisión(arreglobuses.get(pos).getTransmisión());
    bus.setPrecio(arreglobuses.get(pos).getPrecio());
    bus.setMarca(arreglobuses.get(pos).getMarca());
    bus.setColor(arreglobuses.get(pos).getColor());
    bus.setNumpuertas(arreglobuses.get(pos).getNumpuertas());
    bus.setTipogasolina(arreglobuses.get(pos).getTipogasolina());
    bus.setNumchasis(arreglobuses.get(pos).getNumchasis());
    bus.setTamaño(arreglobuses.get(pos).getTamaño());
    bus.setPesoequipaje(arreglobuses.get(pos).getPesoequipaje());
    bus.setNumpasajeros(arreglobuses.get(pos).getNumpasajeros());    
    System.out.println("ingrese Tamaño de llanta"); //modifica color 
    bus.setTamllanta(leerdatos.nextInt());
    contbuses.modificar(bus);
   
}
    private void modificardiez(){
        System.out.println("Ingrese la placa a modificar");
    Buses bus = new Buses();
    bus.setPlaca(leerdatos.next());
    int pos = contbuses.binarySearch(arreglobuses, bus.getPlaca());//saca del array y lo agrega nuevamente sin modificar
    bus.setCilindraje(arreglobuses.get(pos).getCilindraje());
    bus.setGaloneskilometro(arreglobuses.get(pos).getGaloneskilometro());
    bus.setNumcambios(arreglobuses.get(pos).getNumcambios());
    bus.setNummotor(arreglobuses.get(pos).getNummotor());
    bus.setTamllanta(arreglobuses.get(pos).getTamllanta());
    bus.setTransmisión(arreglobuses.get(pos).getTransmisión());
    bus.setPrecio(arreglobuses.get(pos).getPrecio());
    bus.setMarca(arreglobuses.get(pos).getMarca());
    bus.setColor(arreglobuses.get(pos).getColor());
    bus.setNumpuertas(arreglobuses.get(pos).getNumpuertas());
    bus.setTipogasolina(arreglobuses.get(pos).getTipogasolina());
    bus.setNumchasis(arreglobuses.get(pos).getNumchasis());
    bus.setTamaño(arreglobuses.get(pos).getTamaño());
    bus.setPesoequipaje(arreglobuses.get(pos).getPesoequipaje());
    bus.setNumpasajeros(arreglobuses.get(pos).getNumpasajeros());    
    System.out.println("ingrese transmision"); //modifica color 
    bus.setTransmisión(leerdatos.next());
    contbuses.modificar(bus);
   
}
    private void modificaronce(){
       System.out.println("Ingrese la placa a modificar");
    Buses bus = new Buses();
    bus.setPlaca(leerdatos.next());
    int pos = contbuses.binarySearch(arreglobuses, bus.getPlaca());//saca del array y lo agrega nuevamente sin modificar
    bus.setCilindraje(arreglobuses.get(pos).getCilindraje());
    bus.setGaloneskilometro(arreglobuses.get(pos).getGaloneskilometro());
    bus.setNumcambios(arreglobuses.get(pos).getNumcambios());
    bus.setNummotor(arreglobuses.get(pos).getNummotor());
    bus.setTamllanta(arreglobuses.get(pos).getTamllanta());
    bus.setTransmisión(arreglobuses.get(pos).getTransmisión());
    bus.setPrecio(arreglobuses.get(pos).getPrecio());
    bus.setMarca(arreglobuses.get(pos).getMarca());
    bus.setColor(arreglobuses.get(pos).getColor());
    bus.setNumpuertas(arreglobuses.get(pos).getNumpuertas());
    bus.setTipogasolina(arreglobuses.get(pos).getTipogasolina());
    bus.setNumchasis(arreglobuses.get(pos).getNumchasis());
    bus.setTamaño(arreglobuses.get(pos).getTamaño());
    bus.setPesoequipaje(arreglobuses.get(pos).getPesoequipaje());
    bus.setNumpasajeros(arreglobuses.get(pos).getNumpasajeros());    
    System.out.println("ingrese Numero de cambios"); //modifica color 
    bus.setNumcambios(leerdatos.nextInt());
    contbuses.modificar(bus);
   
}
    private void modificardoce(){
        System.out.println("Ingrese la placa a modificar");
    Buses bus = new Buses();
    bus.setPlaca(leerdatos.next());
    int pos = contbuses.binarySearch(arreglobuses, bus.getPlaca());//saca del array y lo agrega nuevamente sin modificar
    bus.setCilindraje(arreglobuses.get(pos).getCilindraje());
    bus.setGaloneskilometro(arreglobuses.get(pos).getGaloneskilometro());
    bus.setNumcambios(arreglobuses.get(pos).getNumcambios());
    bus.setNummotor(arreglobuses.get(pos).getNummotor());
    bus.setTamllanta(arreglobuses.get(pos).getTamllanta());
    bus.setTransmisión(arreglobuses.get(pos).getTransmisión());
    bus.setPrecio(arreglobuses.get(pos).getPrecio());
    bus.setMarca(arreglobuses.get(pos).getMarca());
    bus.setColor(arreglobuses.get(pos).getColor());
    bus.setNumpuertas(arreglobuses.get(pos).getNumpuertas());
    bus.setTipogasolina(arreglobuses.get(pos).getTipogasolina());
    bus.setNumchasis(arreglobuses.get(pos).getNumchasis());
    bus.setTamaño(arreglobuses.get(pos).getTamaño());
    bus.setPesoequipaje(arreglobuses.get(pos).getPesoequipaje());
    bus.setNumpasajeros(arreglobuses.get(pos).getNumpasajeros());    
    System.out.println("ingrese galones por kilometro"); //modifica color 
    bus.setGaloneskilometro(leerdatos.nextFloat());
    contbuses.modificar(bus);
   
}
    private void modificartrece(){
        System.out.println("Ingrese la placa a modificar");
    Buses bus = new Buses();
    bus.setPlaca(leerdatos.next());
    int pos = contbuses.binarySearch(arreglobuses, bus.getPlaca());//saca del array y lo agrega nuevamente sin modificar
    bus.setCilindraje(arreglobuses.get(pos).getCilindraje());
    bus.setGaloneskilometro(arreglobuses.get(pos).getGaloneskilometro());
    bus.setNumcambios(arreglobuses.get(pos).getNumcambios());
    bus.setNummotor(arreglobuses.get(pos).getNummotor());
    bus.setTamllanta(arreglobuses.get(pos).getTamllanta());
    bus.setTransmisión(arreglobuses.get(pos).getTransmisión());
    bus.setPrecio(arreglobuses.get(pos).getPrecio());
    bus.setMarca(arreglobuses.get(pos).getMarca());
    bus.setColor(arreglobuses.get(pos).getColor());
    bus.setNumpuertas(arreglobuses.get(pos).getNumpuertas());
    bus.setTipogasolina(arreglobuses.get(pos).getTipogasolina());
    bus.setNumchasis(arreglobuses.get(pos).getNumchasis());
    bus.setTamaño(arreglobuses.get(pos).getTamaño());
    bus.setPesoequipaje(arreglobuses.get(pos).getPesoequipaje());
    bus.setNumpasajeros(arreglobuses.get(pos).getNumpasajeros());    
    System.out.println("ingrese el nuevo tipo de gasolina"); 
    bus.setTipogasolina(leerdatos.next());
    contbuses.modificar(bus);
   
}
     private void modificarcatorce(){
    System.out.println("Ingrese la placa a modificar");
    Buses bus = new Buses();
    bus.setPlaca(leerdatos.next());
    int pos = contbuses.binarySearch(arreglobuses, bus.getPlaca());//saca del array y lo agrega nuevamente sin modificar
    bus.setCilindraje(arreglobuses.get(pos).getCilindraje());
    bus.setGaloneskilometro(arreglobuses.get(pos).getGaloneskilometro());
    bus.setNumcambios(arreglobuses.get(pos).getNumcambios());
    bus.setNummotor(arreglobuses.get(pos).getNummotor());
    bus.setTamllanta(arreglobuses.get(pos).getTamllanta());
    bus.setTransmisión(arreglobuses.get(pos).getTransmisión());
    bus.setPrecio(arreglobuses.get(pos).getPrecio());
    bus.setMarca(arreglobuses.get(pos).getMarca());
    bus.setColor(arreglobuses.get(pos).getColor());
    bus.setNumpuertas(arreglobuses.get(pos).getNumpuertas());
    bus.setTipogasolina(arreglobuses.get(pos).getTipogasolina());
    bus.setNumchasis(arreglobuses.get(pos).getNumchasis());
    bus.setTamaño(arreglobuses.get(pos).getTamaño());
    bus.setPesoequipaje(arreglobuses.get(pos).getPesoequipaje());
    bus.setNumerodecilindros(arreglobuses.get(pos).getNumerodecilindros());    
    System.out.println("ingrese Numero de pasajeros"); //modifica color 
    bus.setNumpasajeros(leerdatos.nextInt());
    contbuses.modificar(bus);
   
}
      private void modificarquince(){
    System.out.println("Ingrese la placa a modificar");
    Buses bus = new Buses();
    bus.setPlaca(leerdatos.next());
    int pos = contbuses.binarySearch(arreglobuses, bus.getPlaca());//saca del array y lo agrega nuevamente sin modificar
    bus.setCilindraje(arreglobuses.get(pos).getCilindraje());
    bus.setGaloneskilometro(arreglobuses.get(pos).getGaloneskilometro());
    bus.setNumcambios(arreglobuses.get(pos).getNumcambios());
    bus.setNummotor(arreglobuses.get(pos).getNummotor());
    bus.setTamllanta(arreglobuses.get(pos).getTamllanta());
    bus.setTransmisión(arreglobuses.get(pos).getTransmisión());
    bus.setPrecio(arreglobuses.get(pos).getPrecio());
    bus.setMarca(arreglobuses.get(pos).getMarca());
    bus.setColor(arreglobuses.get(pos).getColor());
    bus.setNumpuertas(arreglobuses.get(pos).getNumpuertas());
    bus.setTipogasolina(arreglobuses.get(pos).getTipogasolina());
    bus.setNumchasis(arreglobuses.get(pos).getNumchasis());
    bus.setTamaño(arreglobuses.get(pos).getTamaño());
    bus.setNumerodecilindros(arreglobuses.get(pos).getNumerodecilindros());
    bus.setNumpasajeros(arreglobuses.get(pos).getNumpasajeros());    
    System.out.println("ingrese Peso del equipaje"); //modifica color 
    bus.setPesoequipaje(leerdatos.nextFloat());
    contbuses.modificar(bus);
   
}
       private void modificardieciseis(){
    System.out.println("Ingrese la placa a modificar");
    Buses bus = new Buses();
    bus.setPlaca(leerdatos.next());
    int pos = contbuses.binarySearch(arreglobuses, bus.getPlaca());//saca del array y lo agrega nuevamente sin modificar
    bus.setCilindraje(arreglobuses.get(pos).getCilindraje());
    bus.setGaloneskilometro(arreglobuses.get(pos).getGaloneskilometro());
    bus.setNumcambios(arreglobuses.get(pos).getNumcambios());
    bus.setNummotor(arreglobuses.get(pos).getNummotor());
    bus.setTamllanta(arreglobuses.get(pos).getTamllanta());
    bus.setTransmisión(arreglobuses.get(pos).getTransmisión());
    bus.setPrecio(arreglobuses.get(pos).getPrecio());
    bus.setMarca(arreglobuses.get(pos).getMarca());
    bus.setColor(arreglobuses.get(pos).getColor());
    bus.setNumpuertas(arreglobuses.get(pos).getNumpuertas());
    bus.setTipogasolina(arreglobuses.get(pos).getTipogasolina());
    bus.setNumchasis(arreglobuses.get(pos).getNumchasis());
    bus.setNumerodecilindros(arreglobuses.get(pos).getNumerodecilindros());
    bus.setPesoequipaje(arreglobuses.get(pos).getPesoequipaje());
    bus.setNumpasajeros(arreglobuses.get(pos).getNumpasajeros());    
    System.out.println("ingrese Tamaño"); //modifica color 
    bus.setTamaño(leerdatos.next());
    contbuses.modificar(bus);
   
}
    private void BorrarUnAuto(){
        System.out.println("Digite la placa a borrar");
        Buses bus= new Buses();
        bus.setPlaca(leerdatos.next());
        if (contbuses.borrar(bus))
            System.out.println("Objeto Borrado");
        else
            System.out.println("No pudo borrar el objeto");
    }        
    
    private void leerAutomovil()
    {
         Buses bus= new Buses();
        
        System.out.println("Numero de placa");  
        String placa = leerdatos.next(); 
        bus.setPlaca(placa);
        
        System.out.println("Marca");
        bus.setMarca(leerdatos.next());
        
        System.out.println("Color");
        bus.setColor(leerdatos.next());
        
        System.out.println("Precio");
        bus.setPrecio(leerdatos.nextFloat());
        
        System.out.println("Numero de cilindros");
        bus.setNumerodecilindros(leerdatos.nextInt());
        
        System.out.println("Numero de puertas");
        bus.setNumpuertas(leerdatos.nextInt());
        
        System.out.println("Numero de cilindraje");
        bus.setCilindraje(leerdatos.nextFloat());
        
        System.out.println("Numero de chasis");
        bus.setNumchasis(leerdatos.nextInt());
        
        System.out.println("Numero de motor");
        bus.setNummotor(leerdatos.nextInt());
        
        System.out.println("Tamaño de Llanta");
        bus.setTamllanta(leerdatos.nextInt());
        
        System.out.println("Transmision");
        bus.setTransmisión(leerdatos.next());
        
        System.out.println("Numero de cambios");
        bus.setNumcambios(leerdatos.nextInt());
        
        System.out.println("Galones de kilometro");
        bus.setGaloneskilometro(leerdatos.nextFloat());
        
        System.out.println("Tipo gasolina");
        bus.setTipogasolina(leerdatos.next());
        
        System.out.println("Numero de pasajeros");
        bus.setNumpasajeros(leerdatos.nextInt());
        
        System.out.println("Peso del equipaje");
        bus.setPesoequipaje(leerdatos.nextFloat());
        
        System.out.println("Tamaño");
        bus.setTamaño(leerdatos.next());

        if(contbuses.insertar(bus))
        {
            System.out.println("Bus insertado");
        }
        else
            System.out.println("Bus NO insertado - placa esta duplicada");
        
    }
    public void consultarunAutomovil()
    {
    System.out.println("Ingrese la placa a consultar");
    Buses bus = new Buses();
    bus.setPlaca(leerdatos.next());
    int pos = contbuses.binarySearch(arreglobuses, bus.getPlaca());//saca del array y lo agrega nuevamente sin modificar
    bus.setCilindraje(arreglobuses.get(pos).getCilindraje());
    bus.setGaloneskilometro(arreglobuses.get(pos).getGaloneskilometro());
    bus.setNumcambios(arreglobuses.get(pos).getNumcambios());
    bus.setNummotor(arreglobuses.get(pos).getNummotor());
    bus.setTamllanta(arreglobuses.get(pos).getTamllanta());
    bus.setTransmisión(arreglobuses.get(pos).getTransmisión());
    bus.setPrecio(arreglobuses.get(pos).getPrecio());
    bus.setMarca(arreglobuses.get(pos).getMarca());
    bus.setColor(arreglobuses.get(pos).getColor());
    bus.setNumpuertas(arreglobuses.get(pos).getNumpuertas());
    bus.setTipogasolina(arreglobuses.get(pos).getTipogasolina());
    bus.setNumchasis(arreglobuses.get(pos).getNumchasis());
    bus.setTamaño(arreglobuses.get(pos).getTamaño());
    bus.setPesoequipaje(arreglobuses.get(pos).getPesoequipaje());
    bus.setNumpasajeros(arreglobuses.get(pos).getNumpasajeros()); 
    bus.setNumerodecilindros(arreglobuses.get(pos).getNumerodecilindros());
    bus = (Buses)contbuses.consultarUno(bus);
    System.out.println(bus);
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
    System.out.println("14. Modificar Numero de pasajeros");
    System.out.println("15. Modificar Peso del equipaje");
    System.out.println("16. Modificar Tamaño");
    System.out.println("17. Regresar al Menu Principal");
    System.out.println(" Digite su opcion");
    
    int opc = leerdatos.nextInt();    
    switch (opc)
    {
        case 1: 
            modificaruno();
            contbuses.consultarTodos();
            MenuModif();
            break;
        case 2: 
            modificardos();
            contbuses.consultarTodos();
            MenuModif();
            break;
        case 3: 
            modificartres();
            contbuses.consultarTodos();
            MenuModif();
            break;
        case 4:
            modificarcuatro();
            contbuses.consultarTodos();
            MenuModif();
        case 5: 
            modificarcinco();
            contbuses.consultarTodos();
            MenuModif();
            break;
        case 6: 
            modificarseis();
            contbuses.consultarTodos();
            MenuModif();
            break;
        case 7:
            modificarsiete();
            contbuses.consultarTodos();
            MenuModif();
            break;
        case 8:
            modificarocho();
            contbuses.consultarTodos();
            MenuModif();
            break;
        case 9:
            modificarnueve();
            contbuses.consultarTodos();
            MenuModif();
            break;
        case 10:
            modificardiez();
            contbuses.consultarTodos();
            MenuModif();
            break;
        case 11:
            modificaronce();
            contbuses.consultarTodos();
            MenuModif();
            break;
        case 12:
            modificardoce();
            contbuses.consultarTodos();
            MenuModif();
            break;
        case 13:
            modificartrece();
            contbuses.consultarTodos();
            MenuModif();
            break;
        case 14:
            modificarcatorce();
            contbuses.consultarTodos();
            MenuModif();
            break;
        case 15:
            modificarquince();
            contbuses.consultarTodos();
            MenuModif();
            break;
        case 16:
            modificardieciseis();
            contbuses.consultarTodos();
            MenuModif();
            break;
        case 17:
            MenuBuses();
            break;
           
        default: 
            System.out.println("Opcion no válida");
            System.exit(0);
            break;
        }
    }   
public void MenuBuses()
{
    System.out.println("1. Insertar Bus");
    System.out.println("2. Consultar todos");
    System.out.println("3. Consultar uno");
    System.out.println("4. Modificar Buses");
    System.out.println("5. Ordenar Buses - por Marca Ascendente");
    System.out.println("6. Ordenar Buses - por Marca Desecendente");
    System.out.println("7. Ordenar Buses - por Numero de motor");
    System.out.println("8. Borrar Bus");
    System.out.println("9. Regresar a Menu General");
    System.out.println(" Digite su opcion");
    int opc = leerdatos.nextInt();    
    switch (opc)
    {
        case 1: 
            leerAutomovil();
            MenuBuses();
            break;
        case 2: 
            contbuses.consultarTodos();
            MenuBuses();
            break;
        case 3: 
            consultarunAutomovil();
            MenuBuses();
            break;
        case 4: 
            MenuModif();
            MenuBuses();
            break;
        case 5: 
            contbuses.ordenar();
            contbuses.consultarTodos();
            MenuBuses();
            break;
         case 6:
            contbuses.burbuja();
            contbuses.consultarTodos();
            MenuBuses();
            break;
        case 7:
            contbuses.ordenar(0,ControladorBuses.arreglobuses.size()-1);
            contbuses.consultarTodos();
            MenuBuses();
        case 8: 
            BorrarUnAuto();
            contbuses.consultarTodos();
            MenuBuses();
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