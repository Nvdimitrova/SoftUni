package ConditionalStatements.Lab;

import java.util.Scanner;

import static java.lang.Math.PI;

public class AreaOfFigures {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String typeOfFigure = scanner.nextLine();

        if (typeOfFigure.equals("square")){
            double sideA = Double.parseDouble(scanner.nextLine());
            double area = sideA * sideA;
            System.out.printf("%.3f%n", area);

        } else if (typeOfFigure.equals("rectangle")) {
            double length = Double.parseDouble(scanner.nextLine());
            double width = Double.parseDouble(scanner.nextLine());
            double area = length * width;
            System.out.printf("%.3f%n", area);

        } else if (typeOfFigure.equals("circle")) {
            double radius = Double.parseDouble(scanner.nextLine());
            double area = PI * radius * radius;
            System.out.printf("%.3f%n", area);

        } else if (typeOfFigure.equals("triangle")) {
            double base = Double.parseDouble(scanner.nextLine());
            double height = Double.parseDouble(scanner.nextLine());
            double area = 0.5 * base * height;
            System.out.printf("%.3f%n", area);
        }
        scanner.close();
    }
}