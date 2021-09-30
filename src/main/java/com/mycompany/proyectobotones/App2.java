/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.proyectobotones;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;

/**
 *
 * @author javie
 */
public class App2 implements ActionListener {

    /**
     * Método que se encarga de recoger un evento y aplicárselo al segundo botón
     *
     * @param e
     */
    @Override
    public void actionPerformed(ActionEvent e) {

        // Creación de un objeto de la clase JButton
        JButton boton2 = (JButton) e.getSource();

        // Creación de un objeto de la clase Font
        Font f1 = new Font("Snap ITC", Font.BOLD, 18);

        // Modificamos el valor del background
        boton2.setBackground(Color.BLUE);

        // Modificamos el valor del texto
        boton2.setForeground(Color.WHITE);

        // Modificamos el valor de la fuente
        boton2.setFont(f1);
    }

}
