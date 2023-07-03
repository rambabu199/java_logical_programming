
/*
 * You are developing a program for a pizza restaurant to calculate the cost of
 * a pizza based on its size and toppings. The program should have a method
 * called calculateCost that takes two parameters: size (a string representing
 * the size of the pizza) and toppings (an integer representing the number of
 * toppings). The method should return the total cost of the pizza.
 * 
 * The pizza sizes and their corresponding costs are as follows:
 * 
 * Small: $8.99
 * Medium: $10.99
 * Large: $12.99
 * 
 * The cost of each topping is $1.25.
 * 
 * Write the calculateCost method in Java that uses a switch case statement to
 * determine the cost of the pizza based on the size and the number of toppings.
 */
import java.util.Scanner;

class Pizzacost {
  float s = 8.99f, m = 10.99f, l = 12.99f;
  float cost, t1;

  void small(float t) {
    cost = (float) s + t;
    System.out.println("the total pizza cost is:" + cost);
  }

  void medium(float t) {
    cost = (float) m + t;
    System.out.println("the total pizza cost is:" + cost);
  }

  void large(float t) {
    cost = (float) l + t;
    System.out.println("the total pizza cost is:" + cost);
  }
}

class Pizza {
  public static void main(String args[]) {
    float top = 1.25f;
    Pizzacost p = new Pizzacost();
    Scanner sc = new Scanner(System.in);
    System.out.println("PIZZA MENU:");
    System.out.println("[1]SMALL: 8.99:");
    System.out.println("[2]MEDIUM: 10.99:");
    System.out.println("[3]LARGE:12.99:");
    System.out.println("ENTER YOUR CHOICE:");
    int ch = sc.nextInt();
    System.out.println("enter how many toppings do you want:");
    int t = sc.nextInt();
    float t1 = t * top;
    switch (ch) {
      case 1:
        p.small(t1);
        break;
      case 2:
        p.medium(t1);
        break;
      case 3:
        p.large(t1);
        break;
      default:
        System.out.println("invalid choice");
    }

  }
}
