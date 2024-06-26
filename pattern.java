//                  VARARGS example
/*public class Main {
    static int sum(int x, int... arr) {
        int result = x;
        for (int a : arr) {
            result += a;
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println("the sum of 2 + 3 + 4:" + sum(2, 3, 4));
        System.out.println("The sum of 67 + 24:" + sum(67, 24));
    }
 } */
//        IN-PLACE REVERSAL OF ARRAY
    /*    int [] arr = {12, 14, 16, 18, 20};
        int l= arr.length;
        int n = Math.floorDiv(arr.length, 2);
        for (int i = 0; i<n; i++) {
            int temp;
            temp = arr[i];
            arr[i]= arr[l-i-1];
            arr[l-i-1] = temp;
        }
        for (int elements:arr) {
            System.out.print(elements + " ");
        } */
          //FACTORIAL USING RECURSION
/* public class Main {
    static int factorial(int n) {
        if (n == 0 || n == 1) {
            return 1;
        } else {
            return n * factorial(n - 1);
        }
    }
    public static void main(String[] args) {
        int n = 4;
        System.out.println("factorial is:" + factorial(n));
    */
/* public class Main {
    static void multiplication(int n) {
        for (int i = 1; i <= 20; i++) {
            System.out.printf("%d X %d = %d\n", n, i, n * i);
        }
    }
    public static void main(String[] args) {
        int n = 6;
        multiplication(n);
    }
} */
       // PRINT PATTERN USING RECURSION
public class pattern {
    public static void main(String[] args) {
        printPattern(5);
    }
    static void printPattern(int n) {
        if (n > 0) {
            printPattern(n - 1);
            for (int i = 0; i < n; i++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}