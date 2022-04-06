import java.util.Scanner;

public class Journey_06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double budget = Double.parseDouble(scanner.nextLine());
        String season = scanner.nextLine();

        String destination = "";
        double priceHoliday = 0;
        String place = "";

        if(budget <= 100){
            destination = "Bulgaria";
            if(season.equals("summer")){
                priceHoliday = budget * 0.3;
                place = "Camp";
            }else if(season.equals("winter")){
                priceHoliday = budget * 0.7;
                place = "Hotel";
            }
        }else if(budget <= 1000){
            destination = "Balkans";
            if(season.equals("summer")){
                priceHoliday = budget * 0.4;
                place = "Camp";
            }else if(season.equals("winter")){
                priceHoliday = budget * 0.8;
                place = "Hotel";
            }
        }else if(budget > 1000){
            destination = "Europe";
            priceHoliday = 0.9 * budget;
            place = "Hotel";
        }
        System.out.printf("Somewhere in %s%n", destination);
        System.out.printf("%s - %.2f", place, priceHoliday);
    }
}