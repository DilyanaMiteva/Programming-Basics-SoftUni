import java.util.Scanner;

public class AreaOfFigures_07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String figures = scanner.nextLine();

        if (figures.equals("square")) {
            double sideOfSquare = Double.parseDouble(scanner.nextLine());
            double areaOfSquare = sideOfSquare * sideOfSquare;
            System.out.printf("%.3f", areaOfSquare);
        } else if (figures.equals("rectangle")) {
            double lengthOfRectange = Double.parseDouble(scanner.nextLine());
            double widthOfRectangle = Double.parseDouble(scanner.nextLine());
            double areaOfRectangle = lengthOfRectange * widthOfRectangle;
            System.out.printf("%.3f", areaOfRectangle);
        } else if (figures.equals("circle")) {
            double radius = Double.parseDouble(scanner.nextLine());
            double areaOfCircle = Math.PI * radius * radius;
            System.out.printf("%.3f", areaOfCircle);
        } else {
            double sideOfTriangle = Double.parseDouble(scanner.nextLine());
            double heightOfTriangle = Double.parseDouble(scanner.nextLine());
            double areaOfTriangle = (sideOfTriangle * heightOfTriangle) / 2;
            System.out.printf("%.3f", areaOfTriangle);
        }
    }
}
