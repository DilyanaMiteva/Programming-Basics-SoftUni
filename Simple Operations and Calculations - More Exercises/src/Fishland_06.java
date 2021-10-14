import java.util.Scanner;

public class Fishland_06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double priceOfMackerel = Double.parseDouble(scanner.nextLine()); //skumriq
        double priceOfSprat = Double.parseDouble(scanner.nextLine());   //caca
        double kilogramOfChamois = Double.parseDouble(scanner.nextLine()); //palamud
        double kilogramOfHorseMackerel = Double.parseDouble(scanner.nextLine()); //safrid
        int kilogramOfMussels = Integer.parseInt(scanner.nextLine()); //midi

        double priceForMussels = 7.50;
        double priceForHorseMackerel = priceOfSprat + priceOfSprat * 0.8;
        double priceForChamois = priceOfMackerel + priceOfMackerel * 0.6;

        double sumOfChamois = kilogramOfChamois * priceForChamois;
        double sumOfHorseMackerel = kilogramOfHorseMackerel * priceForHorseMackerel;
        double sumOfMussels = kilogramOfMussels * priceForMussels;

        double sumOfProducts =  sumOfChamois + sumOfHorseMackerel + sumOfMussels;

        System.out.printf("%.2f", sumOfProducts);

    }
}
