package Application.Employee;

import java.util.ArrayList;

public class Expense {

    private double expense_fuel;
    private double expense_toll;
    private ArrayList<String> misc_expense = new ArrayList<String>();

    public double getExpense_fuel() {
        return expense_fuel;
    }

    public void setExpense_fuel(double expense_fuel) {
        this.expense_fuel = expense_fuel;
    }

    public double getExpense_toll() {
        return expense_toll;
    }

    public void setExpense_toll(double expense_toll) {
        this.expense_toll = expense_toll;
    }

    public ArrayList<String> getMisc_expense() {
        misc_expense.add("Insert Expense");

        return misc_expense;
    }

    public void setMisc_expense(ArrayList<String> misc_expense) {

        this.misc_expense = misc_expense;
        this.misc_expense.add("Motor Oil");
        this.misc_expense.add("Radiator Coolant");
        this.misc_expense.add("Battery");
        this.misc_expense.add("Brakes");
        this.misc_expense.add("Fuel tanks");
        this.misc_expense.add("Suspension System");
        this.misc_expense.add("Wheels and Rims");
        this.misc_expense.add("Body");
        this.misc_expense.add("Lights");
        this.misc_expense.add("Engine");
        this.misc_expense.add("Tools");
        this.misc_expense.add("Tires");
        this.misc_expense.add("Clutch");
        this.misc_expense.add("Transmission");
        this.misc_expense.add("Axle");
        this.misc_expense.add("Vandalism");
    }
}
