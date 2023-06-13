/*
/* To change this license header, choose License Headers in Project Properties.
/* To change this template file, choose Tools | Templates
/* and open the template in the editor.
/*/
package vista;

import controlador.ControladorVolquetas;
import static controlador.ControladorVolquetas.arreglovol;
import java.util.Scanner;
import modelo.Volquetas;


/**
 *
 *
 */
public class MenuVolquetas {
    
      private Scanner leerdatos; 
      private ControladorVolquetas contvol;

    public MenuVolquetas() {
        //Separar memoria para esos objetos
        leerdatos = new Scanner(System.in);
        contvol = new ControladorVolquetas();
        insertarDatosDefecto();
    }
    private void insertarDatosDefecto(){
        Volquetas vol = new Volquetas ("Grande", "UEW241", 2, 3, "Audi", 4, "Cafe", 4, 2, 5, 1, "Mecanica", 4, 2, "Diesel");
        contvol.insertar(vol);
        vol= new Volquetas ("Mediana", "JNE178", 1, 5, "Toyota", 1, "Verde", 2, 1, 4, 9, "Mecanica", 3, 8, "Diesel"); 
        contvol.insertar(vol);
        vol = new Volquetas ("Pequeña", "KEB279", 4, 2, "Mazda", 5, "Rojo", 9, 5, 2, 4, "Mecanica", 1, 5, "Diesel");
        contvol.insertar(vol);
   
    }
private void modificaruno(){
    System.out.println("Ingrese la placa a modificar");
    Volquetas volq = new Volquetas();
    volq.setPlaca(leerdatos.next());
    int pos = contvol.binarySearch(arreglovol, volq.getPlaca());//saca del array y lo agrega nuevamente sin modificar
    volq.setCilindraje(arreglovol.get(pos).getCilindraje());
    volq.setGaloneskilometro(arreglovol.get(pos).getGaloneskilometro());
    volq.setNumcambios(arreglovol.get(pos).getNumcambios());
    volq.setNummotor(arreglovol.get(pos).getNummotor());
    volq.setTamllanta(arreglovol.get(pos).getTamllanta());
    volq.setTransmisión(arreglovol.get(pos).getTransmisión());
    volq.setPrecio(arreglovol.get(pos).getPrecio());
    volq.setMarca(arreglovol.get(pos).getMarca());
    volq.setColor(arreglovol.get(pos).getColor());
    volq.setNumpuertas(arreglovol.get(pos).getNumpuertas());
    volq.setTipogasolina(arreglovol.get(pos).getTipogasolina());
    volq.setNumchasis(arreglovol.get(pos).getNumchasis());
    volq.setTamvol(arreglovol.get(pos).getTamvol());
    System.out.println("ingrese Numero de cilindros"); //modifica color 
    volq.setNumerodecilindros(leerdatos.nextInt());
    contvol.modificar(volq);
   
}
    private void modificardos(){
    System.out.println("Ingrese la placa a modificar");
    Volquetas volq = new Volquetas();
    volq.setPlaca(leerdatos.next());
    int pos = contvol.binarySearch(arreglovol, volq.getPlaca());//saca del array y lo agrega nuevamente sin modificar
    volq.setNumerodecilindros(arreglovol.get(pos).getNumerodecilindros());
    volq.setGaloneskilometro(arreglovol.get(pos).getGaloneskilometro());
    volq.setNumcambios(arreglovol.get(pos).getNumcambios());
    volq.setNummotor(arreglovol.get(pos).getNummotor());
    volq.setTamllanta(arreglovol.get(pos).getTamllanta());
    volq.setTransmisión(arreglovol.get(pos).getTransmisión());
    volq.setPrecio(arreglovol.get(pos).getPrecio());
    volq.setMarca(arreglovol.get(pos).getMarca());
    volq.setColor(arreglovol.get(pos).getColor());
    volq.setNumpuertas(arreglovol.get(pos).getNumpuertas());
    volq.setTipogasolina(arreglovol.get(pos).getTipogasolina());
    volq.setNumchasis(arreglovol.get(pos).getNumchasis());
    volq.setTamvol(arreglovol.get(pos).getTamvol());
    System.out.println("ingrese Cilindraje"); //modifica color 
    volq.setCilindraje(leerdatos.nextInt());
    contvol.modificar(volq);
   
}
    private void modificartres(){
    System.out.println("Ingrese la placa a modificar");
    Volquetas volq = new Volquetas();
    volq.setPlaca(leerdatos.next());
    int pos = contvol.binarySearch(arreglovol, volq.getPlaca());//saca del array y lo agrega nuevamente sin modificar
    volq.setCilindraje(arreglovol.get(pos).getCilindraje());
    volq.setGaloneskilometro(arreglovol.get(pos).getGaloneskilometro());
    volq.setNumcambios(arreglovol.get(pos).getNumcambios());
    volq.setNummotor(arreglovol.get(pos).getNummotor());
    volq.setTamllanta(arreglovol.get(pos).getTamllanta());
    volq.setTransmisión(arreglovol.get(pos).getTransmisión());
    volq.setPrecio(arreglovol.get(pos).getPrecio());
    volq.setNumerodecilindros(arreglovol.get(pos).getNumerodecilindros());
    volq.setColor(arreglovol.get(pos).getColor());
    volq.setNumpuertas(arreglovol.get(pos).getNumpuertas());
    volq.setTipogasolina(arreglovol.get(pos).getTipogasolina());
    volq.setNumchasis(arreglovol.get(pos).getNumchasis());
    volq.setTamvol(arreglovol.get(pos).getTamvol());
    System.out.println("ingrese Marca"); //modifica color 
    volq.setMarca(leerdatos.next());
    contvol.modificar(volq);
   
}
    private void modificarcuatro(){
    System.out.println("Ingrese la placa a modificar");
    Volquetas volq = new Volquetas();
    volq.setPlaca(leerdatos.next());
    int pos = contvol.binarySearch(arreglovol, volq.getPlaca());//saca del array y lo agrega nuevamente sin modificar
    volq.setCilindraje(arreglovol.get(pos).getCilindraje());
    volq.setGaloneskilometro(arreglovol.get(pos).getGaloneskilometro());
    volq.setNumcambios(arreglovol.get(pos).getNumcambios());
    volq.setNummotor(arreglovol.get(pos).getNummotor());
    volq.setTamllanta(arreglovol.get(pos).getTamllanta());
    volq.setTransmisión(arreglovol.get(pos).getTransmisión());
    volq.setNumerodecilindros(arreglovol.get(pos).getNumerodecilindros());
    volq.setMarca(arreglovol.get(pos).getMarca());
    volq.setColor(arreglovol.get(pos).getColor());
    volq.setNumpuertas(arreglovol.get(pos).getNumpuertas());
    volq.setTipogasolina(arreglovol.get(pos).getTipogasolina());
    volq.setNumchasis(arreglovol.get(pos).getNumchasis());
    volq.setTamvol(arreglovol.get(pos).getTamvol());
    System.out.println("ingrese Precio"); //modifica color 
    volq.setPrecio(leerdatos.nextFloat());
    contvol.modificar(volq);
   
}
    private void modificarcinco(){
    System.out.println("Ingrese la placa a modificar");
    Volquetas volq = new Volquetas();
    volq.setPlaca(leerdatos.next());
    int pos = contvol.binarySearch(arreglovol, volq.getPlaca());//saca del array y lo agrega nuevamente sin modificar
    volq.setCilindraje(arreglovol.get(pos).getCilindraje());
    volq.setGaloneskilometro(arreglovol.get(pos).getGaloneskilometro());
    volq.setNumcambios(arreglovol.get(pos).getNumcambios());
    volq.setNummotor(arreglovol.get(pos).getNummotor());
    volq.setTamllanta(arreglovol.get(pos).getTamllanta());
    volq.setTransmisión(arreglovol.get(pos).getTransmisión());
    volq.setPrecio(arreglovol.get(pos).getPrecio());
    volq.setMarca(arreglovol.get(pos).getMarca());
    volq.setNumerodecilindros(arreglovol.get(pos).getNumerodecilindros());
    volq.setNumpuertas(arreglovol.get(pos).getNumpuertas());
    volq.setTipogasolina(arreglovol.get(pos).getTipogasolina());
    volq.setNumchasis(arreglovol.get(pos).getNumchasis());
    volq.setTamvol(arreglovol.get(pos).getTamvol());
    System.out.println("ingrese Color"); //modifica color 
    volq.setColor(leerdatos.next());
    contvol.modificar(volq);
   
}
    private void modificarseis(){
    System.out.println("Ingrese la placa a modificar");
    Volquetas volq = new Volquetas();
    volq.setPlaca(leerdatos.next());
    int pos = contvol.binarySearch(arreglovol, volq.getPlaca());//saca del array y lo agrega nuevamente sin modificar
    volq.setCilindraje(arreglovol.get(pos).getCilindraje());
    volq.setGaloneskilometro(arreglovol.get(pos).getGaloneskilometro());
    volq.setNumcambios(arreglovol.get(pos).getNumcambios());
    volq.setNummotor(arreglovol.get(pos).getNummotor());
    volq.setTamllanta(arreglovol.get(pos).getTamllanta());
    volq.setTransmisión(arreglovol.get(pos).getTransmisión());
    volq.setPrecio(arreglovol.get(pos).getPrecio());
    volq.setMarca(arreglovol.get(pos).getMarca());
    volq.setColor(arreglovol.get(pos).getColor());
    volq.setNumpuertas(arreglovol.get(pos).getNumpuertas());
    volq.setTipogasolina(arreglovol.get(pos).getTipogasolina());
    volq.setNumerodecilindros(arreglovol.get(pos).getNumerodecilindros());
    volq.setTamvol(arreglovol.get(pos).getTamvol());
    System.out.println("ingrese Numero de chasis"); //modifica color 
    volq.setNumchasis(leerdatos.nextInt());
    contvol.modificar(volq);
   
}
   private void modificarsiete(){
         System.out.println("Ingrese la placa a modificar");
    Volquetas volq = new Volquetas();
    volq.setPlaca(leerdatos.next());
    int pos = contvol.binarySearch(arreglovol, volq.getPlaca());//saca del array y lo agrega nuevamente sin modificar
    volq.setCilindraje(arreglovol.get(pos).getCilindraje());
    volq.setGaloneskilometro(arreglovol.get(pos).getGaloneskilometro());
    volq.setNumcambios(arreglovol.get(pos).getNumcambios());
    volq.setNummotor(arreglovol.get(pos).getNummotor());
    volq.setTamllanta(arreglovol.get(pos).getTamllanta());
    volq.setTransmisión(arreglovol.get(pos).getTransmisión());
    volq.setPrecio(arreglovol.get(pos).getPrecio());
    volq.setMarca(arreglovol.get(pos).getMarca());
    volq.setColor(arreglovol.get(pos).getColor());
    volq.setNumpuertas(arreglovol.get(pos).getNumpuertas());
    volq.setTipogasolina(arreglovol.get(pos).getTipogasolina());
    volq.setNumchasis(arreglovol.get(pos).getNumchasis());
    volq.setTamvol(arreglovol.get(pos).getTamvol());
    System.out.println("ingrese Numero de chasis"); //modifica color 
    volq.setNumchasis(leerdatos.nextInt());
    contvol.modificar(volq);
}
    private void modificarocho(){
       System.out.println("Ingrese la placa a modificar");
    Volquetas volq = new Volquetas();
    volq.setPlaca(leerdatos.next());
    int pos = contvol.binarySearch(arreglovol, volq.getPlaca());//saca del array y lo agrega nuevamente sin modificar
    volq.setCilindraje(arreglovol.get(pos).getCilindraje());
    volq.setGaloneskilometro(arreglovol.get(pos).getGaloneskilometro());
    volq.setNumcambios(arreglovol.get(pos).getNumcambios());
    volq.setNummotor(arreglovol.get(pos).getNummotor());
    volq.setTamllanta(arreglovol.get(pos).getTamllanta());
    volq.setTransmisión(arreglovol.get(pos).getTransmisión());
    volq.setPrecio(arreglovol.get(pos).getPrecio());
    volq.setMarca(arreglovol.get(pos).getMarca());
    volq.setColor(arreglovol.get(pos).getColor());
    volq.setNumpuertas(arreglovol.get(pos).getNumpuertas());
    volq.setTipogasolina(arreglovol.get(pos).getTipogasolina());
    volq.setNumchasis(arreglovol.get(pos).getNumchasis());
    volq.setTamvol(arreglovol.get(pos).getTamvol());
    System.out.println("ingrese Numero de motor"); //modifica color 
    volq.setNummotor(leerdatos.nextInt());
    contvol.modificar(volq);
   
}
  
