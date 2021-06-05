public class ZhaoProj5 
{
    public static void main (String[]args)
    {
        boolean one1 = ZhaoProj5.barkingTrouble(true,7);
        System.out.println(one1);
        int ticket10 = ZhaoProj5.ticket10(18,12,8);
        System.out.println(ticket10);
        String third1=ZhaoProj5.lonelyL("DEAL");
        System.out.println(third1);
        int fourth1 = ZhaoProj5.smallestDight(355);
        System.out.println(fourth1);
        int extra = ZhaoProj5.howManyBigFences(4,1,17);
        System.out.println(extra);
        int testing = ZhaoProj5.test1(85,false);
        System.out.println(testing);
        int testing2 = ZhaoProj5.test2(9,7);
        System.out.println(testing2);
        boolean testing3 = ZhaoProj5.testing3(12,66);
        System.out.println(testing3);
    }
    public static boolean barkingTrouble(boolean barking, int hour)
    {
        boolean output;
        if(hour<=6&&barking==true)
        {
            output=true;
        }
        else if(hour>=20&&barking==true)
        {
            output=true;
        }
        else
        {
            output=false;
        }
        return output;
    }
    public static int ticket10(int a, int b, int c)
    {
        int ab = a+b;
        int bc = b+c;
        int ac = a+c;
        int difference1 = ab-bc;
        int difference2 = ab-ac;
        int output;
        if(ab==10||bc==10||ac==10)
        {
            output=10;
        }
        else if(difference1==10||difference2==10)
        {
            output=5;
        }
        else
        {
            output=0;
        }
        return output;
    }
    public static String lonelyL(String str)
    {
        String output;
        int length = str.length();
        if(length>=0)
        {
            int firstLetter = str.charAt(0);
            int lastLetter = str.charAt(length-1);
            if(length==1)
            {
                output=str;
            }
            else if(length==2)
            {
                if(firstLetter=='L')
                {
                    if(lastLetter=='L')
                    {
                        output=str;
                    }
                    else
                    {
                        output="L ";
                    }
                }
                else
                {
                    if(lastLetter=='L')
                    {
                        output=" L";
                    }
                    else
                    {
                        output=str;
                    }
                }
            }
            else if(firstLetter=='L')
            {
                String firstpart = str.substring(1,length);
                output="L "+firstpart;
            }
            else if(lastLetter=='L')
            {
                String firstpart = str.substring(0,length-1);
                output=firstpart+" L";
            }
            else
            {
                int positionOfL=str.indexOf('L');
                char right = str.charAt(positionOfL+1);
                char left = str.charAt(positionOfL-1);
                if(right==' '&&left==' ')
                {
                    output=str;
                }
                else if(right==' ')
                {
                    String firstpart = str.substring(0,positionOfL);
                    String secondpart = str.substring(positionOfL,length);
                    output=firstpart+" "+secondpart;
                }
                else if(left==' ')
                {
                    String firstpart = str.substring(0,positionOfL+1);
                    String secondpart = str.substring(positionOfL+1,length);
                    output=firstpart+" "+secondpart;
                }
                else
                {
                    String firstpart = str.substring(0,positionOfL);
                    String secondpart = str.substring(positionOfL+1,length);
                    output=firstpart+" L "+secondpart;
                }
            }
        }
        else
        {
            output=str;
        }
        
        return output;
    }
    public static int smallestDight(int num)
    {
        int output;
        int cReal = num%10;
        int bWork = num/10;
        int bReal = bWork%10;
        int aReal = bWork/10;
        if((cReal<=bReal&&cReal<=aReal)||(cReal<=aReal&&cReal<=bReal))
        {
            output=cReal;
        }
        else if((bReal<=aReal&&bReal<=cReal)||(bReal<=cReal&&bReal<=aReal))
        {
            output=bReal;
        }
        else
        {
            output=aReal;
        }
        return output;
    }
    public static int howManyBigFences(int small, int big, int goal)
    {
       int output;
       int ones = goal%10; 
       int onesdivided = ones/5;  
       int smalldivided = small/5; 
       if(small==5)
       {
           int goalmod = goal%5;
           if(small>=goalmod)
           {
               goal = goal-goalmod;
               output=goal/5;
           }
           else
           {
               output=-1;
           }
       }
       else if(smalldivided>=1) 
       {
           int mutipled5 = smalldivided*5; 
           small = small-mutipled5; 
           goal = goal-mutipled5; 
           int goalmod = goal%5; 
           if(small>=goalmod) 
           {
               goal=goal-goalmod;
               output=goal/5;
           }
           else
           {
               output=-1;
           }    
       }
       else
       {
           //4 1 17 4 5 17
           if(small>=onesdivided)
           {
               goal=goal-onesdivided;
               if(big>=goal/5)
               {
                   output=goal/5;
               }
               else
               {
                   output=-1;
               }
           }
           else
           {
               output=-1;
           }
       }
       
       return output;
   }
    public static int test1 (int speed, boolean birth)
    {
        int output;
        if(birth==true)
        {
            speed = speed-5;
        }
        if(speed<=60)
        {
            output=0;
        }
        else if(speed>=61&&speed<=80)
        {
            output=1;
        }
        else
        {
            output=2;
        }
        return output;
    }
    public static int test2 (int b1, int b2)
    {
        int output;
        if(b1>=10&&b2>=10)
        {
            output=10;
        }
        else if(b1>=10&&b2<=10)
        {
            output=b2;
        }
        else if(b2>=10&&b1<=10)
        {
            output=b1;
        }
        else
        {
            if(b1>=b2)
            {
                output=b2;
            }
            else
            {
                output=b1;
            }
        }
        return output;
    }
    public static boolean testing3 (int a, int b)
    {
        boolean output;
        int ones1 = a%10;
        int ones2 = b%10;
        int tens1 = a/10;
        int tens2 = b/10;
        if(ones1==ones2||ones1==tens2)
        {
            output=true;
        }
        else if(tens1==ones2||tens1==tens2)
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
