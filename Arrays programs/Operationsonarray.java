import java.util.*;

class Operationsonarray {
  public static void main(String[] args) {
    int n;
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter size of array");
    n = sc.nextInt();
    int array[] = new int[n];
    System.out.println("Enter values of array");
    for (int p = 0; p < n - 1; p++)
      array[p] = sc.nextInt();
    System.out.println("the  values of array is: ");
    for (int i = 0; i < n; i++)
      System.out.print(" " + array[i]);
    System.out.println("\n enter the data :  ");
    int d = sc.nextInt();
    System.out.println("enter the position: ");
    int pos = sc.nextInt();
    for (int i = n - 2; i >= pos; i--) {
      array[i + 1] = array[i];
    }
    array[pos] = d;
    System.out.println("\n the  values of array after insertion is: ");
    for (int i = 0; i < n; i++)
      System.out.print(" " + array[i]);
    System.out.println("\n enter the position to delete: ");
    int pos1 = sc.nextInt();
    for (int i = pos1 + 1; i <= n - 1; i++) {
      array[i - 1] = array[i];
    }
    array[n - 1] = 0;
    System.out.println("the  values of array after deletion is: ");
    for (int i = 0; i < n; i++)
      System.out.print(" " + array[i]);

  }
}