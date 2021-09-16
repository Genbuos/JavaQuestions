package Javawork2;

public class question12 {
    public static void printOddNumbersInRange(int start, int end){
        String odd= " ";

        for (int i = start; i <= end; i+=2){

            odd += i + "\n";

            System.out.println(odd);
        }

    }



    public static void main(String[] args) {
        printOddNumbersInRange(1,30);

    }
}
