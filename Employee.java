public class Employee {
    private String id;
    private String name;
    private int salary;

    // Constructor
    public Employee(String id, String name, int salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    // Getters
    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getSalary() {
        return salary;
    }

    // Method to raise salary by a certain percentage
    public int raiseSalary(int percent) {
        salary += salary * percent / 100;
        return salary;
    }

    // Method to calculate annual salary
    public int AnnualSalary() {
        return salary * 12;
    }

    // toString method to represent Employee details as a string
    @Override
    public String toString() {
        return "Employee[id=" + id + ", name=" + name + ", salary=" + salary + "]";
    }
}
