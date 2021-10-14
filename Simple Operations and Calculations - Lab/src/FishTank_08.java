import java.util.Scanner;

public class FishTank_08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int length = Integer.parseInt(scanner.nextLine());
        int width = Integer.parseInt(scanner.nextLine());
        int height = Integer.parseInt(scanner.nextLine());
        double percentage = Double.parseDouble(scanner.nextLine());

        int volumeOfTheAquarium = length * width * height;
        double litersInTheAquarium = volumeOfTheAquarium * 0.001;
        double percentageCapacity = percentage * 0.01;
        double waterInTheAquarium = litersInTheAquarium * (1-percentageCapacity);

        System.out.printf("%.3f", waterInTheAquarium);
    }
}
