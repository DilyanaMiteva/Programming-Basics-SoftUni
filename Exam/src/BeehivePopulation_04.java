import java.util.Scanner;

public class BeehivePopulation_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int initialPopulation = Integer.parseInt(scanner.nextLine());
        int age = Integer.parseInt(scanner.nextLine());
        for (int allAge = 1; allAge <= age ; allAge++) {
            initialPopulation += initialPopulation/10*2;
            if (allAge % 5 == 0){
                initialPopulation -= initialPopulation/50*5;
            }
            initialPopulation -= initialPopulation/20*2;

        }
        System.out.printf("Beehive population: %d", initialPopulation);
    }
}