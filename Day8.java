
class Day8 {

    public static void main(String[] args) {
        //Access array elements
        int[] arr = {10, 20, 30, 40, 50};
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

        //Change array elements
        arr[0] = 5;
        System.out.println(arr[0]);

        //Sum of array elements
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        System.out.println(sum);

        //for each loop
        for (int number : arr) {
            System.out.println(number);
        }

        //reverse the array
        for (int i = arr.length - 1; i >= 0; i--) {
            System.out.println(arr[i]);
        }

        //search an element
        int search = 20;
        int index = -1;
        for (int i = 0; i < arr.length; i++) {
            if (search == arr[i]) {
                index = i;
                break;
            }
        }
        if (index != -1) {
            System.out.println("Search element found at " + index);
        } else {
            System.out.println("Search element not found");
        }

        //Count even and odd numbers
        int evenCount = 0;
        int oddCount = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                evenCount++;
            } else {
                oddCount++;
            }
        }
        System.out.println("Count of even numbers " + evenCount);
        System.out.println("Count of odd numbers " + oddCount);

        //count positive,negative,zero
        int[] elements = {2, 0, -7, 0, 5, -9};
        int countPositive = 0;
        int countNegative = 0;
        int countZero = 0;
        for (int i = 0; i < elements.length; i++) {
            if (elements[i] > 0) {
                countPositive++;
            } else if (elements[i] < 0) {
                countNegative++;
            } else {
                countZero++;
            }
        }
        System.out.println("Count of positive numbers " + countPositive);
        System.out.println("Count of negative numbers " + countNegative);
        System.out.println("Count of Zeroes " + countZero);

        //Find second largest number
        int largest = arr[0];
        int secLargest = Integer.MIN_VALUE;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > largest) {
                secLargest = largest;
                largest = arr[i];

            } else if (arr[i] > secLargest && arr[i] != largest) {
                secLargest = arr[i];
            }
        }
        System.out.println("Second largest: " + secLargest);

        //Find second Smallest
        int smallest = arr[0];
        int secSmallest = Integer.MAX_VALUE;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < smallest) {
                secSmallest = smallest;
                smallest = arr[i];
            } else if (arr[i] < secSmallest && arr[i] != smallest) {
                secSmallest = arr[i];
            }
        }
        System.out.println("Second smallest: " + secSmallest);

        //Find frequency of element
        int[] ele = {2, 6, 34, 7, 7, 2, 2};
        int maxCount = 0;
        int maxElement = ele[0];
        for (int i = 0; i < ele.length; i++) {
            int count = 0;
            for (int j = 0; j < ele.length; j++) {
                if (ele[i] == ele[j]) {
                    count++;
                }
            }
            if (count > maxCount) {
                maxCount = count;
                maxElement = ele[i];
            }
        }
        System.out.println(maxElement + " occurs " + maxCount + " times");

        //Print Duplicate Elements
        int[] a = {10, 20, 30, 10, 20, 40};

        for (int i = 0; i < a.length; i++) {
            for (int j = i + 1; j < a.length; j++) {
                if (a[i] == a[j]) {
                    System.out.println(a[i]);
                    break;
                }
            }
        }

    }
}
