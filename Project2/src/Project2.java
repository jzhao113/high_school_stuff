import java.util.Scanner;
public class Project2{
    static Scanner sc = new Scanner (System.in);
    public static void main (String[]args)
    {
     String gender;
     int boyage, girlage;
     System.out.println("Are you a boy or a girl?");
     gender = sc.nextLine();
     switch (gender){
         case "boy":
             System.out.println("How old are you?");
             boyage = sc.nextInt();
             if (boyage > 20){
                 System.out.println("You may enter.");              
             }
             else System.out.println("You may not enter");
             break;
         case "girl":
             System.out.println("How old are you?");
             girlage = sc.nextInt();
             if (girlage > 18){
                 System.out.println("You may enter.");
             }
             else System.out.println("You may not enter");
             break;
         default: System.out.println("What you say?");
             break;
             
         }
     }
    }
