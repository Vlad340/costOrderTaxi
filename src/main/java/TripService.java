public class TripService {

    public long calculationAmount(long distance, TariffService tariff) {
        int oneHundredPercent = 100;

        if (distance == 0) {
            return 0;
        }
        //TariffService tariff = new TariffService();
        long amount = tariff.landingPrice + tariff.tripPrice * distance;
        if (amount <= tariff.amountToCalculateDiscount) {
            return amount;
        }
        long discount = tariff.discount*amount/oneHundredPercent;
        if (discount > tariff.maximumAmountDiscount) {
            discount = tariff.maximumAmountDiscount;
        }
        amount -=discount;
        return amount;
    }
}
