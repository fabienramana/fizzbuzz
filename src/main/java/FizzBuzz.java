public class FizzBuzz {
    public String convert(int input) {

        if (isDivisibleByFive(input) && isDivisibleByThree(input))
            return "FIZZBUZZ";

        if (isDivisibleByThree(input))
            return "FIZZ";

        if (isDivisibleByFive(input))
            return "BUZZ";

        return "" + input;
    }

    private boolean isDivisibleByThree(int input) {
        return input % 3 == 0;
    }

    private boolean isDivisibleByFive(int input) {
        return input % 5 == 0;
    }
}
