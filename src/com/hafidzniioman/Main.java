package com.hafidzniioman;

public class Main {

    public static void main(String[] args) {
        // write your code here
        System.out.println("10.000 at 2% interest = " + calculateInterest(10000, 2));
        System.out.println("10.000 at 3% interest = " + calculateInterest(10000, 3));
        System.out.println("10.000 at 4% interest = " + calculateInterest(10000, 4));
        System.out.println("10.000 at 5% interest = " + calculateInterest(10000, 5));

        for (int i = 2; i < 9; i++) {
            System.out.println("10.000 at " + i + "% interest = " + String.format("%2f", calculateInterest(10000, i)));
        }
        System.out.println("*****************************");

        for (int i = 9; i > 2; i--) {
            System.out.println("10.000 at " + i + "% interest = " + String.format("%2f", calculateInterest(10000, i)));
        }

        System.out.println("******************************");

        /*create a for statement using any range of numbers
         * determine if the number is a prime number using the isPrime method
         * if it is a prime number, print it out AND increment a count of the
         * number of prime number found
         * if that count is 3 exit the for loop
         * hint: Use the break; statement to exit*/

        int count = 0;
        for (int i = 10; i < 50; i++) {
            if (isPrime(i)) {
                count++;
                System.out.println("Number " + i + " is a prime number");
                if (count == 3) {
                    System.out.println("Exiting for loop");
                    break;
                }
            }
        }
    }

    public static boolean isPrime(int n) {
        if (n == 1) {
            return false;
        }
        for (int i = 2; i <= n / 2; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static double calculateInterest(double amount, double interestRate) {
        return (amount * (interestRate / 100));
    }

}
