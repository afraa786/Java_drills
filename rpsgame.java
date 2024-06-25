import java.util.Random;
import java.util.Scanner;
public class rpsgame {
    public static void main(String[] args) {
        int rock = 0;
        int paper = 1;
        int scissor = 2;
        Scanner fareed = new Scanner(System.in);
        System.out.println("enter 0 for ROCK\n enter 1 for paper\n enter 2 for scissor\n ");
        Scanner scan = new Scanner(System.in);
        int fareedplays = scan.nextInt();
        Random rc = new Random();
        int computerplays = rc.nextInt(3);
        if (computerplays==fareedplays){
            System.out.println("Draw! Play again");
        }
        else if (computerplays==0 && fareedplays==1 || computerplays==2 && fareedplays==0 || computerplays==1 && fareedplays==2) {
            System.out.println("YOU WIN");
        }
        else {
            System.out.println("you lose, try again");
        }
        System.out.println("The computer choosed: " + computerplays);
        if (computerplays==0) {
            System.out.println("The computer choosed rock");
        }
        else if (computerplays==1){
            System.out.println("The computer choosed paper");
        }
        else {
            System.out.println("The computer choosed scissor");
        }
    }
}