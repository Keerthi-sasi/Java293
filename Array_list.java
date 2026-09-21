
import java.util.ArrayList;
import java.util.Iterator;

class Array_list {

    public static void main(String args[]) {
        ArrayList<String> names = new ArrayList<>();
        names.add("keerthi");
        names.add("renu");
        names.add("surya");
        System.out.println(names);
        names.remove(0);
        System.out.println(names);
        names.removeIf(n -> n == "renu");
        System.out.println(names);
        System.out.println(names.contains("surya"));
        names.replaceAll(n -> n.toUpperCase());
        for (String name : names) {
            System.out.println(name);
        }
        names.add(1, "anu");
        Iterator<String> itr = names.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }
        ArrayList<String> c1 = (ArrayList<String>) names.clone();
        System.out.println(c1);

        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(5);
        numbers.add(12);
        System.out.println(numbers);
        numbers.set(2, 3);
        for (int i = 1; i < numbers.size(); i++) {
            System.out.println(numbers.get(i));
        }
        System.out.println(numbers.indexOf(12));
        System.out.println(numbers.lastIndexOf(12));
        System.out.println(numbers.get(1));
        numbers.clear();
        System.out.println(numbers.isEmpty());

        ArrayList<String> s1 = new ArrayList<>();
        s1.add("Java");
        s1.add("Python");
        ArrayList<String> s2 = new ArrayList<>();
        s2.add("C");
        s2.add("C++");
        s1.addAll(s2);
        System.out.println(s1);

        ArrayList<Integer> num1 = new ArrayList<>();

        num1.add(1);
        num1.add(3);
        num1.add(5);
        int sum = 0;
        for (int n : num1) {
            sum = sum + n;
        }
        System.out.println("Sum of the numbers : " + sum);

        ArrayList<Integer> num2 = new ArrayList<>();
        num2.add(7);
        num2.add(8);
        num2.add(3);
        int max = num2.get(0);

        for (int n : num2) {
            if (max < n) {
                max = n;
            }
        }
        System.out.println("Maximum : " + max);

    }
}
