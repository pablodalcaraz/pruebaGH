/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entidades;

/**
 *
 * @author Pablo
 */
public class Cliente {
    private String nombre;
    private String Apellido;
    private String dni;
    private String email;

    public Cliente(String nombre, String Apellido, String dni, String email) {
        this.nombre = nombre;
        this.Apellido = Apellido;
        this.dni = dni;
        this.email = email;
    }

    public String getNombre() {
        return nombre;         
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return Apellido;
    }

    public void setApellido(String Apellido) {
        this.Apellido = Apellido;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    
    //comentario
}
