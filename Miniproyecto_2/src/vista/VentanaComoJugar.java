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
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

/**
 *
 * @author Jhonnier Hernandez
 */
public class VentanaComoJugar extends JFrame implements ActionListener{
    private JButton btnOk;
    private JButton btnSiguiente;
    private JLabel background;
    int contador = 1;
    
    
    public VentanaComoJugar(){
        iniciarComponentes();
    }
    
    private void iniciarComponentes(){
        setTitle("COMO JUGAR");
        setSize(1310,700);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(HIDE_ON_CLOSE);
        getRootPane().setWindowDecorationStyle(JRootPane.NONE);
        setUndecorated(true);
        setVisible(true);
        
        setLayout(new BorderLayout());
        background = new JLabel(new ImageIcon("C:\\Users\\PC\\Desktop\\ProyectosGUIS\\miniproyecto_2\\Miniproyecto_2\\imagenes\\ventanaComoJugar\\pagina1.png"));
        add(background);
        background.setLayout(new BorderLayout());
        btnOk = new JButton("OK");
        btnOk.addActionListener(this);
        background.add(btnOk, BorderLayout.SOUTH);
        
        btnSiguiente = new JButton("Siguiente");
        btnSiguiente.setSize(30, HEIGHT);
        btnSiguiente.addActionListener(this);
        btnSiguiente.addMouseListener(new MouseManager());
        background.add(btnSiguiente, BorderLayout.LINE_END);

    }
    
    private void cambiarPagina(int numeroPagina){
        
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == btnOk){
            this.dispose();
        }else if(e.getSource() == btnSiguiente){
            switch(contador){
                case 2 -> cambiarPagina(2);
                case 3 -> cambiarPagina(3);
                case 4 -> cambiarPagina(4);
                case 5 -> cambiarPagina(5);
            }
        }
    }
    
    private class MouseManager implements MouseListener{

        @Override
        public void mouseClicked(MouseEvent e) {
            if(e.getClickCount() > 0){
                if(contador == 5){
                    System.out.println("contador llego al limite");
                }
                else{
                  contador++;  
                }
            }
        }

        @Override
        public void mousePressed(MouseEvent e) {
        }

        @Override
        public void mouseReleased(MouseEvent e) {
        }

        @Override
        public void mouseEntered(MouseEvent e) {
        }

        @Override
        public void mouseExited(MouseEvent e) {
        }
        
    }
}