package modelo;

import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;

public class Movimiento extends Thread {
    private Circle circulo;
    private long velocidad;
    private Pane pane;

    public Movimiento(Circle circulo, long velocidad, Pane pane) {
        this.circulo = circulo;
        this.velocidad = velocidad;
        this.pane = pane;


    }

    public void mover() throws InterruptedException {
        double finX = pane.getPrefWidth();
        double ppioX = 0;
        double sentidoX = 1;
        double posX = circulo.getLayoutX();

        double finY = pane.getPrefHeight();
        double ppioY = 0;
        double sentidoY = 1;
        double posY = circulo.getLayoutY();

        while (true) {
            posX = posX + sentidoX;

            if ((posX >= finX) || (posX == ppioX)) {
                sentidoX = sentidoX * (-1);
                if (sentidoX > 0) {
                    circulo.setFill(Color.RED);
                    
                } else {
                    circulo.setFill(Color.BLUE);
                }
                posX = posX + sentidoX;

            }
            circulo.setLayoutX(posX);


            posY = posY + sentidoY;

            if ((posY == finY) || (posY == ppioY)) {
                sentidoY = sentidoY * (-1);
                if (sentidoY > 0) {
                    circulo.setRadius(5);
                } else {
                    circulo.setRadius(10);
                }
                posY = posY + sentidoY;

            }
            circulo.setLayoutY(posY);
            Thread.sleep(velocidad);
        }

    }

    @Override
    public void run() {
        try {
            mover();
        } catch (InterruptedException e) {

        }
    }

}
