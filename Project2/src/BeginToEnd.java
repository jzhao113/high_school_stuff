import javax.swing.JOptionPane;
public class BeginToEnd
{
    public static void main (String[]args)
    {
        String input = JOptionPane.showInputDialog("Enter a word");
        
        char first = input.charAt(0);
        String rest = input.substring(1);
        String output = rest+first;
        System.out.println(input+ " becomes "+output);
        
        int length = input.length();
        int actual = length-1;
        String rest2 = input.substring(0,actual);
        char last = input.charAt(actual);
        System.out.println(last+rest2);
       
        char firstone = input.charAt(0);
        int lastonere = length-1;
        char lastone = input.charAt(lastonere);
        String rest3 = input.substring(1, lastonere);
        System.out.println(lastone+rest3+firstone);
        
        char first1 = input.charAt(lastonere-1);
        char second = input.charAt(lastonere);
        String both = first1+""+second;
        System.out.println(both+both+both);
        
        
          
    }
}