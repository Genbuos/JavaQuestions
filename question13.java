package Javawork2;

public class question13 {
    public static String printGivenStringTimesNumberGiven(String str, int n) {
    String Str = str;

       return  Str.repeat(n);
    }

    public static void main(String[] args) {
        System.out.println(printGivenStringTimesNumberGiven("Jordan" + "\n", 5));
    }
}
