import java.util.Scanner;
public class SquareSide {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter peri: ");
        double peri = sc.nextDouble();
        double side = peri / 4;
        System.out.println("The length of the side is " + side + " whose perimeter is " + peri);
    }
}