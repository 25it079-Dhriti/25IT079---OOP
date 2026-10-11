public class Thermostat {
    private String room;
    private int currentTemp;
    private static final int MIN = 16;
    private static final int MAX = 30;
    private static int totalThermostats = 0;
    Thermostat(String room) {
        this(room, 22);
    }
    Thermostat(String room, int currentTemp) {
        this.room = room;

        if (currentTemp >= MIN && currentTemp <= MAX)
            this.currentTemp = currentTemp;
        else
            this.currentTemp = 22;

        totalThermostats++;
    }
    void raise() {
        if (currentTemp < MAX)
            currentTemp++;
        else
            System.out.println("Already at maximum");
    }
    void lower() {
        if (currentTemp > MIN)
            currentTemp--;
        else
            System.out.println("Already at minimum");
    }
    int getTemperature() {
        return currentTemp;
    }
    static int getActiveCount() {
        return totalThermostats;
    }
    public static void main(String[] args) {
        Thermostat first = new Thermostat("Office");
        Thermostat second = new Thermostat("Kitchen", 24);
        for (int i = 0; i < 10; i++) {
            first.raise();
            System.out.println("Current Temperature: " + first.getTemperature());
        }
        for (int i = 0; i < 20; i++) {
            first.lower();
            System.out.println("Current Temperature: " + first.getTemperature());
        }
        System.out.println("Total Thermostats: " + Thermostat.getActiveCount());
    }
}