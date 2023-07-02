/*a java program to print the current bill by using methods*/
class Current {
  int cnum, lmr, pmr;
  float total, bamount;
  String cname;
  float urate = 3.80f;

  void input() {
    cnum = 10235;
    lmr = 120;
    pmr = 325;
    cname = "ram";
  }

  void cal() {
    total = pmr - lmr;
    bamount = total * urate;
  }

  void display() {
    System.out.println("the report is:");
    System.out.println("********************");
    System.out.println("consumer number:" + cnum);
    System.out.println("consumer name:" + cname);
    System.out.println("last month reading:" + lmr);
    System.out.println("present month reading:" + pmr);
    System.out.println("total units consumed:" + total);
    System.out.println("total bill amount is:" + bamount);
  }
}

class Methodcurrent {
  public static void main(String args[]) {
    Current c = new Current();
    c.input();
    c.cal();
    c.display();
  }
}
