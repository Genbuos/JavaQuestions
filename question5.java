package Javawork2;

public class question5 {
    public static String getSecondToLastElement(String[] names) {
        String daSecondBfoLast = names[1];
        return daSecondBfoLast;
    }


    public static void main(String[] args) {
        String[] mentors = {"Ivan Henderson", "Dolio L Durant", "Vinte Clemons"};
        System.out.println(getSecondToLastElement(mentors ));


    }
}
