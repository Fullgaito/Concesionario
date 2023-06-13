/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import java.util.ArrayList;
import java.util.Collections;
import modelo.Usuarios;

/**
 *
 * @au
 */
public class ControladorUsuarios implements CRUD {
    public static ArrayList<Usuarios> arreglousu = new ArrayList<Usuarios>();
   
    @Override
    public boolean insertar(Object obj) {
        boolean inserto = true;
        Usuarios usutem=new Usuarios();
        usutem=(Usuarios)obj; //Casting
        
        if(arreglousu.isEmpty())
        {
           return inserto = arreglousu.add(usutem);
        }
        for(Usuarios usu:arreglousu)
        {
            if(usu.equals(usutem))
            return inserto = false;
        }
        if (inserto)
        {
            return inserto = arreglousu.add(usutem);
        }
        return inserto;
            
            
    }
    @Override
    public Object consultarUno(Object obj) {
        //Automovil vacio
        Usuarios usu= new Usuarios();
        usu=(Usuarios)obj;
        Collections.sort(arreglousu);
        int pos= Collections.binarySearch(arreglousu, usu);
        if(pos < 0)
        {
            System.out.println("Objeto no encontrado");
        }
        else
        {
            usu= arreglousu.get(pos);
        }
        return usu;
    }


    @Override
    public void consultarTodos() {
        
          for(Usuarios usu:arreglousu)
              System.out.println(usu.toString());   
          
//          for(int i=0;i< arregloautos.size();i++)
//          {
//              System.out.println(arregloautos.get(i).toString());
//          }    
    }

    @Override
    public Object modificar(Object obj) {
          Usuarios usu= new Usuarios();
        usu=(Usuarios)obj;
        Collections.sort(arreglousu);
        int pos= Collections.binarySearch(arreglousu, usu);
        if(pos < 0)
        {
            return null;
            
        }
        else
        {
            arreglousu.set(pos,usu);
            return usu;
        }
    }

    @Override
    public boolean borrar(Object obj) {
    Usuarios usu= new Usuarios();
        usu=(Usuarios)obj;
        Collections.sort(arreglousu);
        int pos= Collections.binarySearch(arreglousu, usu);
        if(pos < 0)
        {
            System.out.println("Objeto no encontrado");
        }
        else
        {
            usu= arreglousu.remove(pos);
        }
        return true;
    }


   
    @Override
    public void ordenar() {
        Collections.sort(arreglousu);
    }

    @Override
    public void ordenar(int izq, int der){
        Usuarios pivote= arreglousu.get(izq);   // tomamos primer elemento como pivote
        int i=izq;         // i realiza la búsqueda de izquierda a derecha
        int j=der;         // j realiza la búsqueda de derecha a izquierda
        Usuarios aux;
 
    while(i < j)
    {    // mientras no se crucen las búsquedas                                   
        while(arreglousu.get(i).getTelefono()<= pivote.getTelefono()&& i< j )i++; // busca elemento mayor que pivote
        while(arreglousu.get(j).getTelefono()> pivote.getTelefono()) j--;           // busca elemento menor que pivote
        if (i < j) {                        // si no se han cruzado                      
            aux= arreglousu.get(i);                      // los intercambia
            arreglousu.set(i,arreglousu.get(j));
            arreglousu.set(j,aux);
        }
   }
   
   arreglousu.set(izq,arreglousu.get(j));      // se coloca el pivote en su lugar de forma que tendremos                                    
   arreglousu.set(j,pivote);      // los menores a su izquierda y los mayores a su derecha
   
   if(izq < j-1) 
        ordenar(izq,j-1);   // ordenamos subarray izquierdo
    if(j+1 < der)
        ordenar(j+1,der);   // ordenamos subarray derecho
   
    }
@Override
    public void burbuja() {
        Usuarios aux;
        for (int i = 0; i < arreglousu.size(); i++) {
            for (int j = i+1; j < arreglousu.size()-1; j++) {                                                              
                if (arreglousu.get(j).getNombre().compareToIgnoreCase( arreglousu.get(j).getNombre()) >=0)
                {
                    aux = arreglousu.get(j);
                    arreglousu.set(j,arreglousu.get(j));
                    arreglousu.set(j, aux);
                }
            }
        }
        
        
    }
}
