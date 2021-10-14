import java.util.Scanner;

public class HousePainting_07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double x = Double.parseDouble(scanner.nextLine());
        double y = Double.parseDouble(scanner.nextLine());
        double h = Double.parseDouble(scanner.nextLine());

        double frontWall = (x * x) - (1.2 * 2);
        double backWall = x * x;
        double sideWall = (x * y) - (1.5 * 1.5);
        double roofRectangle = 2 * (x * y);
        double roofTriangle = 2 * ((x * h) / 2);


        double totalAreaGreenPaint = frontWall + backWall + (2 * sideWall);
        double totalAreaRedPaint = roofRectangle + roofTriangle;

        double litersOfGreenPaint = totalAreaGreenPaint / 3.4;
        double litersOfRedPaint = totalAreaRedPaint / 4.3;

        System.out.printf("%.2f%n", litersOfGreenPaint);
        System.out.printf("%.2f", litersOfRedPaint);
    }
}
