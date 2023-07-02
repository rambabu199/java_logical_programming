import java.util.Scanner;

class Positive
  {
  
    Scanner sc = new Scanner(System.in);

    void positive()
    {
     System.out.println("enter a value");
     int a = sc.nextInt();
     if (a > 0) {
       System.out.println("a is a positive number");

     }
     else
     {
      System.out.println("a is a negitive number");
     }
  }
}

class Methodpositive
  {
  public static void main(String args[])
  {
    Positive p = new Positive();
    p.positive();
  }

}