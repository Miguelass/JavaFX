/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javafxapplication3;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

/**
 *
 * @author Miguel
 */
public class JavaFXApplication3 extends Application {
    
    @Override
    public void start(Stage primaryStage) {
        
        Label label1 = new Label("Tremenda Baina");
        label1.setLayoutX(150);
        label1.setLayoutY(25);
        
        Button btn = new Button();
        btn.setText("Say 'Hello World'");
        btn.setOnAction(new EventHandler<ActionEvent>() {
            
            @Override
            public void handle(ActionEvent event) {
                label1.setText("Hello World");
            }
        });
        btn.setLayoutX(10);
        btn.setLayoutY(10);
        
        Button bye = new Button();
        bye.setText("Say 'Bye World'");
        bye.setOnAction(new EventHandler<ActionEvent>() {
            
            @Override
            public void handle(ActionEvent event) {
                label1.setText("Bye World");
            }
        });
        bye.setLayoutX(10);
        bye.setLayoutY(40);
        
        TableView table = new TableView();
        table.setEditable(false);
        TableColumn lunes = new TableColumn("Lunes");
        TableColumn martes = new TableColumn("Martes");
        TableColumn miercoles = new TableColumn("Miercoles");
        table.getColumns().addAll(lunes, martes, miercoles);
        table.setLayoutX(250);
        
        Pane root = new Pane();
        root.getChildren().add(btn);
        root.getChildren().add(bye);
        root.getChildren().add(label1);
        root.getChildren().add(table);
        
        Scene scene = new Scene(root, 500, 500);
        
        primaryStage.setTitle("Hello World!");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
