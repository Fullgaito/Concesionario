/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import controlador.ControladorAuto;
import static controlador.ControladorAuto.arregloautos;
import java.util.Collections;
import java.util.Scanner;
import modelo.Automovil;


/**
 *
 *
 */
public class MenuAuto {
    
      private Scanner leerdatos; 
      private ControladorAuto contauto;

    public MenuAuto() {
        //Separar memoria para esos objetos
        leerdatos = new Scanner(System.in);
        contauto = new ControladorAuto();
        insertarDatosDefecto();
    }
    private void insertarDatosDefecto(){
   
        Automovil auto = new Automovil("GNO908", 4, 8, "Mazda", 20000000, "Verde", 4, 5, 8, 4, "Mecanica", 2, 1, "Diesel");
        contauto.insertar(auto);
        auto = new Automovil("LDN789", 5, 7, "Toyota", 35000000, "Azul", 1, 5, 3, 2, "Mecanica", 7, 4, "Diesel");
        contauto.insertar(auto);
         auto = new Automovil("LSD653", 6, 9, "Audi", 12000000, "Rosa", 1, 7, 2, 9, "Mecanica", 4, 9, "Diesel");
        contauto.insertar(auto);
    }
    
    private void modificaruno(){
    System.out.println("Ingrese la placa a modificar");
    Automovil auto = new Automovil();
    auto.setPlaca(leerdatos.next());
    int pos = contauto.binarySearch(arregloautos, auto.getPlaca());//saca del array y lo agrega nuevamente sin modificar
    auto.setCilindraje(arregloautos.get(pos).getCilindraje());
    auto.setGaloneskilometro(arregloautos.get(pos).getGaloneskilometro());
    auto.setNumcambios(arregloautos.get(pos).getNumcambios());
    auto.setNummotor(arregloautos.get(pos).getNummotor());
    auto.setTamllanta(arregloautos.get(pos).getTamllanta());
    auto.setTransmisión(arregloautos.get(pos).getTransmisión());
    auto.setPrecio(arregloautos.get(pos).getPrecio());
    auto.setMarca(arregloautos.get(pos).getMarca());
    auto.setColor(arregloautos.get(pos).getColor());
    auto.setNumpuertas(arregloautos.get(pos).getNumpuertas());
    auto.setTipogasolina(arregloautos.get(pos).getTipogasolina());
    auto.setNumchasis(arregloautos.get(pos).getNumchasis());
    System.out.println("ingrese Numero de cilindros"); //modifica color 
    auto.setNumerodecilindros(leerdatos.nextInt());
    contauto.modificar(auto);
   
}
    private void modificardos(){
    System.out.println("Ingrese la placa a modificar");
    Automovil auto = new Automovil();
    auto.setPlaca(leerdatos.next());
    int pos = contauto.binarySearch(arregloautos, auto.getPlaca());//saca del array y lo agrega nuevamente sin modificar
    auto.setNumerodecilindros(arregloautos.get(pos).getNumerodecilindros());
    auto.setGaloneskilometro(arregloautos.get(pos).getGaloneskilometro());
    auto.setNumcambios(arregloautos.get(pos).getNumcambios());
    auto.setNummotor(arregloautos.get(pos).getNummotor());
    auto.setTamllanta(arregloautos.get(pos).getTamllanta());
    auto.setTransmisión(arregloautos.get(pos).getTransmisión());
    auto.setPrecio(arregloautos.get(pos).getPrecio());
    auto.setMarca(arregloautos.get(pos).getMarca());
    auto.setColor(arregloautos.get(pos).getColor());
    auto.setNumpuertas(arregloautos.get(pos).getNumpuertas());
    auto.setTipogasolina(arregloautos.get(pos).getTipogasolina());
    auto.setNumchasis(arregloautos.get(pos).getNumchasis());
    System.out.println("ingrese Cilindraje"); //modifica color 
    auto.setCilindraje(leerdatos.nextInt());
    contauto.modificar(auto);
   
}
    private void modificartres(){
    System.out.println("Ingrese la placa a modificar");
    Automovil auto = new Automovil();
    auto.setPlaca(leerdatos.next());
    int pos = contauto.binarySearch(arregloautos, auto.getPlaca());//saca del array y lo agrega nuevamente sin modificar
    auto.setCilindraje(arregloautos.get(pos).getCilindraje());
    auto.setGaloneskilometro(arregloautos.get(pos).getGaloneskilometro());
    auto.setNumcambios(arregloautos.get(pos).getNumcambios());
    auto.setNummotor(arregloautos.get(pos).getNummotor());
    auto.setTamllanta(arregloautos.get(pos).getTamllanta());
    auto.setTransmisión(arregloautos.get(pos).getTransmisión());
    auto.setPrecio(arregloautos.get(pos).getPrecio());
    auto.setNumerodecilindros(arregloautos.get(pos).getNumerodecilindros());
    auto.setColor(arregloautos.get(pos).getColor());
    auto.setNumpuertas(arregloautos.get(pos).getNumpuertas());
    auto.setTipogasolina(arregloautos.get(pos).getTipogasolina());
    auto.setNumchasis(arregloautos.get(pos).getNumchasis());
    System.out.println("ingrese Marca"); //modifica color 
    auto.setMarca(leerdatos.next());
    contauto.modificar(auto);
   
}
    private void modificarcuatro(){
        System.out.println("Ingrese la placa a modificar");
    Automovil auto = new Automovil();
    auto.setPlaca(leerdatos.next());
    int pos = contauto.binarySearch(arregloautos, auto.getPlaca());//saca del array y lo agrega nuevamente sin modificar
    auto.setCilindraje(arregloautos.get(pos).getCilindraje());
    auto.setGaloneskilometro(arregloautos.get(pos).getGaloneskilometro());
    auto.setNumcambios(arregloautos.get(pos).getNumcambios());
    auto.setNummotor(arregloautos.get(pos).getNummotor());
    auto.setTamllanta(arregloautos.get(pos).getTamllanta());
    auto.setTransmisión(arregloautos.get(pos).getTransmisión());
    auto.setNumerodecilindros(arregloautos.get(pos).getNumerodecilindros());
    auto.setMarca(arregloautos.get(pos).getMarca());
    auto.setColor(arregloautos.get(pos).getColor());
    auto.setNumpuertas(arregloautos.get(pos).getNumpuertas());
    auto.setTipogasolina(arregloautos.get(pos).getTipogasolina());
    auto.setNumchasis(arregloautos.get(pos).getNumchasis());
    System.out.println("ingrese Precio"); //modifica color 
    auto.setPrecio(leerdatos.nextFloat());
    contauto.modificar(auto);
   
}
    private void modificarcinco(){
        System.out.println("Ingrese la placa a modificar");
    Automovil auto = new Automovil();
    auto.setPlaca(leerdatos.next());
    int pos = contauto.binarySearch(arregloautos, auto.getPlaca());//saca del array y lo agrega nuevamente sin modificar
    auto.setCilindraje(arregloautos.get(pos).getCilindraje());
    auto.setGaloneskilometro(arregloautos.get(pos).getGaloneskilometro());
    auto.setNumcambios(arregloautos.get(pos).getNumcambios());
    auto.setNummotor(arregloautos.get(pos).getNummotor());
    auto.setTamllanta(arregloautos.get(pos).getTamllanta());
    auto.setTransmisión(arregloautos.get(pos).getTransmisión());
    auto.setPrecio(arregloautos.get(pos).getPrecio());
    auto.setMarca(arregloautos.get(pos).getMarca());
    auto.setNumerodecilindros(arregloautos.get(pos).getNumerodecilindros());
    auto.setNumpuertas(arregloautos.get(pos).getNumpuertas());
    auto.setTipogasolina(arregloautos.get(pos).getTipogasolina());
    auto.setNumchasis(arregloautos.get(pos).getNumchasis());
    System.out.println("ingrese Color"); //modifica color 
    auto.setColor(leerdatos.next());
    contauto.modificar(auto);
   
}
    private void modificarseis(){
        System.out.println("Ingrese la placa a modificar");
    Automovil auto = new Automovil();
    auto.setPlaca(leerdatos.next());
    int pos = contauto.binarySearch(arregloautos, auto.getPlaca());//saca del array y lo agrega nuevamente sin modificar
    auto.setCilindraje(arregloautos.get(pos).getCilindraje());
    auto.setGaloneskilometro(arregloautos.get(pos).getGaloneskilometro());
    auto.setNumcambios(arregloautos.get(pos).getNumcambios());
    auto.setNummotor(arregloautos.get(pos).getNummotor());
    auto.setTamllanta(arregloautos.get(pos).getTamllanta());
    auto.setTransmisión(arregloautos.get(pos).getTransmisión());
    auto.setPrecio(arregloautos.get(pos).getPrecio());
    auto.setMarca(arregloautos.get(pos).getMarca());
    auto.setColor(arregloautos.get(pos).getColor());
    auto.setNumpuertas(arregloautos.get(pos).getNumpuertas());
    auto.setTipogasolina(arregloautos.get(pos).getTipogasolina());
    auto.setNumerodecilindros(arregloautos.get(pos).getNumerodecilindros());
    System.out.println("ingrese Numero de chasis"); //modifica color 
    auto.setNumchasis(leerdatos.nextInt());
    contauto.modificar(auto);
   
}
    private void modificarsiete(){
         System.out.println("Ingrese la placa a modificar");
    Automovil auto = new Automovil();
    auto.setPlaca(leerdatos.next());
    int pos = contauto.binarySearch(arregloautos, auto.getPlaca());//saca del array y lo agrega nuevamente sin modificar
    auto.setCilindraje(arregloautos.get(pos).getCilindraje());
    auto.setGaloneskilometro(arregloautos.get(pos).getGaloneskilometro());
    auto.setNumcambios(arregloautos.get(pos).getNumcambios());
    auto.setNummotor(arregloautos.get(pos).getNummotor());
    auto.setTamllanta(arregloautos.get(pos).getTamllanta());
    auto.setTransmisión(arregloautos.get(pos).getTransmisión());
    auto.setPrecio(arregloautos.get(pos).getPrecio());
    auto.setMarca(arregloautos.get(pos).getMarca());
    auto.setColor(arregloautos.get(pos).getColor());
    auto.setNumpuertas(arregloautos.get(pos).getNumpuertas());
    auto.setTipogasolina(arregloautos.get(pos).getTipogasolina());
    auto.setNumerodecilindros(arregloautos.get(pos).getNumerodecilindros());
    System.out.println("ingrese Numero de motor"); //modifica color 
    auto.setNummotor(leerdatos.nextInt());
    contauto.modificar(auto);
   
}
    private void modificarocho(){
        System.out.println("Ingrese la placa a modificar");
    Automovil auto = new Automovil();
    auto.setPlaca(leerdatos.next());
    int pos = contauto.binarySearch(arregloautos, auto.getPlaca());//saca del array y lo agrega nuevamente sin modificar
    auto.setCilindraje(arregloautos.get(pos).getCilindraje());
    auto.setGaloneskilometro(arregloautos.get(pos).getGaloneskilometro());
    auto.setNumcambios(arregloautos.get(pos).getNumcambios());
    auto.setNummotor(arregloautos.get(pos).getNummotor());
    auto.setTamllanta(arregloautos.get(pos).getTamllanta());
    auto.setTransmisión(arregloautos.get(pos).getTransmisión());
    auto.setPrecio(arregloautos.get(pos).getPrecio());
    auto.setMarca(arregloautos.get(pos).getMarca());
    auto.setColor(arregloautos.get(pos).getColor());
    auto.setNumerodecilindros(arregloautos.get(pos).getNumerodecilindros());
    auto.setTipogasolina(arregloautos.get(pos).getTipogasolina());
    auto.setNumchasis(arregloautos.get(pos).getNumchasis());
    System.out.println("ingrese Numero de puertas"); //modifica color 
    auto.setNumpuertas(leerdatos.nextInt());
    contauto.modificar(auto);
   
}
  
