
import java.util.LinkedList;

class Linked_list {

    public static void main(String[] args) {
        {
            LinkedList<Integer> number = new LinkedList<>();
            number.add(10);
            number.add(20);
            number.add(30);
            number.add(40);
            number.add(50);
            number.add(60);
            number.add(70);
            number.add(80);
            System.out.println(number);

            System.out.println(number.size());

            number.remove(2);
            number.removeLast();
            number.removeFirst();
            System.out.println(number);

            number.set(0, 25);

            System.out.println(number.get(1));

            System.out.println(number.getFirst());

            System.out.println(number.getLast());

            System.out.println(number.isEmpty());

            for (int n : number) {
                if (n % 2 == 0) {
                    System.out.println(n + " is even number");
                } else {
                    System.out.println(n + " is odd number");
                }
            }

            LinkedList<String> name = new LinkedList<>();
            name.add("raji");
            name.add("arun");
            name.add("lakshmi");
            System.out.println(name);

            name.addFirst("anu");
            System.out.println(name);

            name.add("anu");
            System.out.println(name.indexOf("anu"));

            System.out.println(name.lastIndexOf("anu"));

            name.addLast("neha");
            System.out.println(name);

            name.removeLastOccurrence("anu");
            name.removeFirstOccurrence("anu");
            System.out.println(name);

            int count = 0;
            for (String n : name) {
                count++;
            }
            System.out.println("Total count of names : " + count);

            name.clear();
            System.out.println(name);
            
            System.out.println(name.isEmpty());

        }
    }
}
