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
public class FitFunc {
    
    public int evaluate(Individuo ind){
        int na=0;
        ArrayList<Reinas> arr=ind.cromosoma;
        for(int a=0;a<ind.nr;a++){
            for(int r=0;r<ind.nr;r++){
                if(a!=r){
                    if(arr.get(a).getX()==arr.get(r).getX() || arr.get(a).getY()==arr.get(r).getY()){
                        na++;
                    }
                    for(int i=1; i<=ind.nr; i++){
                        if(arr.get(a).getX()+i==arr.get(r).getX() && arr.get(a).getY()+i==arr.get(r).getY()){
                            na++;
                        }
                        if(arr.get(a).getX()-i==arr.get(r).getX() && arr.get(a).getY()+i==arr.get(r).getY()){
                            na++;
                        } 
                        if(arr.get(a).getX()+i==arr.get(r).getX() && arr.get(a).getY()-i==arr.get(r).getY()){
                            na++;
                        }
                        if(arr.get(a).getX()-i==arr.get(r).getX() && arr.get(a).getY()-i==arr.get(r).getY()){
                            na++;
                        }
                    }
                    
                }
            }
        }
        return na;
    }
}
