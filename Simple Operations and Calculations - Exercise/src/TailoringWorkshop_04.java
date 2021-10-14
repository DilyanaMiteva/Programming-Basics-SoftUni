import java.util.Scanner;

public class TailoringWorkshop_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int countOfTables = Integer.parseInt(scanner.nextLine());
        double lengthOfTables = Double.parseDouble(scanner.nextLine());
        double widthOfTables = Double.parseDouble(scanner.nextLine());

        double lengthOfТableCloth = lengthOfTables + (2 * 0.30);
        double widthOfТableCloth = widthOfTables + (2 * 0.30);
        double sideOfTableCare = lengthOfTables / 2;

        double areaOfTablesCloth =countOfTables * lengthOfТableCloth * widthOfТableCloth;
        double areaOfTableCare =countOfTables * sideOfTableCare * sideOfTableCare;

        double priceUSD = areaOfTablesCloth * 7 + areaOfTableCare * 9;
        double priceBGN = (areaOfTablesCloth * 7 + areaOfTableCare * 9) * 1.85;

        System.out.printf("%.2f USD %n", priceUSD);
        System.out.printf("%.2f BGN ", priceBGN);

    }
}
