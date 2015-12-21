package fr.arolla.formation.tdd.kata.fizzbuzz.leapyear;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * Created by Dan on 21/12/2015.
 */
public class LeapYearTest {

    @Test
    public void should_detect_a_typical_common_year() {
        YYear year = new YYear(2013);
        boolean isLeap = year.isLeapYear();

        assertThat(isLeap).isFalse();
    }

    @Test
    public void should_detect_a_typical_leap_year() {
        YYear year = new YYear(2016);
        boolean isLeap = year.isLeapYear();

        assertThat(isLeap).isTrue();
    }

    @Test
    public void should_detect_an_atypical_common_year() {
        YYear year = new YYear(2200);
        boolean isLeap = year.isLeapYear();

        assertThat(isLeap).isFalse();
    }

    @Test
    public void should_detect_an_atypical_leap_year() {
        YYear year = new YYear(800);
        boolean isLeap = year.isLeapYear();

        assertThat(isLeap).isTrue();
    }
}
