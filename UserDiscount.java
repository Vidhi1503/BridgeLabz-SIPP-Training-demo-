import java.util.Scanner;
public class UserDiscount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double fee, disper;
        System.out.print("Enter fee: ");
        fee = sc.nextDouble();
        System.out.print("Enter di percent: ");
        disper = sc.nextDouble();
        double di = (disper / 100) * fee;
        double finalf = fee - di;
        System.out.println("The discount amount is INR " + di + " and final died fee is INR " + finalf);
    }
}