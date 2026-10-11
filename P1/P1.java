import java.util.Scanner;
public class P1{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int price = 15;
        int total = 0;
        while (total < price) {
            System.out.print("Enter coin value (1,2,5,10): ");
            int coin = sc.nextInt();
            switch (coin) {
                case 1:
                    total += 1;
                    break;

                case 2:
                    total += 2;
                    break;

                case 5:
                    total += 5;
                    break;

                case 10:
                    total += 10;
                    break;

                default:
                    System.out.println("Invalid Coin");
            }
        }
        System.out.println("Total Amount = " + total);
        System.out.println("Change = " + (total - price));
    }
}