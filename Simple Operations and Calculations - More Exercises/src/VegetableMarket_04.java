import java.util.Scanner;

public class VegetableMarket_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double priceOfVegetables = Double.parseDouble(scanner.nextLine());
        double priceOfFruits = Double.parseDouble(scanner.nextLine());
        int kilogramsOfVegetables = Integer.parseInt(scanner.nextLine());
        int kilogramsOfFruits = Integer.parseInt(scanner.nextLine());

        double kilogramVegetablesByPrice = priceOfVegetables * kilogramsOfVegetables;
        double kilogramFruitsByPrice = priceOfFruits * kilogramsOfFruits;

        double priceBGN = kilogramVegetablesByPrice + kilogramFruitsByPrice;
        double priceEURO = priceBGN / 1.94;

        System.out.printf("%.2f", priceEURO);
    }
}
