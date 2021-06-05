public class ZhaoProj4
{
    public static void main (String[]args)
    {
       int firstq1= ZhaoProj4.maxOf3(2,2,3);
       System.out.println(firstq1);
       int firstq2= ZhaoProj4.maxOf3(3,2,2);
       System.out.println(firstq2);
       int firstq3= ZhaoProj4.maxOf3(3,2,3);
       System.out.println(firstq3);
       int firstq4 = ZhaoProj4.maxOf3(3,3,3);
       System.out.println(firstq4);
       int firstq5 = ZhaoProj4.maxOf3(-1,2,3);
       System.out.println(firstq5);
       
       boolean secondq1 = ZhaoProj4.lollipopParty(22,false);
       System.out.println(secondq1);
       boolean secondq2 = ZhaoProj4.lollipopParty(66,false);
       System.out.println(secondq2);
       boolean secondq3 = ZhaoProj4.lollipopParty(77,true);
       System.out.println(secondq3);
       boolean secondq4 = ZhaoProj4.lollipopParty(65,true);
       System.out.println(secondq4);
       boolean secondq5= ZhaoProj4.lollipopParty(10,false);
       System.out.println(secondq5);
       boolean secondq6= ZhaoProj4.lollipopParty(10,true);
       System.out.println(secondq6);
       
       boolean thirdq1 = ZhaoProj4.moreBy8(1,1,11);
       System.out.println("Start of the third "+thirdq1);
       boolean thirdq2 = ZhaoProj4.moreBy8(1,1,1);
       System.out.println(thirdq2);
       boolean thirdq3 = ZhaoProj4.moreBy8(1,2,3);
       System.out.println(thirdq3);
       boolean thirdq4 = ZhaoProj4.moreBy8(2,2,23);
       System.out.println(thirdq4);
       boolean thirdq5 = ZhaoProj4.moreBy8(1,1,9);
       System.out.println(thirdq5);
       boolean thirdq6 = ZhaoProj4.moreBy8(0,8,0);
       System.out.println(thirdq6);
       boolean thirdq7 = ZhaoProj4.moreBy8(8,0,0);
       System.out.println(thirdq7);
       boolean thirdq8 = ZhaoProj4.moreBy8(0,0,8);
       System.out.println(thirdq8);
       boolean thirdq9 = ZhaoProj4.moreBy8(8,8,8);
       System.out.println(thirdq9);
       
       String fourthq1 = ZhaoProj4.unEnd("fire");
       System.out.println(fourthq1);
       String fourthq2 = ZhaoProj4.unEnd("batman");
       System.out.println(fourthq2);
       String fourthq3 = ZhaoProj4.unEnd("function");
       System.out.println(fourthq3);
       String fourthq4 = ZhaoProj4.unEnd("unffofof^");
       System.out.println(fourthq4);
       String fourthq5 = ZhaoProj4.unEnd("thenn");
       System.out.println(fourthq5);
       
       boolean fifthq1 = ZhaoProj4.twiceAsFar(2,4,8);
       System.out.println(fifthq1);
       boolean fifthq2 = ZhaoProj4.twiceAsFar(4,6,0);
       System.out.println(fifthq2);
       boolean fifthq3 = ZhaoProj4.twiceAsFar(4,6,3);
       System.out.println(fifthq3);
       boolean fifthq4 = ZhaoProj4.twiceAsFar(1,5,4);
       System.out.println(fifthq4);
       boolean fifthq5 = ZhaoProj4.twiceAsFar(4,4,4);
       System.out.println(fifthq5);
       boolean fifthq6 = ZhaoProj4.twiceAsFar(4,4,4);
       System.out.println(fifthq6);
       boolean fifthq7 = ZhaoProj4.twiceAsFar(4,4,6);
       System.out.println(fifthq7);
       boolean fifthq8 = ZhaoProj4.twiceAsFar(0,4,6);
       System.out.println(fifthq8);
       
       int sixthq1= ZhaoProj4.diffNeighborSum(1,2,2);
       System.out.println(sixthq1);
       int sixthq2 = ZhaoProj4.diffNeighborSum(4,2,2);
       System.out.println(sixthq2);
       int sixthq3 = ZhaoProj4.diffNeighborSum(2,1,2);
       System.out.println(sixthq3);
       int sixthq4 = ZhaoProj4.diffNeighborSum(2,2,2);
       System.out.println(sixthq4);
       int sixthq5 = ZhaoProj4.diffNeighborSum(3,2,2);
       System.out.println(sixthq5);
       int sixthq6= ZhaoProj4.diffNeighborSum(1,2,3);
       System.out.println(sixthq6);
       int sixthq7 = ZhaoProj4.diffNeighborSum(3,21,1);
       System.out.println(sixthq7);
       
       String seventhq1=ZhaoProj4.middleOfAB("magic");
       System.out.println(seventhq1);
       String seventhq2=ZhaoProj4.middleOfAB("albqny");
       System.out.println(seventhq2);
       String seventhq3=ZhaoProj4.middleOfAB("vacbt");
       System.out.println(seventhq3);
       String seventhq4=ZhaoProj4.middleOfAB("bean");
       System.out.println(seventhq4);
       String seventhq5=ZhaoProj4.middleOfAB("iloveacb");
       System.out.println(seventhq5);
       String seventhq6=ZhaoProj4.middleOfAB("TheManIsaab");
       System.out.println(seventhq6);
       
       boolean eighthq1 = ZhaoProj4.canBuildFence(3,1,8);
       System.out.println(eighthq1);
       
       boolean ninthq1 = ZhaoProj4.aFarFromBm("batman");
       System.out.println(ninthq1);
       
       String tenthq1 = ZhaoProj4.evilE("eEeaaaaa");
       System.out.println(tenthq1);
       String tenthq2 = ZhaoProj4.evilE("aEa");
       System.out.println(tenthq2);
       
       int eleventhq1 = ZhaoProj4.mutiOf10Sum(111,111,true);
       System.out.println(eleventhq1);
    }
    public static int maxOf3 (int a, int b, int c)
    {
        int output;
        if((a>b&&a>c)||(a>c&&a>b))
        {
            output=a;
        }
        else if ((b>a&&b>c)||(b>c&&b>a))
        {
            output=b;
        }
        else{
            output=c;
        }
        return output;
    }
    public static boolean lollipopParty (int lollipop, boolean isNight)
    {
        boolean output;
        if(isNight==true)
        {
            if(lollipop<77)
            {
                output = true;
            }
            else{
                output=false;
            }
        }
        else{
            if(lollipop>=22&&lollipop<=66)
            {
                output = true;
            }
            else{
                output = false;
            }
        }
        return output;
    }
    public static boolean moreBy8(int a, int b, int c)
    {
        boolean output;
        if(a-b>=8||a-c>=8)
        {
            output=true;
        }
        else if (b-a>=8||b-c>=8)
        {
            output=true;
        }
        else if (c-a>=8||c-b>=8)
        {
            output=true;
        }
        else{
            output=false;
        }
        return output;
    }
    public static String unEnd(String str)
    {
        String output, edited;
        int length = str.length();
        char last = str.charAt(length-1);
        char secondlast = str.charAt(length-2);
        if(last=='n')
        {
            output=str;
            if(secondlast=='o')
            {
                output=str;
            }
            else{
                edited = str.substring(0,length-2)+"n";
                output=edited;
            }
        }
        else{
            if(secondlast=='o')
            {
                edited = str.substring(0,secondlast+1);
                output=edited;
            }
            else{
                edited = str.substring(0, length-2);
                output=edited;
            }
        }
        return output;
    }
    public static boolean twiceAsFar(int a, int b, int c)
    {
        boolean output;
        int small, medium, large;
        if((a>=b&&a>=c)||(a>=c&&a>=b))
        {
            large = a;
            if(b>=c)
            {
                medium = b;
                small = c;
            }
            else
            {
                medium =c;
                small=b;
            }
            int difference1 = Math.abs(medium-small);
            int difference2 = Math.abs(large-medium);
            int doubled1 = difference1*2;
            int doubled2 = difference2*2;
            if(difference1==doubled2)
            {
               output = true; 
            }
            else if(difference2==doubled1)
            {
               output = true; 
            }
            else
            {
                output = false;
            }
        }
        else if((b>=c&&b>=a)||(b>=a&&b>=c))
        {
            large = b;
            if(a>=c)
            {
                medium = a;
                small = c;
            }
            else
            {
                medium =c;
                small=a;
            }
            int difference1 = Math.abs(medium-small);
            int difference2 = Math.abs(large-medium);
            int doubled1 = difference1*2;
            int doubled2 = difference2*2;
            if(difference1==doubled2)
            {
               output = true; 
            }
            else if(difference2==doubled1)
            {
               output = true; 
            }
            else
            {
                output = false;
            }
        }
        else
        {
            large = c;
            if(b>=a)
            {
                medium = b;
                small = a;
            }
            else
            {
                medium =a;
                small=b;
            }
            int difference1 = Math.abs(medium-small);
            int difference2 = Math.abs(large-medium);
            int doubled1 = difference1*2;
            int doubled2 = difference2*2;
            if(difference1==doubled2)
            {
               output = true; 
            }
            else if(difference2==doubled1)
            {
               output = true; 
            }
            else
            {
                output = false;
            }
        }
       return output;
        
    }
    public static int diffNeighborSum(int a, int b, int c)
    {
        int output;
        if(a==b)
        {
            output=a;
        }
        else if(b==c)
        {
            output=a+b;
        }
        else{
            output=a+b+c;
        }
        return output;
    }
    public static String middleOfAB(String str)
    {
        String output;
        int a = str.indexOf('a');
        int b = str.indexOf('b');
        int length = str.length();
        if(a==2&&b==1)
        {
            char mid = str.charAt(1);
            String rest = str.substring(a+1);
            String all = mid+mid+mid+rest;
            output=all;
        }
        else if(b==2&&a==1)
        {
            char mid = str.charAt(1);
            String rest = str.substring(b+1);
            String all = mid+mid+mid+rest;
            output=all;
        }
        else if(a>=1&&b>a)
        {
              if(b==length-1&&a==length-3)
              {
                String firstpart = str.substring(0,a);
                char mid = str.charAt(length-2);
                String all = firstpart+mid+mid+mid;
                output=all;
                
              }
              else if(b-a!=2)
              {
                  output =str;
              }
              else{
                  String firstpart=str.substring(0,a);
                  char mid = str.charAt(a+1);
                  String secondpart=str.substring(b+1);
                  String all = firstpart+mid+mid+mid+secondpart;
                  output = all;
              }
              
        }
        else if(b>=1&&b<a)
        {
            if(a==length-1&&b==length-3)
              {
                String firstpart = str.substring(0,b);
                char mid = str.charAt(length-2);
                String all = firstpart+mid+mid+mid;
                output=all;
                
              }
             else if(b-a!=2)
              {
                  output =str;
              }
            else{
                  String firstpart=str.substring(0,b);
                  char mid = str.charAt(b+1);
                  String secondpart=str.substring(a+1);
                  String all = firstpart+mid+mid+mid+secondpart;
                  output=all;
              }
            
        }
        else if(b==0&&a==2)
        {
            char mid = str.charAt(1);
            String rest = str.substring(a+1);
            String all = ""+mid+mid+mid+rest;
            output=all;
        }
        else if(a==0&&b==2)
        {
            char mid = str.charAt(1);
            String rest = str.substring(b+1);
            String all = ""+mid+mid+mid+rest;
            output=all;
        }
        else{
            output=str;
        }
        return output;
    }
    public static boolean canBuildFence (int small, int big, int goal)
    {
        boolean output;
        int smallmod = small;
        int bigmod = big*5;
        if(smallmod+bigmod==goal)
        {
            output=true;
        }
        else
        {
            output=false;
        }
        return output;
    }
    public static boolean aFarFromBm(String str)
    {
        boolean output;
        int a = str.indexOf('a');
        int b = str.indexOf('b');
        int m = str.indexOf('m');
        int difference1 = Math.abs(a-b);
        int difference2 = Math.abs(a-m);
        if(difference1>=2&&difference2>=2)
        {
            output=true;
        }
        else
        {
            output = false;
        }
        return output;
    }
    public static String evilE (String str)
    {
        String output;
        int length = str.length();
        if(length>=2)
        {
            char FirstLetter = str.charAt(0);
            char SecondLetter = str.charAt(1);
            char SecondToLast = str.charAt(length-2);
            char LastLetter = str.charAt(length-1);
            int PosOfE=str.indexOf('E');
            if(FirstLetter=='E')
            {
                if(SecondLetter=='E'||SecondLetter=='e')
                {
                    output=str;
                }
                else{
                    String rest = str.substring(2);
                    String all = "E "+rest;
                    output=all;
                }
            }
            else if(LastLetter=='E')
            {
                if(SecondToLast=='E'||SecondToLast=='e')
                {
                    output=str;
                }
                else{
                    String rest = str.substring(0,length-2);
                    String all = rest+" E";
                    output=all;
                }
            }
            else if(PosOfE!=-1)
                {
                char AroundE2 = str.charAt(PosOfE+1);
                int AroundE2Index = str.indexOf(AroundE2);
                char AroundE1 = str.charAt(PosOfE-1);
                int AroundE1Index = str.indexOf(AroundE1);
                if(AroundE1=='e'||AroundE1=='E')
                {
                    if(AroundE2=='e'||AroundE2=='E')
                    {
                        output=str;
                    }
                    else{
                        String  firstpart = str.substring(0,PosOfE);
                        String secondpart = str.substring(PosOfE+2);
                        String all = firstpart+"E "+secondpart;
                        output =all;              
                    }
                }
                else
                {
                    if(AroundE2=='e'||AroundE2=='E')
                    {
                        String firstpart = str.substring(0,AroundE1Index);
                        String secondpart = str.substring(AroundE2Index);
                        String all = firstpart+" E"+secondpart;
                        output=all;
                    }
                    else{
                        String firstpart = str.substring(0,AroundE1Index);
                        String secondpart = str.substring(PosOfE+2);
                        String all =firstpart+" E "+secondpart;
                        output=all;
                    }
                }
         }
            else{
                output=str;
            }
        
     }
        else{
            output=str;
        }
        return output;
   }
    public static int mutiOf10Sum(int a, int b, boolean round)
    {
        int output;
        if(round==true)
        {
            int roundedA = a-(a%10);
            int roundedB = b-(b%10);
            int total = roundedA+roundedB;
            output=total;
        }
        else
        {
            int total = a+b;
            output=total;
        }
        return output;
    }
}