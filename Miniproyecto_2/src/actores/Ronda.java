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
    
    private int cantidadAciertos;
    private int puntajeTotal;
    private int tiempoJugado;
    
    
    public Ronda(){
        numeroDeRonda = 0;
        cantidadAciertos = 0;
        puntajeTotal = 0;
        tiempoJugado = 0;
    }

    public int getCantidadAciertos() {
        return cantidadAciertos;
    }

    public void setCantidadAciertos(int cantidadAciertos) {
        this.cantidadAciertos = cantidadAciertos;
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
