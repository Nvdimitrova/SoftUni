package ConditionalStatementsAdvanced;

import java.util.Scanner;

public class AnimalType {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String animal = scanner.nextLine();

        String type = "";

        switch (animal) {
            case "dog":
                type = "mammal";
                break;
            case "crocodile":
                type = "reptile";
                break;
            case "tortoise":
                type = "reptile";
                break;
            case "snake":
                type = "reptile";
                break;
            default:
                type = "unknown";
                break;
        }
        System.out.println(type);
        scanner.close();
    }
}