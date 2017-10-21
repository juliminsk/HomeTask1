package com.company.taskThree;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Rhombus {
    public void run() {
        int sideSize = this.input();
        this.rhombusDrawing(sideSize);
    }

    private int input() {
        System.out.println("Enter rhombus' side size");
        int sideSize;
        while (true) {
            try {
                Scanner scanner = new Scanner(System.in);
                sideSize = scanner.nextInt();
                if (sideSize <=1){
                    System.out.println("!Please, enter number greatrer than 1");
                    continue;
                }
                return sideSize;
            } catch (InputMismatchException e) {
                System.out.println("!Please, enter valid number!");
            }
        }
    }

    private void rhombusDrawing (int sideSize) {
        int x;
        int y;
        for (int i=1; i <=(2*sideSize-1); i++){
            System.out.println();
            if (i<=sideSize){
                x = sideSize-(i-1);
                y = sideSize+(i-1);
            } else {
                x = i-(sideSize-1);
                y = (sideSize*2 -1)-(i-sideSize);
            }
            for (int j=1; j<=(2*sideSize-1); j++){
                if (j==x || j==y){
                    System.out.print('*');
                } else {
                    System.out.print(' ');
                }
            }
        }
    }
}
