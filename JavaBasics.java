class JavaBasics
{
    public static void main(String[] args)
    {
        String name="Keerthika";
        System.out.println("Welcome "+name);
        int age=90;
        System.out.println(age);
        float balance=1000.5f;
        System.out.println(balance);
        boolean check=true;
        System.out.println(check);
        char val='e';
        System.out.println(val);
        byte p=127;
        System.out.println(p);
       

        //Arithmetic Operators
        int a=30;
        int b=20;
        System.out.println("Addition "+(a+b));
        System.out.println("Subtraction "+(a-b));
        System.out.println("Multiplication "+(a*b));
        System.out.println("Division "+(a/b));
        System.out.println("Modulus "+(a%b));

        //Assignment Operators
        a+=b;
        System.out.println("Addition Assignment "+a);
        a-=b;
        System.out.println("Subtraction Assignment "+a);
        a*=b;
        System.out.println("Multiplication Assignment "+a);
        a/=b;
        System.out.println("Division Assignment "+a);
        a%=b;
        System.out.println("Modulus Assignment "+a);

        //Comparison Operators
        System.out.println("Equal to:"+(a==b));
        System.out.println("Not equal to:"+(a!=b));
        System.out.println("Greater than:"+(a>b));
        System.out.println("Less than:"+(a<b));
        System.out.println("Greater than or equal to:"+(a>=b));
        System.out.println("Less than or equal to:"+(a<=b));

        //Logical Operators
        System.out.println("Logical AND:"+(a>b && a<b)); 
        System.out.println("Logical OR:"+(a>b || a<b)); 
        System.out.println("Logical NOT:"+(!(a>b)));

        //Increment and Decrement Operators
        int x=10;
        int y=15;
        y=++x;
        System.out.println("Pre-Increment:"+x+","+y);
        y=--x;
        System.out.println("Pre-Decrement:"+x+","+y);
        y=x++;
        System.out.println("Post-Increment:"+x+","+y);
        y=x--;
        System.out.println("Post-Decrement:"+x+","+y);
    }
}