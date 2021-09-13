package Javawork2;
public class question1 {
    //create a method
    //AccessModifier |returnType |name
    public static int getLastIndex(String[] names) {

        int lastindex = names.length-1;



        return lastindex;


    }





    //main is below
    public static void main(String[] args) {

        String[] names = {"Jordan", "Daya", "Shafi"};

        System.out.println(getLastIndex(names));




    }

}

