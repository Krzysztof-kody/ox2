package com.company;

import javax.swing.*;

public class Main {

    public static void main(String[] args) {
	JFrame okno = new JFrame("OX2");
	Gra gra = new Gra();
	okno.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	okno.setBounds(100,100,600,600);
	okno.add(gra);
	okno.setVisible(true);
    }
}