    private void modificarnueve(){
      System.out.println("Ingrese la placa a modificar");
    Volquetas volq = new Volquetas();
    volq.setPlaca(leerdatos.next());
    int pos = contvol.binarySearch(arreglovol, volq.getPlaca());//saca del array y lo agrega nuevamente sin modificar
    volq.setCilindraje(arreglovol.get(pos).getCilindraje());
    volq.setGaloneskilometro(arreglovol.get(pos).getGaloneskilometro());
    volq.setNumcambios(arreglovol.get(pos).getNumcambios());
    volq.setNummotor(arreglovol.get(pos).getNummotor());
    volq.setTamllanta(arreglovol.get(pos).getTamllanta());
    volq.setTransmisión(arreglovol.get(pos).getTransmisión());
    volq.setPrecio(arreglovol.get(pos).getPrecio());
    volq.setMarca(arreglovol.get(pos).getMarca());
    volq.setColor(arreglovol.get(pos).getColor());
    volq.setNumpuertas(arreglovol.get(pos).getNumpuertas());
    volq.setTipogasolina(arreglovol.get(pos).getTipogasolina());
    volq.setNumchasis(arreglovol.get(pos).getNumchasis());
    volq.setTamvol(arreglovol.get(pos).getTamvol());
    System.out.println("ingrese el nuevo tamaño de la llanta"); //modifica color 
    volq.setTamllanta(leerdatos.nextInt());
    contvol.modificar(volq);
   
}
    private void modificardiez(){
        System.out.println("Ingrese la placa a modificar");
    Volquetas volq = new Volquetas();
    volq.setPlaca(leerdatos.next());
    int pos = contvol.binarySearch(arreglovol, volq.getPlaca());//saca del array y lo agrega nuevamente sin modificar
    volq.setCilindraje(arreglovol.get(pos).getCilindraje());
    volq.setGaloneskilometro(arreglovol.get(pos).getGaloneskilometro());
    volq.setNumcambios(arreglovol.get(pos).getNumcambios());
    volq.setNummotor(arreglovol.get(pos).getNummotor());
    volq.setTamllanta(arreglovol.get(pos).getTamllanta());
    volq.setTransmisión(arreglovol.get(pos).getTransmisión());
    volq.setPrecio(arreglovol.get(pos).getPrecio());
    volq.setMarca(arreglovol.get(pos).getMarca());
    volq.setColor(arreglovol.get(pos).getColor());
    volq.setNumpuertas(arreglovol.get(pos).getNumpuertas());
    volq.setTipogasolina(arreglovol.get(pos).getTipogasolina());
    volq.setNumchasis(arreglovol.get(pos).getNumchasis());
    volq.setTamvol(arreglovol.get(pos).getTamvol());
    System.out.println("ingrese la nueva transmision"); //modifica color 
    volq.setTransmisión(leerdatos.next());
    contvol.modificar(volq);
   
}
    private void modificaronce(){
       System.out.println("Ingrese la placa a modificar");
    Volquetas volq = new Volquetas();
    volq.setPlaca(leerdatos.next());
    int pos = contvol.binarySearch(arreglovol, volq.getPlaca());//saca del array y lo agrega nuevamente sin modificar
    volq.setCilindraje(arreglovol.get(pos).getCilindraje());
    volq.setGaloneskilometro(arreglovol.get(pos).getGaloneskilometro());
    volq.setNumcambios(arreglovol.get(pos).getNumcambios());
    volq.setNummotor(arreglovol.get(pos).getNummotor());
    volq.setTamllanta(arreglovol.get(pos).getTamllanta());
    volq.setTransmisión(arreglovol.get(pos).getTransmisión());
    volq.setPrecio(arreglovol.get(pos).getPrecio());
    volq.setMarca(arreglovol.get(pos).getMarca());
    volq.setColor(arreglovol.get(pos).getColor());
    volq.setNumpuertas(arreglovol.get(pos).getNumpuertas());
    volq.setTipogasolina(arreglovol.get(pos).getTipogasolina());
    volq.setNumchasis(arreglovol.get(pos).getNumchasis());
    volq.setTamvol(arreglovol.get(pos).getTamvol());
    System.out.println("ingrese Numero de cambios"); //modifica color 
    volq.setNumcambios(leerdatos.nextInt());
    contvol.modificar(volq);
   
}
    private void modificardoce(){
        System.out.println("Ingrese la placa a modificar");
    Volquetas volq = new Volquetas();
    volq.setPlaca(leerdatos.next());
    int pos = contvol.binarySearch(arreglovol, volq.getPlaca());//saca del array y lo agrega nuevamente sin modificar
    volq.setCilindraje(arreglovol.get(pos).getCilindraje());
    volq.setGaloneskilometro(arreglovol.get(pos).getGaloneskilometro());
    volq.setNumcambios(arreglovol.get(pos).getNumcambios());
    volq.setNummotor(arreglovol.get(pos).getNummotor());
    volq.setTamllanta(arreglovol.get(pos).getTamllanta());
    volq.setTransmisión(arreglovol.get(pos).getTransmisión());
    volq.setPrecio(arreglovol.get(pos).getPrecio());
    volq.setMarca(arreglovol.get(pos).getMarca());
    volq.setColor(arreglovol.get(pos).getColor());
    volq.setNumpuertas(arreglovol.get(pos).getNumpuertas());
    volq.setTipogasolina(arreglovol.get(pos).getTipogasolina());
    volq.setNumchasis(arreglovol.get(pos).getNumchasis());
    volq.setTamvol(arreglovol.get(pos).getTamvol());
    System.out.println("ingrese los nuevos galones por kilometro"); //modifica color 
    volq.setGaloneskilometro(leerdatos.nextFloat());
    contvol.modificar(volq);
   
}
    private void modificartrece(){
        System.out.println("Ingrese la placa a modificar");
    Volquetas volq = new Volquetas();
    volq.setPlaca(leerdatos.next());
    int pos = contvol.binarySearch(arreglovol, volq.getPlaca());//saca del array y lo agrega nuevamente sin modificar
    volq.setCilindraje(arreglovol.get(pos).getCilindraje());
    volq.setGaloneskilometro(arreglovol.get(pos).getGaloneskilometro());
    volq.setNumcambios(arreglovol.get(pos).getNumcambios());
    volq.setNummotor(arreglovol.get(pos).getNummotor());
    volq.setTamllanta(arreglovol.get(pos).getTamllanta());
    volq.setTransmisión(arreglovol.get(pos).getTransmisión());
    volq.setPrecio(arreglovol.get(pos).getPrecio());
    volq.setMarca(arreglovol.get(pos).getMarca());
    volq.setColor(arreglovol.get(pos).getColor());
    volq.setNumpuertas(arreglovol.get(pos).getNumpuertas());
    volq.setTipogasolina(arreglovol.get(pos).getTipogasolina());
    volq.setNumchasis(arreglovol.get(pos).getNumchasis());
    volq.setTamvol(arreglovol.get(pos).getTamvol());
    System.out.println("ingrese el nuevo tipo de gasolina"); //modifica color 
    volq.setTipogasolina(leerdatos.next());
    contvol.modificar(volq);
   
}
 private void modificarcatorce(){
        System.out.println("Ingrese la placa a modificar");
    Volquetas volq = new Volquetas();
    volq.setPlaca(leerdatos.next());
    int pos = contvol.binarySearch(arreglovol, volq.getPlaca());//saca del array y lo agrega nuevamente sin modificar
    volq.setCilindraje(arreglovol.get(pos).getCilindraje());
    volq.setGaloneskilometro(arreglovol.get(pos).getGaloneskilometro());
    volq.setNumcambios(arreglovol.get(pos).getNumcambios());
    volq.setNummotor(arreglovol.get(pos).getNummotor());
    volq.setTamllanta(arreglovol.get(pos).getTamllanta());
    volq.setTransmisión(arreglovol.get(pos).getTransmisión());
    volq.setPrecio(arreglovol.get(pos).getPrecio());
    volq.setMarca(arreglovol.get(pos).getMarca());
    volq.setColor(arreglovol.get(pos).getColor());
    volq.setNumpuertas(arreglovol.get(pos).getNumpuertas());
    volq.setTipogasolina(arreglovol.get(pos).getTipogasolina());
    volq.setNumchasis(arreglovol.get(pos).getNumchasis());
    volq.setTamvol(arreglovol.get(pos).getTamvol());
    System.out.println("ingrese el nuevo peso del cajon"); //modifica color 
    volq.setTamvol(leerdatos.next());
    contvol.modificar(volq);
   
}   
  
    
    private void BorrarUnAuto(){
        System.out.println("Digite la placa a borrar");
        Volquetas vol= new Volquetas();
        vol.setPlaca(leerdatos.next());
        if (contvol.borrar(vol))
            System.out.println("Objeto Borrado");
        else
            System.out.println("No pudo borrar el objeto");
    }        
    
