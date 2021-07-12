package JavaPackage;

class StaticFunction
{
    static void addition(int... variableArguments)
    {
        int sum = 0;
        for(int elements: variableArguments)
            sum += elements;
        System.out.println("Sum: " + sum);
    }
}
public class demoStaticFunction
{
    public static void main(String[] args)
    {
        StaticFunction.addition(100);
        StaticFunction.addition(1, 2, 3, 4, 5, 6, 7, 8, 9);
    }
}
