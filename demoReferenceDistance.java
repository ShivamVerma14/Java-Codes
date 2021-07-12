package JavaPackage;
import java.util.Scanner;
class ReferenceDistance
{
    int feet;
    int inches;
    // Constructor to initialise the instance variable
    ReferenceDistance()
    {
        feet = 0;
        inches = 0;
    }
    // Function to set the values of instance variable
    ReferenceDistance(int f, int i)
    {
        this.feet = f;
        this.inches = i;
        compute();
    }
    // Constructor to clone an object into another
    ReferenceDistance(ReferenceDistance object)
    {
        this.feet = object.feet;
        this.inches = object.inches;
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
public class demoReferenceDistance
{
    public static void main(String[] args)
    {
        int feet_temp = 0, inches_temp = 0;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the Feet: ");
        feet_temp = input.nextInt();
        System.out.print("Enter the Inches: ");
        inches_temp = input.nextInt();
        ReferenceDistance firstDistance = new ReferenceDistance(feet_temp, inches_temp);
        ReferenceDistance secondDistance = firstDistance;
        ReferenceDistance thirdDistance = new ReferenceDistance(firstDistance);
        System.out.println("Showing first object of Distance...");
        firstDistance.show();
        System.out.println("Showing reference variable to first object of Distance...");
        secondDistance.show();
        System.out.println("Showing cloned object of first object of Distance...");
        thirdDistance.show();
    }
}
