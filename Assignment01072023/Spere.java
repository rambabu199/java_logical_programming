
/* Write a Java program to calculate the volume of a sphere with given radius, and display the result.*/
import java.util.Scanner;

class Spere {
  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    int r;
    float pi = 3.14F;
    float volume;
    float a = 1.34f;
    System.out.println("enter the radius of the sphere:");
    r = sc.nextInt();
    volume = a * pi * r * r * r;
    System.out.println("the volume of the sphere: " + volume);
  }
}