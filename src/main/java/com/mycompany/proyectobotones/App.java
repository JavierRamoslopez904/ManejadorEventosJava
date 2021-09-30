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
public class App implements ActionListener {

    /**
     * Método que se encarga de recoger un evento y aplicárselo al botón que le
     * hayamos especificado en el JFrame
     *
     * @param e
     */
    @Override
    public void actionPerformed(ActionEvent e) {

        // Creación de un objeto de la clase JButton
        JButton boton = (JButton) e.getSource();

        // Creación de un objeto de la clase Font, a la cual le pasamos unos
        // parámetros para que se modifique su valor
        Font f = new Font("Sitka Text", Font.BOLD, 18);

        // Modificamos el valor del background del primer botón
        boton.setBackground(Color.red);

        // Modificamos el valor del texto del primer botón
        boton.setForeground(Color.ORANGE);

        // Modificamos el valor de la fuente del primer botón
        boton.setFont(f);
    }

}
