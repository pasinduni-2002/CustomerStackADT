import java.util.Scanner;
import java.util.Stack;

class Customer {
    String name, mobile, email, city;
    int age;

    public Customer(String name, String mobile, String email, String city, int age) {
        this.name = name;
        this.mobile = mobile;
        this.email = email;
        this.city = city;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Name: " + name + ", Mobile: " + mobile + ", Email: " + email + ", City: " + city + ", Age: " + age;
    }
}

public class CustomerStackADT {

    private static Stack<Customer> customerStack = new Stack<>();

    // Push operation: Add customer to the stack
    public static void pushCustomer(String name, String mobile, String email, String city, int age) {
        Customer customer = new Customer(name, mobile, email, city, age);
        customerStack.push(customer);
        System.out.println("Customer added successfully: " + customer);
    }

    // Pop operation: Remove and return the most recently added customer
    public static void popCustomer() {
        if (customerStack.isEmpty()) {
            System.out.println("No customers in the stack to remove.");
        } else {
            Customer removedCustomer = customerStack.pop();
            System.out.println("Removed Customer: " + removedCustomer);
        }
    }

    // Peek operation: View the most recently added customer
    public static void peekCustomer() {
        if (customerStack.isEmpty()) {
            System.out.println("No customers in the stack.");
        } else {
            Customer topCustomer = customerStack.peek();
            System.out.println("Top Customer: " + topCustomer);
        }
    }

    // IsEmpty operation: Check if the stack is empty
    public static void isEmpty() {
        if (customerStack.isEmpty()) {
            System.out.println("The customer stack is empty.");
        } else {
            System.out.println("The customer stack is not empty.");
        }
    }

    // Size operation: Return the number of customers in the stack
    public static void stackSize() {
        System.out.println("Number of customers in the stack: " + customerStack.size());
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\nCustomer Registration Stack Menu:");
            System.out.println("1. Add Customer");
            System.out.println("2. Remove Customer");
            System.out.println("3. View Top Customer");
            System.out.println("4. Check if Stack is Empty");
            System.out.println("5. View Stack Size");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    System.out.print("Enter Name: ");
                    String name = scanner.nextLine();
                    System.out.print("Enter Mobile: ");
                    String mobile = scanner.nextLine();
                    System.out.print("Enter Email: ");
                    String email = scanner.nextLine();
                    System.out.print("Enter City: ");
                    String city = scanner.nextLine();
                    System.out.print("Enter Age: ");
                    int age = scanner.nextInt();
                    scanner.nextLine(); // Consume newline
                    pushCustomer(name, mobile, email, city, age);
                    break;
                case 2:
                    popCustomer();
                    break;
                case 3:
                    peekCustomer();
                    break;
                case 4:
                    isEmpty();
                    break;
                case 5:
                    stackSize();
                    break;
                case 6:
                    System.out.println("Exiting the system. Thank you!");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        } while (choice != 6);

        scanner.close();
    }
}
