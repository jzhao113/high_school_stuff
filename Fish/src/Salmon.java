import java.util.Scanner;
public class Salmon
{
    //sc.nextLine();
    //Scanner is a type
    public static void main (String[]args)
    {
        Scanner sc = new Scanner (System.in);
        Tuna Printer = new Tuna();
        String name;
        System.out.println("Please enter your name ");
        name = sc.nextLine();
        
        Printer.Message(name);
        System.out.println(Printer.Adding(1, 3));
        
    }
}