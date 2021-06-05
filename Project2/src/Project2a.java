import javax.swing.JOptionPane;
public class Project2a
{
    public static void main (String[]args)
    {
        String input = JOptionPane.showInputDialog("Enter a word");
        
        
        //1
        int positionOfColon = input.indexOf(":");
        System.out.println(positionOfColon);
        
        
        // http://www.pcwebopedia.com/index.html 
        // ftp://www.pcwebopedia.com/stuff.exe
        
        //2
        String protocal = input.substring(0, positionOfColon);
        System.out.println(protocal);
        
        
        //3
        int length = input.length();
        int positionOfDot= input.indexOf(".");
        int positionOfDotRe = positionOfDot+1;
        String restOfUrl = input.substring(positionOfDotRe, length);
        System.out.println(restOfUrl);
        
        //4
        
    }
}