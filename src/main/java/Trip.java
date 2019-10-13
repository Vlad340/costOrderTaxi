public class Trip {

    public long calculationAmount(long distance) {
        int oneHundredPercent = 100;

        if (distance == 0) {
            return 0;
        }
        Tariff tariff = new Tariff();
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
