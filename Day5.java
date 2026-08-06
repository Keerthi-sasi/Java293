
class Day5 {

    public static void main(String[] args) {
        //Find the length of a string
        String name = "Keerthika";
        System.out.println("Length of a string:" + name.length());

        //Convert a string to uppercase
        System.out.println(name.toUpperCase());

        //Convert a string to lowercase
        System.out.println(name.toLowerCase());

        //Display the first character of a string
        System.out.println(name.charAt(0));

        //Display the last character of a string
        System.out.println(name.charAt(name.length() - 1));

        //Concatenate first name and last name
        String result = "Hello";
        System.out.println(result.concat(" ").concat(name));

        //Check whether two strings are equal
        System.out.println(result.equals(name));

        //Check whether a string contains "Java"
        String display = "Java Programming";
        System.out.println(display.contains("Java"));

        //Check whether an email ends with .com
        String email = "keerthi1219@gmail.com";
        System.out.println(email.endsWith(".com"));

        //Extract the domain name from an email using substring()
        int index = email.indexOf("@");
        System.out.println(email.substring(index + 1));

        //Replace all spaces with hyphens
        String department = " computer science ";
        System.out.println(department.replace(" ", "-"));

        //Find the first and last occurrence of a character
        System.out.println("First Occurence:" + display.indexOf('m'));
        System.out.println("Last Occurence:" + display.lastIndexOf('m'));

        //Split a comma-separated list of skills into individual values
        String skills = "Java,Python,HTML,CSS";
        String[] skillList = skills.split(",");
        for (int i = 0; i < skillList.length; i++) {
            System.out.println(skillList[i]);
        }

        //Convert an integer to a string using String.valueOf()
        int value = 56;
        String str = String.valueOf(value);
        System.out.println("Integer:" + value);
        System.out.println("String:" + str);

        //Check whether a string is empty or blank
        String str1 = "";
        String str2 = "  ";
        String str3 = "java";
        System.out.println("str1 isEmpty():" + str1.isEmpty());
        System.out.println("str1 isBlank():" + str1.isBlank());
        System.out.println("str2 isEmpty():" + str2.isEmpty());
        System.out.println("str2 isBlank():" + str2.isBlank());
        System.out.println("str3 isEmpty():" + str3.isEmpty());
        System.out.println("str3 isBlank():" + str3.isBlank());

        //Convert a string to a character array and print each character
        String word = "Java";
        char[] letters = word.toCharArray();
        for(char ch:letters) {
            System.out.println(ch);
        }

        //Compare two names using compareTo()
        String fruit1 = "Apple";
        String fruit2 = "Banana";
        String fruit3 = "apple";
        String fruit4 = "Banana";
        System.out.println(fruit1.compareTo(fruit2));
        System.out.println(fruit1.compareTo(fruit3));
        System.out.println(fruit2.compareTo(fruit3));
        System.out.println(fruit3.compareTo(fruit4));
        System.out.println(fruit2.compareTo(fruit4));
        System.out.println(fruit2.compareTo(fruit1));
        System.out.println(fruit1.compareToIgnoreCase(fruit3));

        //Validate a mobile number containing exactly 10 digits using matches()
        String mobile = "9876543210";
        if (mobile.matches("\\d{10}")) {
            System.out.println("Valid Mobile Number");
        } else {
            System.out.println("Invalid Mobile Number");
        }

        //Validate an email format using a regular expression with matches()
        String emailId = "keerthi234@gmail.com";
        if (emailId.matches("^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+$")) {
            System.out.println("Valid Email Format");
        } else {
            System.out.println("Invalid Email Format");
        }

        //Create a program that accepts a student's full name, length, 
        //uppercase, first character, last character, 
        //Replaces spaces with underscores, Checks whether it contains the word "Kumar"
        String strName = "Sathish Kumar";
        System.out.println("Student name:" + strName);
        System.out.println(strName.length());
        System.out.println(strName.toUpperCase());
        System.out.println(strName.charAt(0));
        System.out.println(strName.charAt(strName.length() - 1));
        System.out.println(strName.replace(" ", "_"));
        System.out.println(strName.contains("Kumar"));

        //Area of Rhombus
        int d1 = 7;
        int d2 = 8;
        float areaRhombus = (float) (d1*d2/ 2);
        System.out.println("Area of Rhombus:" + areaRhombus);

        //Area of Pentagon
        double sides = 8;
        double areaPentagon = (Math.sqrt(5 * (5 + 2 * Math.sqrt(5))) * sides * sides) / 4;
        System.out.println("Area of Pentagon:" + areaPentagon);

        //Area of Hexagon
        double areaHexagon = 3 * (Math.sqrt(3) * sides * sides) / 2;
        System.out.println("Area of Hexagon:" + areaHexagon);

        //Area of Heptogon
        double areaHeptogon = (7.0 / 4.0) * sides * sides * (1 / Math.tan(Math.PI / 7));
        System.out.println("Area of Heptogon:" + areaHeptogon);

        //Area of Octagon
        double areaOctagon = 2 * (1 + (Math.sqrt(2))) * sides * sides;
        System.out.println("Area of Octagon:" + areaOctagon);

        //Area of trapezoid
        double a = 8;
        double b = 10;
        double h = 5;
        double areaTrapezoid = ((a + b) * h) / 2;
        System.out.println("Area of Trapezoid:" + areaTrapezoid);

        //Volume of Sphere
        double radius = 2;
        double volumeSphere = (4.0 / 3.0) * Math.PI * radius * radius * radius;
        System.out.println("Volume of Sphere:" + volumeSphere);

        //Volume of Hemisphere
        double volume = (2.0 / 3.0) * Math.PI * radius * radius * radius;
        System.out.println("Volume of Hemisphere:" + volume);

        //volume of Cone
        int height = 7;
        double volumeCube = (Math.PI * radius * radius * height) / 3;
        System.out.println("Volume of Cone:" + volumeCube);

        //Volume of Cuboid
        double length = 12;
        double width = 21;
        double volumeCuboid = length * width * height;
        System.out.println("Volume of Cuboid:" + volumeCuboid);

        //Convert degrees to radians
        double angle = 30;
        double radians = Math.toRadians(angle);
        System.out.println(radians);

        //Convert radians to degrees
        double degrees = Math.toDegrees(radians);
        System.out.println(degrees);

        //Trigonometric functions
        System.out.println(Math.sin(radians));
        System.out.println(Math.cos(radians));
        System.out.println(Math.tan(radians));

        //Exponential
        System.out.println(Math.exp(2));

        //logarithm
        System.out.println(Math.log(10));

    }
}
