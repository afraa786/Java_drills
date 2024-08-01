import java.util.Scanner;
public class nestedTryandCatch {
    public static void main(String[] args) {
        int [] arr = new int[3]; //0,1,2
        arr[0] = 109;
        arr [1] = 112;
        arr [2] = 102;
        System.out.println("Enter array index:");
        Scanner sc = new Scanner(System.in);
        int ind = sc.nextInt();
        try {
            System.out.println("The value at array index is" + arr[ind]);
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println(e);
            e.printStackTrace();
        }
        System.out.println("The program ha ended");
    }
}
