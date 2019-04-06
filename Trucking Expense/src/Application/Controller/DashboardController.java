package Application.Controller;

import com.jfoenix.controls.JFXListView;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class DashboardController implements Initializable {

    @FXML
    private Label personalIncome;

    @FXML
    private Label companyIncome;

    @FXML
    private Label expenses;

    @FXML
    private VBox transactionHolder = null;

    @Override
    public void initialize(URL location, ResourceBundle resources) {

        /*Node [] nodes = new Node[10];
        for(int i = 0; i < nodes.length; i++){
            try {
                nodes[i] = (Node) FXMLLoader.load(getClass().getResource("Views/Transaction.fxml"));
                transactionHolder.getChildren().add(nodes[i]);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        
         */






        /*try {
            Parent sidebar = FXMLLoader.load(getClass().getResource("Application/Views/Sidebar.fxml"));
            Parent dashboard = FXMLLoader.load(getClass().getResource("Application/Views/Dashboard.fxml"));
            borderPane.setLeft(sidebar);
            borderPane.setCenter(dashboard);
        } catch (IOException e) {
            e.printStackTrace();
        }

         */

    }
}

