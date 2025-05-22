package com.alexjohnson.Strategy;

import static com.alexjohnson.utils.MathUtils.displayQuestion;
import static com.alexjohnson.utils.MathUtils.generateNumbers;
import static com.alexjohnson.utils.MathUtils.getUserAnswer;
import static com.alexjohnson.utils.MathUtils.giveFeedback;


public class StrategyMathPractice {
    private final MathOperationStrategy strategy;

    public StrategyMathPractice(MathOperationStrategy strategy) {
        this.strategy = strategy;
    }

    public void runExercise() {
        int[] numbers = generateNumbers();
        String question = strategy.createQuestion(numbers);
        displayQuestion(question);

        int userAnswer = getUserAnswer();
        boolean correct = strategy.checkAnswer(numbers, userAnswer);
        giveFeedback(correct);
    }
}
