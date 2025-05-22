package com.alexjohnson.utils;

import java.util.Scanner;

public class MathUtils {
    public static int[] generateNumbers() {
        // Generate two random numbers between 1 and 10
        int num1 = (int) (Math.random() * 100) + 1;
        int num2 = (int) (Math.random() * 100) + 1;
        return new int[]{num1, num2};
    }

    public static void displayQuestion(String question) {
        System.out.println(question);
    }

    public static int getUserAnswer() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Your answer: ");
        return scanner.nextInt();
    }

    public static void giveFeedback(boolean correct) {
        System.out.println(correct ? "Correct!" : "Try again.");
    }
}
