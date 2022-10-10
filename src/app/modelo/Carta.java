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
public class Carta {
    
    private List<ElementoCarta> cartaRestaurante;
    
    public Carta() {
        cartaRestaurante = new ArrayList<>();
        anadirElementosIniciales();
    }

    private void anadirElementosIniciales() {
        cartaRestaurante.add(new ElementoCarta(TipoElementoCarta.ENSALADA, "Ensalada verde", "tomate, cebolla, zanahoria, "
                + "atún, huevo, maíz y olivas negras", 6.95));
        cartaRestaurante.add(new ElementoCarta(TipoElementoCarta.ENSALADA, "Ensalada de langostinos crujientes", 
                "con tomates secos, cherrys, aguacate, papadums y salsa tártara", 8.95));
        cartaRestaurante.add(new ElementoCarta(TipoElementoCarta.CARNE, "Pechuga de pollo a la plancha con finas hierbas", "con calabacin y finas hierbas", 7.95));
        cartaRestaurante.add(new ElementoCarta(TipoElementoCarta.CARNE, "Pollo Tikka Masala", "con salteado de arroz, pasas y ajestes", 8.8));
        cartaRestaurante.add(new ElementoCarta(TipoElementoCarta.CARNE, "Hamburguesa Carmen", "Hamburguesa de ternera, queso parmesano, cebolla frita, rúcula, tomate, "
                + "bacón y salsa barbacoa con sus patatas fritas caseras", 9.5));
        cartaRestaurante.add(new ElementoCarta(TipoElementoCarta.PESCADO, "Tataki de atún", "con guacamoles y salsa teriyaki", 10.8));
        cartaRestaurante.add(new ElementoCarta(TipoElementoCarta.PESCADO, "Salmon a la plancha", "con salteado de setas y calabacín y salsa tártara", 11.9));
        cartaRestaurante.add(new ElementoCarta(TipoElementoCarta.PESCADO, "Bacalao", "con puré de patata y compota de cebolla, pasas y miel", 12.8));
    }
    
    public List<ElementoCarta> getCarnes(){
        List<ElementoCarta> lista = new ArrayList<>();
        for (var item : cartaRestaurante) {
            if (item.getTipo().equals(TipoElementoCarta.CARNE)) {
                lista.add(item);
            }
        }
        return lista;
    }
    
    public List<ElementoCarta> getPescados(){
        List<ElementoCarta> lista = new ArrayList<>();
        for (var item : cartaRestaurante) {
            if (item.getTipo().equals(TipoElementoCarta.PESCADO)) {
                lista.add(item);
            }
        }
        return lista;
    }
    
    public List<ElementoCarta> getEnsaladas(){
        List<ElementoCarta> lista = new ArrayList<>();
        for (var item : cartaRestaurante) {
            if (item.getTipo().equals(TipoElementoCarta.ENSALADA)) {
                lista.add(item);
            }
        }
        return lista;
    }
}
