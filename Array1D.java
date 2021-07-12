package JavaPackage;
import java.util.Scanner;
class Array1D
{
    public static void main(String args[])
    {
        int size = 0;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the size of Array: ");
        size = input.nextInt();
        if(size<1)
            System.out.println("Invalid size of Array!!!");
        else
        {
            int array[] = new int[size];
            System.out.println("Enter the Integer Array...");
            for(int i=0; i<size; i++)
                array[i] = input.nextInt();
            System.out.println("The Integer Array is...");
            for(int i=0; i<size; i++)
                System.out.print(array[i] + " ");
        }
    }
}