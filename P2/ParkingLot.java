class ParkingLot {
    private int bikeCount;
    private int carCount;
    private final int bikeLimit;
    private final int carLimit;
    private static long totalRevenue = 0;
    ParkingLot(int bikeLimit, int carLimit) {
        this.bikeLimit = bikeLimit;
        this.carLimit = carLimit;
    }
    void park(String vehicle) {
        if (vehicle.equals("two")) {
            if (bikeCount < bikeLimit) {
                bikeCount++;
                totalRevenue += 20;
            }
            else {
                System.out.println("Bike Parking Full");
            }
        }
        else if (vehicle.equals("four")) {
            if (carCount < carLimit) {
                carCount++;
                totalRevenue += 40;
            }
            else {
                System.out.println("Car Parking Full");
            }
        }
    }
    void leave(String vehicle) {
        if (vehicle.equals("two") && bikeCount > 0)
            bikeCount--;
        if (vehicle.equals("four") && carCount > 0)
            carCount--;
    }
    public static void main(String args[]) {
        ParkingLot lot = new ParkingLot(2, 2);
        lot.park("two");
        lot.park("two");
        lot.park("two");
        lot.park("four");
        lot.leave("two");
        lot.park("four");
        System.out.println("Bike Count : " + lot.bikeCount);
        System.out.println("Car Count : " + lot.carCount);
        System.out.println("Revenue : " + totalRevenue);
    }
}