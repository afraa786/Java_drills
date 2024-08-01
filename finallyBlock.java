public class finallyBlock {
    private static int greet() {
        try {
            int a = 50;
            int b = 0;
            int c = a / b;
            return c;
        } catch (ArithmeticException e) {
            System.out.println("The operation is not possible\t" + e);
        } finally {
            System.out.println("This is the end of our code");
        }
        return -1;
    }
    public static void main(String[] args) {
        int f = greet();
        System.out.println(f);
      int a = 10;
        int b = 2;
        while (true) {
            try {
                System.out.println(a/b);
            } catch (Exception e) {
                System.out.println(e);
                break;
            }
            finally {
                System.out.println("the value of b: " + b);
            }
            b--;
        }
    }
}
