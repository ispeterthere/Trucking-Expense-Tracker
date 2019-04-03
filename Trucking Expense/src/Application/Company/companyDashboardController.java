package Application.Company;

import Application.com.DBConnection;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;
import java.sql.SQLException;

public class companyDashboardController {
    /**
     * When this method is called it will
     * open add company
     */
    public void openAddCompany(){
        try {
            Parent parent = FXMLLoader.load(getClass().getResource("addCompany.fxml"));
            Stage addCompany = new Stage();
            addCompany.setScene(new Scene(parent));
            addCompany.show();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    /**
     * When this method is called it will
     * Open edit Company
     */
    public void openEditCompany(){
        try {
            Parent parent = FXMLLoader.load(getClass().getResource("editCompany.fxml"));
            Stage editCompany = new Stage();
            editCompany.setScene(new Scene(parent));
            editCompany.show();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
    /**
     * When this method is called it will
     * Open add Company Income
     */
    public void openAddCompanyIncome() {
        try {
            Parent parent = FXMLLoader.load(getClass().getResource("addCompanyIncome.fxml"));
            Stage addCompanyIncome = new Stage();
            addCompanyIncome.setScene(new Scene(parent));
            addCompanyIncome.show();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    /**
     * When this method is called it will
     * open edit company Income
     */
    public void openEditCompanyIncome(){
        try {
            Parent parent = FXMLLoader.load(getClass().getResource("editCompanyIncome.fxml"));
            Stage editCompanyIncome = new Stage();
            editCompanyIncome.setScene(new Scene(parent));
            editCompanyIncome.show();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    /**
     * When this method is called it will
     * get Information from field and store it into MYSQL
     */
    public void getCompany(ActionEvent actionEvent)
    {
        DBConnection connection = new DBConnection();
        try {
            connection.getConnection();
            System.out.println("Connected");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    /**
     * Saves the Company name and date created
     * for the company and saves to the database
     */


}
