package at.ac.fhcampuswien;

import java.util.Random;
import java.util.Scanner;

public class App {

    // Implement all methods as public static


    public static void oneMonthCalendar(int totaldays, int startweekday)
    {
        boolean extra = false; //Für Leerzeile falls die letzte Zahl nicht zahl%7
        for (int i = 1; i < startweekday;i++)
        {
            System.out.print("   ");
        }
        for(int i = 1; i < totaldays+1;i++)
        {
            if (i < 10)
            {
                System.out.print(" " + i + " ");
            }
            else
            {
                System.out.print(i + " ");
                extra = true; //extra leerzeile falls innerhalb von 7 liegt
            }
            if (((startweekday-1) + i)%7 == 0)
            {
                System.out.println();
                extra = false;
            }
        }
        if (extra) {
            System.out.println("");
        }
    }
    // Task 2: Pseudo Random Numbers
    public static long[] lcg(long seed) {
        long[] returnArray = new long[10];
        long m = (long) Math.pow(2, 31);
        long a = 1103515245;
        int c = 12345;
        for (int i = 0; i < 10; i++) {
            returnArray[i] = (a * (i == 0 ? seed : returnArray[i - 1]) +c ) % m;
        }
        return returnArray;

    }

    // Task 3: Guessing Game
    public static void guessingGame(int numberToGuess) {
        Scanner scanner = new Scanner(System.in);
        int input;
        for (int i = 1; i <= 10; i++) {
            System.out.printf("Guess number %s: ", i);
            input = scanner.nextInt();

            if (input == numberToGuess) {
                System.out.println("You won wisenheimer!");
                break;
            }
            if (i == 10) System.out.println("You lost! Have you ever heard of divide & conquer?");
            else
                System.out.println("The number AI picked is " + (input < numberToGuess ? "higher " : "lower ") + "than your guess.");

        }
        }
    public static int randomNumberBetweenOneAndHundred() {
        Random rnd = new Random();
        return rnd.nextInt(100) + 1;
    }


        // Task 4: Swap Arrays
        public static boolean swapArrays ( int[] array1, int[] array2){
            if (array1.length != array2.length) return false;

            for (int i = 0; i < array1.length; i++) array1[i] += array2[i];
            for (int i = 0; i < array1.length; i++) array2[i] = array1[i] - array2[i];
            for (int i = 0; i < array1.length; i++) array1[i] -= array2[i];

            return true;
        }

    // Task 5: Camel Case
    public static String camelCase(String sentence)
    {
        char[] cs = sentence.toCharArray();
        boolean big = true;
        boolean small = false;
        StringBuilder resut = new StringBuilder();
        for (int i = 0; i < cs.length; i++)
        {
            if(cs[i] == 32)
            {
                big = true;
                small = false;

            } else if(big && (cs[i] <= 90 && cs[i] >= 65 || cs[i] >= 97 && cs[i] <= 122))
            {
                if (cs[i] >= 97 && cs[i] <= 122)
                {
                    resut.append((char) (cs[i] - 32));
                }
                else
                {
                    resut.append(cs[i]);
                }
                big = false;
                small = true;
            } else if (small && (cs[i] <= 90 && cs[i] >= 65 || cs[i] >= 97 && cs[i] <= 122)) {
                if (cs[i] >= 65 && cs[i] <= 90)
                {
                    resut.append((char) (cs[i] + 32));
                }
                else
                {
                    resut.append(cs[i]);
                }
            }

        }
        return resut.toString();
    }
    //Task 6: Check Digit
    public static int checkDigit(int[] inputArray) {
        int productsSum=0;
        int checkDigit;
        for (int i = 0; i < inputArray.length; i++){
            productsSum += inputArray[i] * (i+2);
        }
        checkDigit = 11 - (productsSum % 11);
        if(checkDigit == 10) return 0;
        else if (checkDigit == 11) return 5;
        return checkDigit;
    }

    }



