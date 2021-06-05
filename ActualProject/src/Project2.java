import javax.swing.JOptionPane;
public class Project2
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
        int positionOfSlash =restOfUrl.indexOf("/");
        String lengthbe = input.substring(0,positionOfDot);
        int lengthof = lengthbe.length();
        int lengthof2 = lengthof+1;
        int between = positionOfSlash+lengthof2;
        String domainName = input.substring(positionOfDotRe,between);
        System.out.println(domainName);
        System.out.println(positionOfSlash);
        
        //5
        String fileName = input.substring(between+1,length);
        System.out.println(fileName);
        
        //6
        int filenamelength = fileName.length();
        System.out.println(filenamelength);
        
        //7
        int filenamelengthre = filenamelength-1;
        char firstletter = fileName.charAt(0);
        char lastletter = fileName.charAt(filenamelengthre);
        System.out.println(firstletter+""+lastletter);
        
        //8
        String month = "September";
        String day = "29";
        String year = "2008";
        System.out.println("The date is "+month+" "+29+", "+year);
        System.out.println("The month is "+month);
        System.out.println("The day is "+day);
        System.out.println("The year is "+year);
        
    }
}