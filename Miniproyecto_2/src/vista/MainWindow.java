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


public class MainWindow extends JFrame implements ActionListener{

    private JButton btnJugar;
    private JButton btnComoJugar;
    private JButton btnParaQueSirve;
    private JLabel lblTitulo;
    
    public MainWindow(){
        initWindow();
    }
    
    private void initWindow(){
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
        c.fill = GridBagConstraints.HORIZONTAL;
        c.ipady = 0;
        c.ipadx = 20;
        c.weightx = 0.0;
        c.gridwidth = 1;
        c.gridx = 0;
        c.gridy = 1;
        frame.add(btnComoJugar, c);
        
        btnJugar = new JButton("JUGAR");
        c.fill = GridBagConstraints.HORIZONTAL;
        c.ipady = 0;
        c.ipadx = 20;
        c.weightx = 0.0;
        c.gridwidth = 1;
        c.gridx = 1;
        c.gridy = 1;
        frame.add(btnJugar, c);
        
        btnParaQueSirve = new JButton("PARA QUE SIRVE");
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
    
    @Override
    public void actionPerformed(ActionEvent e) {
    }
    
}
