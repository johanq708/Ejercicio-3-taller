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
public class Programacion {
    private ArrayList<Sala> salas;

    public Programacion() {
        this.salas = new ArrayList<>();
    }
    
    public void agregarsalas(Sala s){
        this.salas.add(s);
    }
    
    public void listarprogramacion(){
        System.out.println("La programacion para las salas es:");
        for(int i=0;i<salas.size();i++){
            System.out.println("-Sala numero "+(i+1)+":");
            salas.get(i).listarsemanas();
        }
    }
}