    private void leerAutomovil()
    {
         Volquetas vol= new Volquetas();
        
        System.out.println("Numero de placa");  
        String placa = leerdatos.next(); 
        vol.setPlaca(placa);
        
        System.out.println("Marca");
        vol.setMarca(leerdatos.next());
        
        System.out.println("Color");
        vol.setColor(leerdatos.next());
        
        System.out.println("Precio");
        vol.setPrecio(leerdatos.nextFloat());
        
        System.out.println("Numero de cilindros");
        vol.setNumerodecilindros(leerdatos.nextInt());
        
        System.out.println("Numero de puertas");
        vol.setNumpuertas(leerdatos.nextInt());
        
        System.out.println("Numero de cilindraje");
        vol.setCilindraje(leerdatos.nextFloat());
        
        System.out.println("Numero de chasis");
        vol.setNumchasis(leerdatos.nextInt());
        
        System.out.println("Numero de motor");
        vol.setNummotor(leerdatos.nextInt());
        
        System.out.println("Tamaño de Llanta");
        vol.setTamllanta(leerdatos.nextInt());
        
        System.out.println("Transmision");
        vol.setTransmisión(leerdatos.next());
        
        System.out.println("Numero de cambios");
        vol.setNumcambios(leerdatos.nextInt());
        
        System.out.println("Galones de kilometro");
        vol.setGaloneskilometro(leerdatos.nextFloat());
        
        System.out.println("Tipo gasolina");
        vol.setTipogasolina(leerdatos.next());
        
        System.out.println("Tamaño volco");
        vol.setTamvol(leerdatos.next());

        if(contvol.insertar(vol))
        {
            System.out.println("Camion insertado");
        }
        else
            System.out.println("Camion NO insertado - placa esta duplicada");
        
    }
    public void consultarunAutomovil()
    {
       System.out.println("Ingrese la placa a modificar");
    Volquetas volq = new Volquetas();
    volq.setPlaca(leerdatos.next());
    int pos = contvol.binarySearch(arreglovol, volq.getPlaca());//saca del array y lo agrega nuevamente sin modificar
    volq.setCilindraje(arreglovol.get(pos).getCilindraje());
    volq.setGaloneskilometro(arreglovol.get(pos).getGaloneskilometro());
    volq.setNumcambios(arreglovol.get(pos).getNumcambios());
    volq.setNummotor(arreglovol.get(pos).getNummotor());
    volq.setTamllanta(arreglovol.get(pos).getTamllanta());
    volq.setTransmisión(arreglovol.get(pos).getTransmisión());
    volq.setPrecio(arreglovol.get(pos).getPrecio());
    volq.setMarca(arreglovol.get(pos).getMarca());
    volq.setColor(arreglovol.get(pos).getColor());
    volq.setNumpuertas(arreglovol.get(pos).getNumpuertas());
    volq.setTipogasolina(arreglovol.get(pos).getTipogasolina());
    volq.setNumchasis(arreglovol.get(pos).getNumchasis());
    volq.setTamvol(arreglovol.get(pos).getTamvol());
    volq.setNumerodecilindros(arreglovol.get(pos).getNumerodecilindros());
    volq = (Volquetas)contvol.consultarUno(volq);
    System.out.println(volq);
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
    System.out.println("14. Modificar Peso del cajon");
    System.out.println("15. Modificar Volumen del cajon");
    System.out.println("16. Regresar a Menu Principal");
    System.out.println(" Digite su opcion");
    
    int opc = leerdatos.nextInt();    
    switch (opc)
    {
        case 1: 
            modificaruno();
            contvol.consultarTodos();
            MenuModif();
            break;
        case 2: 
            modificardos();
            contvol.consultarTodos();
            MenuModif();
            break;
        case 3: 
            modificartres();
            contvol.consultarTodos();
            MenuModif();
            break;
        case 4:
            modificarcuatro();
            contvol.consultarTodos();
            MenuModif();
        case 5: 
            modificarcinco();
            contvol.consultarTodos();
            MenuModif();
            break;
        case 6: 
            modificarseis();
            contvol.consultarTodos();
            MenuModif();
            break;
        case 7:
            modificarsiete();
            contvol.consultarTodos();
            MenuModif();
            break;
        case 8:
            modificarocho();
            contvol.consultarTodos();
            MenuModif();
            break;
        case 9:
            modificarnueve();
            contvol.consultarTodos();
            MenuModif();
            break;
        case 10:
            modificardiez();
            contvol.consultarTodos();
            MenuModif();
            break;
        case 11:
            modificaronce();
            contvol.consultarTodos();
            MenuModif();
            break;
        case 12:
            modificardoce();
            contvol.consultarTodos();
            MenuModif();
            break;
        case 13:
            modificartrece();
            contvol.consultarTodos();
            MenuModif();
            break;
        case 14:
            modificarcatorce();
            contvol.consultarTodos();
            MenuModif();
            break;
        case 15:
            MenuVolquetas();
            break;
           
        default: 
            System.out.println("Opcion no válida");
            System.exit(0);
            break;
        }
    }    
public void MenuVolquetas()
{
    System.out.println("1. Insertar Volqueta");
    System.out.println("2. Consultar todos");
    System.out.println("3. Consultar uno");
    System.out.println("4. Modificar Volquetas");
    System.out.println("5. Ordenar Volquetas - por Marca Ascendente");
    System.out.println("6. Ordenar Volquetas - por Marca Desecendente");
    System.out.println("7. Ordenar Volquetas - por Numero de motor");
    System.out.println("8. Borrar Volqueta");
    System.out.println("9. Regresar a Menu General");
    System.out.println(" Digite su opcion");
    
    int opc = leerdatos.nextInt();    
    switch (opc)
    {
        case 1: 
            leerAutomovil();
            MenuVolquetas();
            break;
        case 2: 
            contvol.consultarTodos();
            MenuVolquetas();
            break;
        case 3: 
            consultarunAutomovil();
            MenuVolquetas();
            break;
        case 4: 
            MenuModif();
            MenuVolquetas();
            break;
        case 5: 
            contvol.ordenar();
            contvol.consultarTodos();
            MenuVolquetas();
            break;
        case 6:
            contvol.burbuja();
            contvol.consultarTodos();
            MenuVolquetas();
            break;
        case 7:
            contvol.ordenar(0,ControladorVolquetas.arreglovol.size()-1);
            contvol.consultarTodos();
            MenuVolquetas();
        case 8: 
            BorrarUnAuto();
            contvol.consultarTodos();
            MenuVolquetas();
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