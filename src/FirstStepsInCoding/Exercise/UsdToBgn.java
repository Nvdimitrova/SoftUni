package FirstStepsInCoding.Exercise;

import java.util.Scanner;

public class UsdToBgn {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double usdDollars = Double.parseDouble(scanner.nextLine());

        double bgnLev = usdDollars * 1.79549;

        System.out.println(bgnLev);
        scanner.close();
    }
}