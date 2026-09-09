
interface Payment {

    void pay();
}

class Upi implements Payment {

    public void pay() {
        System.out.println("UPI payment");
    }
}

class Card implements Payment {

    public void pay() {
        System.out.println("Card payment");
    }
}

class Employee {

    void salary() {
        System.out.println("Employee salary");
    }
}

class Manager extends Employee {

    void salary() {
        super.salary();
        System.out.println("Manager salary : 60000");
    }
}

class Developer extends Employee {

    void salary() {
        super.salary();
        System.out.println("Developer salary : 30000");
    }
}

class Animal {

    void sound() {
        System.out.println("Animal sounds");
    }
}

class Cat extends Animal {

    void sound() {
        System.out.println("Cat meow");
    }
}

class Dog extends Animal {

    void sound() {
        System.out.println("Dog barks");
    }
}

class Overriding {

    public static void main(String[] args) {
        Payment upi = new Upi();
        upi.pay();
        Payment card = new Card();
        card.pay();

        Employee m = new Manager();
        m.salary();
        Employee d = new Developer();
        d.salary();

        Animal[] a = {new Dog(),
            new Cat()};

        for (Animal animal : a) {
            animal.sound();
        }

    }
}
