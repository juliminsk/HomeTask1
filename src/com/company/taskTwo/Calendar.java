package com.company.taskTwo;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Calendar {

    public void run() {
        int weekdayNumber = this.input();
        System.out.println();
        this.processNumber(weekdayNumber);
    }
    private int input() {
        System.out.println("Enter weekday number");
        int weekDayNumber;
        while (true) {
            try {
                Scanner scanner = new Scanner(System.in);
                return scanner.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("!Please, enter valid number!");
            }
        }
    }

    private void processNumber(int weekdayNumber) {
        switch (weekdayNumber) {
            case 1: System.out.println("Monday");
            break;
            case 2: System.out.println("Tuesday");
            break;
            case 3: System.out.println("Wednesday");
            break;
            case 4: System.out.println("Thursday");
            break;
            case 5: System.out.println("Friday");
            break;
            case 6: System.out.println("Saturday");
            break;
            case 7: System.out.println("Sunday");
            break;
            default: System.out.println("For now we have only seven days in a week, please try again");
            break;
        }
    }
}
