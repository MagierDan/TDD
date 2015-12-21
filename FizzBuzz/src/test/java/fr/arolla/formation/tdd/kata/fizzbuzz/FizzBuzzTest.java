package fr.arolla.formation.tdd.kata.fizzbuzz;

import com.sun.jdi.InvalidLineNumberException;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * Created by Dan on 21/12/2015.
 */
public class FizzBuzzTest {

    @Rule
    public ExpectedException expectedException =
            ExpectedException.none();

    @Test
    public void should_return_invalid_number_exception() {
        expectedException.expect(IllegalArgumentException.class);
        expectedException.expectMessage("positive");

        FizzBuzz fizzBuzz = FizzBuzz.newFizzBuzz(0);

        String eval = fizzBuzz.evaluate();
    }

    @Test(expected = IllegalArgumentException.class)
    public void should_return_invalid_number_exception2() {

        FizzBuzz fizzBuzz = FizzBuzz.newFizzBuzz(0);

        String eval = fizzBuzz.evaluate();
    }

    @Test
    public void should_return_1() {
        FizzBuzz fizzBuzz = FizzBuzz.newFizzBuzz(1);

        String eval = fizzBuzz.evaluate();

        assertThat(eval).isEqualTo("1");
    }

    @Test
    public void should_return_fizz_with_a_multiple_of_3() {
        FizzBuzz fizzBuzz = FizzBuzz.newFizzBuzz(3);

        String eval = fizzBuzz.evaluate();

        assertThat(eval).isEqualTo("fizz");
    }


    @Test
    public void should_return_buzz_with_a_multiple_of_5() {
        FizzBuzz fizzBuzz = FizzBuzz.newFizzBuzz(5);

        String eval = fizzBuzz.evaluate();

        assertThat(eval).isEqualTo("buzz");
    }

    @Test
    public void should_return_fizzbuzz() {
        FizzBuzz fizzBuzz = FizzBuzz.newFizzBuzz(15);

        String eval = fizzBuzz.evaluate();

        assertThat(eval).isEqualTo("fizzbuzz");
    }
}
