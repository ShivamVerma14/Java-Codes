package JavaPackage;
import java.util.Scanner;
class LinearSearch
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
            System.out.flush();
            System.out.println("Enter the number to be searched: ");
            int num = input.nextInt();
            int position=0;
            for(position=0; position<size; position++)
            {
                if(array[position] == num)
                {
                    break;
                }
            }
            System.out.println(num + " is found at position :" + (position+1) + "th");
        }
    }
}