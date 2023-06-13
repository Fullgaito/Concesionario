/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import controlador.ControladorUsuarios;
import static controlador.ControladorUsuarios.arreglousu;
import java.util.Scanner;
import modelo.Usuarios;


/**
 *
 *
 */
public class MenuUsuario {
    
      private Scanner leerdatos; 
      private ControladorUsuarios contusuar;

    public MenuUsuario() {
        //Separar memoria para esos objetos
        leerdatos = new Scanner(System.in);
        contusuar = new ControladorUsuarios();
        insertarDatosDefecto();
    }
       private void insertarDatosDefecto(){
   
//        Usuarios usuar = new Usuarios(1076432789, "Tarjeta de identidad", "Raul", "Ramirez", "Calle 7 #2-23", 8996543, "RamirezRau@Gmail.com", "10/07");
//        contusuar.insertar(usuar);
//        usuar = new Usuarios (34065778, "Cedula de ciudadania", "Maria", "Perez", "Calle 2 #5-81", 8936745, "PerezMaria@Gmail.com", "02/09");
//        contusuar.insertar(usuar);
//         usuar = new Usuarios (1056139876,"Tarjeta de identidad", "Camilo", "Palacio", "Cll 6 #8-46", 8906712, "PalacioCamilo@Gmail.com", "07/22");
//        contusuar.insertar(usuar);
    }
    
       private void modificaruno(){
        Usuarios usutemp = new Usuarios();
             System.out.println("ingrese una cedula");
            usutemp.setCedula(leerdatos.nextDouble());
            usutemp = (Usuarios)contusuar.consultarUno(usutemp);
            if(contusuar.modificar(usutemp)==null){
                System.out.println("no existe");
            }
            else{
                System.out.println("ingrese nombre");
                usutemp.setNombre(leerdatos.next());
                usutemp = (Usuarios) contusuar.modificar(usutemp);
                System.out.println(usutemp);
            
            }
       }
      private void modificardos(){
        Usuarios usutemp = new Usuarios();
             System.out.println("ingrese una cedula");
            usutemp.setCedula(leerdatos.nextDouble());
            usutemp = (Usuarios)contusuar.consultarUno(usutemp);
            if(contusuar.modificar(usutemp)==null){
                System.out.println("no existe");
            }
            else{
                System.out.println("ingrese apellido");
                usutemp.setApellido(leerdatos.next());
                usutemp = (Usuarios) contusuar.modificar(usutemp);
                System.out.println(usutemp);
            
            }
        }
      private void modificartres(){
        Usuarios usutemp = new Usuarios();
             System.out.println("ingrese una cedula");
            usutemp.setCedula(leerdatos.nextDouble());
            usutemp = (Usuarios)contusuar.consultarUno(usutemp);
            if(contusuar.modificar(usutemp)==null){
                System.out.println("no existe");
            }
            else{
                System.out.println("ingrese tipo");
                usutemp.setTipo(leerdatos.next());
                usutemp = (Usuarios) contusuar.modificar(usutemp);
                System.out.println(usutemp);
            
            }
        }
      private void modificarcuatro(){
        Usuarios usutemp = new Usuarios();
             System.out.println("ingrese una cedula");
            usutemp.setCedula(leerdatos.nextDouble());
            usutemp = (Usuarios)contusuar.consultarUno(usutemp);
            if(contusuar.modificar(usutemp)==null){
                System.out.println("no existe");
            }
            else{
                System.out.println("ingrese direccion");
                usutemp.setDireccion(leerdatos.next());
                usutemp = (Usuarios) contusuar.modificar(usutemp);
                System.out.println(usutemp);
            
            }
        }
      private void modificarcinco(){
        Usuarios usutemp = new Usuarios();
             System.out.println("ingrese una cedula");
            usutemp.setCedula(leerdatos.nextDouble());
            usutemp = (Usuarios)contusuar.consultarUno(usutemp);
            if(contusuar.modificar(usutemp)==null){
                System.out.println("no existe");
            }
            else{
                System.out.println("ingrese fecha");
                usutemp.setFecha(leerdatos.next());
                usutemp = (Usuarios) contusuar.modificar(usutemp);
                System.out.println(usutemp);
            
            }
        }
      private void modificarseis(){
        Usuarios usutemp = new Usuarios();
             System.out.println("ingrese una cedula");
            usutemp.setCedula(leerdatos.nextDouble());
            usutemp = (Usuarios)contusuar.consultarUno(usutemp);
            if(contusuar.modificar(usutemp)==null){
                System.out.println("no existe");
            }
            else{
                System.out.println("ingrese telefono");
                usutemp.setTelefono(leerdatos.nextInt());
                usutemp = (Usuarios) contusuar.modificar(usutemp);
                System.out.println(usutemp);
            
            }
        }
      private void modificarsiete(){
        Usuarios usutemp = new Usuarios();
             System.out.println("ingrese una cedula");
            usutemp.setCedula(leerdatos.nextDouble());
            usutemp = (Usuarios)contusuar.consultarUno(usutemp);
            if(contusuar.modificar(usutemp)==null){
                System.out.println("no existe");
            }
            else{
                System.out.println("ingrese correo");
                usutemp.setCorreo(leerdatos.next());
                usutemp = (Usuarios) contusuar.modificar(usutemp);
                System.out.println(usutemp);
            
            }
        }
  
