/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package actores;

/**
 *
 * @author Jhonnier Hernandez
 */
public class Jugador {
    private String nombre;
    private int vidas;
    
    public Jugador(){
        nombre = "None";
        vidas = 3;
    }
    
    public Jugador(String nombre){
        this.nombre = nombre;
        vidas = 3;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public int getVidas() {
        return vidas;
    }

    public void setVidas(int vidas) {
        this.vidas = vidas;
    }
    
}
