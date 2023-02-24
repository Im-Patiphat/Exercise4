import java.util.Scanner;

public class Exercise44 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter radius :");
        int r = input.nextInt();
        double area = (r*r)*3.14;
        System.out.println("Have a radius "+area);
    }
}
