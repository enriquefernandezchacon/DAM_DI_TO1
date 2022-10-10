/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package app.modelo;

/**
 *
 * @author Enrique
 */
public class Cliente {
    
    private String nombre;
    private String apellidos;
    private String direccion;
    private String telefono;
    private String email;

    public Cliente(String nombre, String apellidos, String direccion, String telefono, String email) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.direccion = direccion;
        this.telefono = telefono;
        this.email = email;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public String getDireccion() {
        return direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public String getEmail() {
        return email;
    }

    private void setNombre(String nombre) {
        this.nombre = nombre;
    }

    private void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    private void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    private void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    private void setEmail(String email) {
        this.email = email;
    }
    
    
}
