import javax.swing.JOptionPane;
public class Boss{
    public static void main (String[]args){
        
        
        
        String[]options3={}; //Put abilites in 
        int Monster3 = 800;
        int character=100; //PUT IN HP DEPENDING ON THE CHARACTER CLASS 
        
        JOptionPane.showMessageDialog(null,"This is the final boss it is at "+Monster3+" health","FINAL BOSS FIGHT",0,null);
        
        while(Monster3>0)
        { 
        int choice = JOptionPane.showOptionDialog(null,"What do you want to do","Move",0,0,null,options3,null);    
            if (choice==0)
            {
                Monster3 = Monster3-40;
            }
            else if (choice==1)
            {
                Monster3= Monster3-30;
            }
            if (Monster3<=0){
                break;
            }
            //Min + (int)(Math.random() * ((Max - Min) + 1))
            int damage = 40 + (int)(Math.random() * ((50 - 40) + 1));
            character = character-damage;
            JOptionPane.showMessageDialog(null,"The Final Boss attacks you back!","Boss attack",0,null);
            if (character>0){
                JOptionPane.showMessageDialog(null,"The Final Boss has done "+damage+" damage on you!"+" You're at "+character+" health.","Health",0,null);
                JOptionPane.showMessageDialog(null,"The Final Boss's health is at "+Monster3," HP",0,null);
            }
            else{
                JOptionPane.showMessageDialog(null,"GAME OVER, The FINAL BOSS has deafed you with "+Monster3+" health remaining!","Over",0,null);
                System.exit(1);
            }   
        }
        JOptionPane.showMessageDialog(null,"You have defeated the FINAL BOSS.","WINNER",0,null);
        JOptionPane.showMessageDialog(null,"It is finally over you get to go home","WINNER",0,null);
        JOptionPane.showMessageDialog(null,"Thank you for playing","Thanks",0,null);
    }
}