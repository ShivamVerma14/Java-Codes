package JavaPackage;
import java.util.Scanner;
class DecToBin
{
    public static void main(String args[])
    {
        int dec = 0;
        System.out.print("Enter the positive decimal number to convert it into binary: ");
        Scanner input = new Scanner(System.in);
        dec = input.nextInt();
        if(dec < 0)
            System.out.println("Invalid Number...");
        else
        {
            int size = 1;
            for(size = 1; (double)dec > Math.pow(2, size); size++);
            size++;
            int bin[] = new int[size];
            for(int i = 0; dec != 0; i++)
            {
                bin[i] = dec % 2;
                dec /= 2;
            }
            System.out.print("The Binary Equivalent is: ");
            for(int i = size-1; i >= 0; i--)
                System.out.print(bin[i]);
        }
    }
}