
import java.util.LinkedHashMap;

class Linked_hash_map {

    public static void main(String[] args) {
        LinkedHashMap<Integer, String> num = new LinkedHashMap<>();
        num.put(1, "Renu");
        num.put(2, "Ram");
        num.put(3, "Anu");
        num.put(4, "Shyam");
        System.out.println(num);

        System.out.println(num.get(2));

        System.out.println(num.containsKey(3));
        System.out.println(num.containsValue("Renu"));

        System.out.println(num.keySet());
        System.out.println(num.values());
        System.out.println(num.entrySet());

        for (Integer number : num.keySet()) {
            if (number % 2 == 0) {
                System.out.println(num.get(number));
            }
        }

        System.out.println(num.remove(4));

        System.out.println(num.putIfAbsent(4, "Banu"));
        System.out.println(num);

        System.out.println(num.getOrDefault(4, "Banu"));

        num.replace(2, "Nithya");
        System.out.println(num);

        System.out.println(num.size());

        num.clear();
        System.out.println(num.isEmpty());

    }
}
