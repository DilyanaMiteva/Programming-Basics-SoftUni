import java.util.Scanner;

public class FishingBoat_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int budget = Integer.parseInt(scanner.nextLine());
        String season = scanner.nextLine();
        int countFishers = Integer.parseInt(scanner.nextLine());
        double price = 0;

        switch (season) {
            case "Spring":
                if (countFishers <= 6) {
                    price = 3000 - 0.1 * 3000;
                } else if (countFishers >= 7 && countFishers <= 11) {
                    price = 3000 - 0.15 * 3000;
                } else if (countFishers >= 12) {
                    price = 3000 - 0.25 * 3000;
                }
                break;
            case "Summer":
            case "Autumn":
                if (countFishers <= 6) {
                    price = 4200 - 0.1 * 4200;
                } else if (countFishers >= 7 && countFishers <= 11) {
                    price = 4200 - 0.15 * 4200;
                } else if (countFishers >= 12) {
                    price = 4200 - 0.25 * 4200;
                }
                break;
            case "Winter":
                if (countFishers <= 6) {
                    price = 2600 - 0.1 * 2600;
                } else if (countFishers >= 7 && countFishers <= 11) {
                    price = 2600 - 0.15 * 2600;
                } else if (countFishers >= 12) {
                    price = 2600 - 0.25 * 2600;
                }
                break;
        }

        if (countFishers % 2 == 0 && !"Autumn".equals(season)) {
            price = price - 0.05 * price;
        }

        if (budget >= price) {
            double leftMoney = budget - price;
            System.out.printf("Yes! You have %.2f leva left.", leftMoney);
        } else if (price > budget){
            double needMoney = price - budget;
            System.out.printf("Not enough money! You need %.2f leva.", needMoney);
        }
    }

}
