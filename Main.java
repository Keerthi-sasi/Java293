
class Car {

    String brand;
    String colour;
    int price;
}

class StudentList {

    String studentName;
    int studentID;
    String studentCourse;

    void display(String studentName, int studentID, String studentCourse) {
        System.out.println("Student Name : " + studentName);
        System.out.println("Student ID : " + studentID);
        System.out.println("Student Course :" + studentCourse);
    }
}

class Employee {

    String empName;
    int empID;
    int empSalary;

    void display() {
        System.out.println("Employee Name :" + empName);
        System.out.println("Employee ID:" + empID);
        System.out.println("Employee Salary :" + empSalary);
    }
}

class Calculator {

    int add(int a, int b) {
        return a + b;
    }

    int sub(int a, int b) {
        return a - b;
    }

    int mul(int a, int b) {
        return a * b;
    }

    int div(int a, int b) {
        return a / b;
    }
}

class BankAccount {

    String accountHolder;
    int balance;
    int amount;

    void deposit(int amount) {
        balance = balance + amount;
        System.out.println("Deposited amount : " + amount);
    }

    void displaybalance() {
        System.out.println("Account Holder : " + accountHolder);
        System.out.println("Balance : " + balance);
    }

    void withdraw(int amount) {
        if (amount <= balance) {
            balance = balance - amount;
            System.out.println("Withdrawal successful");
            System.out.println("Remaining balance: " + balance);
        } else {
            System.out.println("Insufficient balance");
        }
    }
}

class Main {

    public static void main(String[] args) {
        Car c1 = new Car();
        c1.brand = "BMW";
        c1.colour = "Red";
        c1.price = 5000000;
        System.out.println("Brand : " + c1.brand);
        System.out.println("Colour : " + c1.colour);
        System.out.println("Price : " + c1.price);

        Car c2 = new Car();
        c2.brand = "Audi";
        c2.colour = "Black";
        c2.price = 4000000;
        System.out.println("Brand : " + c2.brand);
        System.out.println("Colour : " + c2.colour);
        System.out.println("Price : " + c2.price);

        Employee e1 = new Employee();
        e1.empName = "Keerthika";
        e1.empID = 101;
        e1.empSalary = 25000;
        e1.display();

        Employee e2 = new Employee();
        e2.empName = "Sanjana";
        e2.empID = 102;
        e2.empSalary = 50000;
        e2.display();

        Calculator c = new Calculator();
        int a = c.add(10, 20);
        int s = c.sub(20, 10);
        int m = c.mul(10, 20);
        int d = c.div(20, 10);
        System.out.println("Addition : " + a);
        System.out.println("Subtraction : " + s);
        System.out.println("Multiplication : " + m);
        System.out.println("Division : " + d);

        StudentList sl1 = new StudentList();
        sl1.display("Keerthika", 104, "java");
        StudentList sl2 = new StudentList();
        sl2.display("Sanjana", 103, "Python");

        BankAccount b1 = new BankAccount();
        b1.accountHolder = "Priya";
        b1.balance = 1000;
        b1.deposit(500);
        b1.displaybalance();
        b1.withdraw(200);
    }
}
