import java.util.Scanner;

public class Volleyball_10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String year = scanner.nextLine();
        int p = Integer.parseInt(scanner.nextLine());
        int h = Integer.parseInt(scanner.nextLine());

        int weekendsInSofia = 48 - h;
        double playInSofia = weekendsInSofia * (3.0 / 4);
        double playInHometown = h;
        double playInHolidays = p * (2.0 / 3);
        double sumPlay = playInSofia + playInHometown + playInHolidays;

        if("leap".equals(year)){
            sumPlay = sumPlay + sumPlay * 0.15;
            System.out.printf("%.0f", Math.floor(sumPlay));
        } else if("normal".equals(year)) {
            System.out.printf("%.0f", Math.floor(sumPlay));
        }
    }
}
