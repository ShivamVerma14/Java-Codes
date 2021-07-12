package JavaPackage;

class Test {
    public static void main(String[] args) {
        int a = 24, d = 0;
        try {
            System.out.println("Try1");
            try {
                System.out.println("Try2");
                try {
                    a /= d;
                } catch(ArrayIndexOutOfBoundsException E) {
                    System.out.println(E);
                }
                System.out.println("After Exception");
            } catch(ArrayIndexOutOfBoundsException E) {
                System.out.println(E);
            }
            System.out.println("After Exception 1");
        } catch(ArithmeticException E) {
            System.out.println(E);
        }
    }
}