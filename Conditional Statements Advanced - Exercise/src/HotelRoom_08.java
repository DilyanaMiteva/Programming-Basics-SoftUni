import java.util.Scanner;

public class HotelRoom_08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String month = scanner.nextLine();
        int nights = Integer.parseInt(scanner.nextLine());

        double studio = 0;
        double aparment = 0;

        if (month.equals("May") || month.equals("October")) {
            studio = 50 * nights;
            aparment = 65 * nights;
            if (nights > 7 && nights <= 14) {
                studio = studio - 0.05 * studio;
                System.out.printf("Apartment: %.2f lv.%n", aparment);
                System.out.printf("Studio: %.2f lv.", studio);
            } else if (nights > 14) {
                studio = studio - 0.3 * studio;
                aparment = aparment - 0.1 * aparment;
                System.out.printf("Apartment: %.2f lv.%n", aparment);
                System.out.printf("Studio: %.2f lv.", studio);
            } else {
                System.out.printf("Apartment: %.2f lv.%n", aparment);
                System.out.printf("Studio: %.2f lv.", studio);
            }
        } else if (month.equals("June") || month.equals("September")) {
            studio = 75.2 * nights;
            aparment = 68.7 * nights;
            if (nights > 7 && nights <= 14) {
                System.out.printf("Apartment: %.2f lv.%n", aparment);
                System.out.printf("Studio: %.2f lv.", studio);
            } else if (nights > 14) {
                studio = studio - 0.2 * studio;
                aparment = aparment - 0.1 * aparment;
                System.out.printf("Apartment: %.2f lv.%n", aparment);
                System.out.printf("Studio: %.2f lv.", studio);
            } else {
                System.out.printf("Apartment: %.2f lv.%n", aparment);
                System.out.printf("Studio: %.2f lv.", studio);
            }
        } else if (month.equals("July") || month.equals("August")) {
            studio = 76 * nights;
            aparment = 77 * nights;
            if (nights > 7 && nights <= 14) {
                System.out.printf("Apartment: %.2f lv.%n", aparment);
                System.out.printf("Studio: %.2f lv.", studio);
            } else if (nights > 14) {
                aparment = aparment - 0.1 * aparment;
                System.out.printf("Apartment: %.2f lv.%n", aparment);
                System.out.printf("Studio: %.2f lv.", studio);
            } else {
                System.out.printf("Apartment: %.2f lv.%n", aparment);
                System.out.printf("Studio: %.2f lv.", studio);
            }
        }
    }
}
