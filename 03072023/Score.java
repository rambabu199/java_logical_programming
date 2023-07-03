
/*a java program to calculate the score of player*/
import java.util.Scanner;

class Demo {
  int score;

  void level1(int t) {
    score = (t * 2) - 1000;
    System.out.println("the score of the level 1 player is :" + score);
  }

  void level2(int t) {
    score = (t * 3) - 1500;
    System.out.println("the score of the level 2 player is :" + score);
  }

  void level3(int t) {
    score = (t * 4) - 2000;
    System.out.println("the score of the level 3 player is :" + score);
  }

  void level4(int t) {
    score = (t * 5) - 2500;
    System.out.println("the score of the level 4 player is :" + score);
  }

}

class Score {
  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    Demo d = new Demo();
    System.out.println("enter level of player");
    int level = sc.nextInt();
    System.out.println("enter the time taken by player in seconds");
    int time = sc.nextInt();
    switch (level) {
      case 1:
        d.level1(time);
        break;
      case 2:
        d.level2(time);
        break;
      case 3:
        d.level3(time);
        break;
      case 4:
        d.level4(time);
        break;
      default:
        System.out.println("invalid entry");
        break;
    }
  }
}