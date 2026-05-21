import java.util.Scanner;
public class PosNeg0 {
  public int Check(int num){
    if(num<0){
      System.out.println("The number is negetive");
      return num;
    }
    else if(num>0){
      System.out.println("The number is positive");
      return num;
    }
    else{
      System.out.println("The number is zero");
      return 0;
    }
  }
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int num;
    System.out.print("Enter a number: ");
    num = sc.nextInt();
    PosNeg0 obj = new PosNeg0();
    obj.Check(num);
  }
}
