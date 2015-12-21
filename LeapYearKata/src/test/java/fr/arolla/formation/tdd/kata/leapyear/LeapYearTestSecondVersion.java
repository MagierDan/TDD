package fr.arolla.formation.tdd.kata.leapyear;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * Created by Dan on 21/12/2015.
 */
public class LeapYearTestSecondVersion {

    private boolean isLeap(int yearValue) {
        YYear year = new YYear(yearValue);
        return year.isLeapYear();
    }

    @Test
    public void should_detect_a_typical_common_year() {
        boolean isLeap = isLeap(2013);
        assertThat(isLeap).isFalse();
    }


    @Test
    public void should_detect_a_typical_leap_year() {
        boolean isLeap = isLeap(2016);
        assertThat(isLeap).isTrue();
    }

    @Test
    public void should_detect_an_atypical_common_year() {
        boolean isLeap = isLeap(2200);
        assertThat(isLeap).isFalse();
    }

    @Test
    public void should_detect_an_atypical_leap_year() {
        boolean isLeap = isLeap(800);
        assertThat(isLeap).isTrue();
    }
}
