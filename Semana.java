/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio3;
import java.util.ArrayList;
/**
 *
 * @author Johan Quiñonez
 */
public class Semana {
    private int s;
    private Dia[] dias;
    private ArrayList<Sala> sala;

    public Semana(int s) {
        this.s = s;
        this.dias = new Dia[5];
        this.sala = new ArrayList<>();
    }

    public int getS() {
        return s;
    }
    
    public void agragardias(int i,Dia d){
        this.dias[i]=d;
    }
    
    public void listardias(){
        for(int i=0;i<2;i++){
            System.out.println("  -"+dias[i].toString());
        }
    }

}
