import java.util.Scanner;

public class HoneyWinterReserves_06 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double  honeyForWinter = Double.parseDouble(scanner.nextLine());
        String  beesName       = scanner.nextLine();
        double  collectedHoney = 0;
        double  beesHoney      = 0;
        boolean yes            = false;

        while (!beesName.equals("Winter has come")) {
            for (int i = 1; i <= 6; i++) {
                double yield = Double.parseDouble(scanner.nextLine());
                collectedHoney += yield;
                beesHoney += yield;
            }
            if ( beesHoney < 0 ) System.out.printf("%s was banished for gluttony%n", beesName);
            if ( collectedHoney >= honeyForWinter ) {
                System.out.printf("Well done! Honey surplus %.2f.", collectedHoney - honeyForWinter);
                yes = true;
                break;
            }
            beesName = scanner.nextLine();
        }
        if ( !yes ) System.out.printf("Hard Winter! Honey needed %.2f.",honeyForWinter-collectedHoney);
    }
}