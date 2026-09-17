
import java.util.Scanner;

class ProjectBased {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //student management system
        int n = 5;
        int[] marks = new int[n];
        System.out.println("Enter elements");
        for (int i = 0; i < n; i++) {
            marks[i] = sc.nextInt();
        }

        //Total marks
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum = sum + marks[i];
        }
        System.out.println("Total marks " + sum);

        //average marks
        double avg =(double) sum / n;
        System.out.println("Average marks " + avg);

        //highest and smallest mark
        int highest = marks[0];
        int smallest = marks[0];
        for (int i = 0; i < n; i++) {
            if (marks[i] > highest) {
                highest = marks[i];
            }
            if (marks[i] < smallest) {
                smallest = marks[i];
            }
        }
        System.out.println("Highest marks " + highest);
        System.out.println("Smallest marks " + smallest);

        //Product Price Management
        int price[] = new int[n];
        System.out.println("Enter prices of products");
        for (int i = 0; i < n; i++) {
            price[i] = sc.nextInt();
        }

        //Total price
        int add = 0;
        for (int i = 0; i < n; i++) {
            add = add + price[i];
        }
        System.out.println("Total price " + add);

        //expensive and cheapest
        int expensive = price[0];
        int cheap = price[0];
        for (int i = 0; i < n; i++) {
            if (price[i] > expensive) {
                expensive = price[i];
            }
            if (price[i] < cheap) {
                cheap = price[i];
            }
            add = add + price[i];
        }

        System.out.println("Most expensive " + expensive);
        System.out.println("Cheapest " + cheap);

        //average
        double average =(double) sum / n;
        System.out.println("Average price " + average);

        //products above ₹1000
        System.out.println("Products above ₹1000 ");
        for (int i = 0; i < 15; i++) {
            if (price[i] > 1000) {
                System.out.print(price[i] + " ");
            }
        }

        //products between ₹500 and ₹2000
        System.out.println("Products between ₹500 and ₹2000 ");
        for (int i = 0; i < 15; i++) {
            if (price[i] >= 500 && price[i] <= 2000) {
                System.out.print(price[i] + " ");
            }
        }

    }
}
