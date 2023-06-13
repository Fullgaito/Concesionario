/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import controlador.ControladorCamionetas;
import static controlador.ControladorCamionetas.arreglocamionet;
import java.util.Scanner;
import modelo.Camionetas;


/**
 *
 *
 */
public class MenuCamionet {
    
      private Scanner leerdatos; 
      private ControladorCamionetas contcamionet;

    public MenuCamionet() {
        //Separar memoria para esos objetos
        leerdatos = new Scanner(System.in);
        contcamionet = new ControladorCamionetas();
        insertarDatosDefecto();
    }
    private void insertarDatosDefecto(){
        Camionetas camionet = new Camionetas("4x4", "JUE456", 2, 1, "Mazda", 6, "Azul", 2, 4, 3, 7, "Mecanica", 5, 3, "Diesel");
        contcamionet.insertar(camionet);
        camionet= new Camionetas ("4x2", "MON241", 3, 5, "Honda", 6, "Rojo", 4, 1, 4, 3, "Mecanica", 7, 1, "Diesel");
        contcamionet.insertar(camionet);
         camionet = new Camionetas ("4x4", "UFH890", 6, 2, "Toyota", 1, "Gris", 5, 2, 1, 5, "Mecanica", 1, 4, "Diesel");
        contcamionet.insertar(camionet);
    }
     private void modificaruno(){
    System.out.println("Ingrese la placa a modificar");
    Camionetas camio = new Camionetas();
    camio.setPlaca(leerdatos.next());
    int pos = contcamionet.binarySearch(arreglocamionet, camio.getPlaca());//saca del array y lo agrega nuevamente sin modificar
    camio.setCilindraje(arreglocamionet.get(pos).getCilindraje());
    camio.setGaloneskilometro(arreglocamionet.get(pos).getGaloneskilometro());
    camio.setNumcambios(arreglocamionet.get(pos).getNumcambios());
    camio.setNummotor(arreglocamionet.get(pos).getNummotor());
    camio.setTamllanta(arreglocamionet.get(pos).getTamllanta());
    camio.setTransmisión(arreglocamionet.get(pos).getTransmisión());
    camio.setPrecio(arreglocamionet.get(pos).getPrecio());
    camio.setMarca(arreglocamionet.get(pos).getMarca());
    camio.setColor(arreglocamionet.get(pos).getColor());
    camio.setNumpuertas(arreglocamionet.get(pos).getNumpuertas());
    camio.setTipogasolina(arreglocamionet.get(pos).getTipogasolina());
    camio.setNumchasis(arreglocamionet.get(pos).getNumchasis());
    camio.setTraccion(arreglocamionet.get(pos).getTraccion());
    System.out.println("ingrese Numero de cilindros"); 
    camio.setNumerodecilindros(leerdatos.nextInt());
    contcamionet.modificar(camio);
   
}
    private void modificardos(){
    System.out.println("Ingrese la placa a modificar");
    Camionetas camio = new Camionetas();
    camio.setPlaca(leerdatos.next());
    int pos = contcamionet.binarySearch(arreglocamionet, camio.getPlaca());//saca del array y lo agrega nuevamente sin modificar
    camio.setNumerodecilindros(arreglocamionet.get(pos).getNumerodecilindros());
    camio.setGaloneskilometro(arreglocamionet.get(pos).getGaloneskilometro());
    camio.setNumcambios(arreglocamionet.get(pos).getNumcambios());
    camio.setNummotor(arreglocamionet.get(pos).getNummotor());
    camio.setTamllanta(arreglocamionet.get(pos).getTamllanta());
    camio.setTransmisión(arreglocamionet.get(pos).getTransmisión());
    camio.setPrecio(arreglocamionet.get(pos).getPrecio());
    camio.setMarca(arreglocamionet.get(pos).getMarca());
    camio.setColor(arreglocamionet.get(pos).getColor());
    camio.setNumpuertas(arreglocamionet.get(pos).getNumpuertas());
    camio.setTipogasolina(arreglocamionet.get(pos).getTipogasolina());
    camio.setNumchasis(arreglocamionet.get(pos).getNumchasis());
    camio.setTraccion(arreglocamionet.get(pos).getTraccion());
    System.out.println("ingrese Cilindraje"); //modifica color 
    camio.setCilindraje(leerdatos.nextInt());
    contcamionet.modificar(camio);
   
}
    private void modificartres(){
    System.out.println("Ingrese la placa a modificar");
    Camionetas camio = new Camionetas();
    camio.setPlaca(leerdatos.next());
    int pos = contcamionet.binarySearch(arreglocamionet, camio.getPlaca());//saca del array y lo agrega nuevamente sin modificar
    camio.setCilindraje(arreglocamionet.get(pos).getCilindraje());
    camio.setGaloneskilometro(arreglocamionet.get(pos).getGaloneskilometro());
    camio.setNumcambios(arreglocamionet.get(pos).getNumcambios());
    camio.setNummotor(arreglocamionet.get(pos).getNummotor());
    camio.setTamllanta(arreglocamionet.get(pos).getTamllanta());
    camio.setTransmisión(arreglocamionet.get(pos).getTransmisión());
    camio.setPrecio(arreglocamionet.get(pos).getPrecio());
    camio.setNumerodecilindros(arreglocamionet.get(pos).getNumerodecilindros());
    camio.setColor(arreglocamionet.get(pos).getColor());
    camio.setNumpuertas(arreglocamionet.get(pos).getNumpuertas());
    camio.setTipogasolina(arreglocamionet.get(pos).getTipogasolina());
    camio.setNumchasis(arreglocamionet.get(pos).getNumchasis());
    camio.setTraccion(arreglocamionet.get(pos).getTraccion());
    System.out.println("ingrese Marca"); //modifica color 
    camio.setMarca(leerdatos.next());
    contcamionet.modificar(camio);
   
}
    private void modificarcuatro(){
    System.out.println("Ingrese la placa a modificar");
    Camionetas camio = new Camionetas();
    camio.setPlaca(leerdatos.next());
    int pos = contcamionet.binarySearch(arreglocamionet, camio.getPlaca());//saca del array y lo agrega nuevamente sin modificar
    camio.setCilindraje(arreglocamionet.get(pos).getCilindraje());
    camio.setGaloneskilometro(arreglocamionet.get(pos).getGaloneskilometro());
    camio.setNumcambios(arreglocamionet.get(pos).getNumcambios());
    camio.setNummotor(arreglocamionet.get(pos).getNummotor());
    camio.setTamllanta(arreglocamionet.get(pos).getTamllanta());
    camio.setTransmisión(arreglocamionet.get(pos).getTransmisión());
    camio.setNumerodecilindros(arreglocamionet.get(pos).getNumerodecilindros());
    camio.setMarca(arreglocamionet.get(pos).getMarca());
    camio.setColor(arreglocamionet.get(pos).getColor());
    camio.setNumpuertas(arreglocamionet.get(pos).getNumpuertas());
    camio.setTipogasolina(arreglocamionet.get(pos).getTipogasolina());
    camio.setNumchasis(arreglocamionet.get(pos).getNumchasis());
    camio.setTraccion(arreglocamionet.get(pos).getTraccion());
    System.out.println("ingrese Precio"); //modifica color 
    camio.setPrecio(leerdatos.nextFloat());
    contcamionet.modificar(camio);
   
}
    private void modificarcinco(){
    System.out.println("Ingrese la placa a modificar");
    Camionetas camio = new Camionetas();
    camio.setPlaca(leerdatos.next());
    int pos = contcamionet.binarySearch(arreglocamionet, camio.getPlaca());//saca del array y lo agrega nuevamente sin modificar
    camio.setCilindraje(arreglocamionet.get(pos).getCilindraje());
    camio.setGaloneskilometro(arreglocamionet.get(pos).getGaloneskilometro());
    camio.setNumcambios(arreglocamionet.get(pos).getNumcambios());
    camio.setNummotor(arreglocamionet.get(pos).getNummotor());
    camio.setTamllanta(arreglocamionet.get(pos).getTamllanta());
    camio.setTransmisión(arreglocamionet.get(pos).getTransmisión());
    camio.setPrecio(arreglocamionet.get(pos).getPrecio());
    camio.setMarca(arreglocamionet.get(pos).getMarca());
    camio.setNumerodecilindros(arreglocamionet.get(pos).getNumerodecilindros());
    camio.setNumpuertas(arreglocamionet.get(pos).getNumpuertas());
    camio.setTipogasolina(arreglocamionet.get(pos).getTipogasolina());
    camio.setNumchasis(arreglocamionet.get(pos).getNumchasis());
    camio.setTraccion(arreglocamionet.get(pos).getTraccion());
    System.out.println("ingrese Color"); //modifica color 
    camio.setColor(leerdatos.next());
    contcamionet.modificar(camio);
   
}
    private void modificarseis(){
    System.out.println("Ingrese la placa a modificar");
    Camionetas camio = new Camionetas();
    camio.setPlaca(leerdatos.next());
    int pos = contcamionet.binarySearch(arreglocamionet, camio.getPlaca());//saca del array y lo agrega nuevamente sin modificar
    camio.setCilindraje(arreglocamionet.get(pos).getCilindraje());
    camio.setGaloneskilometro(arreglocamionet.get(pos).getGaloneskilometro());
    camio.setNumcambios(arreglocamionet.get(pos).getNumcambios());
    camio.setNummotor(arreglocamionet.get(pos).getNummotor());
    camio.setTamllanta(arreglocamionet.get(pos).getTamllanta());
    camio.setTransmisión(arreglocamionet.get(pos).getTransmisión());
    camio.setPrecio(arreglocamionet.get(pos).getPrecio());
    camio.setMarca(arreglocamionet.get(pos).getMarca());
    camio.setColor(arreglocamionet.get(pos).getColor());
    camio.setNumpuertas(arreglocamionet.get(pos).getNumpuertas());
    camio.setTipogasolina(arreglocamionet.get(pos).getTipogasolina());
    camio.setNumerodecilindros(arreglocamionet.get(pos).getNumerodecilindros());
    camio.setTraccion(arreglocamionet.get(pos).getTraccion());
    System.out.println("ingrese Numero de chasis"); //modifica color 
    camio.setNumchasis(leerdatos.nextInt());
    contcamionet.modificar(camio);
   
}
    private void modificarsiete(){
          System.out.println("Ingrese la placa a modificar");
    Camionetas camio = new Camionetas();
    camio.setPlaca(leerdatos.next());
    int pos = contcamionet.binarySearch(arreglocamionet, camio.getPlaca());//saca del array y lo agrega nuevamente sin modificar
    camio.setCilindraje(arreglocamionet.get(pos).getCilindraje());
    camio.setGaloneskilometro(arreglocamionet.get(pos).getGaloneskilometro());
    camio.setNumcambios(arreglocamionet.get(pos).getNumcambios());
    camio.setNummotor(arreglocamionet.get(pos).getNummotor());
    camio.setTamllanta(arreglocamionet.get(pos).getTamllanta());
    camio.setTransmisión(arreglocamionet.get(pos).getTransmisión());
    camio.setPrecio(arreglocamionet.get(pos).getPrecio());
    camio.setMarca(arreglocamionet.get(pos).getMarca());
    camio.setColor(arreglocamionet.get(pos).getColor());
    camio.setNumpuertas(arreglocamionet.get(pos).getNumpuertas());
    camio.setTipogasolina(arreglocamionet.get(pos).getTipogasolina());
    camio.setNumchasis(arreglocamionet.get(pos).getNumchasis());
    camio.setTraccion(arreglocamionet.get(pos).getTraccion());
    System.out.println("ingrese Numero de chasis"); 
    camio.setNumchasis(leerdatos.nextInt());
    contcamionet.modificar(camio);
   
}
    private void modificarocho(){
        System.out.println("Ingrese la placa a modificar");
    Camionetas camio = new Camionetas();
    camio.setPlaca(leerdatos.next());
    int pos = contcamionet.binarySearch(arreglocamionet, camio.getPlaca());//saca del array y lo agrega nuevamente sin modificar
    camio.setCilindraje(arreglocamionet.get(pos).getCilindraje());
    camio.setGaloneskilometro(arreglocamionet.get(pos).getGaloneskilometro());
    camio.setNumcambios(arreglocamionet.get(pos).getNumcambios());
    camio.setNummotor(arreglocamionet.get(pos).getNummotor());
    camio.setTamllanta(arreglocamionet.get(pos).getTamllanta());
    camio.setTransmisión(arreglocamionet.get(pos).getTransmisión());
    camio.setPrecio(arreglocamionet.get(pos).getPrecio());
    camio.setMarca(arreglocamionet.get(pos).getMarca());
    camio.setColor(arreglocamionet.get(pos).getColor());
    camio.setNumpuertas(arreglocamionet.get(pos).getNumpuertas());
    camio.setTipogasolina(arreglocamionet.get(pos).getTipogasolina());
    camio.setNumchasis(arreglocamionet.get(pos).getNumchasis());
    camio.setTraccion(arreglocamionet.get(pos).getTraccion());
    System.out.println("ingrese Numero de motor"); 
    camio.setNummotor(leerdatos.nextInt());
    contcamionet.modificar(camio);
   
}
  
