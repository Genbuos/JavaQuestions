package lastquestions;

public class Question17 {

    public static String[] swap(String[] array){
        String firstEle = array[0];
        String lastEle = array[array.length -1];
        array[0] = lastEle;
        array[array.length - 1 ] = firstEle;
        String[] reversed = array;

        return reversed;
    }




    public static void main(String[] args) {
        String[] names = {"jaida", "jaiden", "sonja"};

        System.out.println(swap(names));

    }

}
