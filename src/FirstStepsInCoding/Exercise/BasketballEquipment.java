package FirstStepsInCoding.Exercise;

import java.util.Scanner;

public class BasketballEquipment {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int annualFee = Integer.parseInt(scanner.nextLine());

        double basketballShoes = annualFee - (annualFee * 0.4);
        double basketballSet = basketballShoes - (basketballShoes * 0.2);
        double basketballBall = basketballSet - (basketballSet * 0.75);
        double basketballAccessories = basketballBall - (basketballBall * 0.8);

        double totalKitPrice = basketballShoes + basketballSet
                + basketballBall + basketballAccessories;

        double totalPrice = annualFee + totalKitPrice;

        System.out.println(totalPrice);
        scanner.close();
    }
}