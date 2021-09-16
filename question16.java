package Javawork2;
import java.util.Scanner;

public class question16 {
    public static int VowelsCounter(String str){
        int count = 0;

        for (int i=0 ; i<str.length(); i++){
            char ch = str.charAt(i);
            if(ch == 'a'|| ch == 'e'|| ch == 'i' ||ch == 'o' ||ch == 'u'||ch == 'y'){
                count ++;
            }
        }

        return count;
    }

    public static void main(String[] args) {
        System.out.println(VowelsCounter("busy bodY"));

    }

}
