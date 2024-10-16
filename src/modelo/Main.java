package modelo;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Group;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;

import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {

        Parent root =  FXMLLoader.load(getClass().getResource("..\\vista\\vista.fxml"));
      
        primaryStage.setTitle("Movimiento");
        primaryStage.setScene(new Scene(root, 600, 400));
        primaryStage.show();
        primaryStage.setResizable(false);

        // Group root = new Group();
        // Circle circulo = new Circle();

        // circulo.setLayoutX(300);
        // circulo.setLayoutY(200);
        // circulo.setRadius(10);
        // circulo.setFill(Color.RED);
       

        // root.getChildren().add(circulo);

        
        
        // double anchura;
        // Thread.sleep(100);

        // while (circulo.getCenterX() < primaryStage.getMaxWidth()) {

        // for (int i = 0; i < primaryStage.getMaxWidth(); i++) {
        // circulo.setCenterX(circulo.getCenterX() + i);
        // }

        // }

    }

    public static void main(String[] args) {
        launch(args);
    }
}
