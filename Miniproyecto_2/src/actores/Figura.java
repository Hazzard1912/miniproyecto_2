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

    private static List<String>listaDeRutasDeImagenes = new ArrayList<>(Arrays.asList("/imagenes/figuras/circulo.png", "/imagenes/figuras/circuloverde.png", 
            "/imagenes/figuras/circulorojo.png", "/imagenes/figuras/triangulo.png", "/imagenes/figuras/trianguloverde.png", "/imagenes/figuras/triangulorojo.png",
            "/imagenes/figuras/cuadrado.png", "/imagenes/figuras/cuadradoverde.png", "/imagenes/figuras/cuadradorojo.png"));
    private String rutaDeImagen;
    private boolean setRutaDeImagenSinUsar;
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

    public void setRutaDeImagen() {
        if (setRutaDeImagenSinUsar == true) {
            setRutaDeImagenSinUsar = false;
        }
        int numeroRandom = (int)(Math.random() * (listaDeRutasDeImagenes.size() - 1));
        rutaDeImagen = listaDeRutasDeImagenes.get(numeroRandom);

        figuraObservada = false;
    }

    public String getRutaDeImagen() {
        return rutaDeImagen;
    }

    public void setRutaDeImagenTo(javax.swing.JLabel labelX) {
        if (setRutaDeImagenSinUsar == true) {
            setRutaDeImagen();
        }
        labelX.setIcon(new javax.swing.ImageIcon(getClass().getResource(rutaDeImagen)));
    }

    public void observarFigura() {
        figuraObservada = true;
    }

    public boolean getFiguraObservada() {
        return figuraObservada;
    }

    public void anularRutaDeImagen(javax.swing.JLabel labelX) {
        if (setRutaDeImagenSinUsar == true) {
            setRutaDeImagenSinUsar = false;
        }
        labelX.setIcon(null);
        rutaDeImagen = null;
    }
}
