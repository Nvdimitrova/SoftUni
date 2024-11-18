package FirstStepsInCoding.Exercise;

import java.util.Scanner;

public class SuppliesForSchool {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int pensCount = Integer.parseInt(scanner.nextLine());
        int markersCount = Integer.parseInt(scanner.nextLine());
        int compoundLiters = Integer.parseInt(scanner.nextLine());
        double discountPercent = Double.parseDouble(scanner.nextLine()) / 100;

        double pensPrice = 5.8;
        double markersPrice = 7.2;
        double compoundPrice = 1.2;

        double pensTotalPrice = pensCount * pensPrice;
        double markersTotalPrice = markersCount * markersPrice;
        double compoundTotalPrice = compoundLiters * compoundPrice;

        double totalPrice = pensTotalPrice + markersTotalPrice + compoundTotalPrice;
        double totalPriceDiscount = totalPrice - (totalPrice * discountPercent);

        System.out.println(totalPriceDiscount);
        scanner.close();
    }
}