    private void modificarnueve(){
        System.out.println("Ingrese la placa a modificar");
    Camionetas camio = new Camionetas();
    camio.setPlaca(leerdatos.next());
    int pos = contcamionet.binarySearch(arreglocamionet, camio.getPlaca());//saca del array y lo agrega nuevamente sin modificar
    camio.setCilindraje(arreglocamionet.get(pos).getCilindraje());
    camio.setGaloneskilometro(arreglocamionet.get(pos).getGaloneskilometro());
    camio.setNumcambios(arreglocamionet.get(pos).getNumcambios());
    camio.setNummotor(arreglocamionet.get(pos).getNummotor());
    camio.setTamllanta(arreglocamionet.get(pos).getTamllanta());
    camio.setTransmisión(arreglocamionet.get(pos).getTransmisión());
    camio.setPrecio(arreglocamionet.get(pos).getPrecio());
    camio.setMarca(arreglocamionet.get(pos).getMarca());
    camio.setColor(arreglocamionet.get(pos).getColor());
    camio.setNumpuertas(arreglocamionet.get(pos).getNumpuertas());
    camio.setTipogasolina(arreglocamionet.get(pos).getTipogasolina());
    camio.setNumchasis(arreglocamionet.get(pos).getNumchasis());
    camio.setTraccion(arreglocamionet.get(pos).getTraccion());
    System.out.println("ingrese tamaño de llanta"); 
    camio.setTamllanta(leerdatos.nextInt());
    contcamionet.modificar(camio);
   
}
    private void modificardiez(){
         System.out.println("Ingrese la placa a modificar");
    Camionetas camio = new Camionetas();
    camio.setPlaca(leerdatos.next());
    int pos = contcamionet.binarySearch(arreglocamionet, camio.getPlaca());//saca del array y lo agrega nuevamente sin modificar
    camio.setCilindraje(arreglocamionet.get(pos).getCilindraje());
    camio.setGaloneskilometro(arreglocamionet.get(pos).getGaloneskilometro());
    camio.setNumcambios(arreglocamionet.get(pos).getNumcambios());
    camio.setNummotor(arreglocamionet.get(pos).getNummotor());
    camio.setTamllanta(arreglocamionet.get(pos).getTamllanta());
    camio.setTransmisión(arreglocamionet.get(pos).getTransmisión());
    camio.setPrecio(arreglocamionet.get(pos).getPrecio());
    camio.setMarca(arreglocamionet.get(pos).getMarca());
    camio.setColor(arreglocamionet.get(pos).getColor());
    camio.setNumpuertas(arreglocamionet.get(pos).getNumpuertas());
    camio.setTipogasolina(arreglocamionet.get(pos).getTipogasolina());
    camio.setNumchasis(arreglocamionet.get(pos).getNumchasis());
    camio.setTraccion(arreglocamionet.get(pos).getTraccion());
    System.out.println("ingrese transmision"); 
    camio.setTransmisión(leerdatos.next());
    contcamionet.modificar(camio);
   
}
    private void modificaronce(){
        System.out.println("Ingrese la placa a modificar");
    Camionetas camio = new Camionetas();
    camio.setPlaca(leerdatos.next());
    int pos = contcamionet.binarySearch(arreglocamionet, camio.getPlaca());//saca del array y lo agrega nuevamente sin modificar
    camio.setCilindraje(arreglocamionet.get(pos).getCilindraje());
    camio.setGaloneskilometro(arreglocamionet.get(pos).getGaloneskilometro());
    camio.setNumcambios(arreglocamionet.get(pos).getNumcambios());
    camio.setNummotor(arreglocamionet.get(pos).getNummotor());
    camio.setTamllanta(arreglocamionet.get(pos).getTamllanta());
    camio.setTransmisión(arreglocamionet.get(pos).getTransmisión());
    camio.setPrecio(arreglocamionet.get(pos).getPrecio());
    camio.setMarca(arreglocamionet.get(pos).getMarca());
    camio.setColor(arreglocamionet.get(pos).getColor());
    camio.setNumpuertas(arreglocamionet.get(pos).getNumpuertas());
    camio.setTipogasolina(arreglocamionet.get(pos).getTipogasolina());
    camio.setNumchasis(arreglocamionet.get(pos).getNumchasis());
    camio.setTraccion(arreglocamionet.get(pos).getTraccion());
    System.out.println("ingrese Numero de cambios"); 
    camio.setNumcambios(leerdatos.nextInt());
    contcamionet.modificar(camio);
   
}
    private void modificardoce(){
         System.out.println("Ingrese la placa a modificar");
    Camionetas camio = new Camionetas();
    camio.setPlaca(leerdatos.next());
    int pos = contcamionet.binarySearch(arreglocamionet, camio.getPlaca());//saca del array y lo agrega nuevamente sin modificar
    camio.setCilindraje(arreglocamionet.get(pos).getCilindraje());
    camio.setGaloneskilometro(arreglocamionet.get(pos).getGaloneskilometro());
    camio.setNumcambios(arreglocamionet.get(pos).getNumcambios());
    camio.setNummotor(arreglocamionet.get(pos).getNummotor());
    camio.setTamllanta(arreglocamionet.get(pos).getTamllanta());
    camio.setTransmisión(arreglocamionet.get(pos).getTransmisión());
    camio.setPrecio(arreglocamionet.get(pos).getPrecio());
    camio.setMarca(arreglocamionet.get(pos).getMarca());
    camio.setColor(arreglocamionet.get(pos).getColor());
    camio.setNumpuertas(arreglocamionet.get(pos).getNumpuertas());
    camio.setTipogasolina(arreglocamionet.get(pos).getTipogasolina());
    camio.setNumchasis(arreglocamionet.get(pos).getNumchasis());
    camio.setTraccion(arreglocamionet.get(pos).getTraccion());
    System.out.println("ingrese los nuevos galones por kilometro"); 
    camio.setGaloneskilometro(leerdatos.nextFloat());
    contcamionet.modificar(camio);
   
}
    private void modificartrece(){
         System.out.println("Ingrese la placa a modificar");
    Camionetas camio = new Camionetas();
    camio.setPlaca(leerdatos.next());
    int pos = contcamionet.binarySearch(arreglocamionet, camio.getPlaca());//saca del array y lo agrega nuevamente sin modificar
    camio.setCilindraje(arreglocamionet.get(pos).getCilindraje());
    camio.setGaloneskilometro(arreglocamionet.get(pos).getGaloneskilometro());
    camio.setNumcambios(arreglocamionet.get(pos).getNumcambios());
    camio.setNummotor(arreglocamionet.get(pos).getNummotor());
    camio.setTamllanta(arreglocamionet.get(pos).getTamllanta());
    camio.setTransmisión(arreglocamionet.get(pos).getTransmisión());
    camio.setPrecio(arreglocamionet.get(pos).getPrecio());
    camio.setMarca(arreglocamionet.get(pos).getMarca());
    camio.setColor(arreglocamionet.get(pos).getColor());
    camio.setNumpuertas(arreglocamionet.get(pos).getNumpuertas());
    camio.setTipogasolina(arreglocamionet.get(pos).getTipogasolina());
    camio.setNumchasis(arreglocamionet.get(pos).getNumchasis());
    camio.setTraccion(arreglocamionet.get(pos).getTraccion());
    System.out.println("ingrese el nuevo tipo de gasolina"); 
    camio.setTipogasolina(leerdatos.next());
    contcamionet.modificar(camio);
   
}
    
