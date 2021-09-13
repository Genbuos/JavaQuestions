package Javawork2;

public class question2 {

    public static int getSecondToLastIndex(String[] names) {
        int secondToLast = names.length -2;
        return secondToLast;
    }

    public static void main(String[] args){
        String[] names = {"boris", "cece", "jade"};
        System.out.println(getSecondToLastIndex(names));


    }
}
