package fr.arolla.formation.tdd.kata.leapyear;

/**
 * Created by Dan on 21/12/2015.
 */
public class YYear {

    private final int year;

    public YYear(final int year) {
        this.year = year;
    }

    public boolean isLeapYear() {
        if (isDivisibleBy(4) &&
                (!isDivisibleBy(100) || isDivisibleBy(400)))
            return true;
        return false;
    }

    private boolean isDivisibleBy(int divisor) {
        return year % divisor == 0;
    }
}
