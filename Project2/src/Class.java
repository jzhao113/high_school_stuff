import javax.swing.JOptionPane;
public class Class{
    public static void main (String[]args){ 
        
        String nickanme = JOptionPane.showInputDialog("What do you want me to call you?");
        
        //Explaining DPS Class FEMALE
        JOptionPane.showMessageDialog(null,"The DPS Class does more damage","DPS Class",0,null);
        
        //Explaining Tank Class MALE
        JOptionPane.showMessageDialog(null,"The Tank Class has more health","Tank Class",0,null);
        
        //Declaring array for classes
        String[]classes = {"DPS","Tank"};
        
        //Giving user the choice to pick class, affects future boss characters.
        int pickedclass = JOptionPane.showOptionDialog(null,"Which class do you want to pick?","Picking Class?",0,0,null,classes,null);
        
        //DPS CLASS CHOICE ROUTE
        if (pickedclass==0){
            JOptionPane.showMessageDialog(null,"Ah I see you picked the DPS class. You shall not go alone, I will come with you as your healer","DPS",0,null);
            JOptionPane.showMessageDialog(null,"You set off your on your adventure","Adventure",0,null);
            String[]twoareas ={"Cave","Grass Plain"};
            int area1 = JOptionPane.showOptionDialog(null,"You encounter a cross road, where do you want to go?","Where do go",0,0,null,twoareas,null);
            int really = JOptionPane.showConfirmDialog(null,"Are you sure?","Really?",0,0,null);
            while (really!=0){
            area1 = JOptionPane.showOptionDialog(null,"You encounter a cross road, where do you want to go?","Where do go",0,0,null,twoareas,null);
            really = JOptionPane.showConfirmDialog(null,"Are you sure?","Really?",0,0,null);
            }
            //CHOICE IS TO CAVE (DPS)
            if(area1==0){
                JOptionPane.showMessageDialog(null,"You and the old man walk into the cave","Cave",0,null);
                 JOptionPane.showMessageDialog(null,"All of a sudden a monster appears, and you ready your weapon!","Cave",0,null);
                 String[]options={"Shocking Tailor (60 DMG)","Repeated (80 DMG)"};
            int Monster = 200;
            int character = 100;
        
            JOptionPane.showMessageDialog(null,"You encountered a monster that is at "+Monster+" health","Monster encounter",0,null);
        
             while(Monster>0)
            { 
            int choice = JOptionPane.showOptionDialog(null,"What do you want to do","Move",0,0,null,options,null);    
            if (choice==0)
            {
                Monster = Monster-60;
            }
            else if (choice==1)
            {
                Monster= Monster-80;
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
                JOptionPane.showMessageDialog(null,"You have learned a new ability \"Stunted Hit\", deals 120 DP","New ability",0,null);
                JOptionPane.showMessageDialog(null,"The old man restores you back to full health","Health",0,null);
                
                
                //NEW ROUTES (DPS,CAVE)
                String[]twoareas2 ={"Mountian","Lava Pit"};
                int area2 = JOptionPane.showOptionDialog(null,"You encounter a cross road, where do you want to go?","Where do go",0,0,null,twoareas2,null);
                int really2= JOptionPane.showConfirmDialog(null,"Are you sure?","Really?",0,0,null);
                while (really2!=0){
                area2 = JOptionPane.showOptionDialog(null,"You encounter a cross road, where do you want to go?","Where do go",0,0,null,twoareas2,null);
                really2 = JOptionPane.showConfirmDialog(null,"Are you sure?","Really?",0,0,null);
                }
                
                // CHOICE MOUNTIAN DPS
                 if (area2==0){
                JOptionPane.showMessageDialog(null,"You and the old man walk into the Mountian","Mountian",0,null);
                JOptionPane.showMessageDialog(null,"All of a sudden a monster appears, and you ready your weapon!","Lake",0,null);
                String[]options2={"Shocking Tailor (60 DMG)","Repeated (80 DMG)","Stunted Hit(120 DMG)"};
                int Monster2 = 300;
                character = 100;
                JOptionPane.showMessageDialog(null,"You encountered a monster that is at 100 health","Monster encounter",0,null);
        
                while(Monster2>0)
                { 
                int choice = JOptionPane.showOptionDialog(null,"What do you want to do","Move",0,0,null,options2,null);    
                if (choice==0)
                {
                    Monster2 = Monster2-60;
                }
                else if (choice==1)
                {
                    Monster2= Monster2-80;
                }
                else if (choice==2){
                    Monster2 = Monster2-120;
                }
                if (Monster2<=0){
                    break;
                }
                //Min + (int)(Math.random() * ((Max - Min) + 1))
                int damage = 10 + (int)(Math.random() * ((30 - 10) + 1));
                character = character-damage;
                JOptionPane.showMessageDialog(null,"The Monster attacks you back!","Monster attack",0,null);
                if (character>0){
                JOptionPane.showMessageDialog(null,"The monster has done "+damage+" damage on you!"+" You're at "+character+" health.","Health",0,null);
                JOptionPane.showMessageDialog(null,"The monster's health is at "+Monster2,"Monster health",0,null);
                }
                else{
                    JOptionPane.showMessageDialog(null,"GAME OVER, The monster has defeated you with "+Monster2+" health remaining!","Over",0,null);
                    System.exit(1);
                    }   
                }
                    JOptionPane.showMessageDialog(null,"You have defeated the monster.","WINNER",0,null);
                    JOptionPane.showMessageDialog(null,"You gained an extra 20 HP to your max HP","New ability",0,null); //PUT IN ABILITY 
                    JOptionPane.showMessageDialog(null,"The old man restores you back to full health","Health",0,null);
                    //BOSS FIGHT AFTER THIS CODE
                }
                 



                //LAVA PIT DPS  
                else if (area2==1){
                JOptionPane.showMessageDialog(null,"You and the old man walk into the Lava Pit","Lava Pit",0,null);
                JOptionPane.showMessageDialog(null,"You encountered a monster that is at 100 health","Monster encounter",0,null);
                
                int Monster2 = 300;
                String[]options2={"Shocking Tailor (60 DMG)","Repeated (80 DMG)","Stunted Hit(120 DMG)"};
                character = 100;
                while(Monster2>0)
                { 
                int choice = JOptionPane.showOptionDialog(null,"What do you want to do","Move",0,0,null,options2,null);    
                if (choice==0)
                {
                Monster2 = Monster2-60;
                }
                else if (choice==1)
                {
                Monster2= Monster2-80;
                }
                else if (choice==2){
                    Monster2 = Monster2-120;
                }
                if (Monster2<=0){
                break;
                }
                //Min + (int)(Math.random() * ((Max - Min) + 1))
                 int damage = 10 + (int)(Math.random() * ((30 - 10) + 1));
                character = character-damage;
                JOptionPane.showMessageDialog(null,"The Monster attacks you back!","Monster attack",0,null);
                if (character>0){
                JOptionPane.showMessageDialog(null,"The monster has done "+damage+" damage on you!"+" You're at "+character+" health.","Health",0,null);
                JOptionPane.showMessageDialog(null,"The monster's health is at "+Monster2,"Monster health",0,null);
                }
                else{
                JOptionPane.showMessageDialog(null,"GAME OVER, The monster has defeated you with "+Monster2+" health remaining!","Over",0,null);
                System.exit(1);
                }   
            }
                JOptionPane.showMessageDialog(null,"You have defeated the monster.","WINNER",0,null);
                JOptionPane.showMessageDialog(null,"You learned \"Pot heal\". This ability allows you to heal 10 HP","New",0,null); //PUT IN ABILITY 
                JOptionPane.showMessageDialog(null,"This ability also allows for overheal over max HP, but does not stay with you after the battle","New",0,null);
                JOptionPane.showMessageDialog(null,"The old man restores you back to full health","Health",0,null);
                //BOSS FIGHT CODE AFTER THIS 
                 }
          }
            
            
            
           
            




            //CHOICE IS TO GRASS PLAINS  DPS
            else if (area1==1){
                 JOptionPane.showMessageDialog(null,"You and the old man walk towards the grass plains ","Grass Plains",0,null);
                 JOptionPane.showMessageDialog(null,"All of a sudden a monster appears, and you ready your weapon!","Grass Plains",0,null);
                 String[]options={"Shocking Tailor (60 DMG)","Repeated (80 DMG)"};
            int Monster = 200;
            int character = 100;
        
            JOptionPane.showMessageDialog(null,"You encountered a monster that is at 100 health","Monster encounter",0,null);
        
             while(Monster>0)
            { 
            int choice = JOptionPane.showOptionDialog(null,"What do you want to do","Move",0,0,null,options,null);    
            if (choice==0)
            {
                Monster = Monster-60;
            }
            else if (choice==1)
            {
                Monster= Monster-80;
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
                JOptionPane.showMessageDialog(null,"You learned a new ability \"Giga Drain\"","New Ability",0,null);
                JOptionPane.showMessageDialog(null,"This ability allows you attack and heal yourself wiht the DMG you do to the monster. Does 40 DMG, Heal 40 HP","New Ability",0,null);
                JOptionPane.showMessageDialog(null,"The old man restores you back to full health","Health",0,null);
                JOptionPane.showMessageDialog(null,"This ability also allows for overheal during battle above max Hp, but does not stay after the battle","New Ability",0,null);
                
                //NEW ROUTES
                String[]twoareas2 ={"Lake","Forest"};
                int area2 = JOptionPane.showOptionDialog(null,"You encounter a cross road, where do you want to go?","Where do go",0,0,null,twoareas2,null);
                int really2= JOptionPane.showConfirmDialog(null,"Are you sure?","Really?",0,0,null);
                while (really2!=0){
                area2 = JOptionPane.showOptionDialog(null,"You encounter a cross road, where do you want to go?","Where do go",0,0,null,twoareas2,null);
                really2 = JOptionPane.showConfirmDialog(null,"Are you sure?","Really?",0,0,null);
                }
                
                //LAKE CHOICE DPS
                 if (area2==0){
                     JOptionPane.showMessageDialog(null,"You and the old man walk into the Lake","Lake",0,null);
                 JOptionPane.showMessageDialog(null,"All of a sudden a monster appears, and you ready your weapon!","Lake",0,null);
                String[]options2={"Shocking Tailor (60 DMG)","Repeated (80 DMG)","Giga Drain(40 DMG,40 Healing"};
                int Monster2 = 300;
                character = 100;
                JOptionPane.showMessageDialog(null,"You encountered a monster that is at 100 health","Monster encounter",0,null);
        
                while(Monster2>0)
                { 
                int choice = JOptionPane.showOptionDialog(null,"What do you want to do","Move",0,0,null,options2,null);    
                if (choice==0)
                {
                    Monster2 = Monster2-60;
                }
                else if (choice==1)
                {
                    Monster2= Monster2-80;
                }
                else if (choice==2){
                    Monster2 = Monster2-40;
                    character = character+40;
                }
                if (Monster2<=0){
                    break;
                }
                //Min + (int)(Math.random() * ((Max - Min) + 1))
                int damage = 10 + (int)(Math.random() * ((30 - 10) + 1));
                character = character-damage;
                JOptionPane.showMessageDialog(null,"The Monster attacks you back!","Monster attack",0,null);
                if (character>0){
                JOptionPane.showMessageDialog(null,"The monster has done "+damage+" damage on you!"+" You're at "+character+" health.","Health",0,null);
                JOptionPane.showMessageDialog(null,"The monster's health is at "+Monster2,"Monster health",0,null);
                }
                else{
                    JOptionPane.showMessageDialog(null,"GAME OVER, The monster has defeated you with "+Monster2+" health remaining!","Over",0,null);
                    System.exit(1);
                    }   
                }
                    JOptionPane.showMessageDialog(null,"You have defeated the monster.","WINNER",0,null);
                    JOptionPane.showMessageDialog(null,"You have learned \"Dueling Swords\". Does 90 DMG","New ability",0,null); //PUT IN ABILITY 
                    JOptionPane.showMessageDialog(null,"The old man restores you back to full health","Health",0,null);
                    //BOSS FIGHT CODE AFTER THIS
                     
                }
                 



                //FOREST CHOICE DPS
                else if (area2==1){
                JOptionPane.showMessageDialog(null,"You and the old man walk into the Lava Pool","Lava Pool",0,null);
                String[]options2={"Shocking Tailor (60 DMG)","Repeated (80 DMG)","Giga Drain(40 DMG,40 Healing"};
                int Monster2 = 300;
                JOptionPane.showMessageDialog(null,"You encountered a monster that is at "+Monster2+" health","Monster encounter",0,null);
                character = 100;
                while(Monster2>0)
                { 
                int choice = JOptionPane.showOptionDialog(null,"What do you want to do","Move",0,0,null,options2,null);    
                if (choice==0)
                {
                Monster2 = Monster2-40;
                }
                else if (choice==1)
                {
                Monster2= Monster2-30;
                }
                else if (choice==2){
                    Monster2= Monster2-40;
                    character = character+40;
                }
                if (Monster2<=0){
                break;
                }
                //Min + (int)(Math.random() * ((Max - Min) + 1))
                 int damage = 10 + (int)(Math.random() * ((30 - 10) + 1));
                character = character-damage;
                JOptionPane.showMessageDialog(null,"The Monster attacks you back!","Monster attack",0,null);
                if (character>0){
                JOptionPane.showMessageDialog(null,"The monster has done "+damage+" damage on you!"+" You're at "+character+" health.","Health",0,null);
                JOptionPane.showMessageDialog(null,"The monster's health is at "+Monster2,"Monster health",0,null);
                }
                else{
                JOptionPane.showMessageDialog(null,"GAME OVER, The monster has defeated you with "+Monster2+" health remaining!","Over",0,null);
                System.exit(1);
                }   
            }
                JOptionPane.showMessageDialog(null,"You have defeated the monster.","WINNER",0,null);
                JOptionPane.showMessageDialog(null,"You learned a new ability \"Sesmic Toss\". Deals 150 DMG but hurts player by 50 HP","New",0,null); //PUT IN ABILITY 
                JOptionPane.showMessageDialog(null,"The old man restores you back to full health","Health",0,null);
                //BOSS FIGHT CODE AFTER THIS
              }
                
            }
         }
        else if (pickedclass==1){
            JOptionPane.showMessageDialog(null,"Ah I see you picked the Tank class. You shall not go alone, I will come with you as your healer","DPS Class",0,null);
            JOptionPane.showMessageDialog(null,"You set off your on your adventure","Adventure",0,null);
            String[]twoareas ={"Cave","Grass Plain"};
            int area1 = JOptionPane.showOptionDialog(null,"You encounter a cross road, where do you want to go?","Where do go",0,0,null,twoareas,null);
            int really = JOptionPane.showConfirmDialog(null,"Are you sure?","Really?",0,0,null);
            while (really!=0){
            area1 = JOptionPane.showOptionDialog(null,"You encounter a cross road, where do you want to go?","Where do go",0,0,null,twoareas,null);
            really = JOptionPane.showConfirmDialog(null,"Are you sure?","Really?",0,0,null);
            }
            //CHOICE IS TO CAVE (TANK)
            if(area1==0){
                JOptionPane.showMessageDialog(null,"You and the old man walk into the cave","Cave",0,null);
                 JOptionPane.showMessageDialog(null,"All of a sudden a monster appears, and you ready your weapon!","Cave",0,null);
                 String[]options={"Sparing (30 DMG)","U Turn(20 DMG)"};
            int Monster = 200;
            int character = 200;
        
            JOptionPane.showMessageDialog(null,"You encountered a monster that is at "+Monster+" health","Monster encounter",0,null);
        
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
                JOptionPane.showMessageDialog(null,"You have learned a new ability \"Recover\", it restores 40 HP","New ability",0,null);
                JOptionPane.showMessageDialog(null,"Recover also allows you to overheal above max HP, however the overheal does not stay after battle","New ability",0,null);
                JOptionPane.showMessageDialog(null,"The old man restores you back to full health","Health",0,null);
                
                
                //NEW ROUTES (TANK, CAVE)
                String[]twoareas2 ={"Mountian","Lava Pit"};
                int area2 = JOptionPane.showOptionDialog(null,"You encounter a cross road, where do you want to go?","Where do go",0,0,null,twoareas2,null);
                int really2= JOptionPane.showConfirmDialog(null,"Are you sure?","Really?",0,0,null);
                while (really2!=0){
                area2 = JOptionPane.showOptionDialog(null,"You encounter a cross road, where do you want to go?","Where do go",0,0,null,twoareas2,null);
                really2 = JOptionPane.showConfirmDialog(null,"Are you sure?","Really?",0,0,null);
                }
                
                //MOUNTIAN CHOICE (TANK, CAVE)
                 if (area2==0){
                 JOptionPane.showMessageDialog(null,"You and the old man walk into the Mountian","Mountian",0,null);
                 JOptionPane.showMessageDialog(null,"All of a sudden a monster appears, and you ready your weapon!","Mountian",0,null);
                String[]options2={"Sparing (30 DMG)","U Turn(20 DMG)","Recover(Heals 40 HP)"};
                int Monster2 = 250;
                character = 200;
                JOptionPane.showMessageDialog(null,"You encountered a monster that is at "+Monster2+" health","Monster encounter",0,null);
        
                while(Monster2>0)
                { 
                int choice = JOptionPane.showOptionDialog(null,"What do you want to do","Move",0,0,null,options2,null);    
                if (choice==0)
                {
                    Monster2 = Monster2-40;
                }
                else if (choice==1)
                {
                    Monster2= Monster2-30;
                }
                else if (choice==2){
                    character = character+40;
                    JOptionPane.showMessageDialog(null,"You healed 40 HP, you're now at "+character,"Healing",0,null);
                }
                if (Monster2<=0){
                    break;
                }
                //Min + (int)(Math.random() * ((Max - Min) + 1))
                int damage = 10 + (int)(Math.random() * ((30 - 10) + 1));
                character = character-damage;
                JOptionPane.showMessageDialog(null,"The Monster attacks you back!","Monster attack",0,null);
                if (character>0){
                JOptionPane.showMessageDialog(null,"The monster has done "+damage+" damage on you!"+" You're at "+character+" health.","Health",0,null);
                JOptionPane.showMessageDialog(null,"The monster's health is at "+Monster2,"Monster health",0,null);
                }
                else{
                    JOptionPane.showMessageDialog(null,"GAME OVER, The monster has defeated you with "+Monster2+" health remaining!","Over",0,null);
                    System.exit(1);
                    }   
                }
                    JOptionPane.showMessageDialog(null,"You have defeated the monster.","WINNER",0,null);
                    JOptionPane.showMessageDialog(null,"You learned a new ability \"Shocking Blow\". It does 60 DMG.","New ability",0,null); //PUT IN ABILITY 
                    JOptionPane.showMessageDialog(null,"The old man restores you back to full health","Health",0,null);
                     
                    //BOSS CODE AFTER THIS 
                    }
                 



                //LAVA PIT (TANK, CAVE)
                else if (area2==1){
                JOptionPane.showMessageDialog(null,"You and the old man walk into the Lava Pit","Lava Pit",0,null);
                JOptionPane.showMessageDialog(null,"You encountered a monster that is at 100 health","Monster encounter",0,null);
                String[]options2={"Sparing (30 DMG)","U Turn(20 DMG)","Recover(Heals 40 HP)"};
                
                int Monster2 = 300;
                character = 200;
                while(Monster2>0)
                { 
                int choice = JOptionPane.showOptionDialog(null,"What do you want to do","Move",0,0,null,options2,null);    
                if (choice==0)
                {
                Monster2 = Monster2-40;
                }
                else if (choice==1)
                {
                Monster2= Monster2-30;
                }
                else if (choice==2){
                    character = character+40;
                }
                if (Monster2<=0){
                break;
                }
                //Min + (int)(Math.random() * ((Max - Min) + 1))
                 int damage = 10 + (int)(Math.random() * ((30 - 10) + 1));
                character = character-damage;
                JOptionPane.showMessageDialog(null,"The Monster attacks you back!","Monster attack",0,null);
                if (character>0){
                JOptionPane.showMessageDialog(null,"The monster has done "+damage+" damage on you!"+" You're at "+character+" health.","Health",0,null);
                JOptionPane.showMessageDialog(null,"The monster's health is at "+Monster2,"Monster health",0,null);
                }
                else{
                JOptionPane.showMessageDialog(null,"GAME OVER, The monster has defeated you with "+Monster2+" health remaining!","Over",0,null);
                System.exit(1);
                }   
            }
                JOptionPane.showMessageDialog(null,"You have defeated the monster.","WINNER",0,null);
                JOptionPane.showMessageDialog(null,"You learned \"Rammus\". This ability heals 20 HP and does 20 DMG","New",0,null); //PUT IN ABILITY 
                JOptionPane.showMessageDialog(null,"The old man restores you back to full health","Health",0,null);
                
                //BOSS FIGHT CODE AFTER THIS 
                 }
          }
            
            
            
           
            




            //CHOICE IS TO GRASS PLAINS
            else if (area1==1){
                 JOptionPane.showMessageDialog(null,"You and the old man walk towards the grass plains ","Grass Plains",0,null);
                 JOptionPane.showMessageDialog(null,"All of a sudden a monster appears, and you ready your weapon!","Grass Plains",0,null);
                 String[]options={"Sparing (30 DMG)","U Turn(20 DMG)"};
            int Monster = 200;
            int character = 200;
        
            JOptionPane.showMessageDialog(null,"You encountered a monster that is at "+Monster+" health.","Monster encounter",0,null);
        
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
                JOptionPane.showMessageDialog(null,"Your HP has increased by 50 HP, you're now at 250HP","New Ability",0,null);
                JOptionPane.showMessageDialog(null,"The old man restores you back to full health","Health",0,null);
                
                //NEW ROUTES
                String[]twoareas2 ={"Lake","Forest"};
                int area2 = JOptionPane.showOptionDialog(null,"You encounter a cross road, where do you want to go?","Where do go",0,0,null,twoareas2,null);
                int really2= JOptionPane.showConfirmDialog(null,"Are you sure?","Really?",0,0,null);
                while (really2!=0){
                area2 = JOptionPane.showOptionDialog(null,"You encounter a cross road, where do you want to go?","Where do go",0,0,null,twoareas2,null);
                really2 = JOptionPane.showConfirmDialog(null,"Are you sure?","Really?",0,0,null);
                }
                
                //LAKE CHOICE
                 if (area2==0){
                JOptionPane.showMessageDialog(null,"You and the old man walk into the Lake","Lake",0,null);
                JOptionPane.showMessageDialog(null,"All of a sudden a monster appears, and you ready your weapon!","Lake",0,null);
                String[]options2={"Sparing (30 DMG)","U Turn(20 DMG)"};
                int Monster2 = 300;
                character = 250;
                JOptionPane.showMessageDialog(null,"You encountered a monster that is at 100 health","Monster encounter",0,null);
        
                while(Monster2>0)
                { 
                int choice = JOptionPane.showOptionDialog(null,"What do you want to do","Move",0,0,null,options2,null);    
                if (choice==0)
                {
                    Monster2 = Monster2-40;
                }
                else if (choice==1)
                {
                    Monster2= Monster2-30;
                }
                if (Monster2<=0){
                    break;
                }
                //Min + (int)(Math.random() * ((Max - Min) + 1))
                int damage = 10 + (int)(Math.random() * ((30 - 10) + 1));
                character = character-damage;
                JOptionPane.showMessageDialog(null,"The Monster attacks you back!","Monster attack",0,null);
                if (character>0){
                JOptionPane.showMessageDialog(null,"The monster has done "+damage+" damage on you!"+" You're at "+character+" health.","Health",0,null);
                JOptionPane.showMessageDialog(null,"The monster's health is at "+Monster2,"Monster health",0,null);
                }
                else{
                    JOptionPane.showMessageDialog(null,"GAME OVER, The monster has defeated you with "+Monster2+" health remaining!","Over",0,null);
                    System.exit(1);
                    }   
                }
                    JOptionPane.showMessageDialog(null,"You have defeated the monster.","WINNER",0,null);
                    JOptionPane.showMessageDialog(null,"You gained 50 extra HP Points. Putting you at 300HP","New ability",0,null); //PUT IN ABILITY 
                    JOptionPane.showMessageDialog(null,"The old man restores you back to full health","Health",0,null);
                     
                    }
                 



                //FOREST CHOICE
                else if (area2==1){
                JOptionPane.showMessageDialog(null,"You and the old man walk into the Forest","Forest",0,null);
                
                int Monster2 = 300;
                JOptionPane.showMessageDialog(null,"You encountered a monster that is at "+Monster2+" health","Monster encounter",0,null);
                character = 250;
                while(Monster2>0)
                { 
                int choice = JOptionPane.showOptionDialog(null,"What do you want to do","Move",0,0,null,options,null);    
                if (choice==0)
                {
                Monster2 = Monster2-40;
                }
                else if (choice==1)
                {
                Monster2= Monster2-30;
                }
                if (Monster2<=0){
                break;
                }
                //Min + (int)(Math.random() * ((Max - Min) + 1))
                 int damage = 10 + (int)(Math.random() * ((30 - 10) + 1));
                character = character-damage;
                JOptionPane.showMessageDialog(null,"The Monster attacks you back!","Monster attack",0,null);
                if (character>0){
                JOptionPane.showMessageDialog(null,"The monster has done "+damage+" damage on you!"+" You're at "+character+" health.","Health",0,null);
                JOptionPane.showMessageDialog(null,"The monster's health is at "+Monster2,"Monster health",0,null);
                }
                else{
                JOptionPane.showMessageDialog(null,"GAME OVER, The monster has defeated you with "+Monster2+" health remaining!","Over",0,null);
                System.exit(1);
                }   
            }
                JOptionPane.showMessageDialog(null,"You have defeated the monster.","WINNER",0,null);
                JOptionPane.showMessageDialog(null,"You learned \"Piercing Strike\". This does 10 HP, Does 30 DMG.","New",0,null); //PUT IN ABILITY 
                JOptionPane.showMessageDialog(null,"The old man restores you back to full health","Health",0,null);
                //BOSS FIGHT AFTER THIS CODE
                 }
                
            }
                
        }
    }
        
        
}