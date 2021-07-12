package JavaPackage;
class SumIntegers
{
    public static void main(String args[])
    {
        int len=args.length;
        if(len<1)
            System.out.println("No Command Line Arguments Passed!!!");
        else
        {
            float sum=0;
            for (int i=0; i<len; i++)
                sum+=Float.parseFloat(args[i]);
            System.out.println("Sum:"+ sum);
        }
    }
}