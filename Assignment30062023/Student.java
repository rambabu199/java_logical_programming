/*
 * Write a JAVAprogram to input marks of five subjects Physics, Chemistry,
 * Biology, Mathematics and Computer. Calculate percentage and grade according
 * to following:
 * Percentage >= 90% : Grade A
 * Percentage >= 80% : Grade B
 * Percentage >= 70% : Grade C
 * Percentage >= 60% : Grade D
 * Percentage >= 40% : Grade E
 * Percentage < 40% : Grade F
 */
import java.util.Scanner;

class Student1 {
  Scanner sc = new Scanner(System.in);
  float total;
  float per;

  void percentage() 
  {
     
    System.out.println("enter marks in biology:");
    int bio = sc.nextInt();
    System.out.println("enter marks in computers:");
    int comp = sc.nextInt();
    System.out.println("enter marks in maths:");
    int mat = sc.nextInt();
    System.out.println("enter marks in chemistry:");
    int che = sc.nextInt();
    System.out.println("enter marks in physics:");
    int phy = sc.nextInt();
    total = mat+phy+che+bio+comp;
    per=(total/500)*100;
    if(per>=90)
    {
      System.out.println("GRADE A:");
    }
    else if(per>=80&&per<90)
    {
      System.out.println("GRADE B:");
    }
    else if(per>=70&&per<80)
    {
      System.out.println("GRADE C:");
    }
    else if(per>=60&&per<70)
    {
      System.out.println("GRADE D:");
    }
    else if(per>=40&&per<60)
    {
      System.out.println("GRADE E:");
    }
    else
    {
      System.out.println("GRADE F:");
    }
  }
}

class Student{
  public static void main(String args[]) {
   
    Student1 s1 = new Student1();
    s1.percentage();

  }
}
