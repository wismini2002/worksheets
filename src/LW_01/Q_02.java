package LW_01;

import java.util.*;
public class Q_02 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String fullName;
        System.out.println("Enter your full name in the format, First Middle Last");
        fullName=scanner.nextLine();
        String[] names=fullName.split(" ");
        System.out.println("Your Name: "+names[2]+", "+names[0]+" "+names[1].charAt(0));




    }


}
