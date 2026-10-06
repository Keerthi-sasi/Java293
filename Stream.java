
import java.util.*;

class Stream {

    public static void main(String args[]) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        List<Integer> answer = numbers.stream().map(n -> n * 2).toList();
        System.out.println(answer);

        List<Integer> number = Arrays.asList(1, 2, 3, 4, 5);
        List<Integer> squares = number.stream().map(n -> n * n).toList();
        System.out.println(squares);

        List<String> names = Arrays.asList("Ram", "Priyanka", "Anitha");
        List<String> result = names.stream().map(n -> n.toUpperCase()).toList();
        System.out.println(result);

        List<String> shapes = Arrays.asList("Circle", "Triangle", "Square", "Sphere");
        List<String> prints = shapes.stream().filter(n -> n.startsWith("S")).toList();
        System.out.println(prints);

    }
}
