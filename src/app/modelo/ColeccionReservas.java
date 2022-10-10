/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package app.modelo;

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
