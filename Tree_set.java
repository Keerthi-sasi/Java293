import java.util.TreeSet;
class Tree_set
{
   public static void main(String[] args) {
       {
        TreeSet<String> subject1 = new TreeSet<>();
        subject1.add("Tamil");
        subject1.add("English");
        subject1.add("Maths");
        System.out.println(subject1);

        System.out.println(subject1.size());

        subject1.remove("Tamil");
        System.out.println(subject1);

        TreeSet<String> subject2 = new TreeSet<>();
        subject2.add("Science");
        subject2.add("Tamil");
        subject2.add("Social");
        System.out.println(subject2);

        System.out.println(subject1.containsAll(subject2));

        subject1.addAll(subject2);
        System.out.println(subject1);

        System.out.println(subject1.first());
        System.out.println(subject1.last());
        System.out.println(subject1.higher("Social"));
        System.out.println(subject1.higher("English"));
        System.out.println(subject1.lower("Social"));
        System.out.println(subject1.ceiling("History"));
        System.out.println(subject1.floor("History"));
        
        System.out.println(subject1.contains("Social"));

        subject1.clear();
        System.out.println(subject1.isEmpty());
       }
   }
}