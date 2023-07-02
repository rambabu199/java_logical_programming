
/* a java program to enter student number,name, 3 subjects 
marks and calculate the sum and avg of the marksand 
display the report*/
import java.util.Scanner;

class Student {
  int snum, che, phy, mat, total, avg;
  String sname;

  void input() {
    // Scanner sc = new Scanner(System.in);
    // System.out.println("enter the student number:");
    snum = 101;
    // System.out.println("enter the student name:");
    sname = "ram";
    // System.out.println("enter the marks of maths:");
    mat = 55;
    // System.out.println("enter the marks of physics:");
    phy = 66;
    // System.out.println("enter the marks of chemistry:");
    che = 68;
  }

  void total() {
    total = mat + phy + che;
    // System.out.println("the total of 3 subjects:"+total);

  }

  void avg() {
    avg = total / 3;
    // System.out.println("the avg of marks"+avg);
  }

  void display() {
    System.out.println("the report is");
    System.out.println("*******************");
    System.out.println("the name of the student :" + sname);
    System.out.println("the number of the student :" + snum);
    System.out.println("the marks in  maths :" + mat);
    System.out.println("the marks in  physics :" + phy);
    System.out.println("the marks in  chemistry :" + che);
    System.out.println("the total of 3 subjects:" + total);
    System.out.println("the avg of marks" + avg);

  }
}

class Methodstudent {
  public static void main(String args[]) {
    /*
     * Scanner sc = new Scanner(System.in);
     * System.out.println("enter the student number:");
     * int snum = sc.nextInt();
     * System.out.println("enter the student name:");
     * String sname = sc.next();
     * System.out.println("enter the marks of maths:");
     * int mat = sc.nextInt();
     * System.out.println("enter the marks of physics:");
     * int phy = sc.nextInt();
     * System.out.println("enter the marks of chemistry:");
     * int che = sc.nextInt();
     */
    Student s = new Student();
    s.input();
    s.total();
    s.avg();
    s.display();

  }
}