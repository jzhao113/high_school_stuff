import java.util.Scanner;
public class Tests
{
    static Scanner sc = new Scanner (System.in);
    public static void main (String[]args)
    {
        String firstname,lastname;
        System.out.println("Please put in your first name");
        firstname = sc.nextLine();
        System.out.println("Please put in your last name");
        lastname = sc.nextLine();
        System.out.println("Your name is " + firstname + " " + lastname);
        
    }
}