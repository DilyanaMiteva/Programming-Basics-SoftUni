import java.util.Scanner;

public class Travelling_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String command = scanner.nextLine(); //End или дестинация

        while (!command.equals("End")){
            double budget = Double.parseDouble(scanner.nextLine());
            int sum = 0; //спестени пари
            while (sum < budget) {
                double saved = Double.parseDouble(scanner.nextLine());
                sum += saved;

            }
            //ako sum >= budget
            if(sum >= budget){
                System.out.printf("Going to %s!%n", command);
            }

            command = scanner.nextLine();

        }


    }
}