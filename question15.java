package Javawork2;

public class question15 {
    public static int WordsInAStringCounter(String str){
        int wordcount = 0;
        boolean aWord = false;
        int endOfstring = str.length() -1;
        for (int i =0; i <str.length(); i++){
            if (Character.isLetter(str.charAt(i)) && i != endOfstring){
                aWord =true;


            }else if (!Character.isLetter(str.charAt(i)) && aWord){
                wordcount++;
                aWord=false;

            }else if (Character.isLetter(str.charAt(i)) && i == endOfstring){
                wordcount++;
            }
        }





        return wordcount;
    }

    public static void main(String[] args) {
        System.out.println(WordsInAStringCounter("hello  joe man"));

    }
}
