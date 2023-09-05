/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reinas8;

import java.util.ArrayList;
import java.util.Random;

/**
 *
 * @author Bacs
 */
public class Individuo {
    public int nr;
    public ArrayList<Reinas> cromosoma= new ArrayList<Reinas>();    
    
    public Individuo(int n_r){
        this.nr=n_r;
    }
    
    public void init(){
        for (int i = 0; i < this.nr; i++) {
            Reinas r = new Reinas();
            r.setX((int)(Math.random()*this.nr));
            r.setY((int)(Math.random()*this.nr));
            this.cromosoma.add(r);
        }
        comprobar();
    }
    
    public void comprobar(){
        boolean a=true;
        for(int j=0; j<this.nr;j++){
            for(int i=0; i<this.nr;i++){
                if(j!=i){
                    if(cromosoma.get(j).getX()==cromosoma.get(i).getX() && cromosoma.get(j).getY()==cromosoma.get(i).getY()){
                        Reinas r = new Reinas();
                        r.setX((int)(Math.random()*this.nr));
                        r.setY((int)(Math.random()*this.nr));
                        cromosoma.set(i, r);
                        comprobar();
                    }
                }
            }
        }
    }
    
    public ArrayList<Individuo> cruza(Individuo m){
        ArrayList<Individuo> hijos =new  ArrayList<Individuo>();
        
        Individuo h1 = new Individuo(this.nr);
        Individuo h2 = new Individuo(this.nr);
        
        h1.cromosoma.addAll(this.cromosoma.subList(0, (int)cromosoma.size()/2));
        h1.cromosoma.addAll(m.cromosoma.subList((int)cromosoma.size()/2,cromosoma.size()));
        
        h2.cromosoma.addAll(m.cromosoma.subList(0, (int)cromosoma.size()/2));
        h2.cromosoma.addAll(this.cromosoma.subList((int)cromosoma.size()/2,cromosoma.size()));
        
        h1.comprobar();
        h2.comprobar();
        
        hijos.add(h1);
        hijos.add(h2);

        return hijos;
    }
    
    
    public void mutar(){
        Reinas r = new Reinas();
        r.setX((int)(Math.random()*this.nr));
        r.setY((int)(Math.random()*this.nr));
        cromosoma.set(((int)(Math.random()*this.nr)), r);
        comprobar();
    }
}
