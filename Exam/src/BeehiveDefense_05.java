import java.util.Scanner;

public class BeehiveDefense_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int countBees = Integer.parseInt(scanner.nextLine());
        int healthBeer = Integer.parseInt(scanner.nextLine());
        int attackBeer = Integer.parseInt(scanner.nextLine());
        while (countBees >= 100) {
            countBees -= attackBeer;
            healthBeer -= countBees*5;
            if (healthBeer <= 0){
                System.out.printf("Beehive won! Bees left %d.", countBees);
                break;
            } if (countBees<=0){
                countBees = 0;
                break;
            }

        }if (countBees<100){
            System.out.printf("The bear stole the honey! Bees left %d.", countBees);
        }
    }
}