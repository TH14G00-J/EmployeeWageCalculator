import entities.Employee;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Employee employee = new Employee();

        System.out.print("User number: ");
        int userNumber = (int) getValidIntOrDouble(sc);

        System.out.print("Hours worked: ");
        int hoursWorked = (int) getValidIntOrDouble(sc);

        System.out.print("Hourly wage: ");
        double hourlyWage = getValidIntOrDouble(sc);

        double salary = employee.calculateEmployeeSalary(hoursWorked, hourlyWage);

        System.out.printf("""
                ------------------------
                USER INFORMATION
                
                Number: %d
                Salary: %.2f
                ------------------------
                """, userNumber, salary);
    }

    private static double getValidIntOrDouble(Scanner sc) {
        while (!sc.hasNextDouble()) {
            System.out.println("Invalid input. Please enter a number: ");
            sc.next();
        }
        return sc.nextDouble();
    }
}