import java.util.Scanner;
public class Reverse {
  public void check(int num){
    int i;
    int rev = 0;
    int temp = num;
    while(num!=0){
      i = num%10;
      rev = rev*10+i;
      num = num/10;
    }
    System.out.println("The reverse will be: "+rev);
    if(temp == rev){
      System.out.println("The number is palindrome");
    }else{
      System.out.println("The number is not a palindrome");
    }
  }
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int num;
    System.out.print("Enter a number: ");
    num = sc.nextInt();
    Reverse obj = new Reverse();
    obj.check(num);
    sc.close();
  }
}
