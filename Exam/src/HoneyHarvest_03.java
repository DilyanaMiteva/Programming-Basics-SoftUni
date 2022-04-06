import java.util.Scanner;

public class HoneyHarvest_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String flower = scanner.nextLine();
        int countFlowers = Integer.parseInt(scanner.nextLine());
        String season = scanner.nextLine();
        double quality = 0;

        switch (flower) {
            case "Sunflower":
                if (season.equals("Spring")) {
                    quality = countFlowers * 10;
                } else if (season.equals("Summer")) {
                    quality = countFlowers * 8 * 1.1;
                } else if (season.equals("Autumn")) {
                    quality = countFlowers * 12 * 0.95;
                }
                break;
            case "Daisy":
                if (season.equals("Spring")) {
                    quality = countFlowers * 12 * 1.1;
                } else if (season.equals("Summer")) {
                    quality = countFlowers * 8 * 1.1;
                } else if (season.equals("Autumn")){
                    quality = countFlowers * 6 * 0.95;
                }
                break;
            case "Lavender":
                if (season.equals("Spring")) {
                    quality = countFlowers * 12;
                } else if (season.equals("Summer")) {
                    quality = countFlowers * 8 * 1.1;
                } else if (season.equals("Autumn")){
                    quality = countFlowers * 6 * 0.95;
                }
                break;
            case "Mint":
                if (season.equals("Spring")) {
                    quality = countFlowers * 10 * 1.1;
                } else if (season.equals("Summer")) {
                    quality = countFlowers * 12 * 1.1;
                } else if (season.equals("Autumn")){
                    quality = countFlowers * 6 * 0.95;
                }
                break;
        }
        System.out.printf("Total honey harvested: %.2f", quality);
    }
}
