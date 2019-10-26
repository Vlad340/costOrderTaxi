public class Main {
    public static void main(String[] args) {
        int oneHundredPenny=100;
        long distance = 100;
        TripService trip = new TripService();
        System.out.println("Стоимость поездки "+trip.calculationAmount(distance, new TariffService())/oneHundredPenny+" руб.");
    }
}
