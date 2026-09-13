
class JavaProgram
{
    public static void main(String[] args)
    {
        int num = 10;
        if(num > 0)
        {
            System.out.println("The number is positive");
        }
        if(num < 0)
        {
            System.out.println("The number is negative");
        }
        if(num == 0)
        {
            System.out.println("The number is zero");
        }
        int marks = 90;
        if(marks >= 90)
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
        int annualIncome = 1300000;

        if(annualIncome <= 200000)
        {
            System.out.println("No Tax");
        }
        else if(annualIncome <= 500000)
        {
            System.out.println("Tax 5%");
        }
        else if(annualIncome <= 750000)
        {
            System.out.println("Tax 10%");
        }
        else if(annualIncome <= 1000000)
        {
            System.out.println("Tax 20%");
        }
        else 
        {
            System.out.println("Tax 30%");
        }
        int age = 20;
        int marks1 = 80;
        if(age >= 18)
        {
            if(marks1 >= 60)
            {
                System.out.println("Eligible");
            }
            else
            {
                System.out.println("Not Eligible");
            }
        }
        else
        {
            System.out.println("Not Eligible");
        }

        //Student details
         int studentId = 848;
         String studentName = "Keerthika"; 
         int studentAge = 20;
         String course = "Java Full Stack";
         System.out.println("Student Id:"+studentId);
         System.out.println("Student name:"+studentName);
         System.out.println("Student Age:"+studentAge);
         System.out.println("Course:"+course);

         //Employee details
         String employeeName = "Sanjana";
         int employeeId = 567;
         String department = "Information Technology";
         int salary = 50000;
         System.out.println("Employee Name:"+employeeName);
         System.out.println("Employee ID:"+employeeId);
         System.out.println("Department:"+department);
         System.out.println("Salary:"+salary);

         //Sum of two integers
         int num1 = 90;
         int num2 = 78;
          int sum = num1 + num2;
           System.out.println("Sum of two integers:"+sum);

        //Average of three numbers
        int a = 4;
        int b = 7;
        int c = 9;
        int average = (a+b+c)/3;
        System.out.println("Average of three numbers:"+average);

        //Area and perimetre of rectangle
        int length = 30;
        int breadth = 67;
        int areaOfRectangle = length*breadth;
        int perimeter = 2*(length+breadth);
        System.out.println("Area of rectangle:"+areaOfRectangle);
        System.out.println("Perimeter of rectangle:"+perimeter);

        //Area and circumference of circle
        double radius = 7;
        double areaOfCircle = 3.14*radius*radius;
        double circumference = 2*3.14*radius;
        System.out.println("Area of circle:"+areaOfCircle);
        System.out.println("Circumference of circle:"+circumference);

        //Swap two numbers using temp variable
        int x = 56, y = 90;
        int temp = x;
        x = y;
        y = temp;
        System.out.println("Before swapping: x = "+x+",y = "+y);
        System.out.println("After swapping: x = "+x+",y = "+y);

        //Swap two numbers without using temp variable
        int p = 34, q =67;
        p = p + q;
        q = p - q;
        p = p - q;
        System.out.println("Before swapping: p = "+p+",q = "+q);
        System.out.println("After swapping: p = "+p+",q = "+q);

        //Implicit and Explicit type casting



        //convert celsius to fahrenheit
        double celsius = 37;
        double fahrenheit = (celsius*9/5) + 32;
        System.out.println("Fahrenheit:"+fahrenheit);
        
        //perform addition, subtraction, multiplicetion, division and modules
        int m = 49;
        int n = 73;
        System.out.println("Addition:"+(m+n));
        System.out.println("Subtraction:"+(m-n));
        System.out.println("Multiplication:"+(m*n));
        System.out.println("Division:"+(m/n));
        System.out.println("Modulus:"+(m%n));

        //total and average of five subject marks
        int tamil = 95;
        int english = 66;
        int maths = 89;
        int science = 78;
        int social = 80;
        int total = tamil + english + maths +science +social;
        int avg = total/5;
        System.out.println("Total marks:"+total);
        System.out.println("Average marks:"+avg);

        //square and cube of a number
        int r = 6;
        int square = r*r;
        int cube = r*r*r;
        System.out.println("Square of a number:"+square);
        System.out.println("Cube of a number:"+cube);

        //Calculate simple interest
        double principal = 100000;
        double rate = 2;
        double time = 5;
        double simpleInterest = (principal*rate*time)/100;
        System.out.println("Simple Interest:"+simpleInterest);

        //Calculate compound interest
        double amount = 700000;
        double compoundInterest = amount - principal;
        System.out.println("Compound Interest:"+compoundInterest);

        //Greatest of two numbers
        int l = 897;
        int k = 477;
        if(l>k)
        {
            System.out.println("l is greater");
        }
        else if(k>l)
        {
            System.out.println("k is greater");
        }
        else
        {
            System.out.println("Both are equal");
        }

        //check equal or not
        int f = 86;
        int g = 47;
        if(f==g)
        {
            System.out.println("f and g are equal");
        }
        else
        {
            System.out.println("f and g are not equal");
        }

        //largest of three numbers
        int h = 65;
        int i = 63;
        int j = 84;
        if(h>i && h>j)
        {
            System.out.println("h is largest");
        }
        else if(i>h && i>j)
        {
            System.out.println("i is largest");
        }
        else if(j>h && j>i)
        {
            System.out.println("j is largest");
        }
        else
        {
            System.out.println("All are equal");
        }

        //check number greater than 100 or not
        int s = 35;
        if(s > 100)
        {
            System.out.println("s is greater than 100");
        }
        else
        {
            System.out.println("s is not greater than 100");
        }
        
        //check whether number greater than or equal to 50 or not
        int t = 67;
        if(t <= 50)
        {
            System.out.println("t is less than or equal to 50");
        }
        else
        {
            System.out.println("t is not less than or equal to 50");
        }

        //Check whether a student has passed in all subjects 
        if(tamil >= 35 && english >= 35 && maths >= 35 && science >= 35 && social >= 35)
        {
            System.out.println("Student has passed in all subjects");
        }
        else
        {
            System.out.println("Student has not passed in all subjects");
        }

        //person is eligible for discount or not
        int age1 = 17;
        boolean isMember = true;
        if(age1 >=18 && isMember)
        {
            System.out.println("Person is eligible for discount");
        }
        else
        {
            System.out.println("Person is not eligible for discount");
        }

        //Check whether a user is authorized using username and password conditions
        String username = "keerthika";
        String password = "keerth456567";
        if(username.equals("keerthika") && password.equals("keerth456567"))
        {
            System.out.println("User is authorized");
        }
        else
        {
            System.out.println("User is not authorized");
        }

        //Demonstrate the NOT (!) operator.
        boolean isRaining = false;
        if(!isRaining)
        {
            System.out.println("It is not raining");
        }
        else
        {
            System.out.println("It is raining");
        }

        //Check whether a number lies within a specified range.
        int number = 25;
        if(number >=10 && number <= 50)
        {
            System.out.println("Number lies within the range");
        }
        else
        {
            System.out.println("Number does not lie within the range");
        }

        //Check whether a number is positive
        int number1 = 6;
        if(number1 > 0)
        {
            System.out.println("Number is positive");
        }
        
        //Check whether a person is eligible to vote
        int age2 = 45;
        if(age2 >= 18)
        {
            System.out.println("person is eligible to vote");
        }

        //Check whether a student has scored above 90 marks.
        int marks2 = 95;
        if(marks2 > 90)
        {
            System.out.println("Student has scored above 90 marks");
        }

        //Check whether salary is greater than 50,000
        int salary1 = 40000;
        if(salary1 > 50000)
        {
            System.out.println("Salary is greater than 50000");
        }

        //Check whether temperature is above 40°C
         int temperature = 35;
        if(temperature > 40)
        {
            System.out.println("Temperature is above 40°C");
        }

        //Check whether a number is even or odd
        int checkNum = 7;
        if(checkNum%2 == 0)
        {
            System.out.println("Number is even");
        }
        else
        {
            System.out.println("Number is odd");
        }
        
        //Check whether a student is pass or fail
        int studentMark = 67;
        if(studentMark >= 35)
        {
            System.out.println("Student has passed");
        }
        else
        {
            System.out.println("Student has failed");
        }

        //Find the maximum of two numbers
        int maxNum1 = 34;
        int maxNum2 = 67;
        if(maxNum1 > maxNum2)
        {
            System.out.println("Maximum number is "+maxNum1);
        }
        else
        {
            System.out.println("Maximum number is "+maxNum2);
        }

        //Check whether a character is uppercase or lowercase
        char character = 'e';
        if(character >= 'A' && character <= 'Z')
        {
            System.out.println("Character is uppercase");
        }
        else
        {
            System.out.println("Character is lowercase");
        }

        //Check whether a year is a leap year
        int year = 2024;
        if((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0))
        {
            System.out.println(year+" is a leap year");
        }
        else
        {
            System.out.println(year+" is not a leap year");
        }

        //Find the grade based on marks (A, B, C, D, Fail)
        int studentMarks = 85;
       if(studentMarks < 0 || studentMarks >100)
        {
            System.out.println("Invalid marks");
        }
        else if(studentMarks >= 90)
        {
            System.out.println("Grade A");
        }
        else if(studentMarks >= 80)
        {
            System.out.println("Grade B");
        }
        else if(studentMarks >= 70)
        {
            System.out.println("Grade C");
        }
        else if(studentMarks >= 60)
        {
            System.out.println("Grade D");
        }
        else
        {
            System.out.println("Fail");
        }

        //Display salary category (High, Medium, Low)
        int employeeSalary = 60000;
        if(employeeSalary >= 100000)
        {
            System.out.println("High salary");
        }
        else if(employeeSalary >= 50000)
        {
            System.out.println("Medium salary");
        }
        else
        {
            System.out.println("Low salary");
        }  

        //Calculate income tax based on salary slabs
        int annualSalary = 1200000;
        if(annualSalary <= 250000)
        {
            System.out.println("No Tax");
        }
        else if(annualSalary <= 500000)
        {
            System.out.println("Tax amount:"+(annualSalary*5/100));
        }
        else if(annualSalary <= 750000)
        {
            System.out.println("Tax amount:"+(annualSalary*10/100));
        }
        else if(annualSalary <= 1000000)
        {
            System.out.println("Tax amount:"+(annualSalary*15/100));
        }
        else 
        {
            System.out.println("Tax amount:"+(annualSalary*20/100));
        }

        //Display ticket price based on age category
        int personAge = 13;
        if(personAge <= 5)
        {
            System.out.println("Ticket price: Free");
        }
        else if(personAge <= 12)
        {
            System.out.println("Ticket price: 10");
        }
        else if(personAge <= 60)
        {
            System.out.println("Ticket price: 20");
        }
        else
        {
            System.out.println("Ticket price: 15");
        }

        //Check college admission eligibility based on age and marks
        int studentAge1 = 18;
        int studentMarks1 = 75;
        if(studentAge1 >= 17)
        {
            if(studentMarks1 >= 60)
            {
                System.out.println("Eligible for admission");
            }
            else
            {
                System.out.println("Not eligible for admission");
            }
        }
        else
        {
            System.out.println("Not eligible for admission");
        }

        //Check loan eligibility based on salary and credit score
        int applicantSalary = 70000;
        int creditScore = 600;
        if(applicantSalary >= 50000)
        {
            if(creditScore >= 500)
            {
                System.out.println("Eligible for loan");
            }
            else 
            {
                System.out.println("Not eligible for loan");
            }
        }
        else
        {
            System.out.println("Not eligible for loan");
        }

        //Find the larger of two numbers using the ternary operator
        int checkNum1 = 48;
        int checkNum2 = 90;
        int checkMax = (checkNum1 > checkNum2) ? checkNum1 : checkNum2;
        System.out.println("Larger number is: "+checkMax);

        //Check whether a number is even or odd using the ternary operator
        int checkNum3 = 88;
        String checkResult = (checkNum3 % 2 == 0) ? "even" : "odd";
        System.out.println("Number is: "+checkResult);

        //Display the day name based on day number using switch
        int dayNumber = 4;
        switch(dayNumber)
        {
            case 1:
                System.out.println("Sunday");
                break;
            case 2:
                System.out.println("Monday");
                break;
            case 3:
                System.out.println("Tuesday");
                break;
            case 4:
                System.out.println("Wednesday");
                break;
            case 5:
                System.out.println("Thursday");
                break;
            case 6:
                System.out.println("Friday");
                break;
            case 7:
                System.out.println("Saturday");
                break;
            default:
                System.out.println("Invalid day number");
        }

        //Display the month name using switch
        int monthNumber = 6;
        switch(monthNumber)
        {
            case 1:
                System.out.println("January");
                break;
            case 2:
                System.out.println("February");
                break;
            case 3:
                System.out.println("March");
                break;
            case 4:
                System.out.println("April");
                break;
            case 5:
                System.out.println("May");
                break;
            case 6:
                System.out.println("June");
                break;
            case 7:
                System.out.println("July");
                break;
            case 8:
                System.out.println("August");
                break;
            case 9:
                System.out.println("September");
                break;
            case 10:
                System.out.println("October");
                break;
            case 11:
                System.out.println("November");
                break;
            case 12:
                System.out.println("December");
                break;
            default:
                System.out.println("Invalid month number");
        }

        //Find the smallest of three numbers
        int num4 = 6;
        int num5 = 7;
        int num6 = 8;
        if(num4==num5 && num5==num6)
        {
            System.out.println("All numbers are equal");
        }
        else if(num4<=num5 && num4<=num6)
        {
            System.out.println("Smallest number is:"+num4);
        }
        else if(num5<=num4 && num5<=num6)
        {
            System.out.println("Smallest number is:"+num5);
        }
        else
        {
            System.out.println("Smallest number is:"+num6);
        }

        //Check whether a number is divisible by 5
        int divNum = 55;
        if(divNum%5 == 0)
        {
            System.out.println("Number is divisible by 5");
        }
        else
        {
            System.out.println("Number is not divisible by 5");
        }

        //Check whether a number is divisible by both 3 and 5
        int divNumber = 45;
        if(divNumber%3 == 0 && divNumber%5 == 0)
        {
            System.out.println("Number is divisible by both 3 and 5");
        }
        else
        {
            System.out.println("Number is not divisible by both 3 and 5");
        }

        //Find the absolute value of a number
        int absoluteNum = -78;
        if(absoluteNum < 0)
        {
            absoluteNum = -absoluteNum;
        }
        System.out.println("Absolute value is:"+absoluteNum);

        //Check whether a character is a vowel or consonant
        char ch = 't';
        if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u' || ch=='A' || ch=='E' || ch=='I' || ch=='O' || ch=='U')
        {
            System.out.println(ch+" is a Vowel");
        }
        else 
        {
            System.out.println(ch+" is a Consonant");
        }

        //Check whether a character is an alphabet, digit, or special character
        char ch2 = '@';
        if((ch2 >= 'a' && ch2 <= 'z') || (ch2 >= 'A' && ch2 <= 'Z'))
        {
            System.out.println(ch2+" is an alphabet");
        }
        else if(ch2 >= '0' && ch2 <= '9')
        {
            System.out.println(ch2+" is a digit");
        }
        else
        {
            System.out.println(ch2+" is a special character");
        }

        //Find the maximum among four numbers
        int num7 = 45;
        int num8 = 90;
        int num9 = 67;
        int num10 = 12;
        if(num7==num8 && num8==num9 && num8==num10)
        {
            System.out.println("All numbers are equal");
        }
        else if(num7>=num8 && num7>=num9 && num7>=num10)
        {
            System.out.println("Maximum number is:"+num7);
        }
        else if(num8>=num7 && num8>=num9 && num8>=num10)
        {
            System.out.println("Maximum number is:"+num8);
        }
        else if(num9>=num7 && num9>=num8 && num9>=num10)
        {
            System.out.println("Maximum number is:"+num9);
        }
        else
        {
            System.out.println("Maximum number is:"+num10);
        }

        //Calculate electricity bill based on units consumed
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

        //Calculate mobile recharge discount based on recharge amount
        int rechargeAmount = 200;
        if(rechargeAmount < 0)
        {
            System.out.println("Invalid recharge amount");
        }
        else if(rechargeAmount >= 400)
        {
            System.out.println("Discount: 20%");
        }
        else if(rechargeAmount >=1000)
        {
            System.out.println("Discount: 30%");
        }
        else
        {
            System.out.println("No discount");
        }

        //Determine movie ticket category based on age
        int age3 = 25;
        if(age3 < 0)
        {
            System.out.println("Invalid age");
        }
        else if(age3 <= 12)
        {
            System.out.println("child ticket");
        }
        else if(age3 <= 60)
        {
            System.out.println("adult ticket");
        }
        else
        {
            System.out.println("senior citizen ticket");
        }

        //Find BMI category based on height and weight
        double height = 1.52;
        double weight = 55;
        double bmi = weight/(height*height);
        if(bmi < 18.5)
        {
            System.out.println("Underweight");
        }
        else if(bmi < 25)
        {
            System.out.println("Normal weight");
        }
        else if(bmi < 30)
        {
            System.out.println("Overweight");
        }
        else
        {
            System.out.println("Obesity");
        }

        //Calculate net salary after tax deduction
        int grossSalary = 600000;
        double taxRate = 0;
        if(grossSalary <= 250000)
        {
            taxRate = 0;
        }
        else if(grossSalary <= 500000)
        {
            taxRate = grossSalary*0.05;
        }
        else if(grossSalary <= 750000)
        {
            taxRate = grossSalary*0.1;
        }
        else if(grossSalary <= 1000000)
        {
            taxRate = grossSalary*0.2;
        }
        else
        {
            taxRate = grossSalary*0.3;
        }
        double netSalary = grossSalary - taxRate;
        System.out.println("Net Salary after tax deduction:"+netSalary);

        //Determine blood donation eligibility based on age and weight
        int eligibleAge = 20;
        int eligibleWeight = 55;
        if(eligibleAge >= 18 && eligibleWeight >= 50)
        {
            System.out.println("Eligible for blood donation");
        }
        else
        {
            System.out.println("Not eligible for blood donation");
        }

        //Check driving license eligibility
        int drivingAge = 45;
        if(drivingAge >= 18)
        {
            System.out.println("Eligible for driving license");
        }
        else
        {
            System.out.println("Not eligible for driving license");
        }

        //Display season name based on month number using switch
        int monthNum = 5;
        if(monthNum < 1 || monthNum > 12)
        {
            System.out.println("Invalid month number");
        }
        else if(monthNum == 12 || monthNum == 1 || monthNum == 2)
        {
            System.out.println("Winter");
        }
        else if(monthNumber >= 3 && monthNumber <= 5)
        {
            System.out.println("Summer");
        }
        else if(monthNumber >= 6 && monthNumber <= 8)
        {
            System.out.println("Rainy");
        }
        else
        {
            System.out.println("Autumn");
        }

        //Display department name based on department code using switch
        int departmentCode = 6;
        switch(departmentCode)
        {
            case 1:
                System.out.println("Information Technology");
                break;
                case 2:
                System.out.println("Computer Science");
                break;
                case 3:
                System.out.println("Electronics and Communication");
                break;
                case 4:
                System.out.println("Mechanical Engineering");
                break;
                default:
                System.out.println("Invalid department code");
        }

        //Calculate shopping bill with discount using conditional statements
        double shoppingAmount = 1200;
        double discount = 0;
        if(shoppingAmount >= 10000)
        {
            discount = shoppingAmount*0.2;
        }
        else if(shoppingAmount >= 5000)
        {
            discount = shoppingAmount*0.1;
        }
        else
        {
            discount = shoppingAmount*0.05;
        }
       System.out.println("Shopping bill "+shoppingAmount+"Discount "+discount);
        
       //Create a restaurant menu using switch and display the selected food item's price
       String foodItem = "Idly";
       switch(foodItem)
       {
          case "Idly":
            System.out.println("Idly");
            break;
          case "Dosa":
            System.out.println("Dosa");
            break;
          case "Poori":
            System.out.println("Poori");
            break;
          default:
            System.out.println("Food item not avaiable");       
       }
    }
}