 private void modificarcatorce(){
         System.out.println("Ingrese la placa a modificar");
    Camionetas camio = new Camionetas();
    camio.setPlaca(leerdatos.next());
    int pos = contcamionet.binarySearch(arreglocamionet, camio.getPlaca());//saca del array y lo agrega nuevamente sin modificar
    camio.setCilindraje(arreglocamionet.get(pos).getCilindraje());
    camio.setGaloneskilometro(arreglocamionet.get(pos).getGaloneskilometro());
    camio.setNumcambios(arreglocamionet.get(pos).getNumcambios());
    camio.setNummotor(arreglocamionet.get(pos).getNummotor());
    camio.setTamllanta(arreglocamionet.get(pos).getTamllanta());
    camio.setTransmisión(arreglocamionet.get(pos).getTransmisión());
    camio.setPrecio(arreglocamionet.get(pos).getPrecio());
    camio.setMarca(arreglocamionet.get(pos).getMarca());
    camio.setColor(arreglocamionet.get(pos).getColor());
    camio.setNumpuertas(arreglocamionet.get(pos).getNumpuertas());
    camio.setTipogasolina(arreglocamionet.get(pos).getTipogasolina());
    camio.setNumchasis(arreglocamionet.get(pos).getNumchasis());
    camio.setTraccion(arreglocamionet.get(pos).getTraccion());
    System.out.println("ingrese llanta repuesto"); 
    camio.setTraccion(leerdatos.next());
    contcamionet.modificar(camio);
   
}   
   
