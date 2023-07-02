
/*a java program to find the area and cercumference 
    of the triangle */
import java.util.Scanner;

class Triangle {
  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    double a, b, c, h, area, cir;
    System.out.println("enter the 1st side of tryangle:");
    a = sc.nextInt();
    System.out.println("enter the 2nd side of tryangle:");
    b = sc.nextInt();
    System.out.println("enter the 3rd side of tryangle:");
    c = sc.nextInt();
    System.out.println("enter the height of tryangle:");
    h = sc.nextInt();
    area = 0.5 * b * h;
    cir = a + b + c;
    System.out.println("the area of the tryangle: " + area);
    System.out.println("the circumference of the tryangle: " + cir);
  }
}