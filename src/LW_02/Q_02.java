package LW_02;

import java.util.Scanner;

public class Q_02 {
    public static void main(String[] args) {
        int number=0;
        Scanner sc=new Scanner(System.in);
        while (number>=0){
            System.out.println("Enter a number");
            number=sc.nextInt();
            int i;
            for(i=0;number>0;i++){
                number=number/10;
            }
            System.out.println("No of Digits: "+i);

        }
    }
}
