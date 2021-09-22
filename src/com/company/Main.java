
package com.company;
import java.util.Scanner;

public class Main {
    static boolean isDoubloon = true;

    public static void isDoubloon (String text) {
        String textDublicate = text.toLowerCase();
        for (int i = 0; i <= text.length() - 1; i++) {
            int counter = 0;
            for (int x = 0; x <= text.length() - 1; x++) {
                if (text.toLowerCase().charAt(i) == textDublicate.toLowerCase().charAt(x)) {
                    counter++;
                }
                if (counter == 3) {
                    System.out.println("The word is not a doubloon!");
                    return;
                }
            }
            if (counter <= 1) {
                System.out.println("The word is not a doubloon!");
                return;
            }
        }
        if (isDoubloon){

        System.out.println("Yaaaay! The word is a doubloon!");
        }
    }

    public static void main(String[] args) {
        String[] tal = new String[10];
        tal [0] = "0";
        tal [1] = "1";
        tal [2] = "2";
        tal [3] = "3";
        tal [4] = "4";
        tal [5] = "5";
        tal [6] = "6";
        tal [7] = "7";
        tal [8] = "8";
        tal [9] = "9";

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a word to see if it's a doubloon: ");
        String text = scanner.next();

        for (int i = 0; i < tal.length; i++) {
            if (text.contains(tal[i])) {
                isDoubloon = false;
                break;
            }
        }
        if (isDoubloon = false){
            System.out.println("Is not a doubloon");
        }

/*
        for (int i = 0; i < text.length(); i++) {
            char letter = text.charAt(i);
            for (int j = 0; j < tal.length; j++) {
                if (letter == tal[j]){
                    break;
                }
            }
            if (i == Integer.parseInt(tal[i])){
                break;
            }
        }

 */
        isDoubloon(text);
    }
}