public class MathPractice
{
    public static void main (String[]args)
    {
        int a=13,b=30,c=15;
        double b2 = Math.pow(b,2),ac = 4*a*c, topish = Math.sqrt(b2-ac), doublea = 2*a,all = (-b+topish)/doublea;
        System.out.println(all);
    }
}