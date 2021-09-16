package Javawork2;

public class question10 {
    public static boolean contains(String[] names, String element) {
        for (String array : names){
            if(array.equals(element)){
                return true;

            }
        }
        return false;
    }

    public static void main(String[] args) {
        String[] idk ={"60", "lolol", "peace", "88"};
        System.out.println(contains(idk,"60"));

    }

}
