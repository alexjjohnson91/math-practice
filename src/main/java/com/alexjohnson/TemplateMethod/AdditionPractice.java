package com.alexjohnson.TemplateMethod;

public class AdditionPractice extends TemplateMathPractice {

    @Override
    protected String createQuestion(int[] numbers) {
        return "What is " + numbers[0] + " + " + numbers[1] + "?";
    }

    @Override
    protected boolean checkAnswer(int[] numbers, int userAnswer) {
        return userAnswer == (numbers[0] + numbers[1]);
    }
}
