package Javawork2;

import java.util.Arrays;

public class question6 {
    public static int getSum(int[] ints) {
        int sum = Arrays.stream(ints).sum();

        return sum;

    }

    public static void main(String[] args) {
        int[] webdevSalaries = {40,45,65,20};
        System.out.println(getSum(webdevSalaries));

        //got this one first try


    }
}