    private void BorrarUnAuto(){
        System.out.println("Digite la placa a borrar");
        Camionetas camionet= new Camionetas();
        camionet.setPlaca(leerdatos.next());
        if (contcamionet.borrar(camionet))
            System.out.println("Objeto Borrado");
        else
            System.out.println("No pudo borrar el objeto");
    }        
    
    private void leerAutomovil()
    {
         Camionetas camionet= new Camionetas();
        
        System.out.println("Numero de placa");  
        String placa = leerdatos.next(); 
        camionet.setPlaca(placa);
        
        System.out.println("Marca");
        camionet.setMarca(leerdatos.next());
        
        System.out.println("Color");
        camionet.setColor(leerdatos.next());
        
        System.out.println("Precio");
        camionet.setPrecio(leerdatos.nextFloat());
        
        System.out.println("Numero de cilindros");
        camionet.setNumerodecilindros(leerdatos.nextInt());
        
        System.out.println("Numero de puertas");
        camionet.setNumpuertas(leerdatos.nextInt());
        
        System.out.println("Numero de cilindraje");
        camionet.setCilindraje(leerdatos.nextFloat());
        
        System.out.println("Numero de chasis");
        camionet.setNumchasis(leerdatos.nextInt());
        
        System.out.println("Numero de motor");
        camionet.setNummotor(leerdatos.nextInt());
        
        System.out.println("Tamaño de Llanta");
        camionet.setTamllanta(leerdatos.nextInt());
        
        System.out.println("Transmision");
        camionet.setTransmisión(leerdatos.next());
        
        System.out.println("Numero de cambios");
        camionet.setNumcambios(leerdatos.nextInt());
        
        System.out.println("Galones de kilometro");
        camionet.setGaloneskilometro(leerdatos.nextFloat());
        
        System.out.println("Tipo gasolina");
        camionet.setTipogasolina(leerdatos.next());
        
        System.out.println("Llantas de repuesto");
        camionet.setTraccion(leerdatos.next());

        if(contcamionet.insertar(camionet))
        {
            System.out.println("Camion insertado");
        }
        else
            System.out.println("Camion NO insertado - placa esta duplicada");
        
    }
 
