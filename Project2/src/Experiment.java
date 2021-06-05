import java.util.Scanner;
public class Experiment
{
    static Scanner sc = new Scanner (System.in);
    public static void main (String[]args)
    {
     int a,b;
     String op;
     System.out.println("Please type in your first number");
     a = sc.nextInt();
     System.out.println("Please type in your second number");
     b = sc.nextInt();
     System.out.println("Please type in one of the following \"Add\", \"Subtract\", \"Mutiple\", \"Divide\"");
     op = sc.nextLine();
     switch (op){
         case"Add":
             System.out.println(a+b);
         case "Subtract":
             System.out.println(a-b);
         case "Mutiple":
             System.out.println(a*b);
         case "Divide":
             System.out.println(a/b);
         default: System.out.println("I do not understand");
     }
    }
}