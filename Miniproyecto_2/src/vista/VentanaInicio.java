/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vista;

/**
 *
 * @author Jhonnier Hernandez
 */

import java.awt.*;
import java.awt.event.ActionEvent;
import javax.swing.*;
import java.awt.event.ActionListener;


public class VentanaInicio extends JFrame implements ActionListener{

    private JButton btnJugar;
    private JButton btnComoJugar;
    private JButton btnParaQueSirve;
    private JLabel lblTitulo;
    
    public VentanaInicio(){
        iniciarComponentes();
    }
    
    private void iniciarComponentes(){
        JFrame frame = new JFrame();
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("memorabble");
        frame.getContentPane();
        frame.setLayout(new GridBagLayout());
        GridBagConstraints c =  new GridBagConstraints();
        lblTitulo = new JLabel("MEMORABBLE");
        c.fill = GridBagConstraints.HORIZONTAL;
        c.ipady = 100;
        c.weightx = 0.0;
        c.gridwidth = 3;
        c.gridx = 1;
        c.gridy = 0;
        frame.add(lblTitulo, c);
        
        btnComoJugar = new JButton("COMO JUGAR");
        btnComoJugar.addActionListener(this);
        c.fill = GridBagConstraints.HORIZONTAL;
        c.ipady = 0;
        c.ipadx = 20;
        c.weightx = 0.0;
        c.gridwidth = 1;
        c.gridx = 0;
        c.gridy = 1;
        frame.add(btnComoJugar, c);
        
        btnJugar = new JButton("JUGAR");
        btnJugar.addActionListener(this);
        c.fill = GridBagConstraints.HORIZONTAL;
        c.ipady = 0;
        c.ipadx = 20;
        c.weightx = 0.0;
        c.gridwidth = 1;
        c.gridx = 1;
        c.gridy = 1;
        frame.add(btnJugar, c);
        
        btnParaQueSirve = new JButton("PARA QUE SIRVE");
        btnParaQueSirve.addActionListener(this);
        c.fill = GridBagConstraints.HORIZONTAL;
        c.ipady = 0;
        c.ipadx = 20;
        c.weightx = 0.0;
        c.gridwidth = 1;
        c.gridx = 2;
        c.gridy = 1;
        frame.add(btnParaQueSirve, c);
        
        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
        
    }
    
    private void abrirVentanaDatos(){
        VentanaDatos ventanaDatos = new VentanaDatos();
    }
    
    private void abrirVentanaComoJugar(){
        VentanaComoJugar ventanaComoJugar = new VentanaComoJugar();
    }
    
    private void abrirVentanaParaQueSirve(){
        VentanaParaQueSirve ventanaParaQueSirve = new VentanaParaQueSirve();
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == btnComoJugar){
            abrirVentanaComoJugar();
        }
        else if(e.getSource() == btnJugar){
            abrirVentanaDatos();
        }
        else if(e.getSource() == btnParaQueSirve){
            abrirVentanaParaQueSirve();
        }
    }
    
}
