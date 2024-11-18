package FirstStepsInCoding.Exercise;

import java.util.Scanner;

public class DepositCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double depositAmount = scanner.nextDouble();
        int depositTerm = scanner.nextInt();
        double annualInterest = scanner.nextDouble();

        double annualInterestPercent = annualInterest / 100;

        double total = depositAmount + depositTerm * ((depositAmount * annualInterestPercent) / 12);

        System.out.println(total);
        scanner.close();
    }
}