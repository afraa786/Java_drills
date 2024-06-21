import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int MYNUMBER = (int) (Math.random() * 100);

        do {
            System.out.println("Guess my number:");
            int username = sc.nextInt();

            if (username == MYNUMBER) {
                System.out.println("Correct number!");
                break;
            } else if (username > MYNUMBER) {
                System.out.println("Number is greater.");
            } else {
                System.out.println("Number is smaller.");
            }

        } while (true);

        System.out.println("My number was: " + MYNUMBER);
        sc.close();
    }
}
