
class Person {

    protected String gender = "Female";
}

class Student extends Person {

    public String name = "Keerthika";
    private int fees = 200000;
    private String dept = "CSE";
    int age = 18;

    public void department() {
        System.out.println("Department : " + dept);
    }

    public int getFees() {
        return fees;
    }

    private void totalMark() {
        int mark = 490;
        System.out.println("Student Mark : " + mark);
    }

    void displayGender() {
        System.out.println("Gender : " + gender);
    }

    void displayMark() {
        totalMark();
    }
}

class Modifier {

    public static void main(String[] args) {
        Student s = new Student();
        System.out.println("Student Name : " + s.name);
        System.out.println("Age : " + s.age);
        s.department();
        System.out.println("Course Fees : " + s.getFees());
        s.displayMark();
        s.displayGender();

    }
}
