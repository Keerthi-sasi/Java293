
class Login {

    void login(String username) {
        System.out.println("Login with username : " + username);
    }

    void login(String username, String password) {
        System.out.println("Login with username : " + username + " and password : " + password);
    }

    void login(long mobile, int otp) {
        System.out.println("Login with mobile number : " + mobile + " and otp : " + otp);
    }
}

class Payment {

    void pay(int amount) {
        System.out.println("Cash payment : " + amount);
    }

    void pay(int amount, String cardnumber) {
        System.out.println("Card payment : " + amount + " with card number : " + cardnumber);
    }

    void pay(int amount, String upi, boolean isUpi) {
        System.out.println("UPI payment : " + amount + " with UPI ID : " + upi);
    }
}

class Calculator
{
    int add(int a, int b)
    {
        return a+b;
    }
    double add(double a,double b)
    {
        return a+b;
    }
    int add(int a, int b, int c)
    {
        return a+b+c;
    }
}

class Overloading {

    public static void main(String[] args) {
        Login l = new Login();
        l.login("user233");
        l.login("userr88", "pass#123");
        l.login(9378838837L, 37787);

        Payment p = new Payment();
        p.pay(500);
        p.pay(1000, "1346978358926938");
        p.pay(2890, "376788@upi", true);

        Calculator c = new Calculator();
        System.out.println(c.add(10, 20));
        System.out.println(c.add(10.5, 20.5));
        System.out.println(c.add(10, 20, 9));
    }
}
