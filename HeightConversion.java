import java.util.Scanner;
public class HeightConversion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double cm;
        System.out.print("Enter height in cm: ");
        cm = sc.nextDouble();
        double inches = cm / 2.54;
        int feet = (int)(inches / 12);
        double rem = inches % 12;
        System.out.println("Your Height in cm is " + cm + " while in feet is " + feet + " and inches is " + rem);
    }
}