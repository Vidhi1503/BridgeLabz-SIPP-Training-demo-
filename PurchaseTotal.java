import java.util.Scanner;
public class PurchaseTotal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter unit price: ");
        double unit = sc.nextDouble();
        System.out.print("Enter quant: ");
        int quant = sc.nextInt();
        double total = unit * quant;
        System.out.println("The total purchase price is INR " + total + " if the quant " + quant + " and unit price is INR " + unit);
    }
}
