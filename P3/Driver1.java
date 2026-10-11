public class Driver1 {
    public static void main(String[] args) {
        Card c[] = {
                new Card("Ace", "Spades"),
                new Card("King", "Clubs"),
                new Card("Queen", "Hearts"),
                new Card("Ace", "Spades"),
                new Card("Jack", "Diamonds")
        };
        for (int i = 1; i < c.length; i++) {
            for (int j = 0; j < i; j++) {
                if (c[i].equals(c[j])) {

                    System.out.println("Duplicate found : " + c[i]);
                    return;
                }
            }
        }
    }
}