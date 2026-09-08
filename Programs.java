
import java.util.Scanner;

class Programs {

    public static void main(String[] args) {

        //decimal to binary
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter decimal number");
        int value = sc.nextInt();
        StringBuilder str = new StringBuilder();
        while (value > 0) {
            int rem = value % 2;
            str.append(rem);
            value = value / 2;
        }
        System.out.println(str.reverse());

        //binary to decimal
        System.out.println("Enter binary number");
        int n = sc.nextInt();
        int decimal = 0;
        int power = 1;
        while (n > 0) {
            int digit = n % 10;
            decimal = decimal + digit * power;
            power = power * 2;
            n /= 10;
        }
        System.out.println(decimal);

        //decimal to octal
        System.out.println("Enter decimal number");
        int num = sc.nextInt();
        StringBuilder st = new StringBuilder();
        while (num > 0) {
            int remainder = num % 8;
            st.append(remainder);
            num = num / 8;
        }
        System.out.println(st.reverse());

        //octal to decimal
        System.out.println("Enter octal number");
        int number = sc.nextInt();
        int octal = 0;
        int pow = 1;
        while (number > 0) {
            int digit1 = number % 10;
            octal = octal + digit1 * pow;
            pow = pow * 8;
            number /= 10;
        }
        System.out.println(octal);

        //decimal to hexadecimal
        System.out.println("Enter decimal number");
        int num1 = sc.nextInt();
        StringBuilder hex = new StringBuilder();
        while (num1 > 0) {
            int rem1 = num1 % 16;
            if (rem1 < 10) {
                hex.append(rem1);
            } else {
                hex.append((char) ('A' + rem1 - 10));
            }
            num1 /= 16;
        }
        System.out.println(hex.reverse());

        //linear search
        System.out.println("Enter N");
        int num2 = sc.nextInt();
        int arr[] = new int[num2];
        System.out.println("Enter the elements");
        for (int i = 0; i < num2; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Search element");
        int search = sc.nextInt();
        boolean key = false;
        for (int i = 0; i < num2; i++) {
            if (arr[i] == search) {
                System.out.println("Element found at " + i);
                key = true;
            }
        }
        if (!key) {
            System.out.println("Element not found");
        }

        //binary search
        System.out.println("Enter the elements");
        for (int i = 0; i < num2; i++) {
            arr[i] = sc.nextInt();
        }
        boolean found = false;
        int start = 0;
        int end = num2 - 1;
        while (start <= end) {
            int mid = (start + end) / 2;
            if (arr[mid] == search) {
                System.out.println("Element found at " + mid);
                found = true;
                break;
            } else if (arr[mid] < search) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        if (!found) {
            System.out.println("Element not found");
        }

        //bubble sort 
        System.out.println("Enter number of elements:");
        int l = sc.nextInt();
        int array[] = new int[l];
        System.out.println("Unsorted array");
        for (int i = 0; i < l; i++) {
            array[i] = sc.nextInt();
        }
        for (int i = 0; i < l; i++) {
            for (int j = 0; j < l - i - 1; j++) {
                if (array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
        System.out.println("Sorted array:");
        for (int i = 0; i < l; i++) {
            System.out.print(array[i] + " ");
        }

    }
}
