import org.assertj.core.api.Assertions;
import org.junit.Assert;
import org.junit.Test;

public class FizzBuzzTest {

    @Test
    public void should_return_fizzbuzz_if_divisible_by_3_and5(){

        // GIVEN - ARRANGE (A)
        FizzBuzz fizz = new FizzBuzz();
        int input = 15;

        // WHEN - ACT (A)
        String result = fizz.convert(input);

        // THEN - ASSERT (A) 
        String expected = "FIZZBUZZ";
        Assertions.assertThat(result).isEqualTo(expected);
        //Assert.assertEquals(expected, result);
    }

    @Test
    public void should_return_fizz_if_divisible_by_3(){

        // GIVEN - ARRANGE (A)
        FizzBuzz fizz = new FizzBuzz();
        int input = 3;

        // WHEN - ACT (A)
        String result = fizz.convert(input);

        // THEN - ASSERT (A)
        String expected = "FIZZ";
        Assertions.assertThat(result).isEqualTo(expected);
        //Assert.assertEquals(expected, result);
    }

    @Test
    public void should_return_buzz_if_divisible_by_5(){

        // GIVEN - ARRANGE (A)
        FizzBuzz fizz = new FizzBuzz();
        int input = 5;

        // WHEN - ACT (A)
        String result = fizz.convert(input);

        // THEN - ASSERT (A)
        String expected = "BUZZ";
        Assertions.assertThat(result).isEqualTo(expected);
        //Assert.assertEquals(expected, result);
    }

    @Test
    public void should_return_input_if_not_divisible_by_3_or_5(){

        // GIVEN - ARRANGE (A)
        FizzBuzz fizz = new FizzBuzz();
        int input = 7;

        // WHEN - ACT (A)
        String result = fizz.convert(input);

        // THEN - ASSERT (A)
        String expected = "7";
        Assertions.assertThat(result).isEqualTo(expected);
        //Assert.assertEquals(expected, result);
    }
}
