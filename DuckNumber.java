import java.util.Scanner;

public class DuckNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num;

        System.out.print("Enter a number: ");
        num = sc.nextInt();

        String str = Integer.toString(num);

        if(str.contains("0") && str.charAt(0) != '0') {
            System.out.println(num + " is a Duck number");
        } else {
            System.out.println(num + " is not a Duck number");
        }
        sc.close();
    }
}