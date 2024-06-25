import java.util.Scanner;
public class guess {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int MYNUMBER = (int) (Math.random() * 100);
        System.out.println(MYNUMBER);

        do {
            System.out.println("Guess my number:");
            int username = sc.nextInt();

            if (username == MYNUMBER) {
                System.out.println("Correct number!");
                break;
            } else if (username > MYNUMBER) {
                System.out.println("Number is smaller.");
            } else {
                System.out.println("Number is greater.");
            }

        } while (true);

        System.out.println("My number was: " + MYNUMBER);
        sc.close();
    }
}
