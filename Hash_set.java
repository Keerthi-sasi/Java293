
import java.util.HashSet;
import java.util.Iterator;

class Hash_set {

    public static void main(String[] args) {
        HashSet<Integer> num = new HashSet<>();
        num.add(10);
        num.add(20);
        num.add(30);
        num.add(40);
        num.forEach(n -> System.out.println(n));

        System.out.println(num.contains(10));

        System.out.println(num.size());

        System.out.println(num.isEmpty());

        HashSet<Integer> number = new HashSet<>();
        number.add(10);
        number.add(40);
        number.add(70);
        number.add(4);
        System.out.println(number);

        num.retainAll(number);
        System.out.println(num);

        num.addAll(number);
        System.out.println(num);

        System.out.println(num.containsAll(number));

        num.removeAll(number);
        System.out.println(num);

        Iterator<Integer> itr = number.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }

        number.remove(70);
        System.out.println(number);

        num.clear();
        System.out.println(num);

    }
}
