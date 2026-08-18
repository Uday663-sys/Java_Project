package IOT_2;
import java.io.BufferedReader;
import java.io.InputStreamReader;

class Employee {

    String name;
    int age;
    String designation;
    double salary;

    boolean created = false;

    BufferedReader br =
        new BufferedReader(new InputStreamReader(System.in));

    
    void create() throws Exception {

        System.out.println("\n--- CREATE EMPLOYEE ---");

        
        System.out.print("1. Enter the User Name: ");
        name = br.readLine();

        
        while (true) {

            System.out.print("2. Enter the User Age (18-60): ");
            age = Integer.parseInt(br.readLine());

            if (age >= 18 && age <= 60) {
                System.out.println("Age is Approved");
                break;
            } 
            else {
                System.out.println("Age is Not Approved");
                System.out.println(" Try again.");
                return;
            }
        }

        
        while (true) {

            System.out.print(
                "3. Enter the Designation: "
            );

            designation = br.readLine();

            if (designation.equalsIgnoreCase("PROGRAMMER") ||
                designation.equalsIgnoreCase("MANAGER") ||
                designation.equalsIgnoreCase("TESTER")) {

                System.out.println("YES");
                break;

            } 
            else {
                System.out.println("NO");
                System.out.println("Enter the  Proper Designation Again.");
            }
        }

        created = true;

        System.out.println("Employee details created successfully.");
    }

    
    void display() {

        if (!created) {
            System.out.println("\n Please Fill The Details.");
            return;
        }

        System.out.println("\n--- EMPLOYEE DETAILS ---");
        System.out.println("User Name        : " + name);
        System.out.println("User Age         : " + age);
        System.out.println("User Designation : " + designation);
    }

    
    void increaseSalary() throws Exception {

        if (!created) {
            System.out.println("\nFill the details in Create option.");
            return;
        }

        System.out.println("\n--- INCREASE SALARY ---");

        
        System.out.print("1. Enter the Salary: ");
        salary = Double.parseDouble(br.readLine());

        
        System.out.print("2. Enter the Salary Raise Amount: ");
        double raiseAmount = Double.parseDouble(br.readLine());

        salary = salary + raiseAmount;

        System.out.println("Salary after Raise: " + salary);
    }
}


public class EmployeeCredentials {

    public static void main(String[] args) throws Exception {

        BufferedReader br =
            new BufferedReader(new InputStreamReader(System.in));

        Employee emp = new Employee();

        int choice;

        do {

            System.out.println("\n===== EMPLOYEE MANAGEMENT =====");
            System.out.println("1. Create");
            System.out.println("2. Display");
            System.out.println("3. Increase Salary");
            System.out.println("4. Exit");

            System.out.print("Enter your choice: ");
            choice = Integer.parseInt(br.readLine());

            switch (choice) {

                case 1:
                    emp.create();
                    break;

                case 2:
                    emp.display();
                    break;

                case 3:
                    emp.increaseSalary();
                    break;

                case 4:
                    System.out.println("Program Exited.");
                    break;

                default:
                    System.out.println("Invalid Choice.");
            }

        } while (choice != 4);
    }
}
