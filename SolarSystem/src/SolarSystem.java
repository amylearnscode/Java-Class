/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.effect.DropShadow;
import javafx.scene.layout.Pane;
import javafx.scene.shape.Circle;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.Text;

/**
 *
 * @author amy
 */
public class SolarSystem extends Application {
    
   
   

   public static void main(String[] args) {
        launch(args);
    }
   public void start(Stage primaryStage)
     {
        
        final double SCENE_WIDTH = 1750.0;
        final double SCENE_HEIGHT = 200.0;
        
        DropShadow dropShadow = new DropShadow();
        dropShadow.setOffsetX(10);
        dropShadow.setOffsetY(10);
        
        DropShadow dropShadow2 = new DropShadow();
        dropShadow.setOffsetX(5);
        dropShadow.setOffsetY(5);
        
        Circle sun = new Circle();
        sun.setCenterX(50);
        sun.setCenterY(100);
        sun.setRadius(120);
        sun.setFill(Color.YELLOW);
        sun.setEffect(dropShadow);
        Text sunText = new Text(50.0, 100.0, "Sun");
        sunText.setFont(new Font("Serif", 20));
        sunText.setStroke(Color.BLACK);
        
        Circle mercury = new Circle();
        mercury.setCenterX(250);
        mercury.setCenterY(100);
        mercury.setRadius(3);
        mercury.setFill(Color.BLACK);
        mercury.setEffect(dropShadow2);
        Text mercuryText = new Text(225.0, 75.0, "Mercury");
        mercuryText.setFont(new Font("Serif", 10));
        mercury.setStroke(Color.BLACK);
        
        Circle venus = new Circle();
        venus.setCenterX(300);
        venus.setCenterY(100);
        venus.setRadius(7);
        venus.setFill(Color.ORANGE);
        venus.setEffect(dropShadow2);
        Text venusText = new Text(285.0, 135.0, "Venus");
        venusText.setFont(new Font("Serif", 10));
        venus.setStroke(Color.BLACK);
        
        Circle earth = new Circle();
        earth.setCenterX(430);
        earth.setCenterY(100);
        earth.setRadius(8);
        earth.setFill(Color.BLUE);
        earth.setEffect(dropShadow2);
        Text earthText = new Text(410.0, 75.0, "Earth");
        Text earthText2 = new Text(410.0, 125.0, "#1!!!!");
        earthText.setFont(new Font("Serif", 10));
        earthText2.setFont(new Font("Serif", 10));
        earth.setStroke(Color.BLACK);
        
        Circle mars = new Circle();
        mars.setCenterX(475);
        mars.setCenterY(100);
        mars.setRadius(7);
        mars.setFill(Color.RED);
        mars.setEffect(dropShadow2);
        Text marsText = new Text(465.0, 75.0, "Mars");
        venusText.setFont(new Font("Serif", 10));
        venus.setStroke(Color.BLACK);
        
        Circle jupiter = new Circle();
        jupiter.setCenterX(600);
        jupiter.setCenterY(100);
        jupiter.setRadius(90);
        jupiter.setFill(Color.GREY);
        jupiter.setEffect(dropShadow);
        Text jupiterText = new Text(570.0, 100.0, "Jupiter");
        jupiterText.setFont(new Font("Serif", 20));
        jupiter.setStroke(Color.BLACK);
        
        Circle saturn = new Circle();
        saturn.setCenterX(800);
        saturn.setCenterY(100);
        saturn.setRadius(75);
        saturn.setFill(Color.TAN);
        saturn.setEffect(dropShadow);
        Text saturnText = new Text(770.0, 100.0, "Saturn");
        saturnText.setFont(new Font("Serif", 20));
        saturn.setStroke(Color.BLACK);
        
        Circle uranus = new Circle();
        uranus.setCenterX(1000);
        uranus.setCenterY(100);
        uranus.setRadius(32);
        uranus.setFill(Color.GREEN);
        uranus.setEffect(dropShadow);
        Text uranusText = new Text(975.0, 50.0, "Uranus");
        uranusText.setFont(new Font("Serif", 15));
        uranus.setStroke(Color.BLACK);
        
        Circle neptune = new Circle();
        neptune.setCenterX(1200);
        neptune.setCenterY(100);
        neptune.setRadius(30);
        neptune.setFill(Color.BLUE);
        neptune.setEffect(dropShadow);
        Text neptuneText = new Text(1170.0, 50.0, "Neptune");
        neptuneText.setFont(new Font("Serif", 15));
        neptune.setStroke(Color.BLACK);
        
        Circle pluto = new Circle();
        pluto.setCenterX(1700);
        pluto.setCenterY(100);
        pluto.setRadius(3);
        pluto.setFill(Color.GREY);
        pluto.setEffect(dropShadow);
        Text plutoText = new Text(1680.0, 75.0, "Pluto");
        plutoText.setFont(new Font("Serif", 15));
        pluto.setStroke(Color.BLACK);
        
        
        Pane sky = new Pane(sun,sunText,mercury,mercuryText, venus,venusText, earth,
                earthText,earthText2, mars,marsText,
                jupiter,jupiterText, saturn,saturnText, uranus,uranusText, neptuneText,
                plutoText, neptune, pluto);
        Scene scene = new Scene(sky, SCENE_WIDTH, SCENE_HEIGHT);
        primaryStage.setScene(scene);
        primaryStage.show();
     }



}
    

