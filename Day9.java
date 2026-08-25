
import java.util.Scanner;

public class Day9 {

    public static void main(String[] args) {

        //get number from user
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int number = sc.nextInt();
        if (number > 0) {
            System.out.println("Positive");
        } else if (number < 0) {
            System.out.println("Negative");
        } else {
            System.out.println("Zero");
        }

        //get input array from user
        System.out.println("Enter N");
        int N = sc.nextInt();
        int arr[] = new int[N];
        System.out.println("Enter a elements");
        for (int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Multiplication");
        int mul = sc.nextInt();
        for (int i = 0;i<arr.length;i++)
        {
            System.out.println(arr[i]*mul);
        }

        //Get two inputs
        System.out.println("Enter a first number");
        int a = sc.nextInt();
        System.out.println("Enter a Second number");
        int b = sc.nextInt();
        int sum = a + b;
        System.out.println("Addition " + sum);

        //Get string,double,float inputs  
        System.out.println("Enter name");
        String name = sc.next();
        System.out.println(name);
        System.out.println("Enter number");
        double num1 = sc.nextDouble();
        System.out.println(num1);
        System.out.println("Enter number");
        float num2 = sc.nextFloat();
        System.out.println(num2);     

    }
}
