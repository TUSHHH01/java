// Program no 28
class AgeNotValidException extends Exception {
    public AgeNotValidException(String message) {
        super(message);
    }
}

class Employee {
    private int eno;
    private String ename;
    private int age;
    private double salary;

    public Employee(int eno, String ename, int age, double salary) throws AgeNotValidException {
        if (age < 18) {
            throw new AgeNotValidException("Age not valid exception: Employee must be 18 years or older.");
        }
        this.eno = eno;
        this.ename = ename;
        this.age = age;
        this.salary = salary;
    }

    public void display() {
        System.out.println("Employee Details");
        System.out.println("Employee Number: " + eno);
        System.out.println("Employee Name: " + ename);
        System.out.println("Employee Age: " + age);
        System.out.println("Employee Salary: " + salary);
    }

    public static void main(String[] args) {
        try {
            Employee validEmployee = new Employee(101, "Manakernika", 25, 50000);
            validEmployee.display();
            Employee invalidEmployee = new Employee(102, "JIJA", 16, 45000);
            invalidEmployee.display();
        } catch (AgeNotValidException e) {
            System.out.println(e.getMessage());
        }
    }
}
