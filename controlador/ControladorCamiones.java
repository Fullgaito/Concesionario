/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import java.util.ArrayList;
import java.util.Collections;
import modelo.Camiones;

/**
 *
 * @au
 */
public class ControladorCamiones implements CRUD {
    public static ArrayList<Camiones> arreglocamion = new ArrayList<Camiones>();
   
    @Override
    public boolean insertar(Object obj) {
        boolean inserto = true;
        Camiones autotem=new Camiones();
        autotem=(Camiones)obj; //Casting
        
        if(arreglocamion.isEmpty())
        {
           return inserto = arreglocamion.add(autotem);
        }
        for(Camiones auto:arreglocamion)
        {
            if(auto.equals(autotem))
            return inserto = false;
        }
        if (inserto)
        {
            return inserto = arreglocamion.add(autotem);
        }
        return inserto;
            
            
    }
    @Override
    public Object consultarUno(Object obj) {
        //Automovil vacio
        Camiones auto= new Camiones();
        auto=(Camiones)obj;
        Collections.sort(arreglocamion);
        int pos= Collections.binarySearch(arreglocamion, auto);
        if(pos < 0)
        {
            System.out.println("Objeto no encontrado");
        }
        else
        {
            auto= arreglocamion.get(pos);
        }
        return auto;
    }

    @Override
    public void consultarTodos() {
        
          for(Camiones auto:arreglocamion)
              System.out.println(auto.toString());   
          
//          for(int i=0;i< arregloautos.size();i++)
//          {
//              System.out.println(arregloautos.get(i).toString());
//          }    
    }

   @Override
    public Object modificar(Object obj) {   
        Camiones auto= new Camiones();
        auto=(Camiones)obj;
        Collections.sort(arreglocamion);
        String cadena = auto.getPlaca();
        int pos= binarySearch(arreglocamion, cadena);
        if(pos!=-1){
            arreglocamion.set(pos,auto);
            return auto;
        }
        else{
            return null;
        }
        
    }
    
    // Returns index of x if it is present in arr[],
    // else return -1
	public static int binarySearch(ArrayList<Camiones> arr, String x)
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
        Camiones auto;
        auto = (Camiones) obj;
        arreglocamion.remove(auto);
        return borro; 
    }

   
    @Override
    public void ordenar() {
        Collections.sort(arreglocamion);
    }
    //Quicksort
    @Override
    public void ordenar(int izq, int der){
        Camiones pivote= arreglocamion.get(izq);   // tomamos primer elemento como pivote
        int i=izq;         // i realiza la búsqueda de izquierda a derecha
        int j=der;         // j realiza la búsqueda de derecha a izquierda
        Camiones aux;
 
    while(i < j)
    {    // mientras no se crucen las búsquedas                                   
        while(arreglocamion.get(i).getNummotor() <= pivote.getNummotor()&& i< j )i++; // busca elemento mayor que pivote
        while(arreglocamion.get(j).getNummotor() > pivote.getNummotor()) j--;           // busca elemento menor que pivote
        if (i < j) {                        // si no se han cruzado                      
            aux= arreglocamion.get(i);                      // los intercambia
            arreglocamion.set(i,arreglocamion.get(j));
            arreglocamion.set(j,aux);
        }
   }
   
   arreglocamion.set(izq,arreglocamion.get(j));      // se coloca el pivote en su lugar de forma que tendremos                                    
   arreglocamion.set(j,pivote);      // los menores a su izquierda y los mayores a su derecha
   
   if(izq < j-1) 
        ordenar(izq,j-1);   // ordenamos subarray izquierdo
    if(j+1 < der)
        ordenar(j+1,der);   // ordenamos subarray derecho
   
    }
@Override
    public void burbuja() {
        Camiones aux;
        for (int i = 0; i < arreglocamion.size(); i++) {
            for (int j = i+1; j < arreglocamion.size()-1; j++) {                                                              
                if (arreglocamion.get(j).getMarca().compareToIgnoreCase( arreglocamion.get(j).getMarca()) >=0)
                {
                    aux = arreglocamion.get(j);
                    arreglocamion.set(j,arreglocamion.get(j));
                    arreglocamion.set(j, aux);
                }
            }
        }
        
        
    }
}