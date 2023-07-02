/*a java program to calculate the bill amount of a product
 by using methods*/
class Product {
  int pnum = 123, pqua = 10;
  float pcost = 10.0f;
  float total;
  String pname = "choklet";

  void cal() {
    total = pqua * pcost;
  }

  void display() {
    System.out.println("the product details");
    System.out.println("the product number is" + pnum);
    System.out.println("the product name is" + pname);
    System.out.println("The product cost " + pcost);
    System.out.println("the  product quantity " + pqua);
    System.out.println("the bill = " + total);

  }
}

class Methodproduct {
  public static void main(String args[]) {
    Product p = new Product();
    p.cal();
    p.display();
  }
}