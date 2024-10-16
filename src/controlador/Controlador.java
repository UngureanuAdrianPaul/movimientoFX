package controlador;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;

public class Controlador implements Initializable {

    @FXML
    VBox vboxFX;

    @FXML
    Pane arribaFX;

    @FXML
    Pane abajoFX;

    @FXML
    Label b1FX;

    @FXML
    Label b2FX;

    @FXML
    Label b3FX;

    @FXML
    Label b4FX;

    @FXML
    Label b5FX;

    @Override
    public void initialize(URL location, ResourceBundle resources) {

        vboxFX.setStyle("-fx-background-Color: grey");

        arribaFX.setStyle("-fx-background-Color: white");
        abajoFX.setStyle("-fx-background-Color: lightgreen");

    }

    public void bolaSeleccionada(MouseEvent evento) {
        Label etiqueta = (Label) evento.getSource();
        if (b1FX.getTextFill() == Color.WHITE) {
            b1FX.setTextFill(Color.BLACK);
        }
        if (b2FX.getTextFill() == Color.WHITE) {
            b2FX.setTextFill(Color.BLACK);
        }
        if (b3FX.getTextFill() == Color.WHITE) {
            b3FX.setTextFill(Color.BLACK);
        }
        if (b4FX.getTextFill() == Color.WHITE) {
            b4FX.setTextFill(Color.BLACK);
        }
        if (b5FX.getTextFill() == Color.WHITE) {
            b5FX.setTextFill(Color.BLACK);
        }
        etiqueta.setTextFill(Color.WHITE);
    }

    public void posicionRaton(MouseEvent evento){

        System.out.println("X: " + evento.getX());
        
        System.out.println("Y: " + evento.getY());

        if (b1FX.getTextFill() == Color.WHITE) {
            b1FX.setText("Bola1: (" + evento.getX() + " , " + evento.getY() + ")");
        } else  if (b2FX.getTextFill() == Color.WHITE) {
            b2FX.setText("Bola2: (" + evento.getX() + " , " + evento.getY() + ")");
        } else  if (b3FX.getTextFill() == Color.WHITE) {
            b3FX.setText("Bola3: (" + evento.getX() + " , " + evento.getY() + ")");
        } else  if (b4FX.getTextFill() == Color.WHITE) {
            b4FX.setText("Bola4: (" + evento.getX() + " , " + evento.getY() + ")");
        } else  if (b5FX.getTextFill() == Color.WHITE) {
            b5FX.setText("Bola5: (" + evento.getX() + " , " + evento.getY() + ")");
        } 
    }
}