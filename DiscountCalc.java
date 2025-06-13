public class DiscountCalc {
    public static void main(String[] args) {
        double fee = 125000;
        double dis = 10;
        double discount = (dis / 100) * fee;
        double finalf = fee - discount;
        System.out.println("The discount amount is INR " + discount + " and final discounted fee is INR " + finalf);
    }
}