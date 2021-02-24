   import javafx.application.Application;
   import javafx.stage.Stage;
   import javafx.scene.Scene;
   import javafx.scene.layout.Pane;
   import javafx.scene.paint.Color;
   import javafx.scene.shape.Polygon;
   import javafx.scene.text.Text;
   import javafx.scene.text.Font;
   


/**
 *
 * @author amy
 */
public class star extends Application {
   
    public static void main(String[] args) {
        launch(args);
   }

  public void start(Stage primaryStage)
  {
      final double SCENE_WIDTH= 600.0;
      final double SCENE_HEIGHT= 600.0;
      
      final double X1 = 20.0, Y1 = 170.0;
      final double X2 = 170.0, Y2 = 150.0;
      final double X3 = 220.0, Y3 = 20.0;
      final double X4 = 270.0, Y4 = 150.0;
      final double X5 = 420.0, Y5 = 170.0;
      final double X6 = 320.0, Y6 = 250.0;
      final double X7 = 340.0, Y7 = 380.0;
      final double X8 = 220.0, Y8 = 300.0;
      final double X9 = 100.0, Y9 = 380.0;
      final double X10 = 120.0, Y10 = 250.0;
      
       final double TEXT_X = 125.0;
       final double TEXT_Y = 200.0;
       final double FONT_SIZE = 30.0;
      
      Polygon star = new Polygon(X1, Y1, X2, Y2, X3, Y3, X4, Y4, X5, Y5,
                                    X6, Y6, X7, Y7, X8, Y8, X9, Y9, X10, Y10);
      
      star.setFill(null);
      star.setStroke(Color.BLACK);
      
      Text myName = new Text(TEXT_X, TEXT_Y, "Amy Gonzales");
      myName.setFont(new Font("Serif Italic", FONT_SIZE));
      
   
                                      
      
      Pane pane = new Pane(star, myName);
       
       Scene scene = new Scene(pane, SCENE_WIDTH, SCENE_HEIGHT);
       primaryStage.setScene(scene);
       primaryStage.show();
 }
      
   
  }


    

