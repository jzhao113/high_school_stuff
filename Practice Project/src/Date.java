import java.util.Scanner;
public class Date
{
    static Scanner sc = new Scanner (System.in);
    public static void main (String[]args)
    {
     String gender;
     int boyage, girlage;
     System.out.println("Are you a boy or a girl?");
     gender = sc.nextLine();
     switch (gender){
         case ("girl"):
             System.out.println("Please enter age");
             girlage = sc.nextInt();
             if (girlage >20){
                 System.out.print("You may enter");
                 }
             else System.out.println("You may not enter");
             break;
         case ("boy"):
             System.out.println("Please enter age");
             boyage = sc.nextInt();
             if (boyage > 18){
                 System.out.println("You may enter");
             }
             else System.out.println("You may not enter");
             break;
             
         default:
             System.out.println("What?");
             break;
                     
             }
         
     }
     
     
}
