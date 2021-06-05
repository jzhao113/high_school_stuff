public class Review
{
    public static void main(String[]args)
    {
        int a=20;
        double b=2.312;
        double d = a*b;
        String c = "3162";
        String all = c+d;
        System.out.println(all);
        
        String carinfo = "22:G:G";
        int colon1 = carinfo.indexOf(":"); //01234
        String year = carinfo.substring(0,colon1);//Does not include colon1
        System.out.println(year);
        
        int lengthyear = year.length();//In length is 4 which goes up to :
        int length = carinfo.length();//
        String rest = carinfo.substring(lengthyear+1, length);//GTR:PathFinder
        int colon2 = rest.indexOf(":");//Position is 3
        int colon2re = colon2+lengthyear;//4+3
        String brand = carinfo.substring(colon1+1,colon2re+1);//Colon1 needs to add 1 to get rid of :, Colon2re needs to add one to get to colon
        System.out.println(brand);
        
        String model = carinfo.substring(colon2re+2, length);//Needs to add 2 to get to the P
        System.out.println(model);
        
        //Weird math
        
        
        
        
        
        
        
       
    }
}