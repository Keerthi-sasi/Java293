
class Parent {

    Parent() {
        System.out.println("Parent class constructor");
    }
}

class Child extends Parent {

    Child() {
        //super() automatically called
        System.out.println("Child class constructor");
    }
}

class Animal
{
   void sound()
    {
          System.out.println("Animal makes sound");        
    }
}

class Dog extends Animal
{
    @Override
    void sound()
    {
        super.sound();
        System.out.println("Dog barks");
    }
}

class Product
{
    String name;
    Product(String name)
    {
        System.out.println("Product Name : "+name);
    }
}

class Smart_phone extends Product
{
    
    Smart_phone()
    {
        super("Phone");
        System.out.println("Smart phone constructor");
    }
}

class Vehicle 
{
    double speed = 100.53;
}

class Car extends Vehicle
{
    double speed = 200.0;
    void display()
    {
        System.out.println("Car speed : "+speed);
        System.out.println("Vehicle speed : "+super.speed);
    }
}

class Super {

    public static void main(String[] args) {
        Child c = new Child();
        
        Dog d = new Dog();
        d.sound();

        Smart_phone sp = new Smart_phone();

        Car c1 = new Car();
        c1.display();
        
    }
}
