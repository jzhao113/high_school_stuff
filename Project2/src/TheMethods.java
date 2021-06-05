public class TheMethods
{
    public static void main (String[]args)
    {
        String catcher = TheMethods.notstring("To");
        System.out.println(catcher);
        String catcher2 = notstring("NOT");
        System.out.println(catcher2);
        String catcher3 = notstring("NOT NO NO NO");
        System.out.println(catcher3);
        String catcher4 = notstring("12345y45");
        System.out.println(catcher4);
    }
   public static String notstring (String str)
   {
       String output;
       int length = str.length();
       if(length>=3)
       {
           String firstfour=str.substring(0,3);
           boolean isit = firstfour.equalsIgnoreCase("not");
           if(isit==true)
           {
               output=str;
           }
           else{
               output="not "+str;
           }
       }
       else{
           output="not "+str;
       }
       return output;
   }
}