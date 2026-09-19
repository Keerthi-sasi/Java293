
class Student {

    private String name;
    private int age;
    private String email;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setAge(int age) {
        if (age >= 0 && age <= 100) {
            this.age = age;
        } else {
            System.out.println("Invalid age");
        }
    }

    public int getAge() {
        return age;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEmail() {
        return email;
    }
}

class Car {

    private int speed;

    public void setSpeed(int speed) {
        if (speed >= 0) {
            this.speed = speed;
        }
    }

    public int getSpeed() {
        return speed;
    }
}

class BankAccount {

    private double balance;

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getBalance() {
        return balance;
    }
}

public class Encapsulation {

    public static void main(String args[]) {
        Student S = new Student();
        S.setName("Keerthika");
        S.setAge(21);
        S.setEmail("keerthi.2005gs@gmail.com");
        System.out.println(S.getName());
        System.out.println(S.getAge());
        System.out.println(S.getEmail());

        BankAccount a = new BankAccount();
        a.setBalance(5000);
        System.out.println("Balance : " + a.getBalance());

        Car c = new Car();
        c.setSpeed(80);
        System.out.println("Speed : " + c.getSpeed());
    }
}
