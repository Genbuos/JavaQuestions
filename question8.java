package Javawork2;

public class question8 {

    public static String extractAllOddNumbers(int[] numbers) {
        String daOdds = " ";
        for (int i = 0; i< numbers.length; i++){
            if (numbers[i] % 2 != 0) {
                daOdds += numbers[i] + " ";
            }
        }
        return daOdds;
    }

    public static void main(String[] args) {
        int[] someNumbers = {19,25,22,900,99,787,70};

        System.out.println(extractAllOddNumbers(someNumbers));




    }
}
