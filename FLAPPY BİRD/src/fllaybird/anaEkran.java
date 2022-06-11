package fllaybird;

import java.awt.Color;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JButton;
import javax.swing.JFrame;



public class anaEkran extends JFrame {

	
	public static void main(String[] args) {
		anaEkran ekran=new anaEkran();
		ekran.setResizable(false);
		ekran.setFocusable(false);
		ekran.setBounds(300, 125, 800, 600);
		ekran.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		oyun oyun=new oyun();
		oyun.requestFocus();
		oyun.addKeyListener(oyun);
		oyun.setFocusable(true);
		oyun.setFocusTraversalKeysEnabled(false);
		ekran.add(oyun);
		ekran.setVisible(true);
		
		
	}
	
}
