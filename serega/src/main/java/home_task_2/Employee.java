package home_task_2;


public class Employee {
    private String firstName;
    private String lasttName;
    private int salary;

    public Employee(String firstName) {
        this.firstName = firstName;
    }

    public Employee(String firstName, String lasttName) {
        this.firstName = firstName;
        this.lasttName = lasttName;
    }

    public Employee(String firstName, String lasttName, int salary) {
        this.firstName = firstName;
        this.lasttName = lasttName;
        this.salary = salary;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLasttName() {
        return lasttName;
    }

    public void setLasttName(String lasttName) {
        this.lasttName = lasttName;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

}
