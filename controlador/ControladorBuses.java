/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;


import java.util.ArrayList;
import java.util.Collections;
import modelo.Buses;

/**
 *
 * @au
 */
public class ControladorBuses implements CRUD {
    public static ArrayList<Buses> arreglobuses = new ArrayList<Buses>();
   
    @Override
    public boolean insertar(Object obj) {
        boolean inserto = true;
        Buses bustem =new Buses();
        bustem=(Buses)obj; //Casting
        
        if(arreglobuses.isEmpty())
        {
           return inserto = arreglobuses.add(bustem);
        }
        for(Buses bus:arreglobuses)
        {
            if(bus.equals(bustem))
            return inserto = false;
        }
        if (inserto)
        {
            return inserto = arreglobuses.add(bustem);
        }
        return inserto;
            
            
    }
    @Override
    public Object consultarUno(Object obj) {
        //Automovil vacio
        Buses bus= new Buses();
        bus=(Buses)obj;
        Collections.sort(arreglobuses);
        int pos= Collections.binarySearch(arreglobuses, bus);
        if(pos < 0)
        {
            System.out.println("Objeto no encontrado");
        }
        else
        {
            bus= arreglobuses.get(pos);
        }
        return bus;
    }


    @Override
    public void consultarTodos() {
        
          for(Buses bus:arreglobuses)
              System.out.println(bus.toString());   
          
//          for(int i=0;i< arregloautos.size();i++)
//          {
//              System.out.println(arregloautos.get(i).toString());
//          }    
    }

   @Override
    public Object modificar(Object obj) {   
        Buses bus = new Buses();
        bus=(Buses)obj;
        Collections.sort(arreglobuses);
        String cadena = bus.getPlaca();
        int pos= binarySearch(arreglobuses, cadena);
        if(pos!=-1){
            arreglobuses.set(pos,bus);
            return bus;
        }
        else{
            return null;
        }
        
    }
    
    // Returns index of x if it is present in arr[],
    // else return -1
	public static int binarySearch(ArrayList<Buses> arr, String x)
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
        boolean borro=true;
        Buses bus;
        bus = (Buses) obj;
        arreglobuses.remove(bus);
        return borro; 
    }

   
    @Override
    public void ordenar() {
        Collections.sort(arreglobuses);
    }
    //Quicksort
    @Override
    public void ordenar(int izq, int der){
        Buses pivote= arreglobuses.get(izq);   // tomamos primer elemento como pivote
        int i=izq;         // i realiza la búsqueda de izquierda a derecha
        int j=der;         // j realiza la búsqueda de derecha a izquierda
        Buses aux;
 
    while(i < j)
    {    // mientras no se crucen las búsquedas                                   
        while(arreglobuses.get(i).getNummotor() <= pivote.getNummotor()&& i< j )i++; // busca elemento mayor que pivote
        while(arreglobuses.get(j).getNummotor() > pivote.getNummotor()) j--;           // busca elemento menor que pivote
        if (i < j) {                        // si no se han cruzado                      
            aux= arreglobuses.get(i);                      // los intercambia
            arreglobuses.set(i,arreglobuses.get(j));
            arreglobuses.set(j,aux);
        }
   }
   
   arreglobuses.set(izq,arreglobuses.get(j));      // se coloca el pivote en su lugar de forma que tendremos                                    
   arreglobuses.set(j,pivote);      // los menores a su izquierda y los mayores a su derecha
   
   if(izq < j-1) 
        ordenar(izq,j-1);   // ordenamos subarray izquierdo
    if(j+1 < der)
        ordenar(j+1,der);   // ordenamos subarray derecho
   
    }

    @Override
    public void burbuja() {
        Buses aux;
        for (int i = 0; i < arreglobuses.size(); i++) {
            for (int j = i+1; j < arreglobuses.size()-1; j++) {                                                              
                if (arreglobuses.get(j).getMarca().compareToIgnoreCase( arreglobuses.get(j).getMarca()) >=0)
                {
                    aux = arreglobuses.get(j);
                    arreglobuses.set(j,arreglobuses.get(j));
                    arreglobuses.set(j, aux);
                }
            }
        }
        
        
    }
}
