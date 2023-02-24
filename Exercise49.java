import java.util.Scanner;

public class Exercise49 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter sum : ");
        int x = input.nextInt();
        if (x > 0) {

            System.out.print("Positive number");

        } else {
            if (x < 0) {
                System.out.print("Negative number");
            } else {
                System.out.print("Zero");
            }

        }
    }
}
