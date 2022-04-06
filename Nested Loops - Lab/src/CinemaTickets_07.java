import java.util.Scanner;

public class CinemaTickets_07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String command = scanner.nextLine();  //филм или Finish
        //1. получаваме филм до команда Finish-> стоп: command == Finish; продължаваме: command != Finish

        int countTotalTickets = 0;//общият брой закупени билети за всички филми
        int countStandardTickets = 0; //общият брой закупени стандартни билети за всички филми
        int countStudentTickets = 0; //общият брой закупени студентски билети за всички филми
        int countKidTickets = 0; //общият брой закупени детски билети за всички филми

        while (!command.equals("Finish")) {
            //филм -> брой свободни места
            int freeSeats = Integer.parseInt(scanner.nextLine());
            //продаване на билети
            String type = scanner.nextLine(); //тип или End
            //купуват билети-> stop:type == End; продължават: type != "End"
            int busySeats = 0;
            while (!type.equals("End")) {
                //тип билет -> ("student", "standard", "kid")
                switch (type) {
                    case "standard":
                        countStandardTickets++;
                        break;
                    case "student":
                        countStudentTickets++;
                        break;
                    case "kid":
                        countKidTickets++;
                        break;
                }
                countTotalTickets++;
                busySeats++;
                if(freeSeats == busySeats){
                    break;
                }
                type = scanner.nextLine();
            }

            //изчислим процент заетост -> брой на заети места / общ брой места * 100
            double percent = busySeats * 1.0 / freeSeats * 100;
            System.out.printf("%s - %.2f%% full.%n", command, percent);

            command = scanner.nextLine();
        }

        System.out.printf("Total tickets: %d%n", countTotalTickets);
        //процент студентски билети
        double percentStudent = countStudentTickets * 1.0 / countTotalTickets * 100;
        System.out.printf("%.2f%% student tickets.%n", percentStudent);

        //процент стандартни билети
        double percentStandard = countStandardTickets * 1.0 / countTotalTickets * 100;
        System.out.printf("%.2f%% standard tickets.%n", percentStandard);

        //процент детски билети
        double percentKid = countKidTickets * 1.0 / countTotalTickets * 100;
        System.out.printf("%.2f%% kids tickets.%n", percentKid);


    }
}
