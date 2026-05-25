import java.util.Scanner;
public class count {
  public int check(int num){
    int count = 0;
    
    while(num!=0){
      count++;
      num = num/10;
    }
    return count;
  }
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int num;
    System.out.print("Enter a number: ");
    num = sc.nextInt();
    count obj = new count();
    int result = obj.check(num);
    System.out.println(result);
    sc.close();
  }
}
