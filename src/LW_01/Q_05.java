package LW_01;

import java.util.*;
public class Q_05{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Circle innerCircle = new Circle();
        Circle outerCircle = new Circle();

        System.out.println("Enter inner radius: ");
        double ri = scanner.nextDouble();
        innerCircle.setRadius(ri);

        System.out.println("Enter outer radius: ");
        double ro = scanner.nextDouble();
        outerCircle.setRadius(ro);

        double shadedArea = outerCircle.computeArea() - innerCircle.computeArea();

        System.out.println("Shaded Area: "+ shadedArea);
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


