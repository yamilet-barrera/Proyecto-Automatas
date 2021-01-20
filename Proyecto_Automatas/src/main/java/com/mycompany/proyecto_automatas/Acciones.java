package com.mycompany.proyecto_automatas;

import static com.mycompany.proyecto_automatas.Vista.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author yamil
 */
public class Acciones implements ActionListener{

	String CURP, comprobacion;
	char[] CL;
	
	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource()==btnValidar){
			
			CURP=txt1.getText();
			CL = CURP.toCharArray();
			
			if (validar(CURP)==true) {
                
		       txt2.setText(comprobacion = "Correcto");
			txt3.setText(String.valueOf(CL.length));
            }else{
               
		txt2.setText(comprobacion = "Incorrecto");
			txt3.setText(String.valueOf(CL.length));
            }
			
		}
		
		if(e.getSource()==btnBorrar){
			
			txt1.setText("");
			txt2.setText("");
			txt3.setText("");
		}
	}
	
}



