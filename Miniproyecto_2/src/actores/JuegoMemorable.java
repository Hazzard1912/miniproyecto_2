/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package actores;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @authors:
 * Jhonnier Hernandez
 * Juan Cifuentes
 * Alejandra Carvajal
 */

public class JuegoMemorable {
    private List<Figura> figuras = new ArrayList<>();
    
    private Figura figuraReto;
    private int numero_de_figuras_a_encontrar;
    private Jugador jugador;
    private Ronda ronda;
    
    public JuegoMemorable(Jugador jugador,List<Figura> figuras, Figura figuraReto){
        this.jugador = jugador;
        this.figuras = figuras;
        this.figuraReto = figuraReto;
        ronda = new Ronda();
        numero_de_figuras_a_encontrar = 0;
    }

    public void setNumero_de_figuras_a_encontrar(int numero_de_figuras_a_encontrar) {
        this.numero_de_figuras_a_encontrar = numero_de_figuras_a_encontrar;
    }
    
    public void contarNumeroDeFigurasAEncontrar(){
        
        
        for (int i = 0; i < figuras.size(); i++){

            if (figuras.get(i).getRutaDeImagen() == figuraReto.getRutaDeImagen()){
                numero_de_figuras_a_encontrar++;
            }
        }
        System.out.println("1. numero_de_figuras_a_encontrar="+numero_de_figuras_a_encontrar);
    }
    
    public boolean esLaFicha(){
        return false;
    }
    
    public boolean todasLasFichasSeleccionadas(Figura figura, Figura una_figura_a_encontrar){
        if (una_figura_a_encontrar.getRutaDeImagen() == figura.getRutaDeImagen()){
            numero_de_figuras_a_encontrar--;
        }
        
        System.out.println("2. numero_de_figuras_a_encontrar="+numero_de_figuras_a_encontrar);
        
        return numero_de_figuras_a_encontrar <= 0;
    }
    
    public String getJugador(){
        return jugador.getNombre();
    }
}
