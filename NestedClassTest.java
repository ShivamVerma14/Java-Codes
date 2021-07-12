package JavaPackage;

class Outer1
{
    int outer1_x = 10;
    class Outer2
    {
        int outer2_x = 20;
        class Inner
        {
            void display()
            {
                System.out.println("X = " + outer1_x + " Y = " + outer2_x);
            }
        }
        void test2()
        {
            Inner inn = new Inner();
            inn.display();
        }
    }
    void test1()
    {
        Outer2 out = new Outer2();
        out.test2();
    }
}

class NestedClassTest
{
    public static void main(String[] args)
    {
        Outer1 obj = new Outer1();
        obj.test1();
    }
}
