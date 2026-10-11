import java.util.Objects;
public class Card {
    private String rank;
    private String suit;
    Card(String r, String s) {
        rank = r;
        suit = s;
    }
    public String toString() {
        return rank + " of " + suit;
    }
    public boolean equals(Object o) {
        if (this == o)
            return true;
        if (!(o instanceof Card))
            return false;
        Card c = (Card) o;
        return rank.equals(c.rank) && suit.equals(c.suit);
    }
    public int hashCode() {
        return Objects.hash(rank, suit);
    }
}