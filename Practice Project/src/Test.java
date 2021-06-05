import java.util.Scanner;
public class Test
{
    static Scanner sc = new Scanner (System.in);
    public static void main (String[]args)
    {
     double Base;
     double Height;
     System.out.println("Enter the tringle's base");
     Base = sc.nextDouble();
     System.out.println("Enter the tringle's height");
     Height = sc.nextDouble();
     double PreArea = Base*Height;
     double Area = PreArea / 2;
     System.out.println(Area);
     
     
    }
}