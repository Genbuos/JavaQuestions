package Javawork2;

public class question11 {

    public static int getIndexByElement(String[] names, String element) {
        int getIndex = 0;

        for (int a = 0; a < names.length; a++){
            if (names[a].equals(element)) {
               getIndex = a;
            }
        }

        return getIndex;
    }

    




    public static void main(String[] args) {
        String[] names = {"shannon", "daya", "caleb", "diego"};
        System.out.println(getIndexByElement(names, "shannon"));


    }
}
