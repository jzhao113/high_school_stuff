public class Franc
{
    public static void main (String[]args)
    {
        int total = Franc.sumOfDigitsUntil(5);
        System.out.println(total);
        String total1=Franc.stringTimes("HI",1);
        System.out.println(total1);
        String total2= Franc.frontTimes("C",3);
        System.out.println(total2);
        String total3=Franc.stringBits("HIHIHI");
        System.out.println(total3);
        String total4=Franc.doubleChar("HELLO");
        System.out.println(total4);
        String total5=Franc.removeXs("XTXTXTHEXXX");
        System.out.println(total5);
        int total6 =Franc.countSup("AsupAsupsup");
        System.out.println(total6);
        boolean total7=Franc.catDog("dogcatcat");
        System.out.println(total7);
        int total8=Franc.countCode("xx");
        System.out.println(total8);
    }
    public static int sumOfDigitsUntil(int max)
    {
        int output=0;
	for(int a=1;a<=max;a++)
        {
            output=output+a;
        }
        return output;
    }
    public static String stringTimes(String str, int n) 
    {
        String output="";
        for(int a=0;a<n;a++)
        {
            output=output+str;
        }
        return output;
    }
    public static String frontTimes(String str, int n) 
    {
        String output="";
        int length = str.length();
        if(length<=3)
        {
            String prints = str.substring(0,length);
            for(int a=1;a<=n;a++)
            {
                output =output+prints;
            }
        }
        else
        {
            String prints = str.substring(0,3);
            for(int a=1;a<=n;a++)
            {
                output =output+prints;
            }
        }
        return output;
    }
    public static String stringBits(String str) 
    {
        String output="";
        for(int a=0;a<str.length();a=a+2)
        {
            output=output+str.charAt(a);
        }
        return output;
  
    }
    public static String doubleChar(String str) 
    {
        String output="";
        int length = str.length();
        for(int a=0;a<length;a++)
        {
            output=output+str.charAt(a)+str.charAt(a);
        }
        return output;
        
    }
    public static String removeXs(String str) 
    {
	String output="";
        for(int a=0;a<str.length();a++)
        {
            if(str.charAt(a)=='x'||str.charAt(a)=='X')
            {
                output=output;
            }
            else
            {
                output=output+str.charAt(a);
            }
        }
        return output;
        
    }
    public static int countSup(String str) 
    {
        int output=0;
        for(int a=0;a<str.length();a++)
        {
            if(str.charAt(a)=='s')
            {
                if(str.charAt(a+1)=='u')
                {
                    if(str.charAt(a+2)=='p')
                    {
                        output=output+1;
                    }
                    else
                    {
                        output=output;
                    }
                }
                else
                {
                    output=output;
                }
            }
            else
            {
                output=output;
            }
        }
        return output;
    }
    public static boolean catDog(String str) 
    {
        boolean output=false;
        int dog=0,cat=0;
        for(int a=0;a<str.length();a++)
        {
            if(str.charAt(a)=='d')
            {
                if(str.charAt(a+1)=='o')
                {
                    if(str.charAt(a+2)=='g')
                    {
                        dog=dog+1;
                    }
                    else
                    {
                        dog=dog;
                    }
                }
                else
                {
                    dog=dog;
                }
            }
            else
            {
                dog=dog;
            }
        }
        for(int a=0;a<str.length();a++)
        {
            if(str.charAt(a)=='c')
            {
                if(str.charAt(a+1)=='a')
                {
                    if(str.charAt(a+2)=='t')
                    {
                        cat=cat+1;
                    }
                    else
                    {
                        cat=cat;
                    }
                }
                else
                {
                    cat=cat;
                }
            }
            else
            {
                cat=cat;
            }
        }
        if(dog==cat)
        {
            output=true;
        }
        else
        {
            output=false;
        }
        return output;

    }
    public static int countCode(String str) 
    {
        int output=0;
        for(int a=0;a<str.length();a++)
        {
            if(str.charAt(a)=='c')
            {
                if(str.charAt(a+1)=='o')
                {
                    if(str.charAt(a+3)=='e')
                    {
                        output=output+1;
                    }
                    else
                    {
                        output=output;
                    }
                }
                else
                {
                    output=output;
                }
            }
        }
        return output;

   }
}