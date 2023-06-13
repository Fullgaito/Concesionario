/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vista;

import controlador.ControladorAuto;
import controlador.ControladorBuses;
import controlador.ControladorCamiones;
import controlador.ControladorCamionetas;
import controlador.ControladorVolquetas;

import java.util.Scanner;

/**
 *
 *
 */
public class MenuGeneral {

    private Scanner leerdatos; 
    private ControladorAuto contauto;
    private ControladorBuses contbus;
    private ControladorCamiones contcamiones;
    private ControladorCamionetas contcamionet;
    private ControladorVolquetas contvol;

    public MenuGeneral() {
        //Separar memoria para esos objetos
        leerdatos = new Scanner(System.in);
        contauto = new ControladorAuto();
        contbus = new ControladorBuses();
        contcamiones = new ControladorCamiones();
        contcamionet = new ControladorCamionetas();
        contvol = new ControladorVolquetas();
        
    }
    
    public void MenuGeneral()
    {
    System.out.println("1. Carros");
    System.out.println("2. Camionetas y Jeeps");
    System.out.println("3. Camiones");
    System.out.println("4. Volquetas");
    System.out.println("5. Buses y Busetas");
    System.out.println("6. Regresar al menu Principal");
    System.out.println(" Digite su opcion");
    
    int opc = leerdatos.nextInt();    
    switch (opc)
    {
        case 1: 
            MenuAuto menuAu = new MenuAuto();
            menuAu.MenuAuto();
            break;
        case 2: 
            MenuCamionet menuNet = new MenuCamionet();
            menuNet.MenuCamionet();
            break;
        case 3: 
            MenuCamiones menuCa = new MenuCamiones();
            menuCa.MenuCamiones();
            break;
        case 4: 
            MenuVolquetas menuVo = new MenuVolquetas();
            menuVo.MenuVolquetas();
            break;
        case 5: 
            MenuBuses menuBu = new MenuBuses();
            menuBu.MenuBuses();
            break;
        case 6: 
             MenuPrincipal regres = new MenuPrincipal();
            regres.MenuPrincipal();
            break;
        default: 
            
            break;
    }
}    

  
}
