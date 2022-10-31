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
import java.io.IOException;

/**
 *
 * @author Jhonnier Hernandez
 */
public class VentanaParaQueSirve extends JFrame implements ActionListener{

    public VentanaParaQueSirve(){
        iniciarComponentes();
    }
    
    private void iniciarComponentes(){
        setTitle("PARA QUE SIRVE");
        setSize(1280,700);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(HIDE_ON_CLOSE);
        getRootPane().setWindowDecorationStyle(JRootPane.NONE);
        setUndecorated(true);
        setVisible(true);
        
        setLayout(new BorderLayout());
        JLabel background = new JLabel(new ImageIcon("C:\\Users\\PC\\Desktop\\ProyectosGUIS\\miniproyecto_2\\Miniproyecto_2\\imagenes\\ventanaParaQueSirve\\imgParaQueSirve.png"));
        add(background);
        background.setLayout(new BorderLayout());
        JButton btnOk = new JButton("OK");
        btnOk.setPreferredSize(new Dimension(100,100));
        btnOk.addActionListener(this);
        background.add(btnOk, BorderLayout.SOUTH);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        this.dispose();
    }
}

