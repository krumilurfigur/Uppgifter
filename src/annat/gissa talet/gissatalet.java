/*
a program that let's you guess a number
2019-10-17
Gabriel Öberg
 */

import java.util.Scanner;
import java.util.Random;

public class gissatalet {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);

        int r = getRandomNumberInRange(1, 100);
        int n = 0;
        int i = 0;

        while (n != r) {

            if (n = 0) {
                System.out.println("guess a number between 1 and 100");
            }

            if (n < r && n != 0) {
                System.out.println("Too low, guess again!");
                i++;
            }

            if (n > r) {
                System.out.println("Too high, guess again!");
                i++;
            }

            int n = kb.nextInt;
        }
        i++;
        System.out.println("You guessed correct in i tries!");

    }
}