    private void modificarnueve(){
       System.out.println("Ingrese la placa a modificar");
    Automovil auto = new Automovil();
    auto.setPlaca(leerdatos.next());
    int pos = contauto.binarySearch(arregloautos, auto.getPlaca());//saca del array y lo agrega nuevamente sin modificar
    auto.setCilindraje(arregloautos.get(pos).getCilindraje());
    auto.setGaloneskilometro(arregloautos.get(pos).getGaloneskilometro());
    auto.setNumcambios(arregloautos.get(pos).getNumcambios());
    auto.setNummotor(arregloautos.get(pos).getNummotor());
    auto.setNumerodecilindros(arregloautos.get(pos).getNumerodecilindros());
    auto.setTransmisión(arregloautos.get(pos).getTransmisión());
    auto.setPrecio(arregloautos.get(pos).getPrecio());
    auto.setMarca(arregloautos.get(pos).getMarca());
    auto.setColor(arregloautos.get(pos).getColor());
    auto.setNumpuertas(arregloautos.get(pos).getNumpuertas());
    auto.setTipogasolina(arregloautos.get(pos).getTipogasolina());
    auto.setNumchasis(arregloautos.get(pos).getNumchasis());
    System.out.println("ingrese Tamaño de llantas"); //modifica color 
    auto.setTamllanta(leerdatos.nextInt());
    contauto.modificar(auto);
   
}
    private void modificardiez(){
        System.out.println("Ingrese la placa a modificar");
    Automovil auto = new Automovil();
    auto.setPlaca(leerdatos.next());
    int pos = contauto.binarySearch(arregloautos, auto.getPlaca());//saca del array y lo agrega nuevamente sin modificar
    auto.setCilindraje(arregloautos.get(pos).getCilindraje());
    auto.setGaloneskilometro(arregloautos.get(pos).getGaloneskilometro());
    auto.setNumcambios(arregloautos.get(pos).getNumcambios());
    auto.setNummotor(arregloautos.get(pos).getNummotor());
    auto.setTamllanta(arregloautos.get(pos).getTamllanta());
    auto.setNumerodecilindros(arregloautos.get(pos).getNumerodecilindros());
    auto.setPrecio(arregloautos.get(pos).getPrecio());
    auto.setMarca(arregloautos.get(pos).getMarca());
    auto.setColor(arregloautos.get(pos).getColor());
    auto.setNumpuertas(arregloautos.get(pos).getNumpuertas());
    auto.setTipogasolina(arregloautos.get(pos).getTipogasolina());
    auto.setNumchasis(arregloautos.get(pos).getNumchasis());
    System.out.println("ingrese Transmision"); //modifica color 
    auto.setTransmisión(leerdatos.next());
    contauto.modificar(auto);
   
}
    private void modificaronce(){
       System.out.println("Ingrese la placa a modificar");
    Automovil auto = new Automovil();
    auto.setPlaca(leerdatos.next());
    int pos = contauto.binarySearch(arregloautos, auto.getPlaca());//saca del array y lo agrega nuevamente sin modificar
    auto.setCilindraje(arregloautos.get(pos).getCilindraje());
    auto.setGaloneskilometro(arregloautos.get(pos).getGaloneskilometro());
    auto.setNumerodecilindros(arregloautos.get(pos).getNumerodecilindros());
    auto.setNummotor(arregloautos.get(pos).getNummotor());
    auto.setTamllanta(arregloautos.get(pos).getTamllanta());
    auto.setTransmisión(arregloautos.get(pos).getTransmisión());
    auto.setPrecio(arregloautos.get(pos).getPrecio());
    auto.setMarca(arregloautos.get(pos).getMarca());
    auto.setColor(arregloautos.get(pos).getColor());
    auto.setNumpuertas(arregloautos.get(pos).getNumpuertas());
    auto.setTipogasolina(arregloautos.get(pos).getTipogasolina());
    auto.setNumchasis(arregloautos.get(pos).getNumchasis());
    System.out.println("ingrese Numero de cambios"); //modifica color 
    auto.setNumcambios(leerdatos.nextInt());
    contauto.modificar(auto);
   
}
    private void modificardoce(){
        System.out.println("Ingrese la placa a modificar");
    Automovil auto = new Automovil();
    auto.setPlaca(leerdatos.next());
    int pos = contauto.binarySearch(arregloautos, auto.getPlaca());//saca del array y lo agrega nuevamente sin modificar
    auto.setCilindraje(arregloautos.get(pos).getCilindraje());
    auto.setNumerodecilindros(arregloautos.get(pos).getNumerodecilindros());
    auto.setNumcambios(arregloautos.get(pos).getNumcambios());
    auto.setNummotor(arregloautos.get(pos).getNummotor());
    auto.setTamllanta(arregloautos.get(pos).getTamllanta());
    auto.setTransmisión(arregloautos.get(pos).getTransmisión());
    auto.setPrecio(arregloautos.get(pos).getPrecio());
    auto.setMarca(arregloautos.get(pos).getMarca());
    auto.setColor(arregloautos.get(pos).getColor());
    auto.setNumpuertas(arregloautos.get(pos).getNumpuertas());
    auto.setTipogasolina(arregloautos.get(pos).getTipogasolina());
    auto.setNumchasis(arregloautos.get(pos).getNumchasis());
    System.out.println("ingrese Galones por kilometro"); //modifica color 
    auto.setGaloneskilometro(leerdatos.nextFloat());
    contauto.modificar(auto);
   
}
    private void modificartrece(){
        System.out.println("Ingrese la placa a modificar");
    Automovil auto = new Automovil();
    auto.setPlaca(leerdatos.next());
    int pos = contauto.binarySearch(arregloautos, auto.getPlaca());//saca del array y lo agrega nuevamente sin modificar
    auto.setCilindraje(arregloautos.get(pos).getCilindraje());
    auto.setGaloneskilometro(arregloautos.get(pos).getGaloneskilometro());
    auto.setNumcambios(arregloautos.get(pos).getNumcambios());
    auto.setNummotor(arregloautos.get(pos).getNummotor());
    auto.setTamllanta(arregloautos.get(pos).getTamllanta());
    auto.setTransmisión(arregloautos.get(pos).getTransmisión());
    auto.setPrecio(arregloautos.get(pos).getPrecio());
    auto.setMarca(arregloautos.get(pos).getMarca());
    auto.setColor(arregloautos.get(pos).getColor());
    auto.setNumpuertas(arregloautos.get(pos).getNumpuertas());
    auto.setNumerodecilindros(arregloautos.get(pos).getNumerodecilindros());
    auto.setNumchasis(arregloautos.get(pos).getNumchasis());
    System.out.println("ingrese Tipo de gasolina"); //modifica color 
    auto.setTipogasolina(leerdatos.next());
    contauto.modificar(auto);
   
}
    private void BorrarUnAuto(){
        System.out.println("Digite la placa a borrar ");
        Automovil auto = new Automovil();
        auto.setPlaca(leerdatos.next());
        if(contauto.borrar(auto))
            System.out.println("Objeto borrado");
        else
            System.out.println("No se pudo borrar el objeto");
    }
    
