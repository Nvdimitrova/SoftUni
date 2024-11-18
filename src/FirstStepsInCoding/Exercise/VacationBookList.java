package FirstStepsInCoding.Exercise;

import java.util.Scanner;

public class VacationBookList {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int pages = Integer.parseInt(scanner.nextLine());
        int pagesForOneHour = Integer.parseInt(scanner.nextLine());
        int days = Integer.parseInt(scanner.nextLine());

        int totalTimeForBook = (pages / pagesForOneHour) / days;

        System.out.println(totalTimeForBook);
        scanner.close();
    }
}