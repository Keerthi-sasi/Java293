//Topic: Predicting the Map Sequence
//1. Create two maps: a LinkedHashMap and a TreeMap. 
//Insert the same set of unsorted keys and observe the output order.
import java.util.LinkedHashMap;
import java.util.TreeMap;

class Map_sequence {

    public static void main(String[] args) {
        LinkedHashMap<Integer, String> num1 = new LinkedHashMap<>();
        num1.put(50, "Java");
        num1.put(10, "HTML");
        num1.put(20, "CSS");
        num1.put(40, "React");
        num1.put(30, "JS");
        num1.put(20, "CSS");
        num1.put(10, "Springboot");
        num1.put(60, "Java");
        System.out.println("LinkedHashMap : " + num1);

        TreeMap<Integer, String> num2 = new TreeMap<>();
        num2.put(50, "Java");
        num2.put(10, "HTML");
        num2.put(20, "CSS");
        num2.put(40, "React");
        num2.put(30, "JS");
        num2.put(20, "CSS");
        num2.put(10, "Springboot");
        num2.put(60, "Java");
        System.out.println("TreeMap : " + num2);

    }

}
