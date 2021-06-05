import java.util.Scanner;
public class Tuna
{
    static Scanner sc = new Scanner (System.in);
    public static void main (String[]args)
    {
        Snapper Object = new Snapper();
        System.out.println("Please tell me your first girlfriends name");
        String girl = sc.nextLine();
        Object.setName(girl);
        Object.saying();
    }
}