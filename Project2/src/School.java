import java.util.Date;
public class School
{
    public static void main (String[]args)
    {
        Date today = new Date ();
        Date birthday = new Date (99,3,20);
        Date testDate = new Date(116,8,8,7,21,13);
        System.out.println(today);
        System.out.println(birthday);
        System.out.println(testDate);
        int a = testDate.getDate();
        System.out.println(a);
        int b = testDate.getDay();
        System.out.println(b);
        
        
        
    }
    public void setDate (int Date){
        Date = 2;
        System.out.println(Date);
        
    }
}