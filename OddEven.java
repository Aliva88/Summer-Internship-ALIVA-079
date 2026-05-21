import java.util.Scanner;
public class OddEven {
  public void check(int num){
    if(num%2==0){
      System.out.println("The number "+num+" is even");
    }
    else{
      System.out.println("The number "+num+" is odd");
    }
  }
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int num;
    System.out.print("Enter a number: ");
    num = sc.nextInt();
    OddEven obj = new OddEven();
    obj.check(num);
  }
}
