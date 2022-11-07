/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Enum.java to edit this template
 */
package app.modelo;

/**
 *
 * @author Enrique
 */
public enum FormaPago {
    METALICO, TARJETA, TICKET_RESTAURANT {
        @Override
        public String toString(){
            return "TICKET INTERNO";
        }
    }, TARJETA_REGALO {
        @Override
        public String toString(){
            return "TARJETA REGALO";
        }
    }
}
