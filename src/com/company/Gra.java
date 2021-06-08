package com.company;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class Gra extends JPanel implements MouseListener {
    public int[][] plansza = new int[3][3];
    public int gracz = 1;
    Gra(){
        addMouseListener(this);
    }

    @Override
    public void paintComponent(Graphics g){
        super.paintComponent(g);

        for(int i=0; i< 3; i++){
            for(int j=0; j< 3; j++){
                System.out.print(" "+plansza[i][j]);
            }
            System.out.println();
        }


        for(int i=0; i< 3; i++)
            for(int j=0; j< 3; j++) {
                g.setColor(Color.BLACK);
                g.drawRect(10 + 155 * j, 10 + 155 * i, 150, 150);
                if(plansza[i][j] == 1) {
                    g.setColor(Color.BLUE);
                    g.drawRect(10 + 155 * j, 10 + 155 * i, 150, 150);

                    g.drawLine(10 + 155 * j, 10 + 155 * i,10 + 155 * j+150, 10 + 155 * i+150 );
                    g.drawLine(10 + 155 * j, 10 + 155 * i + 150,10 + 155 * j+150, 10 + 155 * i );

                }
                if(plansza[i][j] == 2) {
                    g.setColor(Color.RED);
                    g.drawRect(10 + 155 * j, 10 + 155 * i, 150, 150);

                  //  g.drawLine(10 + 155 * j, 10 + 155 * i,10 + 155 * j+150, 10 + 155 * i+150 );
                  //  g.drawLine(10 + 155 * j, 10 + 155 * i + 150,10 + 155 * j+150, 10 + 155 * i );
                    g.drawOval(10 + 155 * j, 10 + 155 * i, 150, 150);
                }
            }
    }


    @Override
    public void mouseClicked(MouseEvent e) {
        for(int i=0; i< 3; i++)
            for(int j=0; j< 3; j++)
                if( e.getX() > 10 + 155*j && e.getX() < 10 + 155*(j+1))
                    if( e.getY() > 10 + 155*i && e.getY() < 10 + 155*(i+1)) {
                        System.out.println(j + ":" + i);
                        plansza[i][j] = gracz;
                        if(gracz == 1) gracz = 2; else gracz=1;
                    }
        repaint();
        //,10 + 155*i, 150, 150);
    }

    @Override
    public void mousePressed(MouseEvent e) {

    }

    @Override
    public void mouseReleased(MouseEvent e) {

    }

    @Override
    public void mouseEntered(MouseEvent e) {

    }

    @Override
    public void mouseExited(MouseEvent e) {

    }
}
