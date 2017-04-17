/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio3;

/**
 *
 * @author Johan Quiñonez
 */
public class Segmento {
    private String horainicio;
    private String horafin;

    public Segmento(String horainicio, String horafin) {
        this.horainicio = horainicio;
        this.horafin = horafin;
    }

    @Override
    public String toString() {
        return "el segmento inicia a las " + horainicio + " y termina a las " + horafin;
    }
    
}
