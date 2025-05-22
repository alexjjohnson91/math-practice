package com.alexjohnson.Strategy;

public interface MathOperationStrategy {
    String createQuestion(int[] numbers);
    boolean checkAnswer(int[] numbers, int userAnswer);
}
