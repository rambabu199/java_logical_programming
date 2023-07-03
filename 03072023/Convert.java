
/*a java program to convert temparature from celcius to foreignheat or f to c */
import java.util.Scanner;

class Demo {
  float a = 1.8f, b = 0.56f;

  void celsius(float t, String s) {
    float f = (t * a) + 32;
    System.out.println("the temparature celsius after convertion is :" + f + "fahrenheit");
  }

  void fahrenheit(float t, String s) {
    float c = (t - 32) * b;
    System.out.println("the fahrenheit temparature after convertion is : " + c + "celsius");
  }

}

class Convert {
  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    Demo d = new Demo();
    System.out.println("enter tempurature");
    float t = sc.nextFloat();
    System.out.println("enter  scale");
    String scale = sc.next();
    switch (scale) {
      case "celsius":
        d.celsius(t, scale);
        break;
      case "fahrenheit":
        d.fahrenheit(t, scale);
        break;
      default:
        System.out.println("invalid entry");
        break;
    }
  }
}