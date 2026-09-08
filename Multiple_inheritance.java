// Multiple and Hybrid Inheritance
interface Animal
{
    void eat();
}

interface Pet
{
    void play();
}

class Dog implements Animal, Pet
{
    public void eat()
     {
        System.out.println("Dog is eating");
     }

     public void play()
     {
        System.out.println("Dog is playing");
     }
}

class Cat implements Animal, Pet
{
    public void eat()
    {
        System.out.println("Cat is eating");
    }

    public void play()
    {
        System.out.println("Cat is playing");
    }
}

interface Sports
{
    void play();
}

class Person
{
   void speak()
    {
        System.out.println("person speaks");
    }
}

class Teacher extends Person
{
     void teach()
     {
        System.out.println("Teacher teaches");
     }
}

class Student extends Person implements Sports
{
    public void play()
    {
        System.out.println("Student is playing");
    }
}

class Multiple_inheritance
{
    public static void main(String[] args)
    {
        Dog d = new Dog();
        d.eat();
        d.play();

        Cat c = new Cat();
        c.eat();
        c.play();

        Student s = new Student();
        s.speak();
        s.play();

        Teacher t = new Teacher();
        t.speak();
        t.teach();
    }
}