public class Main {
    public static void main(String[] args) {
        int oneHundredPenny=100;
        long distance = 100;
        Trip trip = new Trip();
        System.out.println("Стоимость поездки "+trip.calculationAmount(distance)/oneHundredPenny+" руб.");
    }
}
