public class Franc
{
    public static void main (String[]args)
    {
        int a=5;
        int total1 = Franc.sumOfDigitsUntil(a);
        System.out.println(a+" is "+total1);
        
        String b="HI";
        int c=1;
        String total2=Franc.stringTimes(b,c);
        System.out.println(b+","+c+" is "+total2);
        
        String d="C";
        int e=3;
        String total3= Franc.frontTimes(d,e);
        System.out.println(d+","+e+" is "+total3);
        
        String f="HIHIHI";
        String total4=Franc.stringBits(f);
        System.out.println(f+" is "+total4);
        
        String g="HELLO";
        String total5=Franc.doubleChar(g);
        System.out.println(g+" is "+total5);
        
        String h="XTXTXTHEXXX";
        String total6=Franc.removeXs(h);
        System.out.println(h+" is "+total6);
        
        String i="supsupsupxsup";
        int total7 =Franc.countSup(i);
        System.out.println(i+" is "+total7);
        
        String j="dogcat";
        boolean total8=Franc.catDog(j);
        System.out.println(j+" is "+total8);
        
        String k="cooe";
        int total9=Franc.countCode(k);
        System.out.println(k+" is "+total9);
        
        String l="Jessica";
        String total10=Franc.reflect(l);
        System.out.println(l+" is "+total10);
        
        String m="xggxggxgg";
        boolean total11=Franc.gHappy(m);
        System.out.println(m+" is "+total11);
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
        if(str.length()<3)
        {
            output=0;
        }
        else
        {
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
        }
        return output;
    }
    public static boolean catDog(String str) 
    {
        boolean output=false;
        int dog=0,cat=0;
        if(str.length()<3)
        {
            output=false;
        }
        else
        {
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
        }
        return output;
    }
    public static int countCode(String str) 
    {
        int output=0;
        if(str.length()<4)
        {
            output=0;
        }
        else
        {
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
        }
        return output;

    }
    public static String reflect(String str)
    {
        String output="";
        for(int a=str.length()-1;a>-1;a--)
        {
            output=output+str.charAt(a);
        }
        return output;

    }
    public static boolean gHappy(String str)
    {
        boolean output=false;
        int nope=0;
        if(str.length()<2)
        {
            nope=0;
        }
        else
        {
            for(int a=0;a<str.length();a++)
            {
                if(str.charAt(a)=='g')
                {
                    if(a==str.length()-1&&str.charAt(str.length()-1)=='g')
                    {
                            if(str.charAt(str.length()-2)=='g')
                            {
                                nope=nope+1;
                            }
                            else
                            {
                                nope=0;
                            }
                    }
                    else if(str.charAt(a+1)=='g')
                    {
                        nope=nope+1;
                        a++;
                    }
                    else
                    {
                        nope=0;
                        a=str.length();
                    }
                }
                else
                {
                    nope=nope;
                }
            }
        }
        if(nope>0)
        {
            output=true;
        }
        else
        {
            output=false;
        }
        return output;
    }


    
    




}