import java.util.Scanner;

public class toyShop_08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double priceForTrip = Double.parseDouble(scanner.nextLine());
        int countOfPuzzles = Integer.parseInt(scanner.nextLine());
        int countOfDolls = Integer.parseInt(scanner.nextLine());
        int countOfBears = Integer.parseInt(scanner.nextLine());
        int countOfMinions = Integer.parseInt(scanner.nextLine());
        int countOfTrucks = Integer.parseInt(scanner.nextLine());

        double totalPrice = (2.60 * countOfPuzzles) + (3 * countOfDolls) + (4.10 * countOfBears) + (8.20 * countOfMinions) + (2 * countOfTrucks);
        int countOfToys = countOfPuzzles + countOfDolls + countOfBears + countOfMinions + countOfTrucks;

        if (countOfToys >= 50) {
            totalPrice = totalPrice - (totalPrice * 0.25);
        }

        double rentOfShop = totalPrice * 0.10;

        totalPrice = totalPrice - rentOfShop;

        if (totalPrice >= priceForTrip) {
            double moneyLeftOver = totalPrice - priceForTrip;
            System.out.printf("Yes! %.2f lv left.", moneyLeftOver);
        } else {
            double missingMoney = priceForTrip - totalPrice;
            System.out.printf("Not enough money! %.2f lv needed.", missingMoney);
        }

    }
}
