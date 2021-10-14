import java.util.Scanner;

public class CelsiusToFahrenheit_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double degreesCelsius = Double.parseDouble(scanner.nextLine());
        double degreesFahrenheit = degreesCelsius * 1.8 + 32;
        System.out.printf("%.2f", degreesFahrenheit);
    }
}
