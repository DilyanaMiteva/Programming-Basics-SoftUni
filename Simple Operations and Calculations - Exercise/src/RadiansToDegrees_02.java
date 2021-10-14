import java.util.Scanner;

public class RadiansToDegrees_02 {
    public static void main(String[] args) {
        //Причитаме радианите
        //2. degrees = radians * 180 / 3.14159265359
        //3. Принтираме закръглено до най-близко число
        Scanner scanner = new Scanner(System.in);
        double radians = Double.parseDouble(scanner.nextLine());
        double degrees = radians * 180 / Math.PI;
        System.out.printf("%.0f", degrees);
    }
}

