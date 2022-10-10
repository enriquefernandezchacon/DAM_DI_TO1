/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package app.modelo;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.Date;
import java.util.Vector;

/**
 *
 * @author Enrique
 */
public class Reserva {
    
    private Cliente cliente;
    private LocalDate  fecha;
    private LocalTime hora;
    private FormaPago formaPago;

    public Reserva(Cliente cliente, LocalDate fecha,LocalTime hora, FormaPago formaPago) {
        this.cliente = cliente;
        this.fecha = fecha;
        this.hora = hora;
        this.formaPago = formaPago;
    }

    public Cliente getCliente() {
        return cliente;
    }

    private void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    private void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }
    
    public LocalTime getHora(){
        return hora;
    }
    
    private void setHora(LocalTime hora){
        this.hora = hora;
    }

    public FormaPago getFormaPago() {
        return formaPago;
    }

    private void setFormaPago(FormaPago formaPago) {
        this.formaPago = formaPago;
    }

    public String[] toArrayString() {
        //"Dia","Hora","Cliente","telefono","email", "Forma de Pago"
        String[] as = new String[6];
        as[0]= fecha.toString();
        as[1]= hora.toString();
        as[2]= cliente.getNombre() + " " + cliente.getApellidos();
        as[3] = cliente.getTelefono();
        as[4] = cliente.getEmail();
        as[5] = formaPago.toString();
        return as;
    }
    
    
}
