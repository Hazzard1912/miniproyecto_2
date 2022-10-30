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
        setSize(960, 540);
        setVisible(true);
        setLocationRelativeTo(null);
        setResizable(false);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setTitle("memorabble");
        
        Container container = getContentPane();
        JPanel panel = new JPanel();
        panel.setSize(200,200);
        container.add(panel);
    }
    
    
    
    @Override
    public void actionPerformed(ActionEvent e) {
    }
    
}
