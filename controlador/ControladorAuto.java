/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import java.util.ArrayList;
import java.util.Collections;
import modelo.Automovil;

/**
 *
 * @au
 */
public class ControladorAuto implements CRUD {
    public static ArrayList<Automovil> arregloautos = new ArrayList<Automovil>();
   
    @Override
    public boolean insertar(Object obj) {
        boolean inserto = true;
        Automovil autotem=new Automovil();
        autotem=(Automovil)obj; //Casting
        
        if(arregloautos.isEmpty())
        {
           return inserto = arregloautos.add(autotem);
        }
        for(Automovil auto:arregloautos)
        {
            if(auto.equals(autotem))
            return inserto = false;
        }
        if (inserto)
        {
            return inserto = arregloautos.add(autotem);
        }
        return inserto;
            
            
    }
    @Override
    public Object consultarUno(Object obj) {
        //Automovil vacio
        Automovil auto= new Automovil();
        auto=(Automovil)obj;
        Collections.sort(arregloautos);
        int pos= Collections.binarySearch(arregloautos, auto);
        if(pos < 0)
        {
            System.out.println("Objeto no encontrado");
        }
        else
        {
            auto = arregloautos.get(pos);
        }
        return auto;
    }

    @Override
    public void consultarTodos() {
        
          for(Automovil auto:arregloautos)
              System.out.println(auto.toString());   
          
//          for(int i=0;i< arregloautos.size();i++)
//          {
//              System.out.println(arregloautos.get(i).toString());
//          }    
    }

   @Override
    public Object modificar(Object obj) {   
        Automovil auto= new Automovil();
        auto=(Automovil)obj;
        Collections.sort(arregloautos);
        String cadena = auto.getPlaca();
        int pos= binarySearch(arregloautos, cadena);
        if(pos!=-1){
            arregloautos.set(pos,auto);
            return auto;
        }
        else{
            return null;
        }
        
    }
    
    // Returns index of x if it is present in arr[],
    // else return -1
	public static int binarySearch(ArrayList<Automovil> arr, String x)
	{
		int l = 0, r = arr.size() - 1;
		while (l <= r) {
			int m = l + (r - l) / 2;

			int res = x.compareTo((String) arr.get(m).getPlaca());

			// Check if x is present at mid
			if (res == 0)
				return m;

			// If x greater, ignore left half
			if (res > 0)
				l = m + 1;

			// If x is smaller, ignore right half
			else
				r = m - 1;
		}

		return -1;
	}
    
    
    
   
    @Override
    public boolean borrar(Object obj) {
   //Automovil vacio
        boolean borro=true;
        Automovil auto;
        auto = (Automovil) obj;
        arregloautos.remove(auto);
        return borro; 
    }

   
    @Override
    public void ordenar() {
        Collections.sort(arregloautos);
    }
    //Quicksort
    @Override
    public void ordenar(int izq, int der){
        Automovil pivote= arregloautos.get(izq);   // tomamos primer elemento como pivote
        int i=izq;         // i realiza la búsqueda de izquierda a derecha
        int j=der;         // j realiza la búsqueda de derecha a izquierda
        Automovil aux;
 
    while(i < j)
    {    // mientras no se crucen las búsquedas                                   
        while(arregloautos.get(i).getNummotor() <= pivote.getNummotor()&& i< j )i++; // busca elemento mayor que pivote
        while(arregloautos.get(j).getNummotor() > pivote.getNummotor()) j--;           // busca elemento menor que pivote
        if (i < j) {                        // si no se han cruzado                      
            aux= arregloautos.get(i);                      // los intercambia
            arregloautos.set(i,arregloautos.get(j));
            arregloautos.set(j,aux);
        }
   }
   
   arregloautos.set(izq,arregloautos.get(j));      // se coloca el pivote en su lugar de forma que tendremos                                    
   arregloautos.set(j,pivote);      // los menores a su izquierda y los mayores a su derecha
   
   if(izq < j-1) 
        ordenar(izq,j-1);   // ordenamos subarray izquierdo
    if(j+1 < der)
        ordenar(j+1,der);   // ordenamos subarray derecho
   
    }
    @Override
    public void burbuja() {
        Automovil aux;
        for (int i = 0; i < arregloautos.size(); i++) {
            for (int j = i+1; j < arregloautos.size()-1; j++) {                                                              
                if (arregloautos.get(j).getMarca().compareToIgnoreCase( arregloautos.get(j).getMarca()) >=0)
                {
                    aux = arregloautos.get(j);
                    arregloautos.set(j,arregloautos.get(j));
                    arregloautos.set(j, aux);
                }
            }
        
        }
        
        
    }
}
