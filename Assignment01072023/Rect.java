
/*a java program to find the area and cercumference 
    of the rectangle */
import java.util.Scanner;

class Rect {
  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    int l, b, area, cir;
    System.out.println("enter the lenght of the Rectangle");
    l = sc.nextInt();
    System.out.println("enter the bredth of the Rectangle");
    b = sc.nextInt();
    area = l * b;
    cir = (l + b) / 2;
    System.out.println("the area of the rectangle: " + area);
    System.out.println("the circumference of the rectangle: " + cir);
  }
}