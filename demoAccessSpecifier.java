package JavaPackage;
import java.util.Scanner;

class AccessSpecifier
{
    private int private_variable;
    public int public_variable;
    public int swap_variable1;
    public int swap_variable2;
    final int final_variable = 100;
    // Constructor to initialise the instance variables
    AccessSpecifier()
    {
        private_variable = 10;
        public_variable = 20;
        swap_variable1 = 0;
        swap_variable2 = 0;
    }
    // Constructor to initialise the swap variables
    AccessSpecifier(int v1, int v2)
    {
        private_variable = 10;
        public_variable = 20;
        swap_variable1 = v1;
        swap_variable2 = v2;
    }
    // Function to swap the values of two instance variable by passing the values
    void swap(int firstVariable, int secondVariable)
    {
        int temp;
        temp = firstVariable;
        firstVariable = secondVariable;
        secondVariable = temp;
    }
    // Function to swap the values of two instance variable by passing the object
    void swap(AccessSpecifier obj)
    {
        int temp;
        temp = obj.swap_variable1;
        obj.swap_variable1 = obj.swap_variable2;
        obj.swap_variable2 = temp;
    }
}
public class demoAccessSpecifier 
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int first_variable = 0, second_variable = 0;
        System.out.println("Accessing the public and final instance variables of the instance...");
        AccessSpecifier object = new AccessSpecifier();
        System.out.println("Public Variable: " + object.public_variable);
        System.out.println("Final Variable: " + object.final_variable);
        System.out.println("\nEnter the two values to swap: ");
        first_variable = input.nextInt();
        second_variable = input.nextInt();
        System.out.println("\nSwapping through call by value...");
        object.swap(first_variable, second_variable);
        System.out.println("First Variable: " + first_variable);
        System.out.println("Second Variable: " + second_variable);
        System.out.println("\nSwapping through call by reference...");
        AccessSpecifier swapObject = new AccessSpecifier(first_variable, second_variable);
        object.swap(swapObject);
        System.out.println("First Variable: " + swapObject.swap_variable1);
        System.out.println("Second Variable: " + swapObject.swap_variable2);
    }
}
