package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;



public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));
        primaryStage.setTitle("Tic Tac Toe the Extreme");
        //primeBoxes(primaryStage);
        primaryStage.setScene(new Scene(root, 400, 700));
        primaryStage.show();
    }

    public void primeBoxes(Stage primaryStage){
        ImageView smallBox00 = (ImageView) primaryStage.getScene().lookup("smallGrid00");
    }

    public static void main(String[] args) {
        launch(args);
    }
}