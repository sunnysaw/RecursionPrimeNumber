/*
Question : Write a program to check whether the given number is prime of not by using recursion.
 */
import java.util.Scanner;
public class Main {
    static int multiple = 2;
        static boolean CheckingPrimeNumber(int number){
            if (multiple == number / 2 + 1)return true;
            if (number % multiple == 0)return false;
            multiple++;
            return CheckingPrimeNumber(number);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number;
        System.out.println("Enter the number :");
        number = sc.nextInt();
        System.out.println("Printing the result without using recursion:");
        if (number == 2){
            System.out.println("Prime number");
        } else if (number == 3) {
            System.out.println("Prime number");
        }else
        if (number % 2 == 0 || number % 3 == 0){
            System.out.println("not prime");
        }else
            System.out.println("prime");
        System.out.println();
        System.out.println("Printing the result by using recursion :");
        if (CheckingPrimeNumber(number))
            System.out.println("Number is prime :");
        else System.out.println("Number is not a prime number :");
    }
}