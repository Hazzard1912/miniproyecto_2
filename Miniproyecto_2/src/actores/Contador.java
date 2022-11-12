/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package actores;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.Timer;

/**
 *
 * @author juanc
 */
public class Contador {
    Timer timer = new Timer (5000, new ActionListener ()
    {
        public void actionPerformed(ActionEvent e)
        {
            // Aquí el código que queramos ejecutar.
        }
    });

    public Contador(){
        timer.start();
    }
    
}
