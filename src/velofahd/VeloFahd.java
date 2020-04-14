/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package velofahd;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.Statement;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
import javafx.stage.StageStyle;
import services.EventService;
import utils.MyConnection;

/**
 *
 * @author USER
 */
public class VeloFahd extends Application {
 
    public static Stage stage = null;
    
    @Override
    public void start(Stage primaryStage) throws IOException {
         Parent root = FXMLLoader.load(getClass().getResource("/guis/Login.fxml"));
       // Parent root = FXMLLoader.load(getClass().getResource("/guis/event.fxml"));

        Scene scene = new Scene(root);
        this.stage = primaryStage;
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
