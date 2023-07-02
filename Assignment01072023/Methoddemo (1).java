/* a  java program to perform arthemetic operations
 by using methods*/
class demo {
  int a = 10, b = 5, c;

  void add() {
    c = a + b;
    System.out.println("the addition of a,b :" + c);
  }

  void sub() {
    c = a - b;
    System.out.println("the subtraction of a,b :" + c);
  }

  void mul() {
    c = a * b;
    System.out.println("the addition of a,b :" + c);
  }

  void div() {
    c = a / b;
    System.out.println("the addition of a,b :" + c);

  }

  void mod() {
    c = a % b;
    System.out.println("the addition of a,b :" + c);
  }
}

class Methoddemo {
  public static void main(String args[]) {
    demo d = new demo();
    d.add();
    d.sub();
    d.mul();
    d.div();
    d.mod();
  }
}