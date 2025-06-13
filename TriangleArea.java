import java.util.Scanner;
public class TriangleArea {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter base in inches: ");
        double base = sc.nextDouble();
        System.out.print("Enter height in inches: ");
        double height = sc.nextDouble();
        double areainch = 0.5 * base * height;
        double areacm = areainch * 6.4516;
        System.out.println("Area in square inches is " + areainch + " and square cm is " + areacm);
    }
}