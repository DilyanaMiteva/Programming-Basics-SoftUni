import java.util.Scanner;

public class godzillaVsKong_06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double budged = Double.parseDouble(scanner.nextLine());
        int actors = Integer.parseInt(scanner.nextLine());
        double priceForCostume = Double.parseDouble(scanner.nextLine());

        double costumesTotal = actors * priceForCostume;
        double decor = 0.1 * budged;

        if (actors > 150) {
            costumesTotal *= 0.9;
        }
        double total = decor + costumesTotal;

        if (budged < total) {
            double neededMoney = total - budged;
            System.out.printf("Not enough money!%nWingard needs %.2f leva more.", neededMoney);
        } else {
            System.out.printf("Action!%nWingard starts filming with %.2f leva left.", budged - total);

        }
    }
}

