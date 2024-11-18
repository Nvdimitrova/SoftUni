package ConditionalStatementsAdvanced;

import java.util.Scanner;

public class SmallShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String product = scanner.nextLine();
        String city = scanner.nextLine();
        double quantity = Double.parseDouble(scanner.nextLine());

        double totalPrice = 0;

        switch (city) {
            case "Sofia":
                switch (product) {
                    case "coffee":
                        totalPrice = quantity * 0.5;
                        break;
                    case "water":
                        totalPrice = quantity * 0.8;
                        break;
                    case "beer":
                        totalPrice = quantity * 1.2;
                        break;
                    case "sweets":
                        totalPrice = quantity * 1.45;
                        break;
                    case "peanuts":
                        totalPrice = quantity * 1.6;
                        break;
                }
                break;
            case "Plovdiv":
                switch (product) {
                    case "coffee":
                        totalPrice = quantity * 0.4;
                        break;
                    case "water":
                        totalPrice = quantity * 0.7;
                        break;
                    case "beer":
                        totalPrice = quantity * 1.15;
                        break;
                    case "sweets":
                        totalPrice = quantity * 1.3;
                        break;
                    case "peanuts":
                        totalPrice = quantity * 1.5;
                        break;
                }
                break;
            case "Varna":
                switch (product) {
                    case "coffee":
                        totalPrice = quantity * 0.45;
                        break;
                    case "water":
                        totalPrice = quantity * 0.7;
                        break;
                    case "beer":
                        totalPrice = quantity * 1.1;
                        break;
                    case "sweets":
                        totalPrice = quantity * 1.35;
                        break;
                    case "peanuts":
                        totalPrice = quantity * 1.55;
                        break;
                }
                break;
        }
        System.out.printf("%.2f", totalPrice);
        scanner.close();
    }
}