import javax.swing.JOptionPane;
public class OldMan{
    public static void main (String[]args)
    {
        String[]options={"Yes","No"};
      JOptionPane.showMessageDialog(null,"You get a message ingame from an unknown source, with a link","Link",0,null);
        int open =JOptionPane.showOptionDialog(null,"Do you open the email?","Opening?",0,0,null,options,null);
        while (open!=0){
            open =JOptionPane.showOptionDialog(null,"Looks like you cannot say no.....","Opening?",0,0,null,options,null);
        }
        if (open==0){
            JOptionPane.showMessageDialog(null,"The email opens, and your screen turns blue","Opened",0,null);
            JOptionPane.showMessageDialog(null,"All of a sudden the world around you turns white, and beams of colors come at you. You question if you're dreaming. YOU BLACK OUT");
        }
        JOptionPane.showMessageDialog(null,".....","Wake",0,null);
        JOptionPane.showMessageDialog(null,"You wake up and see you're not open, but instead in an open field near a lake. Mountains surround you, it seems very peaceful","Waking up",0,null);
        int cabin = JOptionPane.showOptionDialog(null,"You see a cabin. Do you walk towards it?","Cabin",0,0,null,options,null);
        if (cabin==0){
            JOptionPane.showMessageDialog(null,"You walk towards the cabin and get there. You knock on the door but no one answers.","Knocking",0,null);
            JOptionPane.showMessageDialog(null,"You walk around scouting it,all of sudden you hear someone yelling.\"HEY WHAT ARE YOU DOING NEAR MY HOME\"","Yelling",0,null);
        }
        else{
            JOptionPane.showMessageDialog(null,"You walk away from the Cabin and towards the lake, You see an old man and walk towards him ","Lake",0,null);
            JOptionPane.showMessageDialog(null,"As you walk towards him the old man twitches and turns around,and yells \"WHAT DO YOU WANT CHILD\"","Confront",0,null);
        }
        String[]choices={"Where am I","Who are you?"};
        int choicess = JOptionPane.showOptionDialog(null,"You continue to walk towards him. You decide to ask him?","Choice",0,0,null,choices,null);
        if (choicess==0){
            
        }
        else if (choicess==1){
            
        }
        JOptionPane.showMessageDialog(null,"Your class is","Class",0,null);
          
    }
}