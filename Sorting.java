package JavaPackage;
import java.util.Scanner;
class Sorting
{
    static void sort(int a[])
    {
        int temp;
        for(int i = 0; i < a.length; i++)
            for(int j = 0; j < a.length - 1; j++)
                if(a[j] > a[j+1])
                {
                    temp = a[j];
                    a[j] = a[j+1];
                    a[j+1] = temp;
                }
    }
    public static void main(String args[])
    {
        Scanner input = new Scanner(System.in);
        int size;
        System.out.print("Enter the size of Array: ");
        size = input.nextInt();
        int array[] = new int[size];
        System.out.println("Enter the elements of Array...");
        for(int index = 0; index < size; index++)
            array[index] = input.nextInt();
        System.out.println("Original Array...");
        for(int element : array)
            System.out.print(element + " ");
        sort(array);
        System.out.println("\nSorted Array...");
        for(int element : array)
            System.out.print(element + " ");
    }
}