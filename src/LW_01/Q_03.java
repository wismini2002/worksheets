package LW_01;

import java.util.*;
public class Q_03 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        float cm;
        int feet,inches;
        System.out.println("Enter the length in centimetres:");
        cm=scanner.nextFloat();
        feet=(int)Math.floor((cm/2.54)/12);
        inches=(int)Math.floor((cm/2.54)%12);
        System.out.println("The length is "+feet+" feet and "+inches+" inches.");

    }
}
