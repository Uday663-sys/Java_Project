package IOT_5;
//CRUD OPERATIONS
import java.util.HashSet;
public class P10_CRUD {
	public static void main(String[] args) {
		HashSet<String> set = new HashSet<>();
		// Create
		set.add("Ninja");
		set.add("Ducati");
		set.add("Yamaha");
		set.add("FireBlade");
		set.add("Aprilla");
		System.out.println("After Create:" + set);
		System.out.println();
		
		//Boolean
		boolean b1 = set.contains("Yamaha");
		System.out.println("Is Yamaha Present:" + b1);
		System.out.println(); 
		
		//Read
		System.out.println("Elements:" + set);
		System.out.println();
		
		//Update
		set.remove("Yamaha");
		set.add("BMW");
		System.out.println("After Update:" + set);
		System.out.println();
		
		//Deleting All Elements In The HashSet
		set.clear();
		System.out.println("After Deleting All Elements:" + set);
	}
}
