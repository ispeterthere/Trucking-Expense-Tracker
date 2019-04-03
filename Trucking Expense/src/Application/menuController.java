package Application;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class menuController {

    /**
     * When this method is called it will open
     * company Dashboard
     */
    public void openCompanyDashboard() {
        try {
            Parent root = FXMLLoader.load(getClass().getResource("Company/companyDashboard.fxml"));
            Stage companyDashboard = new Stage();
            companyDashboard.setScene(new Scene(root));
            companyDashboard.show();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /**
     * When this method is called it will open
     * employee dashboard
     */
    public void openEmployeeDashboard(){
        try {
            Parent root = FXMLLoader.load(getClass().getResource("Employee/employeeDashboard.fxml"));
            Stage employeeDashboard = new Stage();
            employeeDashboard.setScene(new Scene(root));
            employeeDashboard.show();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
