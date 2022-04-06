import java.util.Scanner;

public class Building_06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int floors = Integer.parseInt(scanner.nextLine());
        int rooms = Integer.parseInt(scanner.nextLine());

        for (int floor = floors; floor >= 1; floor--) {
            //за всеки един етаж -> минем през стаите му
            for (int room = 0; room < rooms; room++) {
                //проверка за етажа
                //1. последен
                //2. четен ->
                //3. нечетен
                if (floor == floors) {
                    System.out.printf("L%d%d ", floor, room);
                } else if (floor % 2 == 0) {
                    System.out.printf("O%d%d ", floor, room);
                } else if (floor % 2 == 1) {
                    System.out.printf("A%d%d ", floor, room);
                }
            }
            System.out.println();
        }

    }
}