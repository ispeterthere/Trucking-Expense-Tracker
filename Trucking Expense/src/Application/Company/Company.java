package Application.Company;

import java.sql.Date;
import java.util.ArrayList;

public class Company {
    /**
     * Constructor class for what is a company
     */

    private int company_id;
    private String company_name;
    private Date company_created;
    private ArrayList<Date> company_modified;
    private double company_income;

    public Company(int company_id, String company_name, Date company_created, ArrayList<Date> company_modified,
                   double company_income)
    {
        this.company_id = company_id;
        this.company_name = company_name;
        this.company_created = company_created;
        this.company_modified = company_modified;
        this.company_income = company_income;

    }

    public int getCompany_id() {
        return company_id;
    }

    public void setCompany_id(int company_id) {
        this.company_id = company_id;
    }

    public String getCompany_name() {
        return company_name;
    }

    public void setCompany_name(String company_name) {
        this.company_name = company_name;
    }

    public Date getCompany_created() {
        return company_created;
    }

    public void setCompany_created(Date company_created) {
        this.company_created = company_created;
    }

    public ArrayList<Date> getCompany_modified() {
        return company_modified;
    }

    public void setCompany_modified(ArrayList<Date> company_modified) {
        this.company_modified = company_modified;
    }

    public double getCompany_income() {
        return company_income;
    }

    public void setCompany_income(double company_income) {
        this.company_income = company_income;
    }



}
