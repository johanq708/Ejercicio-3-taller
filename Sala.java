/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio3;
import java.util.ArrayList;
/**
 *
 * @author johit
 */
public class Sala {
    private ArrayList<Semana> semanas;

    public Sala() {
        this.semanas = new ArrayList<>();
    }
    public void agregarsemanas(Semana w){
        this.semanas.add(w);
    }

    public void listarsemanas(){
        for(int i=0;i<semanas.size();i++){
            System.out.println(" -Para la semana numero "+semanas.get(i).getS()+", en los siguientes dias hay segmentos:");
            semanas.get(i).listardias();
        }
    }
}
