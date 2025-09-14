package LW_01;

import java.util.*;
public class Q_01 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String word;
        char middle;
        System.out.println("Enter a word of odd length.");
        word=scanner.next();
        if(word.length()%2==0){
            System.out.println("This is not an odd length word.");
        }
        else{
            middle=word.charAt(word.length()/2);
            System.out.println("Middle Character: "+middle);
        }
    }
}
