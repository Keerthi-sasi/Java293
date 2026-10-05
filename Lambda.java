
interface Message {

    void show();
}

interface Calculator {

    int calc(int a, int b);
}

interface Largest {

    int find(int a, int b);
}

interface Check {

    String test(int n);
}

class Lambda {

    public static void main(String args[]) {

        Message msg = () -> {
            System.out.println("Welcome");
        };
        msg.show();

        Calculator add = (a, b) -> (a + b);
        Calculator sub = (a, b) -> (a - b);
        Calculator mul = (a, b) -> (a * b);
        Calculator div = (a, b) -> (a / b);
        System.out.println("Addition : " + add.calc(20, 10));
        System.out.println("Subtraction : " + sub.calc(20, 10));
        System.out.println("Multiplication : " + mul.calc(20, 10));
        System.out.println("Division : " + div.calc(20, 10));

        Largest l = (a, b) -> a > b ? a : b;
        System.out.println("Largest : " + l.find(10, 20));

        Check c = (n) -> n > 0 ? "Positive" : "Negative";
        System.out.println(c.test(10));

    }
}
