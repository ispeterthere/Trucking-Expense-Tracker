package Application.Controller;

import Application.com.DBConnection;
import com.jfoenix.controls.*;
import javafx.animation.PauseTransition;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Label;
import javafx.scene.input.MouseEvent;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import javafx.stage.StageStyle;
import javafx.util.Duration;

import java.io.IOException;
import java.net.URL;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ResourceBundle;

public class LoginController implements Initializable {

    @FXML
    private JFXButton signup;

    @FXML
    private Label lblError;

    @FXML
    private JFXTextField txtUsername;

    @FXML
    private JFXPasswordField Password;

    @FXML
    private JFXCheckBox remember;

    @FXML
    private JFXButton login;

    @FXML
    private JFXButton forgotPassword;

    @FXML
    private JFXSpinner progress;

    @FXML
    private JFXButton close;

    public void handleButtonAction(MouseEvent event){
        if(event.getSource() == close)
        {
            System.exit(0);
        }
        if(event.getSource() == login)
        {

        }
    }

    public LoginController() {
        try {
            connection = DBConnection.getConnection();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        progress.setOpacity(0);
        txtUsername.setStyle("-fx-text-inner-color: #a0a2ab");
        Password.setStyle("-fx-text-inner-color: #a0a2ab;");
    }

    //Connection setter
    Connection connection = null;
    PreparedStatement preparedStatement = null;
    ResultSet resultSet = null;
    @FXML
    public void loginActon(MouseEvent mouseEvent) throws NoSuchAlgorithmException {
        progress.setOpacity(1);
        PauseTransition pauseTransition = new PauseTransition();
        pauseTransition.setDuration(Duration.seconds(3));
        pauseTransition.play();

        //Login information
        String users_email = txtUsername.getText().trim();
        String users_password = Password.getText().trim();


        //Query
        String sql = "SELECT * FROM users Where users_email = ? and users_password = ?";
        try {
            preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, users_email);
            preparedStatement.setString(2, users_password);
            resultSet = preparedStatement.executeQuery();
            if(!resultSet.next())
            {
                lblError.setTextFill(Color.TOMATO);
                lblError.setText("Enter Correct Email or Password");
            }
            else
            {
                lblError.setTextFill(Color.GREEN);
                lblError.setText("Login Successful. Redirecting...");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }


    @FXML
    public void signUP(javafx.event.ActionEvent actionEvent) throws IOException {
        login.getScene().getWindow().hide();

        Stage signup = new Stage();
        Parent root = FXMLLoader.load(getClass().getResource("../Views/SignUP.fxml"));
        Scene scene = new Scene(root);
        signup.setScene(scene);
        signup.initStyle(StageStyle.UNDECORATED);
        signup.show();
        signup.setResizable(false);

    }

}
