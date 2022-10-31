/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vista;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.*;
import java.awt.*;

/**
 *
 * @author Jhonnier Hernandez
 */
public class VentanaDatos extends JFrame implements ActionListener{

    public VentanaDatos(){
        iniciarComponentes();
    }
    
    private void iniciarComponentes(){
        JFrame frame = new JFrame();
        setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
        frame.setTitle("DATOS");
        frame.getContentPane();
        frame.setLayout(new GridBagLayout());
        GridBagConstraints c =  new GridBagConstraints();
        
        JLabel nombre = new JLabel("INGRESE SU NOMBRE");
        c.fill = GridBagConstraints.HORIZONTAL;
        c.ipady = 200;
        c.ipadx = 100;
        c.weightx = 0.0;
        c.gridwidth = 3;
        c.gridx = 1;
        c.gridy = 0;
        nombre.setAlignmentX(MAXIMIZED_HORIZ);
        frame.add(nombre,c);
        
        JTextField textoNombre = new JTextField();
        c.fill = GridBagConstraints.HORIZONTAL;
        c.ipady = 0;
        c.weightx = 0.0;
        c.gridwidth = 1;
        c.gridx = 1;
        c.gridy = 1;
        c.insets = new Insets(10,10,10,10);
        frame.add(textoNombre,c);
        
        JButton btnOk = new JButton("OK");
        c.fill = GridBagConstraints.HORIZONTAL;
        c.ipady = 0;
        c.weightx = 0.0;
        c.gridwidth = 1;
        c.gridx = 1;
        c.gridy = 2;
        c.insets = new Insets(10,10,10,10);
        frame.add(btnOk,c);
        
        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
    
    private void iniciarJuego(){
        
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
    }
}
