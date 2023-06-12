public abstract class Item implements Sellable{
    private Promotion promotion;
    private double price;
    private int amount;
    private static boolean isFirst = true;

    public Item(Promotion promotion, double price, int amount) {
        this.promotion = promotion;
        this.price = price;
        this.amount = amount;
    }

    public  int GetAmount() {
        return amount;
    }

    public boolean IsAvailable(int liczba) {
        return amount >= liczba;
    }

    public double GetCost(int sztuki) {
        return promotion.CalculatePrice(sztuki, price);
    }
    @Override
    public boolean Sell(int amount_2) {
        if(amount <amount_2) {
            System.out.println("Amount not available!");
            return false;
        } else {
            this.amount -= amount_2;
            if (this.isFirst) {
                System.out.println("First bike has been sold!");
                this.isFirst = false;
            }
            return true;
        }

    }
}
