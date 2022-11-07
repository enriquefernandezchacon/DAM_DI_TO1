/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package app.modelo;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.temporal.TemporalUnit;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Enrique
 */
public class ColeccionReservas {
    
    private List<Reserva> reservas;

    public ColeccionReservas() {
        reservas = new ArrayList();
        Cliente cliente = new Cliente("Enrique O.", "Fdez. Chacon", "Calle 1", "662665668", "enrique@enrique.com");
        reservas.add(new Reserva(cliente, LocalDate.now(), LocalTime.now(), FormaPago.METALICO));
        cliente = new Cliente("Cliente de ", "Prueba", "Calle 2", "655655655", "cliente@prueba.com");
        reservas.add(new Reserva(cliente, LocalDate.now().plusDays(1), LocalTime.now().plusHours(2), FormaPago.TICKET_RESTAURANT));
    }
    
    public void anadirReserva(Reserva reserva) {
        reservas.add(reserva);
    }
    
    public List<Reserva> getReservas(){
        List<Reserva> lista = new ArrayList<>();
        for (var reserva : reservas) {
            lista.add(reserva);
        }
        return lista;
    }
    
    
}
