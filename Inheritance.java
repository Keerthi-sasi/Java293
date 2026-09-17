//Single , Multilevel and Hierarchical Inheritance
class Parent {

    void displayParent() {
        System.out.println("Parent class");
    }
}

class Child extends Parent {

    void displayChild() {
        System.out.println("Child class");
    }
}

class Animal
{
    void eat()
    {
        System.out.println("Animal is eating");
    }
}
class Dog extends Animal
{
    void bark()
    {
        System.out.println("Dog is barking");
    }
}
class Puppy extends Dog
{
    void play()
    {
        System.out.println("Puppy is playing");
    }
}

class Cat extends Animal
{
    void meow()
    {
        System.out.println("Cat is meowing");
    }
}

class Inheritance {

    public static void main(String[] args) {
        Child c = new Child();
        c.displayParent();
        c.displayChild();
        
        Puppy p = new Puppy();
        p.bark();
        p.play();
        p.eat();
        
        Cat c1 = new Cat();
        c1.meow();
        c1.eat();
        Dog d = new Dog();
        d.bark();
        d.eat();
    }

}
