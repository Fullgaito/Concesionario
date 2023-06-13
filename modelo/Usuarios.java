/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author 
 */

public class Usuarios implements Comparable<Usuarios> {
    private int cedula;
    private String contrasena;
    private String nickname;
    private String tipo; 
    private String nombre;
    private String apellido;
    private String direccion;
    private double telefono;
    private String correo;
    private String fecha;
    //Constructor vacio
    public Usuarios() {
    }
    //Constructor completo

    public String getContrasena() {
        return contrasena;
    }

    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }
    
    public Usuarios(double cedula, String tipo, String nombre, String apellido, String direccion, double telefono, String correo, String fecha) {
        this.cedula = (int) cedula;
        this.tipo = tipo;
        this.nombre = nombre;
        this.apellido = apellido;
        this.direccion = direccion;
        this.telefono = (int) telefono;
        this.correo = correo;
        this.fecha = fecha;
    }
    //Metodos get y set
    public double getCedula() {
        return cedula;
    }

    public void setCedula(double cedula) {
        this.cedula = (int) cedula;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public double getTelefono() {
        return telefono;
    }

    public void setTelefono(double telefono) {
        this.telefono = (int) telefono;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    @Override
    public String toString() {
        return "Usuarios" + "cedula=" + cedula + ", tipo=" + tipo + ", nombre=" + nombre + ", apellido=" + apellido + ", direccion=" + direccion + ", telefono=" + telefono + ", correo=" + correo + ", fecha=" + fecha + '}';
    }
       
    @Override
    public int compareTo(Usuarios usu) {
        return(this.getCedula()<usu.getCedula()? -1: 
                (this.getCedula()== usu.getCedula()? 0 : 1));
    }
    
}
