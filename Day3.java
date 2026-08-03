
class Day3 {

    public static void main(String[] args) {

        //print numbers from 1 to 100 using a for loop
        for (int i = 1; i <= 100; i++) {
            System.out.println(i);
        }

        //print numbers from 100 to 1 using a while loop
        int i = 100;
        while (i >= 1) {
            System.out.println(i);
            i--;
        }

        //print all even numbers between 1 and 100
        for (int j = 1; j <= 100; j++) {
            if (j % 2 == 0) {
                System.out.println(j);
            }
        }

        //print all odd numbers between 1 and 100
        for (int j = 1; j <= 100; j++) {
            if (j % 2 != 0) {
                System.out.println(j);
            }
        }

        //sum of the first N natural numbers
        int sum = 0;
        for (int j = 1; j <= 5; j++) {
            sum += j;
        }
        System.out.println("Sum of a number " + sum);

        // calculate the factorial of a given number using a loop
        int fact = 1;
        for (int j = 1; j <= 5; j++) {
            fact *= j;
        }
        System.out.println("Factorial of a number " + fact);

        //reverse a given number using a loop
        int num = 675;
        int reverse = 0;
        while (num > 0) {
            int digit = num % 10;
            reverse = reverse * 10 + digit;
            num /= 10;
        }
        System.out.println("Reverse a given number " + reverse);

        //check whether a given number is a palindrome
        int number = 676;
        int rev = 0;
        int original = number;
        while (number > 0) {
            int digit = number % 10;
            rev = rev * 10 + digit;
            number /= 10;
        }
        if (rev == original) {
            System.out.println(original + " is a palindrome");
        } else {
            System.out.println(original + " is not a palindrome");
        }

        //count the number of digits in a given integer
        int givenNum = 7899;
        int count = 0;
        while (givenNum > 0) {
            givenNum = givenNum / 10;
            count++;
        }
        System.out.println("Number of digits " + count);

        //sum of the digits of a given number
        int value = 7899;
        int store = 0;
        while (value > 0) {
            int temp = value % 10;
            store += temp;
            value /= 10;
        }
        System.out.println("Sum of digits " + store);

        //display the multiplication table of a given number
        int num1 = 5;
        for (int k = 1; k <= 5; k++) {
            System.out.println(k + "*" + num1 + "=" + k * num1);
        }

        //print the Fibonacci series up to N terms
        int n = 10;
        int a = 0, b = 1;
        for (int l = 1; l <= n; l++) {
            System.out.print(a + " ");
            int c = a + b;
            a = b;
            b = c;
        }
        System.out.println("");

        // Check whether a given number is a prime number
        int num2 = 7;
        boolean isPrime = true;
        if (num2 <= 1) 
        {
            isPrime = false;
        } 
        else 
        {
            for (int k=2;k<num2;k++) {
                if (num2 % k == 0) {
                    isPrime = false;
                    break;
                }
            }
        }

        if(isPrime)
        {
            System.out.println("Prime number");
        } 
        else 
        {
            System.out.println("Not a prime number");
        }

        // Print all prime numbers between 1 and 100
        for (int m=2;m<=100;m++) {

            boolean isPrimeNum = true;

            for (int k=2;k<m;k++) 
            {
                if (m%k==0) 
                {
                    isPrimeNum = false;
                    break;
                }
            }

            if (isPrimeNum) 
            {
                System.out.print(m+" ");
            }
        }

    }
}
