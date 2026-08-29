package IOT_8;
// Instance variable and constructor
import java.util.Scanner;
public class P9_Demo {		
	  String name;
	    int age;
	    P9_Demo(String name, int age) {
	        this.name = name;
	        this.age = age;
	    }
	    void display() {
	        System.out.println("Name: " + name);
	        System.out.println("Age: " + age);
	    }
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        System.out.print("Enter name: ");
	        String name = sc.nextLine();
	        System.out.print("Enter age: ");
	        int age = sc.nextInt();
	        P9_Demo person = new P9_Demo(name, age);
	        person.display();
	  }
}
	