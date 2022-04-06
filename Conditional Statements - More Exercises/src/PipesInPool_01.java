import java.util.Scanner;

public class PipesInPool_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int V = Integer.parseInt(scanner.nextLine());
        int P1 = Integer.parseInt(scanner.nextLine());
        int P2 = Integer.parseInt(scanner.nextLine());
        double H = Double.parseDouble(scanner.nextLine());

        double waterInTheFirstPipe = H * P1;
        double waterInTheSecondPipe = H * P2;
        double totalWater = waterInTheFirstPipe + waterInTheSecondPipe;

        if (totalWater <= V){
            double percentageTotal = totalWater / 10;
            double percentageFirstPipe = waterInTheFirstPipe * 100 / totalWater;
            double percentageSecondPipe = waterInTheSecondPipe * 100 / totalWater;
            System.out.printf("The pool is %.2f%% full. Pipe 1: %.2f%%. Pipe 2: %.2f%%.", percentageTotal, percentageFirstPipe, percentageSecondPipe);
        } else if(totalWater > V){
            double litersOverflowed = totalWater - V;
            System.out.printf("For %.2f hours the pool overflows with %.2f liters.", H, litersOverflowed);
        }
    }
}

