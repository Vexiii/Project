/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg2dz;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import javafx.animation.TranslateTransition;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Group;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.input.KeyEvent;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;

/**
 *
 * @author Dylan
 */
public class NewFXMain extends Application {
    
    private final int KEYBOARD_MOVEMENT_DELTA = 2;
    private final List<Bullet> bullets = new ArrayList<Bullet>();
    
    @Override
    public void start(Stage primaryStage) {
        final Player player = createPlayer();
        final Circle circle = new Circle(player.getxPos(), player.getyPos(), 5, Color.BLACK);
        final Group group = new Group(circle);
        
        final Scene scene = new Scene(group, 800, 600, Color.WHITE);
        movePlayerOnKeyPress(scene, player, circle);
        
        primaryStage.setTitle("DZ");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
    
    private Player createPlayer(){
        final Player player = new Player();
        return player;
    }
    
  private void movePlayerOnKeyPress(Scene scene, final Player player, final Circle circle) {
    scene.setOnKeyPressed(new EventHandler<KeyEvent>() {
      @Override public void handle(KeyEvent event) {
        switch (event.getCode()) {
          case UP:    player.setyPos(player.getyPos() - KEYBOARD_MOVEMENT_DELTA);
                      circle.setCenterY(circle.getCenterY() - KEYBOARD_MOVEMENT_DELTA);break;
          case RIGHT: player.setxPos(player.getxPos() + KEYBOARD_MOVEMENT_DELTA); 
                      circle.setCenterX(circle.getCenterX() - KEYBOARD_MOVEMENT_DELTA);break;
          case DOWN:  player.setyPos(player.getyPos() + KEYBOARD_MOVEMENT_DELTA); 
                      circle.setCenterY(circle.getCenterY() - KEYBOARD_MOVEMENT_DELTA);break;
          case LEFT:  player.setxPos(player.getxPos() - KEYBOARD_MOVEMENT_DELTA); 
                      circle.setCenterX(circle.getCenterX() - KEYBOARD_MOVEMENT_DELTA);break;
        }
      }
    });
  }
  
  private void fireOnMousePress(Scene scene, final Player player){
      scene.setOnMousePressed(new EventHandler<MouseEvent>() {
          @Override public void handle(MouseEvent event) {
              
          }
      });
  }
  
  private void addBullet(){
      
      
  }
  
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
