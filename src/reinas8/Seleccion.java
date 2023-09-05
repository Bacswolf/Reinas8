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
public class Seleccion {
    private ArrayList<Integer> aptitudes;
    
    public Seleccion(ArrayList<Integer> ap){
        this.aptitudes=ap;
    }
    
    public int seleccion(){
        int n=(int)(Math.random()*this.aptitudes.size());
        int n2=(int)(Math.random()*this.aptitudes.size());
        if(aptitudes.get(n)<aptitudes.get(n2)){
            return n;
        }
        
        return n2;
    }
}
