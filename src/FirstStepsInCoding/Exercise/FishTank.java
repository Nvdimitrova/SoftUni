package FirstStepsInCoding.Exercise;

import java.util.Scanner;

public class FishTank {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int length = scanner.nextInt();
        int width = scanner.nextInt();
        int height = scanner.nextInt();
        double percentage = scanner.nextDouble();

        int aquariumVolume = length * width * height;
        double volumeInLiters = aquariumVolume * 0.001;
        double occupiedSpace = percentage / 100;
        double litersNeeded = volumeInLiters * (1-occupiedSpace);

        System.out.println(litersNeeded);
        scanner.close();
    }
}