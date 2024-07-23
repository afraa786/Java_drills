import java.util.Scanner;
public class Exeptions {
    public static void main(String[] args) {
        int [] arr = new int[3]; //0,1,2
        arr[0] = 109;
        arr [1] = 112;
        arr [2] = 102;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter array index:");
        int i = sc.nextInt();
        System.out.println("Enter the number to divide the array value:");
        int number = sc.nextInt();
        try {
            System.out.println("The value at the index is:" + arr[i]);
            System.out.println("The value after dividing is:" +arr[i]/number);
        }
        catch(ArrayIndexOutOfBoundsException e) {
            System.out.println("404, Error");
            System.out.println(e);
        }
    }
}
