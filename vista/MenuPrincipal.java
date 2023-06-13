/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vista;

import java.util.Scanner;

/**
 *
 * @author 57314
 */
public class MenuPrincipal {
    private Scanner leerdatos;

public MenuPrincipal() {
        //Separar memoria para esos objetos
        leerdatos = new Scanner(System.in);
}
 public void MenuPrincipal()
    {
    System.out.println("1. Carros");
    System.out.println("2. Usuarios");
        System.out.println("Digite una opcion");
    
     int opc = leerdatos.nextInt();    
    switch (opc)
    {
        case 1: 
            MenuGeneral menuGe = new MenuGeneral();
            menuGe.MenuGeneral();
            break;
        case 2: 
            MenuUsuario menuUs = new MenuUsuario();
            menuUs.MenuUsu();
            break;
        }

    }
}
