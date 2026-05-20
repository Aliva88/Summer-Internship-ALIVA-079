public class DataType{
  byte a = 10;
  short b = 200;
  int c = 3000;
  long d = 30000l;
  float e = 12.5f;
  double f = 45.67;
  char g = 'A';
  boolean h = true;
  public static void main(String[] args) {
    DataType obj = new DataType();
    System.out.println("Byte Value = " + obj.a);
    System.out.println("Short Value = " + obj.b);
    System.out.println("Int Value = " + obj.c);
    System.out.println("Long Value = " + obj.d);
    System.out.println("Float Value = " + obj.e);
    System.out.println("Double Value = " + obj.f);
    System.out.println("Char Value = " + obj.g);
    System.out.println("Boolean Value = " + obj.h);
  }
}