import java.util.Scanner;
public class P3{
    record Vehicle(String number, String type) {
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int totalToll = 0;
        int bike = 0;
        int car = 0;
        int truck = 0;
        while (true) {
            System.out.print("Enter Vehicle Number (or done): ");
            String number = sc.nextLine();
            if (number.equalsIgnoreCase("done")) {
                break;
            }
            System.out.print("Enter Vehicle Type (bike/car/truck): ");
            String type = sc.nextLine().toLowerCase();
            Vehicle v = new Vehicle(number, type);
            int toll = switch (v.type()) {
                case "bike" -> 20;
                case "car" -> 50;
                case "truck" -> 150;
                default -> 0;
            };
            totalToll += toll;
            switch (v.type()) {
                case "bike" -> bike++;
                case "car" -> car++;
                case "truck" -> truck++;
                default -> System.out.println("Invalid Vehicle Type");
            }
        }
        System.out.println("\nTotal toll: " + totalToll);
        if (bike >= car && bike >= truck) {
            System.out.println("Most frequent: bike");
        } else if (car >= bike && car >= truck) {
            System.out.println("Most frequent: car");
        } else {
            System.out.println("Most frequent: truck");
        }
        sc.close();
    }
}