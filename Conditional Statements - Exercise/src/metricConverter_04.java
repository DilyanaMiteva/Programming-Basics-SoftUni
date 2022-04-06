import java.util.Scanner;

public class metricConverter_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double inputData = Double.parseDouble(scanner.nextLine());
        String inputMetric = scanner.nextLine();
        String outputMetric = scanner.nextLine();

        if ( inputMetric.equals("mm")){
            inputData = inputData / 1000;
        } else if ( inputMetric.equals("cm")){
            inputData = inputData / 100;
        }
        if (outputMetric.equals("mm")){
            inputData = inputData * 1000;
        }else if (outputMetric.equals("cm")){
            inputData = inputData * 100;
        }
        System.out.printf("%.3f", inputData);
    }
}
