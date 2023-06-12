public class Bike extends Item{
    
    public Bike(Promotion promotion, double price, int amount) {
        super(promotion, price, amount);
    }
    
    public static Promotion ApplyBestPromotion( double[] tabCost, int[] tabAm) {
        Promotion bestProm = Promotion.AMOUNT;
        double bestPrice = Double.POSITIVE_INFINITY;
        Promotion[] promList = {Promotion.AMOUNT, Promotion.PERCENT, Promotion.TWOFORONE};
        for (int j = 0; j <promList.length; j ++) {
            double fullPrice = 0;
            for( int i = 0; i<tabAm.length; i++) {
                fullPrice += promList[j].CalculatePrice(tabAm[i], tabCost[i]);
            }
            if(fullPrice < bestPrice) {
                bestPrice = fullPrice;
                bestProm = promList[j];
            }
        }
        return bestProm;
    }

}
