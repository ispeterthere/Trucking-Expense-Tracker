package Application.Employee;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.awt.event.ActionEvent;
import java.io.IOException;

public class employeeDashboardController {

    public void backToMain(ActionEvent event) throws IOException {
        Parent parent = FXMLLoader.load(getClass().getResource("Main.fxml"));
        Scene parentScene = new Scene(parent);
        //This line gets the stage information
        Stage window = (Stage) ((javafx.scene.Node)event.getSource()).getScene().getWindow();

        window.setScene(parentScene);
        window.show();
    }

    /**
     * When this method is called it will open
     * add new e mployee
     */
    public void openAddEmployee(){
        try {
            Parent parent = FXMLLoader.load(getClass().getResource("addEmployee.fxml"));
            Stage addEmployee = new Stage();
            addEmployee.setScene(new Scene(parent));
            addEmployee.show();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
    /**
     * When this method is called it will open
     * add Expense
     */
    public void openAddExpense(){
        try {
            Parent parent = FXMLLoader.load(getClass().getResource("addExpense.fxml"));
            Stage addExpense = new Stage();
            addExpense.setScene(new Scene(parent));
            addExpense.show();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    /**
     * When this method is called it will open
     * Edit Expense
     */
    public void openEditExpense(){
        try {
            Parent parent = FXMLLoader.load(getClass().getResource("editExpense.fxml"));
            Stage editExpense = new Stage();
            editExpense.setScene(new Scene(parent));
            editExpense.show();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /**
     * When this method is called it will open
     * edit Employee
     */
    public void openEditEmployee(){
        try {
            Parent parent = FXMLLoader.load(getClass().getResource("editEmployee.fxml"));
            Stage editEmployee = new Stage();
            editEmployee.setScene(new Scene(parent));
            editEmployee.show();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


}
