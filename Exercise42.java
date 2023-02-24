import java.util.Scanner;

public class Exercise42 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter amout : ");
        int n = input.nextInt();
        int sum = 0;
        do{
            System.out.print("Enter price : " );
            int x = input.nextInt();
            sum = sum+x;
            n=n-1;
        }   while (n>0);{
                System.out.println("Result is "+sum);               }
    }
}
