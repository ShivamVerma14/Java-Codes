package JavaPackage;
import java.util.Scanner;
class Distance
{
    int feet;
    int inches;
    // Constructor to initialise the instance variable
    Distance()
    {
        feet = 0;
        inches = 0;
    }
    // Function to set the values of instance variable
    void set(int f, int i)
    {
        this.feet = f;
        this.inches = i;
        compute();
    }
    // Function to compute the real feet and inches
    void compute()
    {
        while(inches > 11)
        {
            int temp;
            temp = inches / 12;
            inches = inches % 12;
            feet += temp;
        }
    }
    // Function to show the values of Instance Variable
    void show()
    {
        System.out.println("Feet: " + feet);
        System.out.println("Inches: " + inches);
    }
}
public class demoDistance 
{
    public static void main(String[] args)
    {
        int feet_temp = 0, inches_temp = 0;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the Feet: ");
        feet_temp = input.nextInt();
        System.out.print("Enter the Inches: ");
        inches_temp = input.nextInt();
        Distance distance_temp = new Distance();
        distance_temp.set(feet_temp, inches_temp);
        distance_temp.show();
    }
}
