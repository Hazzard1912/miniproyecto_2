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

public class JuegoMemorable {
    private Figura[] vector_de_figuras = new Figura[3];
    private Figura figura_a_encontrar;
    private int numero_de_figuras_a_encontrar;
    private Jugador jugador;
    private Ronda ronda;
    
    public JuegoMemorable(Jugador jugador){
        this.jugador = jugador;
        ronda = new Ronda();
        numero_de_figuras_a_encontrar = 0;
    }
    
    public void contarNumeroDeFigurasAEncontrar(Figura figura1, Figura figura2, Figura figura3, Figura figuraReto){
        vector_de_figuras[0] = figura1;
        vector_de_figuras[1] = figura2;
        vector_de_figuras[2] = figura3;
        
        //this.figura_a_encontrar = una_figura_a_encontrar;
        
        for (int i = 0; i < 3; i++){

            if (vector_de_figuras[i].getRutaDeImagen() == figuraReto.getRutaDeImagen()){
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
