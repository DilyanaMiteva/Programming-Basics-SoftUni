import java.util.Scanner;

public class PetShop_06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int countOfDogs = Integer.parseInt(scanner.nextLine());
        int countOfOtherAnimals = Integer.parseInt(scanner.nextLine());

        double priceForFood = (countOfDogs * 2.50) + (countOfOtherAnimals * 4);

        System.out.printf("%.2f lv.", priceForFood);
    }
}
