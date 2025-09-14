package LW_01;

import java.util.*;
public class Q_05{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter inner radius: ");
        double ri = scanner.nextDouble();

        System.out.print("Enter outer radius: ");
        double ro = scanner.nextDouble();

        Circle innerCircle = new Circle();
        Circle outerCircle = new Circle();

        double shadedArea = outerCircle.computeArea() - innerCircle.computeArea();

        System.out.printf("Shaded Area = %.2f\n", shadedArea);
    }

    static class Circle {
        double radius;

        void setRadius(double radius) {
            this.radius = radius;
        }

        double computeArea() {
                return Math.PI * radius * radius;
        }

        double computeCircumference() {
                return 2 * Math.PI * radius;
        }
    }
}


