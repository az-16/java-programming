package day51_inheritance;

public class EmployeeObjects {
    public static void main(String[] args) {
        Employee developer = new Employee();

        //i can returning value
        System.out.println("developer.calculateSalary(55.0) = " + developer.calculateSalary(55.0));
        double annualDevSalary = developer.calculateSalary(62.0);
        System.out.println("annualDevSalary = " + Math.round(annualDevSalary));

    }
}
