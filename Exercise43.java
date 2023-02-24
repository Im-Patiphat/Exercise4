import java.util.Scanner;

public class Exercise43 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter amout : ");
        int amout = input.nextInt();
        System.out.print("Enter price : ");
        int price = input.nextInt();
        int sum = amout*price; 
        System.out.println("Price is "+sum +" Bath"); 
    }
}
