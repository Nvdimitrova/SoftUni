package FirstStepsInCoding.Exercise;

import java.util.Scanner;

public class FoodDelivery {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int chickenMenu = Integer.parseInt(scanner.nextLine());
        int fishMenu = Integer.parseInt(scanner.nextLine());
        int vegetarianMenu = Integer.parseInt(scanner.nextLine());

        double chickenMenusPrice = chickenMenu * 10.35;
        double fishMenuPrice = fishMenu * 12.4;
        double vegetarianMenuPrice = vegetarianMenu * 8.15;
        double deliveryPrice = 2.5;


        double menusPrice = chickenMenusPrice + fishMenuPrice + vegetarianMenuPrice;
        double dessertPrice = menusPrice * 0.2;
        double totalPrice = menusPrice + dessertPrice + deliveryPrice;

        System.out.println(totalPrice);
        scanner.close();
    }
}