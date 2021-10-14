import java.util.Scanner;

public class YardGreening_07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double squareMeters = Double.parseDouble(scanner.nextLine());

        double priceForLandscaping = squareMeters * 7.61;
        double discount = priceForLandscaping * 0.18;
        double theFinalPrice = priceForLandscaping - discount;

        System.out.printf("The final price is: %.2f lv. %n", theFinalPrice);
        System.out.printf("The discount is: %.2f lv.", discount);
    }
}
