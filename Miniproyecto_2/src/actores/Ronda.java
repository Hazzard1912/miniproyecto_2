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
 * Alejandra Carvajal
 */

public class Ronda {
    private int numeroDeRonda;
    public static int cantidadAciertos;
    public static int puntajeTotal;
    public static int tiempoJugado;
    
    
    public Ronda(){
        numeroDeRonda = 0;
        cantidadAciertos = 0;
        puntajeTotal = 0;
        tiempoJugado = 0;
    }

    public int getPuntajeTotal() {
        return puntajeTotal;
    }

    public void setPuntajeTotal(int puntajeTotal) {
        this.puntajeTotal = puntajeTotal;
    }

    public int getTiempoJugado() {
        return tiempoJugado;
    }

    public void setTiempoJugado(int tiempoJugado) {
        this.tiempoJugado = tiempoJugado;
    }
    
    public void mas1NumeroDeRonda(){
        numeroDeRonda++;
    }
        
    public int getNumeroDeRonda(){
        return numeroDeRonda;
    }
    
}
