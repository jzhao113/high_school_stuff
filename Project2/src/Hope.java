import javax.swing.JOptionPane;
public class Hope
{
    public static void main (String[]args)
    {
        String input1 = JOptionPane.showInputDialog("Input your first number");
        String input2 = JOptionPane.showInputDialog("Input your second number");
        String input3 = JOptionPane.showInputDialog("Do you want to add,subtract,mutiple or divide");
        
        int num1 = Integer.parseInt(input1);
        int num2 = Integer.parseInt(input2);
        
        if (input3.equals("add")){
            int add = num1+num2;
            System.out.println(add);    
        }
        else if (input3.equals("substract")){
            
        }
    }
}