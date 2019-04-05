package Application;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application{


    public static void main(String[] args) {

        launch(args);

    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("FXML/LoginMain.fxml"));
        primaryStage.setTitle("Trucking Expense Tracker");
        primaryStage.setScene(new Scene(root, 641, 412));
        primaryStage.show();
        primaryStage.setResizable(false);
    }
}
