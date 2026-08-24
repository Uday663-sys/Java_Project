package IOT_5;
import java.util.HashSet;
import java.util.Iterator;
public class P11_HashSet_Methods {
    public static void main(String[] args) {

        HashSet<Integer> set = new HashSet<>();

        // Insert 10 values
        for (int i = 1; i <= 10; i++) {
            set.add(i);
        }
        
        // Iterator
        System.out.println("Using Iterator:");
        Iterator<Integer> it = set.iterator();
        while (it.hasNext()) {
            System.out.print(it.next() + " ");
        }
        System.out.println();

        // Stream
        System.out.println("\n\nUsing Stream:");
        set.stream().forEach(x -> System.out.print(x + " "));
        System.out.println();

        // For-each Loop
        System.out.println("\n\nUsing For-each Loop:");
        for (int num : set) {
            System.out.print(num + " ");
        }
        System.out.println();

        // ListIterator
        System.out.println("\n\nUsing ListIterator:");
        System.out.println("Not possible with HashSet.");
        System.out.println();

        // Enumeration
        System.out.println("\nUsing Enumeration:");
        System.out.println("Not possible with HashSet.");
    }
}
