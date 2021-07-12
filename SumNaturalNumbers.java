package JavaPackage;
import java.util.Scanner;
class SumNaturalNumbers
{
    public static void main(String args[])
    {
        System.out.print("Enter the value of n:");
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int sum=0;
        for(int i=1; i<=n; i++)
            sum+=i;
        System.out.println("Sum:" + sum);
    }
}