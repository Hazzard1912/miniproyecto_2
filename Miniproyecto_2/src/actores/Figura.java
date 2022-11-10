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
public class Figura {
    private String[] vector_de_imagenes = new String[3];
    private String ruta_de_la_imagen;
    private int numero_de_la_imagen;
    private String forma;
    private String color;
    
    //public Figura(String forma, String color){
    public Figura(){
//        this.forma = forma;
  //      this.color = color;
        vector_de_imagenes[0] = "/imagenes/figuras/circulo.png";
        vector_de_imagenes[1] = "/imagenes/figuras/cuadrado.png";
        vector_de_imagenes[2] = "/imagenes/figuras/triangulo.png";
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
    
    public void setRuta(javax.swing.JLabel un_label) {
        numero_de_la_imagen = (int) (Math.random()*3);
        ruta_de_la_imagen = vector_de_imagenes[numero_de_la_imagen];
        un_label.setIcon(new javax.swing.ImageIcon(getClass().getResource(ruta_de_la_imagen)));
    }
    
//    public String getRuta(String color) {
  //      setRuta();
    //}
}
