public class Zero
{
    public static void main(String[]args)
    {
        String a = "Bovember";
        char zero = a.charAt(0);
        int age = 16;
        int length = a.length();
        int half = length/2;
        String firsthalf = a.substring(0,half-1);
        String secondhalf =a.substring(half+1,length);
        System.out.println(firsthalf+secondhalf);
        if(age>=15&&zero=='N'||zero=='B'){
            System.out.println("Yes");
        }
    }
}