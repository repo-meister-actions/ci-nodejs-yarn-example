package com.github.repomeisteractions;

public class FizzBuzz {

    public boolean isFizzNumber(int number) {
        return number % 3 == 0;
    }

    public boolean isBuzzNumber(int number) {
        return number % 5 == 0;
    }

    public String generate(int count) {
        StringBuilder builder = new StringBuilder();
        for (int i = 1; i <= count; i++) {
            if (isFizzNumber(i) && isBuzzNumber(i))
                builder.append("FizzBuzz\n");
            else if (isFizzNumber(i))
                builder.append("Fizz\n");
            else if (isBuzzNumber(i))
                builder.append("Buzz\n");
            else
                builder.append(String.format("%d\n", i));
        }
        return builder.toString();
    }

    public static void main(String[] args) {
        FizzBuzz fizzBuzz = new FizzBuzz();
        String result = fizzBuzz.generate(100);
        System.out.println(result);
    }
}
