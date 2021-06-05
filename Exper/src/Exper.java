import javax.swing.JOptionPane;
public class Exper
{
    public static void main (String[]args)
    {
        String[]options={"Yes","No"};
        int party = JOptionPane.showOptionDialog(null,"You recieve a party invite from David. Do you accept?","Party invite",0,0,null,options,null);
        Exper2 obj1 = new Exper2();
        obj1.setx(true);
                   if (party==0){
                       JOptionPane.showMessageDialog(null,"David is happy you join his party, and starts up talking to you.","Party",0,null);
                       int hear = JOptionPane.showOptionDialog(null,"Did you hear about the new endgame move Starburst Stream?","New Move",0,0,null,options,null);
                       if(hear==0){
                           JOptionPane.showMessageDialog(null,"Isnt it cool? I heard they also had another move called The Eclipse if you go Grass Plains then Forest.","Hinted",0,null);
                           JOptionPane.showMessageDialog(null,"Alright,enough with the talking lets start the queue!","Hint Missed",0,null);
                       }
                       else{
                           JOptionPane.showMessageDialog(null,"Oh. Its a move that does 300 DMG in one hit. You get it if you go through Cave then Lavapit","Hinted",0,null);
                           int another = JOptionPane.showOptionDialog(null,"Do you want to hear about another move?","Another Hint",0,0,null,options,null);
                           if(another==0){
                               JOptionPane.showMessageDialog(null,"There is another move they added called The Eclipse. It does 200 DMG and heals 50 HP. You learn it from going through Grass Plains and Lake.","Hinted",0,null);
                           }
                           else{
                               JOptionPane.showMessageDialog(null,"Oh ok. Lets just start the queue then!","Hint Missed",0,null);
                           }
                       }
                   }
                   else{
                       obj1.setx(false);
                       JOptionPane.showMessageDialog(null,"David messages you in confusion on your decline, but you ignore, and start up the queue","What?",0,null);
                   }
                   if(obj1.getx()==true){
                       System.out.println("Its true");
                   }
                   else{
                       System.out.println("Its false");
                   }
               }
}
