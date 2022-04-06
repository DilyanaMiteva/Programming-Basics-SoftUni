import java.util.Scanner;

public class OnTimeForTheExam_09 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        int examHours = Integer.parseInt(console.nextLine());
        int examMinutes = Integer.parseInt(console.nextLine());
        int studentHours = Integer.parseInt(console.nextLine());
        int studentMinutes = Integer.parseInt(console.nextLine());

        int examTime = examHours * 60 + examMinutes;
        int studentTime = studentHours * 60 + studentMinutes;
        int minutesDifference = studentTime - examTime;

        if (minutesDifference < -30) {
            System.out.println("Early");
        } else if (minutesDifference <= 0) {
            System.out.println("On time");
        } else {
            System.out.println("Late");
        } if (minutesDifference != 0) {
            int hours = Math.abs(minutesDifference / 60);
            int minutes = Math.abs(minutesDifference % 60);
            if (hours > 0) {
                if (minutes < 10) {
                    System.out.print(hours + ":0" + minutes + " hours");
                    if (minutesDifference < 0) {
                        System.out.print(" before the start");
                    } else {
                        System.out.print(" after the start");
                    }
                } else {
                    System.out.print(hours + ":" + minutes + " hours");
                    if (minutesDifference < 0) {
                        System.out.print(" before the start");
                    } else {
                        System.out.print(" after the start");
                    }
                }
            } else {
                System.out.print(minutes + " minutes");
                if (minutesDifference < 0) {
                    System.out.print(" before the start");
                } else {
                    System.out.print(" after the start");
                }
            }
        }

    }
}