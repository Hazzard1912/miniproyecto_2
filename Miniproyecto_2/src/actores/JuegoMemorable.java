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
    
    public void contarNumeroDeFigurasAEncontrar(Figura figura_1, Figura figura_2, Figura figura_3, Figura una_figura_a_encontrar){
        vector_de_figuras[0] = figura_1;
        vector_de_figuras[1] = figura_2;
        vector_de_figuras[2] = figura_3;
        
        this.figura_a_encontrar = una_figura_a_encontrar;
        
        for (int i = 0; i < 3; i++){
            System.out.println(vector_de_figuras[i].getRuta());
            System.out.println(una_figura_a_encontrar.getRuta());

            if (vector_de_figuras[i].getRuta() == figura_a_encontrar.getRuta()){
                numero_de_figuras_a_encontrar++;
            }
        }
        System.out.println(numero_de_figuras_a_encontrar);
    }
    
    public boolean esLaFicha(){
        return false;
    }
    
    public boolean todasLasFichasSeleccionadas(Figura figura){
        if (figura_a_encontrar.getRuta() == figura.getRuta()){
            numero_de_figuras_a_encontrar--;
        }
        
        if (numero_de_figuras_a_encontrar <= 0){
            return true;
        } else{
            return false;
        }
    }
    
    public String getJugador(){
        return jugador.getNombre();
    }
}
