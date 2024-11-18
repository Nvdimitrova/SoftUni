package FirstStepsInCoding.Lab;

import java.util.Scanner;

public class YardGreening {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double squareMeters = Double.parseDouble(scanner.nextLine());

        double priceForMeter = 7.61;
        double discountPercent = 0.18;
        double price = squareMeters * priceForMeter;
        double totalDiscount = price * discountPercent;
        double totalPrice = price - totalDiscount;

        System.out.println("The final price is: " + totalPrice + " lv.");
        System.out.println("The discount is: " + totalDiscount + " lv.");
        scanner.close();
    }
}