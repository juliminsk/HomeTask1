package com.company;

import com.company.taskFour.Maraphon;
import com.company.taskOne.ProcessString;
import com.company.taskThree.Rhombus;
import com.company.taskTwo.Calendar;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        switch (input()) {
            case 1: {
                ProcessString stringprocessor = new ProcessString();
                stringprocessor.run();
                break;
            }
            case 2: {
                Calendar calendarprocessor = new Calendar();
                calendarprocessor.run();
                break;
            }
            case 3: {
                Rhombus rhombusdrawing = new Rhombus();
                rhombusdrawing.run();
                break;
            }
            case 4: {
                Maraphon maraphon = new Maraphon();
                maraphon.run();
                break;
            }
            default: {
                System.out.println("Oops, something went wrong");
            }
        }
    }


    private static int input() {
        int taskNumber;
        while (true) {
            try {
                System.out.println("Enter task number");
                Scanner scanner = new Scanner(System.in);
                taskNumber = scanner.nextInt();
                if (taskNumber >=1 && taskNumber <=4){
                    return taskNumber;
                } else if (taskNumber == 5) {
                    System.out.println("Sorry, I've done only 4 tasks");
                } else {
                    System.out.println("Please, enter valid number");
                }
            } catch (InputMismatchException e){
                System.out.println("!Please, enter valid number!");
            }
            }

        }
    }
