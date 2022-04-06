import java.util.Scanner;

public class Cake_06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int length = Integer.parseInt(scanner.nextLine());
        int width = Integer.parseInt(scanner.nextLine());
        int totalPieces = length * width;
        //Докато има торта
        //STOP
        String input = scanner.nextLine();
        while (!input.equals("STOP")) {
            //Раздаваме парчета
            int piecesTaken = Integer.parseInt(input);
            totalPieces -= piecesTaken;
            if (totalPieces < 0) {
                System.out.printf("No more cake left! You need %d pieces more.", Math.abs(totalPieces));
                break;
            }
            input = scanner.nextLine();
        }

        if (totalPieces >= 0) {
            System.out.printf("%d pieces are left.", totalPieces);
        }
    }
}
