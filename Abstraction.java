abstract class Vehicle {

    abstract void start();
}

interface GPS {

    void location();
}

class Car extends Vehicle implements GPS {

    void start() {
        System.out.println("Car starts");
    }

    public void location() {
        System.out.println("GPS Location");
    }
}

abstract class Shape {

    abstract void area();
}

class Circle extends Shape {

    void area() {
        int r = 5;
        System.out.println("Area of circle : " + (3.14 * r * r));
    }
}

class Rectangle extends Shape {

    void area() {
        int l = 4;
        int b = 3;
        System.out.println("Area of Rectangle : " + (l * b));
    }
}

abstract class Mobile {

    abstract void call();

    void display() {
        System.out.println("Mobile phone");
    }

}

class Samsung extends Mobile {

    void call() {
        super.display();
        System.out.println("calling using samsung");
    }
}

class Abstraction {

    public static void main(String[] args) {

        Car c = new Car();
        c.start();
        c.location();

        Rectangle r = new Rectangle();
        r.area();
        Circle c1 = new Circle();
        c1.area();

        Samsung s = new Samsung();
        s.call();
    }
}
