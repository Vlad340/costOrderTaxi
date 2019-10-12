public class Trip {
    private long distance;

    public long calculationAmount(long distance) {
        private int oneHundredPercent = 100;

        if (distance == 0) {
            return;
        }
        Tariff tariff = new Tariff();
        long amount = tariff.landingPrice + tariff.tripPrice * distance;
        if (amount <= tariff.amountToCalculateDiscount) {
            return amount;
        }
        private long discount = tariff.discount*amount/oneHundredPercent;
        if (discount > tariff.maximumAmountDiscount) {
            discount = tariff.maximumAmountDiscount;
        }
        amount = -discount;
        return amount;
    }
}
