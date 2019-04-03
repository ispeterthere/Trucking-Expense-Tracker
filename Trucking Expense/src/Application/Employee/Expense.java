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
    }
}
