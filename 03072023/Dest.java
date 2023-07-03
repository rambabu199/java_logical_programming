
/*a java program to calculate the shipping cost*/
import java.util.Scanner;

class Demo {
  int cost, sur, tcost;

  void unitedstates(int w) {
    if (w > 5) {
      cost = w * 5;
      sur = (10 * cost) / 100;
      tcost = cost + sur;
      System.out.println("the cost of the shipping to united states is :" + tcost);
    } else {
      tcost = w * 5;
      System.out.println("the the cost of shipping to unitedstates is :" + tcost);
    }
  }

  void canada(int w) {
    if (w > 5) {
      cost = w * 6;
      sur = (10 * cost) / 100;
      tcost = cost + sur;
      System.out.println("the cost of the shipping to canada is :" + tcost);
    } else {
      tcost = w * 6;
      System.out.println("the cost of shipping to canada is :" + tcost);
    }
  }

  void unitedkingdom(int w) {
    if (w > 5) {
      cost = w * 8;
      sur = (10 * cost) / 100;
      tcost = cost + sur;
      System.out.println("the cost of the shipping to united kingdom is :" + tcost);
    } else {
      tcost = w * 8;
      System.out.println("the cost of shipping to unitedkingdom is :" + tcost);
    }
  }

  void australia(int w) {
    if (w > 5) {
      cost = w * 9;
      sur = (10 * cost) / 100;
      tcost = cost + sur;
      System.out.println("the cost of the shipping to australia is :" + tcost);
    } else {
      tcost = w * 9;
      System.out.println("the cost of shipping to australia is :" + tcost);
    }
  }

  void other(int w) {
    if (w > 5) {
      cost = w * 10;
      sur = (10 * cost) / 100;
      tcost = cost + sur;
      System.out.println("the cost of the shipping to other countries is :" + tcost);
    } else {
      tcost = w * 10;
      System.out.println("the cost of shipping to other countries is :" + tcost);
    }
  }

}

class Dest {
  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    Demo d = new Demo();
    System.out.println("enter weight of the package");
    int w = sc.nextInt();
    System.out.println("enter the destination");
    String s = sc.next();
    switch (s) {
      case "unitedstates":
        d.unitedstates(w);
        break;
      case "canada":
        d.canada(w);
        break;
      case "unitedkingdom":
        d.unitedkingdom(w);
        break;
      case "australia":
        d.australia(w);
        break;
      case "other":
        d.other(w);
        break;
      default:
        System.out.println("invalid entry");
        break;
    }
  }
}