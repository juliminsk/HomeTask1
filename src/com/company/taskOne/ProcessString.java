package com.company.taskOne;

import java.util.Scanner;

public class ProcessString {

    public void run() {
        String newLine = this.readSting();
        System.out.println();
        this.reverseString(newLine);
        System.out.println();
        this.splitString(newLine);
        System.out.println();
        this.replaceString(newLine);
        System.out.println();
        this.upperCaseString(newLine);
        System.out.println();
        this.subString(newLine, 5, 10);
    }

    private String readSting() {
        System.out.println("Enter a string:");
        Scanner scanner = new Scanner (System.in);
        return scanner.nextLine();
    }

    private void reverseString(String newLine) {
        char temp;
        char[] arr = newLine.toCharArray();
        int leng = arr.length;
        for(int i=0; i<(newLine.length())/2; i++,leng--){
            temp = arr[i];
            arr[i] = arr[leng-1];
            arr[leng-1] = temp;
        }

        System.out.println("Reversed String:");
        System.out.println(String.valueOf(arr));
    }

    private void splitString (String newLine) {
        String[] split = newLine.split(" ");
        System.out.println("String by words:");
        for (int i=0; i<split.length; i++){
            System.out.println(split[i]);
        }
    }

    private void replaceString (String newLine) {
        String replace = newLine.replace(' ','*');
        System.out.println("String with replaced spaces:");
        System.out.println(replace);
    }

    private void upperCaseString (String newLine) {
        String upper = newLine.toUpperCase();
        System.out.println("Upper case string:");
        System.out.println(upper);
    }

    private void subString (String newLine, int startIndex, int endIndex) {
        if (startIndex > endIndex) {
            System.out.println("ERROR! startIndex greater than endIndex");
            return;
        }
        if (startIndex > newLine.length() || endIndex > newLine.length()) {
            System.out.println("ERROR! String is too short");
            return;
        }
        String sub = newLine.substring(startIndex-1,endIndex);
        System.out.println("Substring:");
        System.out.println(sub);
    }
}
