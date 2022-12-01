/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXML.java to edit this template
 */
package appusotextoboton;

import componentes.CampoTextoBoton;
import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

/**
 *
 * @author Kristian
 */
public class AppUsoTextoBoton extends Application {
    
    @Override
    public void start(Stage stage) throws Exception {
        
        VBox root = new VBox();
        Label respuesta = new Label();
        respuesta.setText("Pulsa el botón y muestra texto en esta etiqueta");
        respuesta.setPadding(new Insets(20,20,20,20));

        CampoTextoBoton campoTextoBoton1 = new CampoTextoBoton();
        CampoTextoBoton campoTextoBoton2 = new CampoTextoBoton();
        campoTextoBoton1.setButtonText("Grabar");
        campoTextoBoton2.setButtonText("Grabar");
        
        campoTextoBoton1.setOnAction(new EventHandler<MouseEvent>() {
            
            @Override
            public void handle(MouseEvent event) {
                respuesta.setText("Se ha grabado: "+ campoTextoBoton1.getText());
            }
        });
        
        campoTextoBoton2.setOnAction(new EventHandler<MouseEvent>() {
            
            @Override
            public void handle(MouseEvent event) {
                respuesta.setText("Se ha grabado: "+ campoTextoBoton2.getText());
            }
        });
        
        root.getChildren().addAll(campoTextoBoton1,campoTextoBoton2,respuesta);
        
        Scene scene = new Scene(root);
        
        stage.setScene(scene);
        stage.show();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
