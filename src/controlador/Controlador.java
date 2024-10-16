package controlador;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import modelo.Movimiento;

public class Controlador implements Initializable {

    @FXML
    Circle circuloFX;

    @FXML
    Pane paneFX;

    @Override
    public void initialize(URL location, ResourceBundle resources) {
       
       circuloFX.setLayoutX(paneFX.getPrefWidth() / 2);
       circuloFX.setLayoutY(paneFX.getPrefHeight() / 2);
       circuloFX.setRadius(5);
       circuloFX.setFill(Color.RED);

       Movimiento mov = new Movimiento(circuloFX, 20, paneFX);
        mov.start();
       


        
    }
    
    public void nuevaPelota(){

        Circle nuevoCirculo = new Circle();
        nuevoCirculo.setLayoutX(paneFX.getPrefWidth() /2);

        nuevoCirculo.setLayoutY(paneFX.getPrefHeight() /2);
        nuevoCirculo.setRadius(10);
        nuevoCirculo.setFill(Color.RED);
    }
    
}
