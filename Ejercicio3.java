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
public class Ejercicio3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Programacion ps=new Programacion();
        Sala s1=new Sala();
        Sala s2=new Sala();
        Semana w1=new Semana(10);
        Semana w2=new Semana(11);
        Dia d1=new Dia("lunes");
        Dia d2=new Dia("martes");
        Dia d3=new Dia("miercoles");
        Dia d4=new Dia("jueves");
        Segmento c1=new Segmento("10:00 am","11:30 am");
        Segmento c2=new Segmento("1:00 pm","2:35 pm");
        Segmento c3=new Segmento("3:15 pm","4:50 pm");
        Segmento c4=new Segmento("12:40 pm","1:20 pm");
        ps.agregarsalas(s1);
        ps.agregarsalas(s2);
        s1.agregarsemanas(w1);
        s1.agregarsemanas(w2);
        s2.agregarsemanas(w1);
        s2.agregarsemanas(w2);
        w1.agragardias(0, d1);
        w1.agragardias(1, d3);
        w2.agragardias(0, d2);
        w2.agragardias(1, d4);
        d1.agregarsegmento(c1);
        d2.agregarsegmento(c2);
        d3.agregarsegmento(c3);
        d4.agregarsegmento(c4);
        ps.listarprogramacion();
    }
    
}
