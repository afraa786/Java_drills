import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
//       GREATER NUMBER CODE
//        int a,b,c;
//        System.out.println("enter the value of a");
//        Scanner fareed = new Scanner(System.in);
//        a = fareed.nextInt();
//        System.out.println("enter value of b");
//        b = fareed.nextInt();
//        System.out.println("enter value for c");
//        c = fareed.nextInt();
//        int greatest;
//        if
//        (a > b && a > c) {
//        greatest = a; }
//        else if (b > c && b > a)  {
//        greatest = b; }
//        else {
//            greatest = c;
//        }
//        System.out.println("The greatest number is " + greatest );
        // PERCENTAGE CALCULATOR
//        float physics, maths, chemistry;
//        Scanner fareed= new Scanner(System.in);
//        System.out.println("enter marks for Physics:");
//        physics = fareed.nextInt();
//        System.out.println("enter marks for chemistry:");
//        chemistry = fareed.nextInt();
//        System.out.println("enter marks for maths:");
//        maths = fareed.nextInt();
//        float average = (maths+ chemistry + physics)/3f;
//        if (average>=40 && maths>=33 && chemistry >= 33 && physics >=33)
//        {
//            System.out.println("CONGRATS! you are passed"); }
//            else {
//            System.out.println("SORRY, you failed");
//        }
        // TAX calculation as per income
        Scanner fareed= new Scanner(System.in);
        System.out.println("enter you income per annum in lakhs: ");
        float tax = 0;
        float income = fareed.nextFloat();
        if (income < 2.5) {
            tax = tax + 0;
        }
        else if (income>2.5 && income<=5) {
        tax = tax = 0.05f * (income - 2.5f); }
        else if (income > 5f && income <=10f)
        {
            tax = tax = 0.05f * (income - 5f);
            tax = tax + 0.2f * (5f- 2.5f);
        }
       else if (income>10f)
           tax = tax + 0.05f * (5.0f - 2.5f);
           tax = tax + 0.2f * (10f - 5f);
           tax = tax + 0.3f * (income - 10f);
        System.out.println("THE TOTAL TAX PAID BY THE EMPLOYEE IS:" + tax );
    }
}
