import entities.Employee;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class EmployeeTest {

    @Test
    void shouldCalculateSalaryForPositiveValues() {
        Employee employee = new Employee();
        assertEquals(135, employee.calculateEmployeeSalary(9,15));
    }

    @Test
    void shouldReturnZeroForNegativeValues() {
        Employee employee = new Employee();
        assertEquals(0, employee.calculateEmployeeSalary(-9,-15));
    }

    @Test
    void shouldReturnZeroWhenHoursAreZero() {
        Employee employee = new Employee();
        assertEquals(0, employee.calculateEmployeeSalary(0,50));
    }
}
