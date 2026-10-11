class CinemaShow {
    private String movieName;
    private int bookedSeats;
    private final int totalSeats;
    private static int totalBooking = 0;
    CinemaShow(String movieName) {
        this(movieName, 100);
    }
    CinemaShow(String movieName, int totalSeats) {
        this.movieName = movieName;
        this.totalSeats = totalSeats;
        bookedSeats = totalSeats;
    }
    boolean book(int seats) {
        if (seats <= bookedSeats) {
            bookedSeats = bookedSeats - seats;
            totalBooking = totalBooking + seats;
            return true;
        }
        return false;
    }
    void cancel(int seats) {
        bookedSeats = bookedSeats + seats;
        if (bookedSeats > totalSeats)
            bookedSeats = totalSeats;
    }
    int getSeatsAvailable() {
        return bookedSeats;
    }
    static int getTotalBooked() {
        return totalBooking;
    }
    public static void main(String args[]) {
        CinemaShow movie = new CinemaShow("Avengers", 50);
        System.out.println("Booking : " + movie.book(20));
        System.out.println("Available Seats : " + movie.getSeatsAvailable());
        System.out.println("Booking : " + movie.book(40));
        System.out.println("Available Seats : " + movie.getSeatsAvailable());
        movie.cancel(10);
        System.out.println("After Cancel : " + movie.getSeatsAvailable());
        System.out.println("Total Booked : " + getTotalBooked());
    }
}