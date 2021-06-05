import javax.swing.JOptionPane;
public class MonsterExper{
    public static void main (String[]args){
        
        
        
        String[]options={"Super Tackle(40 DMG)","Tackle(30 DMG)"};
        int Monster = 100;
        int character = 100;
        
        JOptionPane.showMessageDialog(null,"You encountered a monster that is at 100 health","Monster encounter",0,null);
        
        while(Monster>0)
        { 
        int choice = JOptionPane.showOptionDialog(null,"What do you want to do","Move",0,0,null,options,null);    
            if (choice==0)
            {
                Monster = Monster-40;
            }
            else if (choice==1)
            {
                Monster= Monster-30;
            }
            if (Monster<=0){
                break;
            }
            //Min + (int)(Math.random() * ((Max - Min) + 1))
            int damage = 10 + (int)(Math.random() * ((30 - 10) + 1));
            character = character-damage;
            JOptionPane.showMessageDialog(null,"The Monster attacks you back!","Monster attack",0,null);
            if (character>0){
                JOptionPane.showMessageDialog(null,"The monster has done "+damage+" damage on you!"+" You're at "+character+" health.","Health",0,null);
                JOptionPane.showMessageDialog(null,"The monster's health is at "+Monster,"Monster health",0,null);
            }
            else{
                JOptionPane.showMessageDialog(null,"GAME OVER, The monster has defeated you with "+Monster+" health remaining!","Over",0,null);
                System.exit(1);
            }   
        }
        JOptionPane.showMessageDialog(null,"You have defeated the monster.","WINNER",0,null);
    }
}