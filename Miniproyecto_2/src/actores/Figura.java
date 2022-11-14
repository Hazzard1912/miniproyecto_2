/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package actores;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

/**
 *
 * @authors: Jhonnier Hernandez Juan Cifuentes Alejandra Carvajal
 */
public class Figura {
<<<<<<< HEAD

    private static List<String>listaDeRutasDeImagenes = new ArrayList<>(Arrays.asList("/imagenes/figuras/circulo.png", "/imagenes/figuras/circuloverde.png", 
            "/imagenes/figuras/circulorojo.png", "/imagenes/figuras/triangulo.png", "/imagenes/figuras/trianguloverde.png", "/imagenes/figuras/triangulorojo.png",
            "/imagenes/figuras/cuadrado.png", "/imagenes/figuras/cuadradoverde.png", "/imagenes/figuras/cuadradorojo.png"));
=======
    
    // Es la lista de las rutas de las imagenes con figuras, es static porque solo se necesita una para todas las figuras.
    private static String[] listaDeRutasDeImagenes = {"/imagenes/figuras/circulo.png", "/imagenes/figuras/cuadrado.png", "/imagenes/figuras/triangulo.png"};
    // Este atributo indica la ruta de la imagen que tiene la figura (circulo, triangulo, cuadrado, etc), este puede cambiar con el metodo setRutaDeImagen()
>>>>>>> 6842c6cd55ffb96a205c8edaf9c3fa52fa17930e
    private String rutaDeImagen;
    // Este atributo indica si ya se ha usado el metodo setRutaDeImagen() en el objeto (instancia) creado
    private boolean setRutaDeImagenSinUsar;
    // Este atributo indica si la figura ya se a observado (o revelado despues de que el contador finalizo)
    private boolean figuraObservada;

    private String forma;
    private String color;

    public Figura() {
        setRutaDeImagenSinUsar = true;
        figuraObservada = false;
    }

    public String getForma() {
        return forma;
    }

    public void setForma(String forma) {
        this.forma = forma;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    // Cambia la ruta de la imagen. Este metodo se ejecuta cuando se inicia una ronda
    public void setRutaDeImagen() {
        if (setRutaDeImagenSinUsar == true) {
            setRutaDeImagenSinUsar = false;
        }
        int numeroRandom = (int)(Math.random() * (listaDeRutasDeImagenes.size() - 1));
        rutaDeImagen = listaDeRutasDeImagenes.get(numeroRandom);

        figuraObservada = false;
    }

    // Dice la ruta de la imagen. Este metodo se ejecuta cuando se da click a una ficha
    public String getRutaDeImagen() {
        return rutaDeImagen;
    }

    // Hace que el label relacionado con lafigura muestre en pantalla la imagen (circulo, cuadrado, etc). Este metodo se ejecuta cuando se da click a una ficha despues de finalizado el contador
    public void setRutaDeImagenTo(javax.swing.JLabel labelX) {
        if (setRutaDeImagenSinUsar == true) {
            setRutaDeImagen();
        }
        labelX.setIcon(new javax.swing.ImageIcon(getClass().getResource(rutaDeImagen)));
    }

    // Cambia el atributo figuraObservada a falso. Este metodo se ejecuta cuando se da click a una ficha despues de finalizado el contador
    public void observarFigura() {
        figuraObservada = true;
    }

    // Dice si es verdadero o falso que la figura ya fue observada.  Este metodo se ejecuta cuando se da click a una ficha despues de finalizado el contador
    public boolean getFiguraObservada() {
        return figuraObservada;
    }

    // Quita cualquier imagen que tenga a la figura. Este metodo se ejecuta cuando se establece que figuras se van a mostrar y cuales no.
    public void anularRutaDeImagen(javax.swing.JLabel labelX) {
        if (setRutaDeImagenSinUsar == true) {
            setRutaDeImagenSinUsar = false;
        }
        labelX.setIcon(null);
        rutaDeImagen = null;
    }
}
