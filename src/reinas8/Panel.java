/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reinas8;

import java.awt.Color;
import java.awt.Graphics2D;
import java.util.ArrayList;
import javax.swing.JPanel;

/**
 *
 * @author Bacs
 */
public class Panel {
    private JPanel p;
    private int w;
    private int h;
    private int a,l,n;

    public Panel(JPanel p) {
        this.p=p;
        this.w=p.getWidth();
        this.h=p.getHeight();
    }
    
    public void dibujar(int n,ArrayList<Reinas> r){
        this.n=n;
        Graphics2D g = (Graphics2D) p.getGraphics();
        delay(100);
        g.clearRect(0, 0, w, h);
        this.a=(int)(w/n);
        for(int x=0;x<w;x+=a){
            g.drawLine(x, 0, x, h);
        }
        this.l=(int)(h/n);
        for(int y=0;y<h;y+=l){
            g.drawLine(0, y, w, y);
        }
        for(int i=0;i<r.size();i++){
            dibujarR(r.get(i).getX(), r.get(i).getY());
        }
    }
    
    public void dibujarR(int x, int y){
        Graphics2D g = (Graphics2D) p.getGraphics();
        g.setColor(Color.RED);
        g.fillOval(x*a+a/4, y*l+l/4,a/2,l/2);
    }
    private void delay(long milis){
        try {
                Thread.sleep(milis);
        } catch (InterruptedException e) {
                e.printStackTrace();
        }
    }

}
