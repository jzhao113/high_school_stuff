public class Test3a{
    public static void main (String[]args){
        String str = "blah";
        char firstletter = str.charAt(0);
        int firstA = str.indexOf("a");
        if(firstletter=='a'||firstletter=='A'){
            System.out.println("The first letter is A");
        }
        else if (firstA/3==0){
            System.out.println("The A is a mutiple of 3");
        }
        else{
            System.out.println("There is no A at index of 0, and no A that is a mutiple of 3");
        }
        
        
    }
}