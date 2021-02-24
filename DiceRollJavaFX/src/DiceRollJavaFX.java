
//package dicerolljavafx;
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.VBox;
import javafx.scene.layout.HBox;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;


/**
 *
 * @author amy
 */
public class DiceRollJavaFX extends Application {
    

    private ImageView viewDie1 = new ImageView();
    private ImageView viewDie2 = new ImageView();
    private Label resultDie;
    private Label message1;
    private Label message2;
    
    /**
     *
     * @param args
     */
    public static void main(String[] args)
    {
        launch(args);
    }
    public void start(Stage primaryStage)
    {
        primaryStage.setTitle("Dice Simulator");
        message1 = new Label("Welcome to the dice simulator");
        message2 = new Label("Please hit Go! to roll the die");
        
        resultDie = new Label();
        Button startButton = new Button("Go!");
        startButton.setOnAction(new StartButtonHandler());
        
        HBox hbox = new HBox(10, viewDie1, viewDie2);
        VBox vbox = new VBox(10, message1, message2, startButton, hbox, resultDie);
        
        Scene simulatorScene = new Scene(vbox);
        primaryStage.setScene(simulatorScene);
        primaryStage.show();
    }
    class StartButtonHandler implements EventHandler<ActionEvent>
    {
        public void handle(ActionEvent event)
        {
            int num1 = 0;
            int num2 = 0;
            Image diePic1;
            Image diePic2;
            
            DieRoll die1 = new DieRoll();
            DieRoll die2 = new DieRoll();
            die1.roll();
            die2.roll();
            num1 = die1.getRoll();
            num2 = die2.getRoll();
            
            DieImages image1 = new DieImages();
            DieImages image2 = new DieImages();
            image1.setImage(num1);
            image1.setImage(num2);
            diePic1 = image1.getImage();
            diePic2 = image2.getImage();
            
            viewDie1.setImage(diePic1);
            viewDie2.setImage(diePic2);
            
            resultDie.setText("You rolled a " + viewDie1
                    + " and " + viewDie2);
        }
    }
}
