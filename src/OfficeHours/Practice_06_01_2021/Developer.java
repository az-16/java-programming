package OfficeHours.Practice_06_01_2021;


/*
- create a class called Developer
                    Attributes:
                        name, employeeID, JobTitle, Salary
                        hasCodingSkills

                    Constructor:
                        accepts and sets all instance variables

                    Actions:
                        getter/setters, coding(),  fixingBug(), toString()

 */
public class Developer {

    private String name;
    private int employeeID;
    private String jobTitle;
    private double salary;
    private static boolean hasCodingSkills = true;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getEmployeeID() {
        return employeeID;
    }

    public void setEmployeeID(int employeeID) {
        this.employeeID = employeeID;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public static boolean isHasCodingSkills() {
        return hasCodingSkills;
    }

    public static void setHasCodingSkills(boolean hasCodingSkills) {

    }
}
