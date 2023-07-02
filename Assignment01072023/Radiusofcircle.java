import java.util.Scanner;

class Radiusofcircle {
  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    int r;
    float pi = 3.14F;
    float area;
    System.out.println("enter the radius of the circle");
    r = sc.nextInt();
    area = pi * r * r;
    System.out.println("the area of the circle: " + area);
  }
}