    public void consultarunAutomovil()
    {System.out.println("Ingrese la placa a consultar");
    Camionetas camio = new Camionetas();
    camio.setPlaca(leerdatos.next());
    int pos = contcamionet.binarySearch(arreglocamionet, camio.getPlaca());//saca del array y lo agrega nuevamente sin modificar
    camio.setCilindraje(arreglocamionet.get(pos).getCilindraje());
    camio.setGaloneskilometro(arreglocamionet.get(pos).getGaloneskilometro());
    camio.setNumcambios(arreglocamionet.get(pos).getNumcambios());
    camio.setNummotor(arreglocamionet.get(pos).getNummotor());
    camio.setTamllanta(arreglocamionet.get(pos).getTamllanta());
    camio.setTransmisión(arreglocamionet.get(pos).getTransmisión());
    camio.setPrecio(arreglocamionet.get(pos).getPrecio());
    camio.setMarca(arreglocamionet.get(pos).getMarca());
    camio.setColor(arreglocamionet.get(pos).getColor());
    camio.setNumpuertas(arreglocamionet.get(pos).getNumpuertas());
    camio.setTipogasolina(arreglocamionet.get(pos).getTipogasolina());
    camio.setNumchasis(arreglocamionet.get(pos).getNumchasis());
    camio.setTraccion(arreglocamionet.get(pos).getTraccion());
    camio.setNumerodecilindros(arreglocamionet.get(pos).getNumerodecilindros());
    camio = (Camionetas)contcamionet.consultarUno(camio);
    System.out.println(camio);
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
    System.out.println("14. Modificar Llanta de repuesto");
    System.out.println("15. Regresar a Menu Principal");
    System.out.println(" Digite su opcion");
    
    int opc = leerdatos.nextInt();    
    switch (opc)
    {
        case 1: 
            modificaruno();
            contcamionet.consultarTodos();
            MenuModif();
            break;
        case 2: 
            modificardos();
            contcamionet.consultarTodos();
            MenuModif();
            break;
        case 3: 
            modificartres();
            contcamionet.consultarTodos();
            MenuModif();
            break;
        case 4:
            modificarcuatro();
            contcamionet.consultarTodos();
            MenuModif();
        case 5: 
            modificarcinco();
            contcamionet.consultarTodos();
            MenuModif();
            break;
        case 6: 
            modificarseis();
            contcamionet.consultarTodos();
            MenuModif();
            break;
        case 7:
            modificarsiete();
            contcamionet.consultarTodos();
            MenuModif();
            break;
        case 8:
            modificarocho();
            contcamionet.consultarTodos();
            MenuModif();
            break;
        case 9:
            modificarnueve();
            contcamionet.consultarTodos();
            MenuModif();
            break;
        case 10:
            modificardiez();
            contcamionet.consultarTodos();
            MenuModif();
            break;
        case 11:
            modificaronce();
            contcamionet.consultarTodos();
            MenuModif();
            break;
        case 12:
            modificardoce();
            contcamionet.consultarTodos();
            MenuModif();
            break;
        case 13:
            modificartrece();
            contcamionet.consultarTodos();
            MenuModif();
            break;
        case 14:
            modificarcatorce();
            contcamionet.consultarTodos();
            MenuModif();
            break;
        case 15:
            MenuCamionet();
            break;
           
        default: 
            System.out.println("Opcion no válida");
            System.exit(0);
            break;
        }
    }       
public void MenuCamionet()
{
    System.out.println("1. Insertar Camionetas");
    System.out.println("2. Consultar todos");
    System.out.println("3. Consultar uno");
    System.out.println("4. Modificar Camionetas");
    System.out.println("5. Ordenar Camionetas - por Marca Ascendente");
    System.out.println("6. Ordenar Camionetas - por Marca Desecendente");
    System.out.println("7. Ordenar Camionetas - por Numero de motor");
    System.out.println("8. Borrar Camioneta");
    System.out.println("9. Regresar a Menu General");
    System.out.println(" Digite su opcion");
    
    int opc = leerdatos.nextInt();    
    switch (opc)
    {
        case 1: 
            leerAutomovil();
            MenuCamionet();
            break;
        case 2: 
            contcamionet.consultarTodos();
            MenuCamionet();
            break;
        case 3: 
            consultarunAutomovil();
            MenuCamionet();
            break;
        case 4: 
            MenuModif();
            MenuCamionet();
            break;
        case 5: 
            contcamionet.ordenar();
            contcamionet.consultarTodos();
            MenuCamionet();
            break;
        case 6:
            contcamionet.burbuja();
            contcamionet.consultarTodos();
            MenuCamionet();
            break;
        case 7:
            contcamionet.ordenar(0,ControladorCamionetas.arreglocamionet.size()-1);
            contcamionet.consultarTodos();
            MenuCamionet();
        case 8: 
            BorrarUnAuto();
            contcamionet.consultarTodos();
            MenuCamionet();
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