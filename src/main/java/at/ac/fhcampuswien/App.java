package at.ac.fhcampuswien;

import java.util.Random;
import java.util.Scanner;

public class App {

    // Task 1: OneMonthCalendar
    public static void oneMonthCalendar(int days, int firstDay) {
        int weekCounter = firstDay - 1;

        for (int j = 1; j <= 3 * (firstDay - 1); j++) {
            System.out.print(" ");
        }
        for (int i = 1; i <= days; i++) {
            System.out.printf("%2d", i);
            System.out.print(" ");
            weekCounter++;
            if (weekCounter == 7) {
                System.out.println();
                weekCounter = 0;
            }
        }
        if (weekCounter != 0) System.out.println();
    }}


