import java.util.Scanner;
public class Largest3 {
  public void check(int num1,int num2,int num3){
    if(num1 > num2 && num1 > num3){
      System.out.println("The number "+num1+" is greater");
    }
    else if(num2 > num3){
      System.out.println("The number "+num2+" is greater");
    }
    else{
      System.out.println("The number "+num3+" is greater" );
    }
  }
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int a,b,c;
    System.out.print("Enter 3 number: ");
    a = sc.nextInt();
    b = sc.nextInt();
    c = sc.nextInt();
    Largest3 obj = new Largest3();
    obj.check(a, b, c);
    sc.close();
  }
}
