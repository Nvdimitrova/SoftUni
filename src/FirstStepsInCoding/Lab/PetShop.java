package FirstStepsInCoding.Lab;

import java.util.Scanner;

public class PetShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int dogFood = Integer.parseInt(scanner.nextLine());
        int catFood = Integer.parseInt(scanner.nextLine());

        double dogFoodPrice = 2.5;
        double catFoodPrice = 4;

        double totalPrice = (dogFood * dogFoodPrice) + (catFood * catFoodPrice);

        System.out.println(totalPrice);
        scanner.close();
    }
}