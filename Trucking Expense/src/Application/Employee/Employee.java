package Application.Employee;

import java.sql.Date;
import java.util.ArrayList;

public class Employee {

    private int employee_id;
    private String employee_first_name;
    private String employee_last_name;
    private double employee_income;
    private Date employee_created;
    private ArrayList<Date> employee_modified;

    public Employee(int employee_id, String employee_first_name, String employee_last_name, double employee_income,
                    Date employee_created, ArrayList<Date> employee_modified)
    {
        this.employee_id = employee_id;
        this.employee_first_name = employee_first_name;
        this.employee_last_name = employee_last_name;
        this.employee_income = employee_income;
        this.employee_created = employee_created;
        this.employee_modified = employee_modified;
    }

    public int getEmployee_id() {
        return employee_id;
    }

    public void setEmployee_id(int employee_id) {
        this.employee_id = employee_id;
    }

    public String getEmployee_first_name() {
        return employee_first_name;
    }

    public void setEmployee_first_name(String employee_first_name) {
        this.employee_first_name = employee_first_name;
    }

    public String getEmployee_last_name() {
        return employee_last_name;
    }

    public void setEmployee_last_name(String employee_last_name) {
        this.employee_last_name = employee_last_name;
    }

    public double getEmployee_income() {
        return employee_income;
    }

    public void setEmployee_income(double employee_income) {
        this.employee_income = employee_income;
    }

    public Date getEmployee_created() {
        return employee_created;
    }

    public void setEmployee_created(Date employee_created) {
        this.employee_created = employee_created;
    }

    public ArrayList<Date> getEmployee_modified() {
        return employee_modified;
    }

    public void setEmployee_modified(ArrayList<Date> employee_modified) {
        this.employee_modified = employee_modified;
    }

}
