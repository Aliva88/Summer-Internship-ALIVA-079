import java.util.Scanner;
public class Armstrong {
  static int power(int num,int count){
    int p = 1;
    for(int i=1; i<count ; i++){
      p=p*num;
    }
    return p;
  }
  public void Check(int num){
    int c = num;
    int temp = num;
    int count = 1;
    int a;
    int arm = 0;
    while(temp!=0){
      count++;
      temp = temp/10;
    }
    while(num!=0){
    a = num % 10;
    arm = arm + power(a, count);
    num = num/10;
    }
    if(c==arm){
      System.out.println("The number is Armstrong");
    }
    else{
      System.out.println("The number is not a Armstrong");
    }
  }
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n;
    System.out.print("Enter a number: ");
    n = sc.nextInt();
    Armstrong obj = new Armstrong();
    obj.Check(n);
    sc.close();
  }
}
