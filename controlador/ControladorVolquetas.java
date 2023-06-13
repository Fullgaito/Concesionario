/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import java.util.ArrayList;
import java.util.Collections;
import modelo.Volquetas;

/**
 *
 * @au
 */
public class ControladorVolquetas implements CRUD {
    public static ArrayList<Volquetas> arreglovol = new ArrayList<Volquetas>();
   
    @Override
    public boolean insertar(Object obj) {
        boolean inserto = true;
        Volquetas autotem=new Volquetas();
        autotem=(Volquetas)obj; //Casting
        
        if(arreglovol.isEmpty())
        {
           return inserto = arreglovol.add(autotem);
        }
        for(Volquetas auto:arreglovol)
        {
            if(auto.equals(autotem))
            return inserto = false;
        }
        if (inserto)
        {
            return inserto = arreglovol.add(autotem);
        }
        return inserto;
            
            
    }
    @Override
    public Object consultarUno(Object obj) {
        //Automovil vacio
        Volquetas auto= new Volquetas();
        auto=(Volquetas)obj;
        Collections.sort(arreglovol);
        int pos= Collections.binarySearch(arreglovol, auto);
        if(pos < 0)
        {
            System.out.println("Objeto no encontrado");
        }
        else
        {
            auto= arreglovol.get(pos);
        }
        return auto;
    }

    @Override
    public void consultarTodos() {
        
          for(Volquetas auto:arreglovol)
              System.out.println(auto.toString());   
          
//          for(int i=0;i< arregloautos.size();i++)
//          {
//              System.out.println(arregloautos.get(i).toString());
//          }    
    }

   @Override
    public Object modificar(Object obj) {   
       Volquetas auto= new Volquetas();
        auto=(Volquetas) obj;
        Collections.sort(arreglovol);
        String cadena = auto.getPlaca();
        int pos= binarySearch(arreglovol, cadena);
        if(pos!=-1){
            arreglovol.set(pos,auto);
            return auto;
        }
        else{
            return null;
        }
        
    }
    
    // Returns index of x if it is present in arr[],
    // else return -1
	public static int binarySearch(ArrayList<Volquetas> arr, String x)
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
        Volquetas auto;
        auto = (Volquetas) obj;
        arreglovol.remove(auto);
        return borro; 
    }

   
    @Override
    public void ordenar() {
        Collections.sort(arreglovol);
    }
    //Quicksort
    @Override
    public void ordenar(int izq, int der){
        Volquetas pivote= arreglovol.get(izq);   // tomamos primer elemento como pivote
        int i=izq;         // i realiza la búsqueda de izquierda a derecha
        int j=der;         // j realiza la búsqueda de derecha a izquierda
        Volquetas aux;
 
    while(i < j)
    {    // mientras no se crucen las búsquedas                                   
        while(arreglovol.get(i).getNummotor() <= pivote.getNummotor()&& i< j )i++; // busca elemento mayor que pivote
        while(arreglovol.get(j).getNummotor() > pivote.getNummotor()) j--;           // busca elemento menor que pivote
        if (i < j) {                        // si no se han cruzado                      
            aux= arreglovol.get(i);                      // los intercambia
            arreglovol.set(i,arreglovol.get(j));
            arreglovol.set(j,aux);
        }
   }
   
   arreglovol.set(izq,arreglovol.get(j));      // se coloca el pivote en su lugar de forma que tendremos                                    
   arreglovol.set(j,pivote);      // los menores a su izquierda y los mayores a su derecha
   
   if(izq < j-1) 
        ordenar(izq,j-1);   // ordenamos subarray izquierdo
    if(j+1 < der)
        ordenar(j+1,der);   // ordenamos subarray derecho
   
    }
@Override
    public void burbuja() {
        Volquetas aux;
        for (int i = 0; i < arreglovol.size(); i++) {
            for (int j = i+1; j < arreglovol.size()-1; j++) {                                                              
                if (arreglovol.get(j).getMarca().compareToIgnoreCase( arreglovol.get(j).getMarca()) >=0)
                {
                    aux = arreglovol.get(j);
                    arreglovol.set(j,arreglovol.get(j));
                    arreglovol.set(j, aux);
                }
            }
        }
        
        
    }
}