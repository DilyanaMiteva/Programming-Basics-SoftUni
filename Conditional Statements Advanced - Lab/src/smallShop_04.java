import java.util.Scanner;

public class smallShop_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String product = scanner.nextLine();
        String town = scanner.nextLine();
        double quality = Double.parseDouble(scanner.nextLine());

        switch (town) {
            case "Sofia":
                if (product.equals("coffee")) {
                    System.out.println(quality * 0.50);
                } else if (product.equals("water")) {
                    System.out.println(quality * 0.80);
                } else if (product.equals("beer")) {
                    System.out.println(quality * 1.20);
                } else if (product.equals("sweets")) {
                    System.out.println(quality * 1.45);
                } else if (product.equals("peanuts")) {
                    System.out.println(quality * 1.60);
                }
                break;
            case "Plovdiv":
                if (product.equals("coffee")) {
                    System.out.println(quality * 0.40);
                } else if (product.equals("water")) {
                    System.out.println(quality * 0.70);
                } else if (product.equals("beer")) {
                    System.out.println(quality * 1.15);
                } else if (product.equals("sweets")) {
                    System.out.println(quality * 1.30);
                } else if (product.equals("peanuts")) {
                    System.out.println(quality * 1.50);
                }
                break;
            case "Varna":
                if ("coffee".equals(product)) {
                    System.out.println(quality * 0.45);
                } else if ("water".equals(product)) {
                    System.out.println(quality * 0.70);
                } else if ("beer".equals(product)) {
                    System.out.println(quality * 1.10);
                } else if ("sweets".equals(product)) {
                    System.out.println(quality * 1.35);
                } else if ("peanuts".equals(product)) {
                    System.out.println(quality * 1.55);
                }
                break;
        }

    }
}
