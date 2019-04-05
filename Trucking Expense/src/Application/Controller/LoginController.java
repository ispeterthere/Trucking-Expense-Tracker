package Application.Controller;

import com.jfoenix.controls.*;
import javafx.animation.PauseTransition;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.util.Duration;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class LoginController implements Initializable {

    @FXML
    private JFXButton signup;

    @FXML
    private JFXTextField username;

    @FXML
    private JFXPasswordField password;

    @FXML
    private JFXCheckBox remember;

    @FXML
    private JFXButton login;

    @FXML
    private JFXButton forgotPassword;

    @FXML
    private JFXSpinner progress;

    public LoginController() {
    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        progress.setOpacity(0);
        username.setStyle("-fx-text-inner-color: #a0a2ab");
        password.setStyle("-fx-text-inner-color: #a0a2ab;");
    }

    @FXML
    public void loginAction(javafx.event.ActionEvent actionEvent) {
        progress.setOpacity(1);
        PauseTransition pauseTransition = new PauseTransition();
        pauseTransition.setDuration(Duration.seconds(3));
        pauseTransition.setOnFinished(event -> {
            System.out.println("Login SuccessFully");
        });
        pauseTransition.play();
    }

    @FXML
    public void signUP(javafx.event.ActionEvent actionEvent) throws IOException {
        login.getScene().getWindow().hide();

        Stage signup = new Stage();
        Parent root = FXMLLoader.load(getClass().getResource("../FXML/SignUP.fxml"));
        Scene scene = new Scene(root);
        signup.setScene(scene);
        signup.show();
        signup.setResizable(false);

    }
}
