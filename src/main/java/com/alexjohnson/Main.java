package com.alexjohnson;

import com.alexjohnson.Strategy.AdditionStrategy;
import com.alexjohnson.Strategy.StrategyMathPractice;

public class Main {
    public static void main(String[] args) {

        AdditionStrategy additionStrategy = new AdditionStrategy();
        StrategyMathPractice strategyMathPractice = new StrategyMathPractice(additionStrategy);
        strategyMathPractice.runExercise();

        // TODO: Refactor to use Template Method pattern
//        MathPractice additionPractice = new AdditionPractice();
//        additionPractice.runExercise();
    }
}
