package fr.arolla.formation.tdd.kata.fizzbuzz;

/**
 * Created by Dan on 21/12/2015.
 */
public class FizzBuzz {
    public static final String FIZZBUZZ = "fizzbuzz";
    public static final String FIZZ = "fizz";
    public static final String BUZZ = "buzz";

    private final int expr;

    private FizzBuzz(final int expr) {
        this.expr = expr;
    }

    public static FizzBuzz newFizzBuzz(final int expr) {
        if (expr <= 0) {
            throw new
                    IllegalArgumentException("Only positive value allowed");
        }
        return new FizzBuzz(expr);
    }

    public String evaluate() {


        if (isDivisibleBy(15))
            return FIZZBUZZ;
        if (isDivisibleBy(3))
            return FIZZ;
        if (isDivisibleBy(5))
            return BUZZ;

        return Integer.toString(expr);
    }

    private boolean isDivisibleBy(int divisor) {
        return expr % divisor == 0;
    }
}
