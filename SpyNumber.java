import java.util.Scanner;

public class SpyNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num, sum = 0, product = 1, digit;

        System.out.print("Enter a number: ");
        num = sc.nextInt();

        int temp = num;

        while(temp > 0) {
            digit = temp % 10;
            sum = sum + digit;
            product = product * digit;
            temp = temp / 10;
        }

        if(sum == product) {
            System.out.println(num + " is a Spy number");
        } else {
            System.out.println(num + " is not a Spy number");
        }
        sc.close();
    }
}