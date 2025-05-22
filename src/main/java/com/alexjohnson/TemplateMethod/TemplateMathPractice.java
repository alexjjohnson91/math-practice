package com.alexjohnson.TemplateMethod;

import static com.alexjohnson.utils.MathUtils.displayQuestion;
import static com.alexjohnson.utils.MathUtils.generateNumbers;
import static com.alexjohnson.utils.MathUtils.getUserAnswer;
import static com.alexjohnson.utils.MathUtils.giveFeedback;

public abstract class TemplateMathPractice {
    public final void runExercise() {
        int[] numbers = generateNumbers();
        String question = createQuestion(numbers);
        displayQuestion(question);
        int userAnswer = getUserAnswer();
        boolean correct = checkAnswer(numbers, userAnswer);
        giveFeedback(correct);
    }

    protected abstract String createQuestion(int[] numbers);
    protected abstract boolean checkAnswer(int[] numbers, int userAnswer);
}
