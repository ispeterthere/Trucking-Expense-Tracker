# Trucking-Expense-Tracker

Trucking Expense Report Tracker
Objective:
		Create a report of expenses in a table format
		View or Edit past expenses
		Display data Yearly report
				Total Company Salary
				Total Gas Expense
				Total Toll Expense
				Total Miscellanous Expense

Input Needed:
		Enter the Company Income earned weekly
		Enter the Gas Expense weekly
		Enter Toll Expense Weekly
		Enter Miscellanous expense weekly
				Create a Miscellanous category 

Calculation:
		Get Personal Salary = 
				Company Income - (Gas Expense + Toll Expense + Miscellanous Expense)

Result:
		Display information in a table
		
		Table: users
			ID
			First Name
			Last Name

		Table: miscellanous
			ID
			Category



		Table Design

			ID | 	Date | Company Income | Gas Expense | Toll Expense | Miscellanous Expense Category | Miscellanous Expense | Personal Salary
		Week 1 |         |                |				|		       | 					           |					  |
		Week 2 |		 |				  | 		    |		 	   |					           |					  |
		....   |		 |			      | 		    |			   |                               |					  |
		
		

get Database connection

        Connection connection = null;
        Statement statement = null;
        ResultSet resultSet = null;
        try
        {
            connection = DriverManager.getConnection(url, username, password);
            statement = connection.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);

            System.out.println("Connected");
        }
        catch (SQLException e)
        {
            e.printStackTrace();
        }
        finally
        {
            if(connection != null)
            {
                connection.close();
            }
            if(statement != null)
            {
                statement.close();
            }
            if(resultSet != null)
            {
                resultSet.close();
            }
        }
		

Menu Controller
@FXML
    void openAddCompany() throws IOException {
        Parent parent = FXMLLoader.load(getClass().getResource("fxml/addCompany.fxml"));
        Stage addCompany = new Stage();
        addCompany.setScene(new Scene(parent));
        addCompany.show();
    }

    @FXML
    public void openAddEmployee() throws IOException {
        Parent parent = FXMLLoader.load(getClass().getResource("fxml/addEmployee.fxml"));
        Stage addEmployee = new Stage();
        addEmployee.setScene(new Scene(parent));
        addEmployee.show();
    }
    @FXML
    public void openAddRevenue() throws IOException {
        Parent parent = FXMLLoader.load(getClass().getResource("fxml/addRevenue.fxml"));
        Stage addRevenue = new Stage();
        addRevenue.setScene(new Scene(parent));
        addRevenue.show();
    }
    @FXML
    public void openAddFuel() throws IOException {
        Parent parent = FXMLLoader.load(getClass().getResource("fxml/addFuel.fxml"));
        Stage addFuel = new Stage();
        addFuel.setScene(new Scene(parent));
        addFuel.show();
    }
    @FXML
    public void openAddToll() throws IOException {
        Parent parent = FXMLLoader.load(getClass().getResource("fxml/addToll.fxml"));
        Stage addToll = new Stage();
        addToll.setScene(new Scene(parent));
        addToll.show();
    }
    @FXML
    public void openAddMiscellaneous() throws IOException {
        Parent parent = FXMLLoader.load(getClass().getResource("fxml/addMiscellaneous.fxml"));
        Stage addMiscellaneous = new Stage();
        addMiscellaneous.setScene(new Scene(parent));
        addMiscellaneous.show();
    }


CompanyDashBoard controller

    @Override
    public void initialize(URL location, ResourceBundle resources) {

    }

    public void openAddCompany() {
        try {
            Parent parent = FXMLLoader.load(getClass().getResource("fxml/addCompany.fxml"));
            Stage addCompany = new Stage();
            addCompany.setScene(new Scene(parent));
            addCompany.show();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    public void openEditCompanyIncome() {
        try {
            Parent parent = FXMLLoader.load(getClass().getResource("fxml/editCompanyIncome.fxml"));
            Stage editCompanyIncome = new Stage();
            editCompanyIncome.setScene(new Scene(parent));
            editCompanyIncome.show();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public void openAddCompanyIncome() {
        try {
            Parent parent = FXMLLoader.load(getClass().getResource("fxml/addCompanyIncome.fxml"));
            Stage addCompanyIncome = new Stage();
            addCompanyIncome.setScene(new Scene(parent));
            addCompanyIncome.show();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void openEditCompany() {
        try {
            Parent parent = FXMLLoader.load(getClass().getResource("fxml/editCompany.fxml"));
            Stage editCompany = new Stage();
            editCompany.setScene(new Scene(parent));
            editCompany.show();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    Menu Controller
    @FXML
    public void openCompanyDashboard() {
        try {
            Parent root = FXMLLoader.load(getClass().getResource("fxml/companyDashboard.fxml"));
            Stage companyDashboard = new Stage();
            companyDashboard.setScene(new Scene(root));
            companyDashboard.show();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @FXML
    public void openEmployeeDashboard() {
        try {
            Parent parent = FXMLLoader.load(getClass().getResource("Application/fxml/employeeDashboard.fxml"));
            Stage employeeDashboard = new Stage();
            employeeDashboard.setScene(new Scene(parent));
            employeeDashboard.show();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

 try {
            Parent parent = FXMLLoader.load(getClass().getResource("Menu.fxml"));
            Stage back = new Stage();
            back.setScene(new Scene(parent));
            back.show();
            
        } catch (IOException e) {
            e.printStackTrace();
        }
