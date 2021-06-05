public class Practice3
{
    public static void main (String[]args)
    {
        String info="Apple->Iphone->6S";
        int line = info.indexOf("-");
        String brand = info.substring(0, line);
        System.out.println(brand);
        int brandlength = brand.length();
        int brandlengthadd = brandlength+2;
        int length = info.length();
        String rest = info.substring(brandlengthadd, length);
        int line2 = rest.indexOf("-");
        int line2real = line2+brandlengthadd;
        int arrow = info.indexOf(">");
        String phone = info.substring(arrow+1,line2real);
        System.out.println(phone);
        int arrow2 = rest.indexOf(">");
        int arrow2real = arrow2+brandlengthadd;
        String model = info.substring(arrow2real+1, length);
        System.out.println(model);
        
    }
}