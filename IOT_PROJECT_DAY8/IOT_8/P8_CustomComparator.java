package IOT_8;
// Custom Sort
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
public class P8_CustomComparator {
	static class Person {
        String name;
        int salary;
        Person(String name, int salary) {
            this.name = name;
            this.salary = salary;
        }
    }
    public static void main(String[] args) {
        ArrayList<Person> people = new ArrayList<>();
        people.add(new Person("Uday", 30000));
        people.add(new Person("Rakesh", 50000));
        people.add(new Person("Ullas", 20000));
        people.add(new Person("Ujwal", 40000));        
        Collections.sort(people, new Comparator<Person>() {
            public int compare(Person p1, Person p2) {
                return p1.salary - p2.salary;
            }
        });       
        for (Person p : people) {
            System.out.println(p.name + " - " + p.salary);
        }
    }
}