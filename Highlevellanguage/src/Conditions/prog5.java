package Conditions;

import java.util.Scanner;
public class prog5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the amount: ");
        int amount = scanner.nextInt();
        scanner.close();

        countNotes(amount);
    }

    public static void countNotes(int amount) {
        int note2000 = 0, note500 = 0, note200 = 0, note100 = 0, note50 = 0, note20 = 0, note10 = 0, note5 = 0, note2 = 0, note1 = 0;

        if (amount >= 2000) {
            note2000 = amount / 2000;
            amount %= 2000;
        } else if (amount >= 500) {
            note500 = amount / 500;
            amount %= 500;
        } else if (amount >= 200) {
            note200 = amount / 200;
            amount %= 200;
        } else if (amount >= 100) {
            note100 = amount / 100;
            amount %= 100;
        } else if (amount >= 50) {
            note50 = amount / 50;
            amount %= 50;
        } else if (amount >= 20) {
            note20 = amount / 20;
            amount %= 20;
        } else if (amount >= 10) {
            note10 = amount / 10;
            amount %= 10;
        } else if (amount >= 5) {
            note5 = amount / 5;
            amount %= 5;
        } else if (amount >= 2) {
            note2 = amount / 2;
            amount %= 2;
        } else if (amount >= 1) {
            note1 = amount / 1;
            amount %= 1;
        }

        printNoteCounts(note2000, note500, note200, note100, note50, note20, note10, note5, note2, note1);
    }

    public static void printNoteCounts(int note2000, int note500, int note200, int note100, int note50, int note20, int note10, int note5, int note2, int note1) {
        System.out.println("Note Counts:");
        System.out.println("2000: " + note2000);
        System.out.println("500: " + note500);
        System.out.println("200: " + note200);
        System.out.println("100: " + note100);
        System.out.println("50: " + note50);
        System.out.println("20: " + note20);
        System.out.println("10: " + note10);
        System.out.println("5: " + note5);
        System.out.println("2: " + note2);
        System.out.println("1: " + note1);
    }
}
