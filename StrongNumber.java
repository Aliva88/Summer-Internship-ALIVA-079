import java.util.Scanner;

public class StrongNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num, temp, digit, sum = 0;

        System.out.print("Enter a number: ");
        num = sc.nextInt();

        temp = num;

        while(temp > 0) {
            digit = temp % 10;

            int fact = 1;

            for(int i = 1; i <= digit; i++) {
                fact = fact * i;
            }

            sum = sum + fact;
            temp = temp / 10;
        }

        if(sum == num) {
            System.out.println(num + " is a Strong number");
        } else {
            System.out.println(num + " is not a Strong number");
        }
        sc.close();
    }
}