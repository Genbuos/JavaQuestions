package Javawork2;

public class question14 {
    public static String repeatFirstThreeLetters(String str, int n) {
        String subsetstr = str.substring(0,3);
        return subsetstr.repeat(n);

    }

    public static void main(String[] args) {
        System.out.println(repeatFirstThreeLetters("Jimii", 3));

    }

}
