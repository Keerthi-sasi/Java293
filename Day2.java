class Day2
{
    public static void main(String[] args)
    {
        //Convert celsius to fahrenheit
        double celsius = 37;
        double fahrenheit = (celsius*9/5) + 32;
        System.out.println("Fahrenheit:"+fahrenheit);

        //Convert kilometer to miles
        double kilometer = 10;
        double miles = kilometer*0.621371;
        System.out.println("Miles:"+miles);

        //Convert miles to kilometer
        double miles1 = 4;
        double kilometer1 = miles1*1.60934;
        System.out.println("Kilometer:"+kilometer1);

        //Time calculation
        double dist = 100;
        double speed = 74;
        double time = dist/speed;
        System.out.println("Time:"+time);

        //Distance calculation
        double speed1 = 60;
        double time1 = 2;
        double distance1 = speed1*time1;
        System.out.println("Distance:"+distance1);

        //salary calculation
        double yearlySalary = 400000;
        System.out.println("1 month salary:"+yearlySalary/12);
        System.out.println("1 week salary:"+yearlySalary/52);
        System.out.println("1 day salary:"+yearlySalary/365);
        System.out.println("1 hour salary:"+yearlySalary/(365*24));

        //Simple interest calculation
        double principal = 550;
        double rate = 2;
        double time2 = 5;
        double simpleInterest = (principal*rate*time2)/100;
        System.out.println("Simple Interest:"+simpleInterest);

        //Area calculation
        double length = 5;
        double breadth = 10;
        double radius = 12;
        double side = 15;
        System.out.println("Area of circle:"+3.14*radius*radius);
        System.out.println("Area of rectangle:"+length*breadth);
        System.out.println("Area of square:"+side*side);

        //Leap year or not
        int year = 2020;
        if(year%4==0 && year%100!=0 || year%400==0)
        {
            System.out.println(year+" is a leap year");
        }
        else 
        {
            System.out.println(year+" is not a leap year");
        }

        //Vowel or consonant
        char ch = 'a';
        if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u' || ch=='A' || ch=='E' || ch=='I' || ch=='O' || ch=='U')
        {
            System.out.println(ch+" is a Vowel");
        }
        else 
        {
            System.out.println(ch+" is a Consonant");
        }
        
        //Largest of two numbers
        int a = 10;
        int b = 17;
        if(a>b)
        {
            System.out.println("a is a largest number");
        }
        else if(b>a)
        {
            System.out.println("b is a largest number");
        }
        else
        {
            System.out.println("Both numbers are equal");
        }

        //Largest of four numbers
        int c = 100;
        int d = 17;
        if(a==b && a==c && a==d)
        {
            System.out.println("All numbers are equal");
        }
        else if(a>=b && a>=c && a>=d)
        {
            System.out.println("a is a largest number");
        }
        else if(b>=a && b>=c && b>=d)
        {
            System.out.println("b is a largest number");
        }
        else if(c>=a && c>=b && c>=d)
        {
            System.out.println("c is a largest number");
        }
        else 
        {
            System.out.println("d is a largest number");
        }
       

        //Grading system
        int marks = 89;
        if(marks < 0 || marks >100)
        {
            System.out.println("Invalid marks");
        }
        else if(marks >= 90)
        {
            System.out.println("Grade A");
        }
        else if(marks >= 80)
        {
            System.out.println("Grade B");
        }
        else if(marks >= 70)
        {
            System.out.println("Grade C");
        }
        else if(marks >= 60)
        {
            System.out.println("Grade D");
        }
        else if(marks >= 50)
        {
            System.out.println("Grade E");
        }
        else
        {
            System.out.println("Fail");
        }

        //EB bill calculator
        int units = 380;
        if(units <= 100)
        {
            System.out.println("Free");
        }
        else if(units <= 150)
        {
            System.out.println("Bill:"+units*3);
        }
        else if(units <= 200)
        {
            System.out.println("Bill:"+units*4);
        }
        else if(units <= 250)
        {
            System.out.println("Bill:"+units*5);
        }
        else
        {
            System.out.println("Bill:"+units*6);
        }

    }
}