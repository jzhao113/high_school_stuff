public class Test3{
    public static void main (String[]args){
        String str = "Blahh";
        boolean change = true;
        int length = str.length();
        if(length%2==1&&change==true){
            int middle = length/2;
            String first = str.substring(0,middle);
            String second = str.substring(middle,length);
            System.out.println(first+"X"+second);
        }
        else{
            System.out.println(str);
        }
    }
}