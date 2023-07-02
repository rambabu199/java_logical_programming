
/* a java program to enter student number,name, 3 subjects 
marks and calculate the sum and avg of the marksand 
display the report*/
import java.util.Scanner;

class Student {
  float total;
  float avg;

  void stotal(int a, int b, int c) {
    total = a + b + c;
    avg = total / 3;
    System.out.println("the total marks are :" + total);
    System.out.println("the avg of marks :" + avg);
  }
}

class Methodstudent1 {
  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    System.out.println("enter student number:");
    int snum = sc.nextInt();
    System.out.println("enter student name:");
    String sname = sc.next();
    System.out.println("enter marks in maths:");
    int mat = sc.nextInt();
    System.out.println("enter marks in chemistry:");
    int che = sc.nextInt();
    System.out.println("enter marks in physics:");
    int phy = sc.nextInt();
    Student s1 = new Student();
    System.out.println("the report is");
    System.out.println("*******************");
    System.out.println("the name of the student :" + sname);
    System.out.println("the number of the student :" + snum);
    System.out.println("the marks in  maths :" + mat);
    System.out.println("the marks in  physics :" + phy);
    System.out.println("the marks in  chemistry :" + che);
    s1.stotal(mat, che, phy);

  }
}