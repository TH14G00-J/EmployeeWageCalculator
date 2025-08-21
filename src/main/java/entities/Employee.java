package entities;

public class Employee {

    public double calculateEmployeeSalary(int hoursWorked, double hourlyWage) {
        int validHours = Math.max(hoursWorked, 0);
        double validWage = Math.max(hourlyWage, 0);
        return validHours * validWage;
    }
}
