package monetaryunits;

import java.util.Scanner;

public class MonetaryUnits {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println(" Enter amount of dollar and cents");
        double amount = input.nextDouble();
        int cents = (int) Math.round(amount * 100);
        int dollar = cents / 100;
        cents %= 100;
        int quarter = cents / 25;
        cents %= 25;
        int dimes = cents / 10;
        cents %= 10;
        int nickels = cents / 5;
        cents %= 5;
        int pennis = cents;
        System.out.println("The amount of dollar is " + dollar);
        System.out.println("The amount of quarter is " + quarter);
        System.out.println("The amount of dimes is " + dimes);
        System.out.println("The amount of nickels is " + nickels);
        System.out.println("The amount of pennis is " + pennis);
    }

}
