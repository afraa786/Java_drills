import java.util.Scanner;
//PATTERN
public class Main {
    public static void main(String[] args) {
        /*  int n = 8;
        for (int i=0; i<n; i++) {
            for (int j = 0; j<i; j++) {
        System.out.print("*"); }
            System.out.println();
        }
        int n = 600;
       for(int/ i=1; i<=10; i++) {
       System.out.printf("%d X %d = %d\n", n, i, n*i);
         }
        int n = 5;
        int factorial = 1;
        for (int i = 1; i <= n; i++) {
            factorial = factorial * i; //values store hori hai
        }
        System.out.printf("factorial of %d is %d", n, factorial);
        */
        //ARRAYS
        //sum of the arrays
//        float [] percentage = {74.75f, 76.73f, 67.30f};
//        float sum = 0;
//        for (float element:percentage) {
//            sum = sum + element;
//        }
//        System.out.println("the sum of the percentage is:" + sum);
        // to check 125.0 if the number is present in the array or not
        /* float num = 125.0f;
        float [] arr = {78.2f,56.2f,2.3f,125.0f,552.5f};
        boolean InArray = false;
        for (float element:arr){
            if (element == 126.0) {
                InArray = true;
                break;
            }
        }
         if(InArray) {
            System.out.println("the value is in the Array");
        }
         else{
             System.out.println("value is not in the Array");
         }
         */
        // 2-D MATRIX ADDITION

        int [] [] matrix1 = {{1,2,3}, {4,5,6}};
        int [] [] matrix2 = {{9,8,7}, {6,5,4}};
        int [] [] result = {{0,0,0}, {0,0,0}};
        // setting thr values
         for (int i = 0; i<matrix1.length; i++) { //number of rows
             for (int j = 0; j < matrix1[i].length; j++) {
                 System.out.printf(" setting the matrix as i = %d  and j = %d\n", i, j);
                  result[i][j] = matrix1[i][j] + matrix2[i][j];
             }
         }
         // printing the matrix
        for (int i = 0; i<matrix1.length; i++) { //number of rows
            for (int j = 0; j < matrix1[i].length; j++) { //number of columns
                System.out.print(result[i][j] + " "); // adding a space
                result[i][j] = matrix1[i][j] + matrix2[i][j];
            }
            System.out.println(" "); // adding space for outer for
        }
        // arrays code
                int number;
                String name;

                Scanner scanner = new Scanner(System.in);

                System.out.print("Enter your name: ");
                name = scanner.nextLine();

                System.out.print("Enter a number: ");
                number = scanner.nextInt();

                scanner.close();

                System.out.println("Hello, " + name + "!");
                System.out.println("You entered the number: " + number);

                if (number % 2 == 0) {
                    System.out.println(number + " is even.");
                } else {
                    System.out.println(number + " is odd.");
                }
            }

        }

    }
}
