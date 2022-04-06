import java.util.Scanner;

public class skiTrip_10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int days = Integer.parseInt(scanner.nextLine());
        String typeOfRoom = scanner.nextLine();
        String grade = scanner.nextLine();
        double priceAfterDiscount = 0;

        switch (typeOfRoom) {
            case "room for one person":
                if (days < 10) {
                    priceAfterDiscount = (days - 1) * 18.00;
                } else if (days >= 10 && days <= 15) {
                    priceAfterDiscount = (days - 1) * 18.00;
                } else if (days > 15) {
                    priceAfterDiscount = (days - 1) * 18.00;
                }
                break;
            case "apartment":
                if (days < 10) {
                    priceAfterDiscount = (days - 1) * 25.00 - ((days - 1) * 25.00 * 0.3);
                } else if (days >= 10 && days <= 15) {
                    priceAfterDiscount = (days - 1) * 25.00 - ((days - 1) * 25.00 * 0.35);
                } else if (days > 15) {
                    priceAfterDiscount = (days - 1) * 25.00 - ((days - 1) * 25.00 * 0.5);
                }
                break;
            case "president apartment":
                if (days < 10) {
                    priceAfterDiscount = (days - 1) * 35.00 - ((days - 1) * 35.00 * 0.1);
                } else if (days >= 10 && days <= 15) {
                    priceAfterDiscount = (days - 1) * 35.00 - ((days - 1) * 35.00 * 0.15);
                } else if (days > 15) {
                    priceAfterDiscount = (days - 1) * 35.00 - ((days - 1) * 35.00 * 0.2);
                }
                break;
        }
        double totalPrice = 0;
        switch (grade){
            case "positive":
                totalPrice = priceAfterDiscount + 0.25 * priceAfterDiscount;
                System.out.printf("%.2f", totalPrice);
                break;
            case "negative":
                totalPrice = priceAfterDiscount - 0.1 * priceAfterDiscount;
                System.out.printf("%.2f", totalPrice);
                break;
        }
    }
}

