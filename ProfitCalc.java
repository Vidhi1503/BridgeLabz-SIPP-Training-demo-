public class ProfitCalc {
    public static void main(String[] args) {
        int cp = 129, sellingPrice = 191;
        int profit = sellingPrice - cp;
        double profitPercent = (profit * 100.0) / cp;
        System.out.println("The Cost Price is INR " + cp + " and Selling Price is INR " + sellingPrice +
            "\nThe Profit is INR " + profit + " and the Profit Percentage is " + profitPercent);
    }
}