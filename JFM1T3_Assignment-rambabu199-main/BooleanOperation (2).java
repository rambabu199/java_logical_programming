//JFM1T3_Assignment5:
/*
1.Write a program to initialize a boolean variable and print it's opposite value on console.

  Sample Input:true

  Expected Output:false

*/
public class BooleanOperation {
  /*
   * public static void main(String args[]) {
   * boolean b1 = true;
   * boolean b2 = !b1;
   * System.ou.println("the opposite value  of" + b1 + " is:" + b2);
   * }
   */
  public static void main(String[] args) {
    boolean value = true;
    boolean oppositeValue = !value;
    System.out.println("The opposite value of " + value + " is " + oppositeValue);
  }
}