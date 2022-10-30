/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package actores;

/**
 *
 * @author Jhonnier Hernandez
 */

public class Ronda {
    private int cantidadAciertos;
    private int cantidadFallos;
    private int puntajeTotal;
    private int tiempoJugado;
    
    
    public Ronda(){
        cantidadAciertos = 0;
        cantidadFallos = 0;
        puntajeTotal = 0;
        tiempoJugado = 0;
    }

    public int getCantidadAciertos() {
        return cantidadAciertos;
    }

    public void setCantidadAciertos(int cantidadAciertos) {
        this.cantidadAciertos = cantidadAciertos;
    }

    public int getCantidadFallos() {
        return cantidadFallos;
    }

    public void setCantidadFallos(int cantidadFallos) {
        this.cantidadFallos = cantidadFallos;
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
    
}