    private void BorrarUnAuto(){
        System.out.println("Digite el nombre a borrar ");
        Usuarios usuar = new Usuarios();
        usuar.setCedula(leerdatos.nextInt());
        if(contusuar.borrar(usuar))
            System.out.println("Objeto borrado");
        else
            System.out.println("No se pudo borrar el objeto");
    }
    
    private void leerAutomovil()
    {
       Usuarios usu= new Usuarios();
        
        System.out.println("Nombre");  
        String nombre = leerdatos.next(); 
        usu.setNombre(nombre);
        
        System.out.println("Apellido");
        usu.setApellido(leerdatos.next());
        
        System.out.println("Cedula");
        usu.setCedula(leerdatos.nextInt());
        
        System.out.println("Tipo");
        usu.setTipo(leerdatos.next());
        
        System.out.println("Direccion");
        usu.setDireccion(leerdatos.next());
        
        System.out.println("Telefono");
        usu.setTelefono(leerdatos.nextDouble());
        
        System.out.println("Correo");
        usu.setCorreo(leerdatos.next());
        
        System.out.println("Fecha");
        usu.setFecha(leerdatos.next());
        
        if(contusuar.insertar(usu))
        {
            System.out.println("Datos insertados");
        }
        else
            System.out.println("Datos NO insertados - datos estan duplicados");
        
    }
    public void consultarunUsuario()
    {
        Usuarios usuar= new Usuarios();
        System.out.println("Digite la placa que desea");
        usuar.setNombre(leerdatos.next());
        System.out.println(arreglousu.toString());
    }
public void MenuModif()
{
    System.out.println("1. Modificar Nombre");
    System.out.println("2. Modificar Apellido");
    System.out.println("3. Modificar Tipo");
    System.out.println("4. Modificar Direccion");
    System.out.println("5. Modificar Fecha");
    System.out.println("6. Modificar Telefono");
    System.out.println("7. Modificar correo");
    System.out.println("8. Regresar a Menu Principal");
    System.out.println(" Digite su opcion");
    
    int opc = leerdatos.nextInt();    
    switch (opc)
    {
        case 1: 
            modificaruno();
            MenuModif();
            break;
        case 2: 
            modificardos();
            MenuModif();
            break;
        case 3: 
            modificartres();
            MenuModif();
            break;
        case 4:
            modificarcuatro();
            MenuModif();
        case 5: 
            modificarcinco();
            MenuModif();
            break;
        case 6: 
            modificarseis();
            MenuModif();
            break;
        case 7:
            modificarsiete();
            MenuModif();
            break;
        case 8:
            MenuUsu();
            break;
           
        default: 
            System.out.println("Opcion no válida");
            System.exit(0);
            break;
        }
    } 
    
    
    
public void MenuUsu()
{
    System.out.println("1. Insertar Datos");
    System.out.println("2. Consultar todos");
    System.out.println("3. Consultar uno");
    System.out.println("4. Modificar Datos");
    System.out.println("5. Ordenar Datos - por Nombre");
    System.out.println("6. Ordenar por Telefono");
    System.out.println("7. Borrar Datos");
    System.out.println("8. Regresar a Menu Principal");
    System.out.println(" Digite su opcion");
    
    int opc = leerdatos.nextInt();    
    switch (opc)
    {
        case 1: 
            leerAutomovil();
            MenuUsu();
            break;
        case 2: 
            contusuar.consultarTodos();
            MenuUsu();
            break;
        case 3: 
            consultarunUsuario();
            MenuUsu();
            break;
        case 4:
            MenuModif();
            MenuUsu();
        case 5: 
            contusuar.ordenar();
            contusuar.consultarTodos();
            MenuUsu();
            break;
        case 6:
            contusuar.ordenar(0,ControladorUsuarios.arreglousu.size()-1);
            contusuar.consultarTodos();
            MenuUsu();
        case 7: 
            BorrarUnAuto();
            contusuar.consultarTodos();
            MenuUsu();
            break;
        case 8:
            MenuGeneral regres = new MenuGeneral();
            regres.MenuGeneral();
        default: 
            System.out.println("Opcion no válida");
            System.exit(0);
            break;
        }
    }    
}
    
