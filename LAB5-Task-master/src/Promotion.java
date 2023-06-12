public enum Promotion {
    NONE,
    PERCENT,
    AMOUNT,
    TWOFORONE;




    public double CalculatePrice(int amount, double price) {
        if (this.name().equals("NONE")) {
            return amount * price;
        } else if (this.name().equals("PERCENT")) {
            return amount * (price * 0.6);

        } else if (this.name().equals("AMOUNT")) {
            return amount * (price - 10);

        } else {
            return (amount / 2 * price) + amount % 2 * price;
        }
    }
}
