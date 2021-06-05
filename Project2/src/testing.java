import javax.swing.JOptionPane;
public class testing
{
    public static void main (String[]args)
    {
           boolean sleep;
           String[]options={"yes","no"};
           int lovelysleep = JOptionPane.showOptionDialog(null,"Did you have a good night's sleep?","Good Sleep?",0,0,null,options,null);
           //If and else statements that differ depending on choice of user
           if (lovelysleep==0){
               JOptionPane.showMessageDialog(null,"Thats nice to hear. David called earlier today looking for you. You should call him back. ","Call",0,null);
               sleep = true;
           }
           else if (lovelysleep==1){
               JOptionPane.showMessageDialog(null,"I'm sorry to hear that. David called earlier today looking for you. You should call him back","Call",0,null);
               sleep = false;
               System.out.println(sleep);
           }
    }
}