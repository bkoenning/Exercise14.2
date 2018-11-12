/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercise14.pkg2;

/**
 *
 * @author Brandon Koenning
 */

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.image.ImageView;
import javafx.scene.image.Image;
import javafx.scene.layout.GridPane;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.stage.Stage;

public class TicTacToe extends Application {
    
    @Override
    public void start(Stage primaryStage) {
        
        //ImageView[] images = {new ImageView(new Image("/image/o.gif")), new ImageView(new Image("/image/x.gif"))};
        String[] files = {"/image/o.gif", "/image/x.gif"}; 
        GridPane pane = new GridPane();
        pane.setAlignment(Pos.CENTER);
        pane.setPadding(new Insets(10, 10, 10, 10));
        pane.setHgap(5.5);
        pane.setVgap(5.5);
    
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                int num = (int)(Math.random() * 3);
                if (num == 0 || num == 1)
                    pane.add(new ImageView(new Image(files[num])), i, j);
                else {
                    ImageView v = new ImageView(new Image(files[1]));
                    v.setVisible(false);
                    pane.add(v, i, j);
                }
            }
        }
        
        Scene scene = new Scene(pane);
        primaryStage.setScene(scene);
        primaryStage.setTitle("Tic Tac Toe Board");
        primaryStage.show();
        
    }
    
    
    public static void main(String [] args) {
        Application.launch(args);
    }
    
}
