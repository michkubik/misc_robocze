package robocze.tictactoe;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class TicTacToe extends Application {

    public static void main(String[]args){
        launch(args);
    }

    @Override
    public  void start(Stage primaryStage) throws Exception {
       // primaryStage.setTitle("Tic Tac Toe Game");
        Text text = new Text(10, 40, "Hello World!");
        text.setFont(new Font(40));
        Scene scene = new Scene(new Group(text), Color.BLUE);

        primaryStage.setTitle("Welcome to JavaFX!");
        primaryStage.setScene(scene);
        primaryStage.sizeToScene();
        primaryStage.show();
/*

        StackPane layout = new StackPane();
        StackPane stack = new StackPane();
        stack.getChildren().addAll(new Rectangle(100,100,Color.BLUE), new Label("Go!"));

*/

/*        Scene scene = new Scene(layout, Color.BLACK);
        primaryStage.setScene(scene);
        scene.setFill(Color.BLUE);
        primaryStage.show();*/
    }
}
