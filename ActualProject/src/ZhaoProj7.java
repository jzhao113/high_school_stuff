public class ZhaoProj7
{
    public static void main (String[]args)
    {
        String Question1 ="badmaddad";
        System.out.println(Question1+" is "+ZhaoProj7.xadCount(Question1));
        
        String Question3="abcxyz",Question31="mnoxyzabc";
        System.out.println(Question3+" and "+Question31+" is "+ZhaoProj7.sameYN(Question3, Question31));
        
        String Question4="AbEEmgmEeodE";
        System.out.println(Question4+" is "+ZhaoProj7.evilE(Question4));
        
        String Question5="ILoveJava";
        System.out.println(Question5 +" is "+ZhaoProj7.encode(Question5));
        
        String Question6="vJvLIoeaa";
        System.out.println(Question6+" is "+ZhaoProj7.deCode(Question6));
        
        String Question7="rawrxxxrawrrawrawr";   
        System.out.println(Question7+" is "+ZhaoProj7.noRawr(Question7));
        
        String Question8="ab13234311313";
        System.out.println(Question8+" is "+ZhaoProj7.only13(Question8));
    }
    public String toString()
    {
        return "Jeffrey Zhao";
    }
    
    //1
    public static int xadCount(String str)
    {
        int output=0;
        if(str.length()<3)
        {
            output=0;
        }
        else
        {
            for(int a=0;a<str.length()-2;a++)
            {
                if(str.charAt(a)=='d'||str.charAt(a)=='b'||str.charAt(a)=='m')
                {
                    if(str.charAt(a+1)=='a'&&str.charAt(a+2)=='d')
                    {
                        output++;
                    }
                }
            }
        }
        return output;
    }
    
    //7
    public static String noRawr(String str)
    {
        String output="";
        str=str+"$$$";
        for(int a=0;a<str.length()-3;a++)
        {
            if(str.charAt(a)=='r'&&str.charAt(a+1)=='a'&&str.charAt(a+2)=='w'&&str.charAt(a+3)=='r')
            {
                a=a+3;
            }
            else
            {
                output=output+str.charAt(a);
            }
        }
        return output;
        
    }
    
    //4
    public static String evilE(String str)
    {
        String output="";
        str="$"+str+"$";
        for(int a=1;a<str.length()-1;a++)
        {
            if(str.charAt(a)!='E'&&str.charAt(a)!='e')
            {
                if(str.charAt(a+1)=='E'||str.charAt(a-1)=='E')
                {
                    output=output+" ";
                }
                else
                {
                    output=output+str.charAt(a);
                }
            }
            else
            {
                output=output+str.charAt(a);
            }
        }
        return output;
    }
    
    //8
    public static boolean only13(String number)
    {
        boolean output=true;
        number=number+"$";
        for(int a=0;a<number.length()-1;a++)
        {
            if(number.charAt(a)=='1'&&number.charAt(a+1)!='3')
            {
                output=false;
            }
        }
        return output;
    }
    
    //5
    public static String encode(String str)
    {
        String output="";
        for(int a=str.length()-2;a>-1;a=a-2)
        {
            output=output+str.charAt(a);
        }
        for(int a=0;a<str.length();a=a+2)
        {
            output=output+str.charAt(a);
        }
        return output;
    }
    
    //6
    public static String deCode(String str)
    {
        String output="",before="";
        int beg=0,end=str.length()-1;
        for(int a=str.length()-1;a>-1;a--)
        {
            if(a%2==0)
            {
                before=before+str.charAt(end);
                end--;
            }
            else
            {
                before=before+str.charAt(beg);
                beg++;
            }
        }
        for(int a=str.length()-1;a>-1;a--)
        {
            output=output+before.charAt(a);
        }
        return output;
    }
    
    //3
    public static String sameYN(String str1, String str2)
    {
        String output="";
        while(str1.length()<str2.length())
        {
            str1=str1+"$";
        }
        while(str2.length()<str1.length())
        {
            str2=str2+"$";
        }
        for(int a=0;a<=str1.length()-1;a++)
        {
            if(str1.charAt(a)==str2.charAt(a))
            {
                output=output+"y";
            }
            else
            {
                output=output+"n";
            }
        }
        return output;
    }
    
}