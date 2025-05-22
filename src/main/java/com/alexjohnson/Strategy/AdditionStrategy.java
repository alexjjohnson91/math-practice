package com.alexjohnson.Strategy;

public class AdditionStrategy implements MathOperationStrategy {
    public String createQuestion(int[] numbers) {
        return "What is " + numbers[0] + " + " + numbers[1] + "?";
    }

    public boolean checkAnswer(int[] numbers, int userAnswer) {
        return userAnswer == (numbers[0] + numbers[1]);
    }
}
