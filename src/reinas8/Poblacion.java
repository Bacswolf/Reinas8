/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reinas8;

import java.util.ArrayList;

/**
 *
 * @author Bacs
 */
public class Poblacion {
    private int sizep;
    public ArrayList<Individuo> po;
    
    public Poblacion(int sp){
        this.sizep=sp;
    }
    
    public void inicializa(int l){
        this.po=new ArrayList<Individuo>();
        for(int i=0;i<this.sizep;i++){
            Individuo ind= new Individuo(l);
            ind.init();
            this.po.add(ind);
        }
    }
}
