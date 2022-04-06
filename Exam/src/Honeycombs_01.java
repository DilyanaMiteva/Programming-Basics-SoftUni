import java.util.Scanner;

public class Honeycombs_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int countBee = Integer.parseInt(scanner.nextLine());
        int countFlower = Integer.parseInt(scanner.nextLine());

        double beeProduction = countBee * countFlower * 0.21;
        double honeyComb = Math.floor(beeProduction / 100);

        System.out.printf("%.0f honeycombs filled.%n", honeyComb);
        double honeyLeft = beeProduction - (honeyComb * 100);
        System.out.printf("%.2f grams of honey left.", honeyLeft);
    }
}
