public class Skateboard extends Item {
    private static double totalPrice = 0;

    public Skateboard(double price, int amount) {
        super(Promotion.PERCENT, price, amount);
        this.totalPrice += Promotion.PERCENT.CalculatePrice(amount, price);

    }

    public static double TotalPrice() {
        return totalPrice;
    }

    @Override
    public boolean Sell(int amount2) {
        if(super.Sell(amount2)) {
            totalPrice -= super.GetCost(amount2);
            return true;
        } else {
            System.out.println("Amount not available!");
            return false;
        }
    }
}
