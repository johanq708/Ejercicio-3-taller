/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio3;
import java.util.ArrayList;
/**
 *
 * @author Johan Quñonez
 */
public class Dia {
    private String nombre;
    private ArrayList<Segmento> segmentos;

    public Dia(String nombre) {
        this.nombre = nombre;
        this.segmentos = new ArrayList<>();
    }
    
    public void agregarsegmento(Segmento c){
        this.segmentos.add(c);
    }

    @Override
    public String toString() {
        return "el " + nombre + segmentos.toString();
    }
    
}
