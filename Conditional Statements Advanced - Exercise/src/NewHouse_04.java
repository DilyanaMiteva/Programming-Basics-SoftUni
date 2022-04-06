import java.util.Scanner;

public class NewHouse_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String flower = scanner.nextLine();
        int count = Integer.parseInt(scanner.nextLine());
        int budget = Integer.parseInt(scanner.nextLine());
        double price = 0;

        switch (flower) {
            case "Roses":
                if (count > 80) {
                    price = (count * 5) - 0.1 * (count * 5);
                } else {
                    price = count * 5;
                }
                break;
            case "Dahlias":
                if (count > 90) {
                    price = (count * 3.8) - 0.15 * (count * 3.8);
                } else {
                    price = count * 3.8;
                }
                break;
            case "Tulips":
                if (count > 80) {
                    price = (count * 2.8) - 0.15 * (count * 2.8);
                } else {
                    price = count * 2.8;
                }
                break;
            case "Narcissus":
                if (count < 120) {
                    price = (count * 3) + 0.15 * (count * 3);
                } else {
                    price = count * 3;
                }
                break;
            case "Gladiolus":
                if (count < 80) {
                    price = (count * 2.5) + 0.2 * (count * 2.5);
                } else {
                    price = count * 2.5;
                }
                break;
        }
        if (budget >= price) {
            double leftMoney = budget - price;
            System.out.printf("Hey, you have a great garden with %d %s and %.2f leva left.", count, flower, leftMoney);
        } else {
            double needMoney = price - budget;
            System.out.printf("Not enough money, you need %.2f leva more.", needMoney);
        }
    }
}
