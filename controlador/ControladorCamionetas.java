/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import java.util.ArrayList;
import java.util.Collections;
import modelo.Camionetas;

/**
 *
 * @au
 */
public class ControladorCamionetas implements CRUD {
    public static ArrayList<Camionetas> arreglocamionet = new ArrayList<Camionetas>();
   
    @Override
    public boolean insertar(Object obj) {
        boolean inserto = true;
        Camionetas autotem=new Camionetas();
        autotem=(Camionetas)obj; //Casting
        
        if(arreglocamionet.isEmpty())
        {
           return inserto = arreglocamionet.add(autotem);
        }
        for(Camionetas auto:arreglocamionet)
        {
            if(auto.equals(autotem))
            return inserto = false;
        }
        if (inserto)
        {
            return inserto = arreglocamionet.add(autotem);
        }
        return inserto;
            
            
    }
    @Override
    public Object consultarUno(Object obj) {
        //Automovil vacio
        Camionetas auto= new Camionetas();
        auto=(Camionetas)obj;
        Collections.sort(arreglocamionet);
        int pos= Collections.binarySearch(arreglocamionet, auto);
        if(pos < 0)
        {
            System.out.println("Objeto no encontrado");
        }
        else
        {
            auto= arreglocamionet.get(pos);
        }
        return auto;
    }

    @Override
    public void consultarTodos() {
        
          for(Camionetas auto:arreglocamionet)
              System.out.println(auto.toString());   
          
//          for(int i=0;i< arregloautos.size();i++)
//          {
//              System.out.println(arregloautos.get(i).toString());
//          }    
    }

   @Override
    public Object modificar(Object obj) {   
        Camionetas auto= new Camionetas();
        auto=(Camionetas)obj;
        Collections.sort(arreglocamionet);
        String cadena = auto.getPlaca();
        int pos= binarySearch(arreglocamionet, cadena);
        if(pos!=-1){
            arreglocamionet.set(pos,auto);
            return auto;
        }
        else{
            return null;
        }
        
    }
    
    // Returns index of x if it is present in arr[],
    // else return -1
	public static int binarySearch(ArrayList<Camionetas> arr, String x)
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
        Camionetas auto;
        auto = (Camionetas) obj;
        arreglocamionet.remove(auto);
        return borro; 
    }

   
    @Override
    public void ordenar() {
        Collections.sort(arreglocamionet);
    }
    //Quicksort
    @Override
    public void ordenar(int izq, int der){
        Camionetas pivote= arreglocamionet.get(izq);   // tomamos primer elemento como pivote
        int i=izq;         // i realiza la búsqueda de izquierda a derecha
        int j=der;         // j realiza la búsqueda de derecha a izquierda
        Camionetas aux;
 
    while(i < j)
    {    // mientras no se crucen las búsquedas                                   
        while(arreglocamionet.get(i).getNummotor() <= pivote.getNummotor()&& i< j )i++; // busca elemento mayor que pivote
        while(arreglocamionet.get(j).getNummotor() > pivote.getNummotor()) j--;           // busca elemento menor que pivote
        if (i < j) {                        // si no se han cruzado                      
            aux= arreglocamionet.get(i);                      // los intercambia
            arreglocamionet.set(i,arreglocamionet.get(j));
            arreglocamionet.set(j,aux);
        }
   }
   
   arreglocamionet.set(izq,arreglocamionet.get(j));      // se coloca el pivote en su lugar de forma que tendremos                                    
   arreglocamionet.set(j,pivote);      // los menores a su izquierda y los mayores a su derecha
   
   if(izq < j-1) 
        ordenar(izq,j-1);   // ordenamos subarray izquierdo
    if(j+1 < der)
        ordenar(j+1,der);   // ordenamos subarray derecho
   
    }
@Override
    public void burbuja() {
        Camionetas aux;
        for (int i = 0; i < arreglocamionet.size(); i++) {
            for (int j = i+1; j < arreglocamionet.size()-1; j++) {                                                              
                if (arreglocamionet.get(j).getMarca().compareToIgnoreCase( arreglocamionet.get(j).getMarca()) >=0)
                {
                    aux = arreglocamionet.get(j);
                    arreglocamionet.set(j,arreglocamionet.get(j));
                    arreglocamionet.set(j, aux);
                }
            }
        }
        
        
    }
}