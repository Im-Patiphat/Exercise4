import java.util.Scanner;

public class Exercise41 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter x1 :");
        float x1 = input.nextFloat();
        System.out.print("Enter x2 :");
        float x2 = input.nextFloat();
        System.out.print("Enter x3 :");
        float x3 = input.nextFloat();
        System.out.print("Enter x4 :");
        float x4 = input.nextFloat();
        System.out.print("Enter x5 :");
        float x5 = input.nextFloat();
        float num = x1+x2+x3+x4+x5;
        float average = num/5;
        if(average >= 50) {
            System.out.println("Average = "+average);
            System.out.println("Pass !");   
        }
        else {
            System.out.println("Average = "+ average);
            System.out.println("Fail !!");
        }
    }
}
