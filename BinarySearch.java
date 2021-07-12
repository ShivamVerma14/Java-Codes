package JavaPackage;
import java.util.Scanner;
class BinarySearch
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
            System.out.println("Enter the number to be searched: ");
            int num = input.nextInt();
            int beg = 0, mid = 0, last = size-1, position=0;
            while(beg<=last)
            {
                mid = (beg+last)/2;
                if(array[mid] == num)
                {   position = mid;
                    break;
                } 
                else if(array[mid] < num)
                    beg = mid+1;
                else if(array[mid] > num)
                    last = mid-1;
            }
            if(position == 0)
                System.out.println(num + " is not found.");
            else
                System.out.println(num + " is found at position :" + (position+1) + "th");
        }
    }
}