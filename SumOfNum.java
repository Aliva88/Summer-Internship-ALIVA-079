import java.util.Scanner;
public class SumOfNum {
  public void Add(int num){
    int sum = 0;
    int r;
    while (num!=0) {
    r = num % 10;
    sum = sum + r;
    num = num/10;
    }
    System.out.println("The sum is "+sum);
  }
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int num;
    System.out.print("Enter a number: ");
    num = sc.nextInt();
    SumOfNum obj = new SumOfNum();
    obj.Add(num);
  }
}
