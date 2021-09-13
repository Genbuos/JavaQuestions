package Javawork2;

import java.util.Arrays;
import java.util.OptionalDouble;

public class question7 {
    public static OptionalDouble getAverage(int[] ints) {
        OptionalDouble daAverage = Arrays.stream(ints).average();
        return daAverage;

    }

    public static void main(String[] args) {
        int[] someNumbers = {43,23,42,99};
        System.out.println(getAverage(someNumbers));

    }
}
