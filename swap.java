public class swap {
  public void swapw(int a,int b){
    System.out.println("Before a = "+a+" b = "+b);
    a = a+b;
    b = a-b;
    a = a-b;
    System.out.println("After a = "+a+" b = "+b);
  }
  public static void main(String[] args) {
    swap obj = new swap();
    obj.swapw(5,9);
  }
}
