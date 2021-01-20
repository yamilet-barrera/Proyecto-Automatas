package com.mycompany.proyecto_automatas;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author yamil
 */
public class Vista {
	
	public static JFrame f = new JFrame("V A L I D A C I Ó N  D E  C U R P");
	public static JButton btnValidar, btnBorrar;
		public static JTextField txt1, txt2, txt3;
		public static JLabel curp, validacion, NumCaract;
	Vista (){
		 f.setSize(500,600 );
                 f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		 f.setLayout(null);
		 f.setLocationRelativeTo(null);
		 
		 JLabel valcurp=new JLabel("V A L I D A C I Ó N  D E  C U R P");
		valcurp.setBounds(165, 50, 200, 50);
		f.add(valcurp);
		
		curp=new JLabel("C U R P");
		curp.setBounds(50, 150, 100, 25);
		f.add(curp);
		
		txt1=new JTextField(60);
		txt1.setBounds(140, 150, 200, 25);
		f.add(txt1);
		
		validacion=new JLabel("V A L I D A C I Ó N");
		validacion.setBounds(20, 200, 100, 25);
		f.add(validacion);
		
		txt2=new JTextField(60);
		txt2.setBounds(140, 200, 100, 25);
		f.add(txt2);
		
		NumCaract=new JLabel("N U M   D E   C A R A C T E R E S");
		NumCaract.setBounds(20, 250, 300, 25);
		f.add(NumCaract);
		
		txt3=new JTextField(60);
		txt3.setBounds(200, 250, 100, 25);
		f.add(txt3);
		
		btnValidar=new JButton("Validar");
		btnValidar.setBounds(97, 370, 100, 25);
		f.add(btnValidar);
		
		
		btnBorrar=new JButton("Limpiar");
		btnBorrar.setBounds(300, 370, 100, 25);
		f.add(btnBorrar);
		
		
		f.setVisible(true);
		
		btnBorrar.addActionListener(new Acciones());
		btnValidar.addActionListener(new Acciones());
		
	}
	
	public static boolean validar(String CURP) {
        return CURP.matches("^"
                + "[A-Z]{1}[AEIOU]{1}[A-Z]{2}"
                + "[0-9]{6}"
                + "[HM]{1}"
                + "(AS|BC|BS|CC|CS|CH|CL|CM|DF|DG|GT|GR|HG|JC|MC|MN|MS|NT|NL|OC|PL|QT|QR|SP|SL|SR|TC|TS|TL|VZ|YN|ZS|NE)"
                + "[BCDFGHJKLMNPQRSTVWXYZ]{3}"
                + "[0-9A-Z]{1}"
                + "[0-9]{1}$");
    }
	
}




















