package JavaPackage;
import java.util.Scanner;
class Factorial
{
    public static void main(String args[])
    {
        int num = 0, fact = 1;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number to find its factorial: ");
        num = input.nextInt();
        if(num<0)
            System.out.println("Number can't be negative!!!");
        else
        {
            for(int i=1; i<=num; i++)
                fact*=i;
            System.out.println("Factorial of given number is: " + fact);
        }

    }
}