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
    private static String[] vector_de_imagenes = {"/imagenes/figuras/circulo.png","/imagenes/figuras/cuadrado.png","/imagenes/figuras/triangulo.png"};
    private String ruta_de_la_imagen;
    private int numero_de_la_imagen;
    private String forma;
    private String color;
    private boolean primer_setRuta;
    
    //public Figura(String forma, String color){
    public Figura(){
//        this.forma = forma;
  //      this.color = color;
        primer_setRuta = true;
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
    
    public void setRuta() {
        if (primer_setRuta == true) {
            primer_setRuta = false;
        }
        numero_de_la_imagen = (int) (Math.random()*3);
        ruta_de_la_imagen = vector_de_imagenes[numero_de_la_imagen];
    }
    
    public String getRuta() {
        return ruta_de_la_imagen;
    }
    
    public void setRutaTo(javax.swing.JLabel un_label) {
        if (primer_setRuta == true) {
            setRuta();
            /*primer_setRuta = false;
            numero_de_la_imagen = (int) (Math.random()*3);
            ruta_de_la_imagen = vector_de_imagenes[numero_de_la_imagen];*/
        }
        un_label.setIcon(new javax.swing.ImageIcon(getClass().getResource(ruta_de_la_imagen)));
    }
    
//    public String getRuta(String color) {
  //      setRuta();
    //}
}
