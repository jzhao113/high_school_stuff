public class Practice
{
    public static void main (String[]args)
    {
        String info = "Suriel/93390303003/100";
        int slash = info.indexOf("/");
        String name = info.substring(0, slash);
        System.out.println(name);
        int namelength =name.length(); 
        int namelengthaddone = namelength+1;
        int length = info.length();
        String rest = info.substring(namelengthaddone, length);
        int slash2 = rest.indexOf("/");
        int slash2real = slash2+namelengthaddone;
        String osis = info.substring(slash+1, slash2real);// Remember add plus 1 to get rid of first slash
        System.out.println(osis);
        String gpa = info.substring(slash2real+1,length);// Remember to add plus 1 to get rid of first slash
        System.out.println(gpa);
        
    }
}