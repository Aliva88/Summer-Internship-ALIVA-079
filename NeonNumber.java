import java.util.Scanner;

public class NeonNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num, square, sum = 0;

        System.out.print("Enter a number: ");
        num = sc.nextInt();

        square = num * num;

        while(square > 0) {
            sum = sum + square % 10;
            square = square / 10;
        }

        if(sum == num) {
            System.out.println(num + " is a Neon number");
        } else {
            System.out.println(num + " is not a Neon number");
        }
        sc.close();
    }
}