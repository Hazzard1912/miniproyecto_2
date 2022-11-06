/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package actores;

/**
 *
 * @authors:
 * Jhonnier Hernandez
 * Juan Cifuentes
 */

public class JuegoMemorable {
    private Jugador jugador;
    private Ronda ronda;
    
    public JuegoMemorable(Jugador jugador){
        this.jugador = jugador;
        ronda = new Ronda();
    }
    
    public void iniciarRonda(){
        
    }
    
    public boolean esLaFicha(){
        return false;
    }
    
    public boolean todasLasFichasSeleccionadas(){
        return false;
    }
    
    public String getJugador(){
        return jugador.getNombre();
    }
}
