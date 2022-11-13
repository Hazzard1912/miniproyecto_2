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
public class Figura {
    private static String[] listaDeRutasDeImagenes = {"/imagenes/figuras/circulo.png","/imagenes/figuras/cuadrado.png","/imagenes/figuras/triangulo.png"};
    private String rutaDeImagen;
    private boolean setRutaDeImagenSinUsar;
    private boolean figuraObservada;
    
    private String forma;
    private String color;
    
    //public Figura(String forma, String color){
    public Figura(){
//        this.forma = forma;
  //      this.color = color;
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
        int numeroRandom = (int) (Math.random()*3);
        rutaDeImagen = listaDeRutasDeImagenes[numeroRandom];
        
        figuraObservada = false;
    }
    
    public String getRutaDeImagen() {
        return rutaDeImagen;
    }
    
    public void setRutaDeImagenTo(javax.swing.JLabel un_label) {
        if (setRutaDeImagenSinUsar == true) {
            setRutaDeImagen();
        }
        un_label.setIcon(new javax.swing.ImageIcon(getClass().getResource(rutaDeImagen)));
    }
    
    public void observarFigura(){
        figuraObservada = true;
    }
    
    public boolean getFiguraObservada (){
        return figuraObservada;
    }
    
    public void anularRutaDeImagen(){
        
    }
}
