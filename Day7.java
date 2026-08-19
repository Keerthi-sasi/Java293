class Day7
{
    static void display(){
            System.out.println("Welcome");
        }
    static void checkAge(){
        int age = 34;
        if(age>=18)
        {
            System.out.println("Eligible");
        }
        else{
            System.out.println("Not Eligible");
        }
    }
    static int add(){
        int a = 78;
        int b = 2;
        return a+b;
    }
    static void addNum(int a, int b){
        System.out.println(a+b);
    } 
    static void addNumber(){
        int a = 8;
        int b = 3;
        System.out.println(a+b);
    }
    static int addition(int a,int b){
        
         return a+b;
    }
    static float addition(float a, float b)
    {
        return a+b;
    }
    static double addition(double a, double b)
         {
            return a+b;
         }
    static String addition(String a, String b)
         {
            return a+b;
         }
 
    public static void main(String[] args) {
        display();
        checkAge();
        System.out.println(add());
        addNum(1,2);
        addNumber();
        System.out.println(addition(8,6));
        System.out.println(addition(3.6f,2.4f));
        System.out.println(addition(8.5,6.6));
        System.out.println(addition("Welcome"," Keerthika"));      
   
}
        
}
