package IOT;
import java.util.Scanner;
public class BankingSystem {
	static String username, designation;
    static int age;
    static double salary;
    static boolean created = false;
    public static void main(String[] args) {
    	 Scanner sc = new Scanner(System.in);
         int choice;
         do {
        	 System.out.println("\n--- BANKING SYSTEM ---");
             System.out.println("1. Create");
             System.out.println("2. Display");
             System.out.println("3. Raise Salary");
             System.out.println("4. Exit");
             System.out.print("Enter your choice: ");
             choice = sc.nextInt();
             switch(choice) {
             
             case 1:
            	 System.out.print("Enter the user name: ");
            	 username = sc.next();
            	 
            	 System.out.print("Enter the User age: ");
            	 age = sc.nextInt();

            	 System.out.print("Enter the designation: ");
            	 designation = sc.next();
            	 if (designation.equalsIgnoreCase("PROGRAMMER") ||designation.equalsIgnoreCase("MANAGER") ||
                         designation.equalsIgnoreCase("TESTER")) {
            		 System.out.println("Valid designation");

                     System.out.print("Enter the salary: ");
                     salary = sc.nextDouble();

                     created = true;
                     System.out.println("User created successfully!");
            	 }
            	 else {
                     System.out.println("Invalid designation");
                 }
                 break;
                 
             case 2:
            	 if (created) {
                     System.out.println("\n--- USER DETAILS ---");
                     System.out.println("User Name: " + username);
                     System.out.println("Age: " + age);
                     System.out.println("Designation: " + designation);
                     System.out.println("Salary: " + salary);
                 } else {
                     System.out.println(" Create the user first!.");
                 }
                 break;
                 
             case 3:
            	 if (created) {
                     System.out.print("Enter salary to Raise amount: ");
                     double increase = sc.nextDouble();

                     salary = salary + increase;

                     System.out.println("Salary increased successfully!");
                     System.out.println("New Salary: " + salary);
                 } else {
                     System.out.println(" Create the user first!.");
                 }
                 break;
                 
             case 4:
            	 System.out.println("Thank you!");
                 break;

             default:
                 System.out.println("Invalid choice!"); 
             }
         }
         while(choice != 4);
         sc.close();
    }
}
