abstract class Media {
    String title;
    int lateDays;
    Media(String title, int lateDays) {
        this.title = title;
        this.lateDays = lateDays;
    }
    abstract double lateFee();
}
class Book extends Media {
    Book(String title, int lateDays) {
        super(title, lateDays);
    }
    @Override double lateFee() {
        return lateDays * 2;
    }
}
class Movie extends Media {
    Movie(String title, int lateDays) {
        super(title, lateDays);
    }
    @Override double lateFee() {
        return lateDays * 5;
    }
}
class MusicCD extends Media {
    MusicCD(String title, int lateDays) {
        super(title, lateDays);
    }
    @Override double lateFee() {
        return lateDays * 3;
    }
}
public class MediaFees {
    public static void main(String[] args) {
        Media[] returnedMedia = {
                new Book("Java Programming", 4),
                new Movie("Avengers", 3),
                new MusicCD("Taylor Swift Album", 5),
                new Book("Data Structures", 2),
                new Movie("Interstellar", 1)
        };
        double totalFees = 0;
        for (Media m : returnedMedia) {
            double fee = m.lateFee();
            System.out.println(
                    "Title: " + m.title +
                            ", Late Days: " + m.lateDays +
                            ", Late Fee: Rs. " + fee);

            totalFees += fee;
        }
        System.out.println("\nTotal Late Fees = Rs. " + totalFees);
    }
}