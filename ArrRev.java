public class ArrRev {
  public void Rev(char[] arr){
    for(int i=arr.length-1 ; i>=0;i--){
      System.out.print(arr[i]+" ");
    }
  }
  public static void main(String[] args) {
    char[] arr = {'A' , 'L' , 'I' , 'V' , 'A'};
    ArrRev obj = new ArrRev();
    obj.Rev(arr);
  }
}
