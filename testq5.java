class Employee {
    private String name;
    private int yearOfJoining;
    private double salary;
    private String address;

    // Constructor with parameters
    public Employee(String name, int yearOfJoining, double salary, String address) {
        this.name = name;
        this.yearOfJoining = yearOfJoining;
        this.salary = salary;
        this.address = address;
    }

    // Method to print employee information
    public void printInfo() {
        System.out.println("Name: " + name);
        System.out.println("Year of Joining: " + yearOfJoining);
        System.out.println("Salary: " + salary);
        System.out.println("Address: " + address);
    }
}

public class testq5 {
    public static void main(String[] args) {
        // Creating objects of Employee class
        Employee employee1 = new Employee("Robert", 1994, 000, "64C- WallsStreet");
        Employee employee2 = new Employee("Sam", 2000, 000, "68D- WallsStreet");
        Employee employee3 = new Employee("John", 1999, 000, "26B- WallsStreet");

        // Printing employee information
        System.out.println("Employee 1:");
        employee1.printInfo();
        System.out.println();

        System.out.println("Employee 2:");
        employee2.printInfo();
        System.out.println();

        System.out.println("Employee 3:");
        employee3.printInfo();
    }
}
