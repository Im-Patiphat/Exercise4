import java.util.Scanner;

public class Exercise47 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter A : ");
        int A = input.nextInt();
        System.out.print("Enter B : ");
        int B = input.nextInt();
        int C;
        if (A > B) {
            if (A > B) {
                System.out.print(A + ">" + B);
            } else {
                System.out.print(A + "=" + B);
            }
        } else {
            if (A < B) {
                System.out.print(A + "<" + B);
            } else {
                System.out.print(A + "=" + B);
            }

        }

    }
}
