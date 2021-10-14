import java.util.Scanner;

public class AlcoholMarket_07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double priceOfWhiskey = Double.parseDouble(scanner.nextLine());

        double litersBeer = Double.parseDouble(scanner.nextLine());
        double litersWine = Double.parseDouble(scanner.nextLine());
        double litersRakia = Double.parseDouble(scanner.nextLine());
        double litersWhiskey = Double.parseDouble(scanner.nextLine());

        double priceOfRakia = priceOfWhiskey / 2;
        double priceOfWine = 0.6 * priceOfRakia;
        double priceOfBeer = 0.2 * priceOfRakia;

        double totalWhiskey = litersWhiskey * priceOfWhiskey;
        double totalBeer = litersBeer * priceOfBeer;
        double totalWine = litersWine * priceOfWine;
        double totalRakia = litersRakia * priceOfRakia;

        double totalSum = totalWhiskey + totalBeer + totalWine + totalRakia;

        System.out.printf("%.2f", totalSum);
    }
}
