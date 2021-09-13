package Javawork2;

public class question9 {


    public static String extractAllEvenNumbers(int[] numbers) {
        String evenSteven = " ";
        for(int e = 0; e < numbers.length; e++){
            if (numbers[e] % 2 == 0){
                evenSteven += numbers[e] +  " ";

            }
        }
        return evenSteven;
    }






    public static void main(String[] args) {
        int[] sumNumbas = {80,23,43,44,77,90};
        System.out.println(extractAllEvenNumbers(sumNumbas));


    }

}
