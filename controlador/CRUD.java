/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

/**
 *
 * @aut
 */
public interface CRUD {
    public boolean insertar(Object obj);        //Create
    public Object    consultarUno(Object obj);  //Read
    public void        consultarTodos();        //Read
    public Object  modificar(Object obj);      //Update
    public boolean  borrar(Object obj);         //Delete
    public void        ordenar();               //Sort
    public void ordenar(int inicio, int fin);   //Quicsort
    public void burbuja();
    
    
}
