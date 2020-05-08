//Importamos la libreria proncipal

import processing.core.PApplet;

/**
 * Clase principal que hererda de PApplet
 * (la clase padre que tiene todos los métodos
 * y atributos para usar Processing)
 */
public class Formas extends PApplet {
    //Dimensiones del sketch
    int viewport_w = 1280; // ancho en pixeles
    int viewport_h = 720; // alto en pixeles

    public static void main(String args[]) {
        PApplet.main("Formas");
    }

    //Método que tiene las configuraciones iniciales
    @Override
    public void settings() {
        size(viewport_w, viewport_h, P2D);
        smooth(8);

    }

    // en este metodo tambien podemos meter configuraciones iniciales de nuestro sketch
    @Override
    public void setup() {


    }


    @Override
    public void draw() {
        if (!mousePressed) {
            background(255, 255, 255); //fondo-cielo
            fill(0, 0, 0);

        } else {
            background(0, 0, 0); //fondo-cielo
            fill(238, 238, 238);
        }



        //piramide
        fill(80,80,80);
        triangle(325,650,630,50,965,650);

        //piramide 3d
        fill(54, 54, 54);
        triangle(250,620,630,50,325,650);

        //ojo
        fill(110, 110, 110);
        ellipse(640, 400, 300, 120);

        //
        fill(180, 180, 180);
        ellipse(640, 400, 120, 100);

        //
        fill(0, 0, 0);
        ellipse(640, 400, 65, 65);

        fill(255, 255, 255);
        ellipse(670, 385, 20, 20);
    }
}