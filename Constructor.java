
class Product{

    Product()
    {
        System.out.println("Product constructor called");
    }
}
class Book {

    String bookName;
    String authorName;
    int price;

    Book() {
        bookName = "Unknown";
        authorName = "Unknown";
        price = 0;
    }

    Book(String bookName) {
        this.bookName = bookName;
        authorName = "Unknown";
        price = 0;
    }

    Book(String bookName, String authorName) {
        this.bookName = bookName;
        this.authorName = authorName;
        price = 0;
    }

    Book(String bookName, String authorName, int price) {
        this.bookName = bookName;
        this.authorName = authorName;
        this.price = price;
    }

    void displayDetails() {
        System.out.println("Book name : " + bookName + " | Author Name : " + authorName + "| price : " + price);

    }
}

class Rectangle {

    int length;
    int breadth;

    Rectangle() {
        length = 10;
        breadth = 5;
    }

    void area() {
        int a = length * breadth;
        System.out.println("Area of rectangle : " + a);
    }
}

class Employee {

    String empName;
    int empID;
    int empSalary;

    Employee(String empName, int empID, int empSalary) {
        this.empName = empName;
        this.empID = empID;
        this.empSalary = empSalary;
    }

    void display() {
        System.out.println("Employee Name :" + empName);
        System.out.println("Employee ID:" + empID);
        System.out.println("Employee Salary :" + empSalary);
    }
}

class Constructor {

    public static void main(String[] args) {

        Product p1 = new Product();

        Book b1 = new Book();
        Book b2 = new Book("java");
        Book b3 = new Book("java", "Richard");
        Book b4 = new Book("java", "Richard", 500);
        b1.displayDetails();
        b2.displayDetails();
        b3.displayDetails();
        b4.displayDetails();

        Rectangle r1 = new Rectangle();
        r1.area();

        Employee e1 = new Employee("Keerthi", 101, 20000);
        e1.display();

        Employee e2 = new Employee("Anu", 102, 30000);
        e2.display();
    }
}
