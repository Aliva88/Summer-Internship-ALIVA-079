class swap3rd{
  public void swap(int a,int b){
    System.out.println("Before a = "+a+" b = "+b);
    int temp;
    temp = a;
    a=b;
    b = temp;
    System.out.println("After a = "+a+" b = "+b);
  }
  public static void main(String[] args) {
    swap3rd obj = new swap3rd();
    obj.swap(5,9);
  }
}