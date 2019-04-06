package Application.Controller;

import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXPasswordField;
import com.jfoenix.controls.JFXSpinner;
import com.jfoenix.controls.JFXTextField;
import javafx.animation.PauseTransition;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class SignupController  implements Initializable {
    @FXML
    private JFXTextField firstName;

    @FXML
    private JFXPasswordField lastName;

    @FXML
    private JFXTextField username;

    @FXML
    private JFXTextField emailAddress;

    @FXML
    private JFXTextField password;

    @FXML
    private JFXTextField companyName;

    @FXML
    private JFXButton signup;

    @FXML
    private JFXButton login;

    @FXML
    private JFXSpinner progress;



    @Override
    public void initialize(URL location, ResourceBundle resources) {
        progress.setOpacity(0);
        firstName.setStyle("-fx-text-inner-color: #a0a2ab");
        lastName.setStyle("-fx-text-inner-color: #a0a2ab");
        emailAddress.setStyle("-fx-text-inner-color: #a0a2ab");
        username.setStyle("-fx-text-inner-color: #a0a2ab");
        password.setStyle("-fx-text-inner-color: #a0a2ab");
        companyName.setStyle("-fx-text-inner-color: #a0a2ab");

    }

    @FXML
    public void signUP(javafx.event.ActionEvent actionEvent) {
        progress.setOpacity(1);
        PauseTransition pauseTransition = new PauseTransition();
        pauseTransition.setOnFinished(event -> {
            System.out.println("SignUp successful");
        });
        pauseTransition.play();
    }

    @FXML
    public void loginAction(javafx.event.ActionEvent actionEvent) throws IOException {
        signup.getScene().getWindow().hide();

        Stage login = new Stage();
        Parent root = FXMLLoader.load(getClass().getResource("../Views/LoginMain.fxml"));
        Scene scene = new Scene(root);
        login.setScene(scene);
        login.show();
        login.setResizable(false);
    }
}
