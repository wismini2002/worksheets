package LW_02;

import java.util.Scanner;

public class Q_04 {
    public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            int[] numbers = new int[5];

            System.out.println("Enter five numbers:");
            for (int i = 0; i < 5; i++) {
                numbers[i] = sc.nextInt();
            }
            int largest = Integer.MIN_VALUE;
            int secondLargest = Integer.MIN_VALUE;

            for (int i = 0; i < 5; i++) {
                if (numbers[i] > largest) {
                    secondLargest = largest;
                    largest = numbers[i];
                } else if (numbers[i] > secondLargest && numbers[i] != largest) {
                    secondLargest = numbers[i];
                }
            }

            System.out.println("Second largest number: " + secondLargest);

        }

}