    private void leerAutomovil()
    {
        Automovil auto= new Automovil();
        
        System.out.println("Numero de placa");  
        String placa = leerdatos.next(); 
        auto.setPlaca(placa);
        
        System.out.println("Marca");
        auto.setMarca(leerdatos.next());
        
        System.out.println("Color");
        auto.setColor(leerdatos.next());
        
        System.out.println("Precio");
        auto.setPrecio(leerdatos.nextFloat());
        
        System.out.println("Numero de cilindros");
        auto.setNumerodecilindros(leerdatos.nextInt());
        
        System.out.println("Numero de puertas");
        auto.setNumpuertas(leerdatos.nextInt());
        
        System.out.println("Numero de cilindraje");
        auto.setCilindraje(leerdatos.nextFloat());
        
        System.out.println("Numero de chasis");
        auto.setNumchasis(leerdatos.nextInt());
        
        System.out.println("Numero de motor");
        auto.setNummotor(leerdatos.nextInt());
        
        System.out.println("Tamaño de Llanta");
        auto.setTamllanta(leerdatos.nextInt());
        
        System.out.println("Transmision");
        auto.setTransmisión(leerdatos.next());
        
        System.out.println("Numero de cambios");
        auto.setNumcambios(leerdatos.nextInt());
        
        System.out.println("Galones de kilometro");
        auto.setGaloneskilometro(leerdatos.nextFloat());
        
        System.out.println("Tipo gasolina");
        auto.setTipogasolina(leerdatos.next());

        if(contauto.insertar(auto))
        {
            System.out.println("Auto insertado");
        }
        else
            System.out.println("Auto NO insertado - placa esta duplicada");
        
    }
    public void consultarunAutomovil()
    {
    System.out.println("Ingrese la placa a consultar");
    Automovil auto = new Automovil();
    auto.setPlaca(leerdatos.next());
    int pos = contauto.binarySearch(arregloautos, auto.getPlaca());//saca del array y lo agrega nuevamente sin modificar
    auto.setCilindraje(arregloautos.get(pos).getCilindraje());
    auto.setGaloneskilometro(arregloautos.get(pos).getGaloneskilometro());
    auto.setNumcambios(arregloautos.get(pos).getNumcambios());
    auto.setNummotor(arregloautos.get(pos).getNummotor());
    auto.setTamllanta(arregloautos.get(pos).getTamllanta());
    auto.setTransmisión(arregloautos.get(pos).getTransmisión());
    auto.setPrecio(arregloautos.get(pos).getPrecio());
    auto.setMarca(arregloautos.get(pos).getMarca());
    auto.setColor(arregloautos.get(pos).getColor());
    auto.setNumpuertas(arregloautos.get(pos).getNumpuertas());
    auto.setTipogasolina(arregloautos.get(pos).getTipogasolina());
    auto.setNumchasis(arregloautos.get(pos).getNumchasis());
    auto.setNumerodecilindros(arregloautos.get(pos).getNumerodecilindros());
    auto = (Automovil)contauto.consultarUno(auto);
    System.out.println(auto);
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
    System.out.println("14. Regresar a Menu Principal");
    System.out.println(" Digite su opcion");
    
    int opc = leerdatos.nextInt();    
    switch (opc)
    {
        case 1: 
            modificaruno();
            contauto.consultarTodos();
            MenuModif();
            break;
        case 2: 
            modificardos();
            contauto.consultarTodos();
            MenuModif();
            break;
        case 3: 
            modificartres();
            contauto.consultarTodos();
            MenuModif();
            break;
        case 4:
            modificarcuatro();
            contauto.consultarTodos();
            MenuModif();
        case 5: 
            modificarcinco();
            contauto.consultarTodos();
            MenuModif();
            break;
        case 6: 
            modificarseis();
            contauto.consultarTodos();
            MenuModif();
            break;
        case 7:
            modificarsiete();
            contauto.consultarTodos();
            MenuModif();
            break;
        case 8:
            modificarocho();
            contauto.consultarTodos();
            MenuModif();
            break;
        case 9:
            modificarnueve();
            contauto.consultarTodos();
            MenuModif();
            break;
        case 10:
            modificardiez();
            contauto.consultarTodos();
            MenuModif();
            break;
        case 11:
            modificaronce();
            contauto.consultarTodos();
            MenuModif();
            break;
        case 12:
            modificardoce();
            contauto.consultarTodos();
            MenuModif();
            break;
        case 13:
            modificartrece();
            contauto.consultarTodos();
            MenuModif();
            break;
        case 14:
            MenuAuto();
            break;
           
        default: 
            System.out.println("Opcion no válida");
            System.exit(0);
            break;
        }
    } 
      
public void MenuAuto()
{
    System.out.println("1. Insertar Autos");
    System.out.println("2. Consultar todos");
    System.out.println("3. Consultar uno");
    System.out.println("4. Modificar Autos");
    System.out.println("5. Ordenar Autos - por Marca Ascendente");
    System.out.println("6. Ordenar Autos - por Marca Desecendente");
    System.out.println("7. Ordenar Autos - por Numero de motor");
    System.out.println("8. Borrar Auto");
    System.out.println("9. Regresar a Menu General");
    System.out.println(" Digite su opcion");
    
    int opc = leerdatos.nextInt();    
    switch (opc)
    {
        case 1: 
            leerAutomovil();
            MenuAuto();
            break;
        case 2: 
            contauto.consultarTodos();
            MenuAuto();
            break;
        case 3: 
            consultarunAutomovil();
            MenuAuto();
            break;
        case 4: 
            MenuModif();
            MenuAuto();
            break;
        case 5: 
            contauto.ordenar();
            contauto.consultarTodos();
            MenuAuto();
            break;
        case 6:
            contauto.burbuja();
            contauto.consultarTodos();
            MenuAuto();
            break;
        case 7:
            contauto.ordenar(0,ControladorAuto.arregloautos.size()-1);
            contauto.consultarTodos();
            MenuAuto();
        case 8: 
            BorrarUnAuto();
            contauto.consultarTodos();
            MenuAuto();
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
    

