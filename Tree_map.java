
import java.util.TreeMap;

class Tree_map {

    public static void main(String[] args) {
        TreeMap<Integer, String> skills = new TreeMap<>();
        skills.put(1, "Java");
        skills.put(2, "Python");
        skills.put(3, "C");
        skills.put(4, "C++");
        skills.put(5, "React");
        System.out.println(skills);

        System.out.println(skills.get(2));

        System.out.println(skills.lowerKey(1));
        System.out.println(skills.higherKey(1));

        System.out.println(skills.firstKey());
        System.out.println(skills.lastKey());

        System.out.println(skills.containsKey(3));
        System.out.println(skills.containsValue("Python"));

        System.out.println(skills.ceilingKey(1));
        System.out.println(skills.floorKey(1));

        System.out.println(skills.pollLastEntry());
        System.out.println(skills.pollFirstEntry());

        System.out.println(skills.descendingMap());
        System.out.println(skills.descendingKeySet());

        skills.putIfAbsent(5, "Java");
        System.out.println(skills);

        System.out.println(skills.firstEntry());
        System.out.println(skills.lastEntry());

        System.out.println(skills.size());

        for (Integer n : skills.keySet()) {
            if (n > 2) {
                System.out.println(skills.get(n));
            }
        }

        skills.clear();
        System.out.println(skills.isEmpty());
    }
}
