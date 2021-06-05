import javax.swing.JOptionPane;
public class Grades
{
    public static void main (String[]args)
    {
        String input1 = JOptionPane.showInputDialog("What is your grade");
        int grade = Integer.parseInt(input1);
        String actualgrade = null;
        
        if(grade>=90){
            actualgrade = "A-";
            if(grade>=100)
            {
                actualgrade = "A+";
            }
            else if (grade>=93){
                actualgrade = "A";
            }
        }
        else if(grade>=80){
            actualgrade = "B-";
            if (grade>=87){
                actualgrade = "B+";
            }
            else if (grade>=83){
                actualgrade = "B";
            }
          }
        else if(grade>=70){
            actualgrade = "C-";
            if(grade>=77){
                actualgrade = "C+";
            }
            else if (grade>=73){
                actualgrade = "C";
            }
        }
        else if (grade>=65){
            actualgrade = "D";
        }
        else if (grade>=0){
            actualgrade = "F";
        }
        else{
            System.out.println("Your grade was so bad it was negative");
        }
        System.out.println(actualgrade);
        
    }
}