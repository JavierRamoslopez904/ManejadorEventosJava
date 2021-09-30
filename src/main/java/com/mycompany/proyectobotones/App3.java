/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.proyectobotones;

/**
 * CLASES IMPORTADAS
 */
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;

/**
 *
 * @author javie
 */
public class App3 implements ActionListener{
    
    /**
     * Método para recoger un evento y aplicárselo al tercer botón
     * @param exc 
     */
    @Override
    public void actionPerformed(ActionEvent exc) {
            // Creación de un objeto de la clase JButton
            JButton boton3 = (JButton)exc.getSource();
            
            // Creación de un objeto de la clase Font
            Font f3 = new Font("Sikta Subheading",Font.BOLD,18);
        
            // Modificamos el valor del bakcground
            boton3.setBackground(Color.GREEN);
            
            // Modificamos el valor del texto
            boton3.setForeground(Color.BLACK);
            
            // Modificamos el valor de la fuente
            boton3.setFont(f3); 
    }
    
}
