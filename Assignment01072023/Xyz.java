import java.util.Scanner;
class Test
{
    void areacircle()
    {   
        System.out.print("enter the radius :");
        Scanner s = new Scanner(System.in);
        float r = s.nextFloat();
        float ar;
        ar = (r * r) * 22 / 7;
        System.out.println("area of the circle is : "+ar+" sq units.");
    }
}
class Xyz
{
    public static void main(String args[]) 
    {
        Test obj = new Test();
        obj.areacircle();
    }
}