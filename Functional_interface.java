
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Consumer;
import java.util.function.Supplier;

class Functional_interface {

    public static void main(String args[]) {
        Function<Integer, Integer> square = x -> x * x;
        System.out.println(square.apply(5));
        System.out.println(square.apply(10));

        Function<String, Integer> name = n -> n.length();
        System.out.println(name.apply("Keerthi"));

        Predicate<Integer> checkEven = number -> number % 2 == 0;
        System.out.println(checkEven.test(10));
        System.out.println(checkEven.test(1));

        Predicate<Integer> voting = age -> age > 18;
        System.out.println(voting.test(20));
        System.out.println(voting.test(12));

        Consumer<String> print = names -> System.out.println(names);
        print.accept("Ragu");
        print.accept("Swetha");
        print.accept("Madhu");

        Consumer<Integer> doubleValue = number -> System.out.println(number * 2);
        doubleValue.accept(100);

        Supplier<String> s = () -> "Welcome to Java";
        System.out.println(s.get());

        Supplier<Integer> calc = () -> 10 * 20;
        System.out.println(calc.get());
    }
}
