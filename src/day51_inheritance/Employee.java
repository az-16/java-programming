package day51_inheritance;

public class Employee {

    String jobTitle;

    public double calculateSalary(double hourlyLate) {
        return 52 * 40 * hourlyLate *1.1;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "jobTitle='" + jobTitle + '\'' +
                '}';
    }
}
