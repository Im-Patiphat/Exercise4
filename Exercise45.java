import java.util.Scanner;

public class Exercise45 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter width : " );
        int w = input.nextInt();
        System.out.print("Enter length :");
        int l = input.nextInt();
        int area = w*l;
        System.out.println("Area is "+area);
    }
}
