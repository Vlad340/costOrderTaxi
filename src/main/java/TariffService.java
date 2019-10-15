public class TariffService {
    long landingPrice;
    long tripPrice;
    long amountToCalculateDiscount;
    int discount;
    long maximumAmountDiscount;

    public TariffService() {
        this.landingPrice = 60_00L;;
        this.tripPrice = 20_00L;
        this.amountToCalculateDiscount = 1_000_00L;
        this.discount = 5;
        this.maximumAmountDiscount = 100_00L;
    }
}
