/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package app.modelo;

/**
 *
 * @author Enrique
 */
public class ElementoCarta {
    
    private TipoElementoCarta tipo;
    private String nombre;
    private String descripcion;
    private double precio;

    public ElementoCarta(TipoElementoCarta tipo, String nombre, String descripcion, double precio) {
        this.tipo = tipo;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.precio = precio;
    }

    public TipoElementoCarta getTipo() {
        return tipo;
    }

    private void setTipo(TipoElementoCarta tipo) {
        this.tipo = tipo;
    }

    public String getNombre() {
        return nombre;
    }

    private void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    private void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public double getPrecio() {
        return precio;
    }

    private void setPrecio(double precio) {
        this.precio = precio;
    }
    
    public String[] toArrayString(){
        String[] as = new String[3];
        as[0]= nombre;
        as[1] = String.valueOf(precio) + "€";
        as[2] = descripcion;
        return as;
    }
    
    
}
