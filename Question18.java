package lastquestions;

public class Question18 {
    /**
     * Given the following legend
     *
     * f   >>   7
     * s   >>   $
     * 1   >>   !
     * a   >>   @
     *
     * your method should replace any character represented by a key in the legend, with its corresponding value.
     * Input  = "The Farmer went to the store to get 1 dollar's worth of fertilizer"
     * Output = "The 7@rmer went to the $tore to get ! doll@r'$ worth of 7ertilizer"
     *
     * output = The 7@rmer went to the $tore to get ! doll@r'$ worth o7 7ertilizer
     */

    public static String replaceCharacters(String str) {
        String replacing = str.replace("f", "7")
                .replace("F", "7")
                .replace("s","$")
                .replace("1","!")
                .replace("a","@");

        return replacing;
    }


    public static void main(String[] args) {
        String sentence = "Forever 1 am awesome";
        System.out.println(replaceCharacters(sentence));

    }
}
