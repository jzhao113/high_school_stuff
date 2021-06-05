import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
public class JeffreyZJasonLProject3
{
    public static void main (String[]args)
    {
        ImageIcon mom =new ImageIcon(JeffreyZJasonLProject3.class.getResource("Mom.png"));
        ImageIcon Male=new ImageIcon(JeffreyZJasonLProject3.class.getResource("Male.png"));
        ImageIcon MissedCall=new ImageIcon(JeffreyZJasonLProject3.class.getResource("MissedCall.jpg"));
        ImageIcon DavidText=new ImageIcon(JeffreyZJasonLProject3.class.getResource("DavidText.jpg"));
        ImageIcon ThinkingMale=new ImageIcon(JeffreyZJasonLProject3.class.getResource("ThinkingMale.png"));
        ImageIcon Login=new ImageIcon(JeffreyZJasonLProject3.class.getResource("Login.gif"));
        ImageIcon PartyInvite=new ImageIcon(JeffreyZJasonLProject3.class.getResource("Party Invite.png"));
        ImageIcon LoginSuccess=new ImageIcon(JeffreyZJasonLProject3.class.getResource("LoginSuccess.png"));
        ImageIcon GameOver=new ImageIcon(JeffreyZJasonLProject3.class.getResource("GameOver.jpg"));
        ImageIcon Female=new ImageIcon(JeffreyZJasonLProject3.class.getResource("Female.png"));
        ImageIcon NikkiText=new ImageIcon(JeffreyZJasonLProject3.class.getResource("NikkiText.jpg"));
        ImageIcon ThinkingFemale=new ImageIcon(JeffreyZJasonLProject3.class.getResource("ThinkingFemale.png"));
        ImageIcon Message=new ImageIcon(JeffreyZJasonLProject3.class.getResource("Message.png"));
        ImageIcon BlueScreen=new ImageIcon(JeffreyZJasonLProject3.class.getResource("Blue Screen.gif"));
        ImageIcon Cabin=new ImageIcon(JeffreyZJasonLProject3.class.getResource("Cabin.png"));
        ImageIcon Fields=new ImageIcon(JeffreyZJasonLProject3.class.getResource("Fields.png"));
        ImageIcon Portal=new ImageIcon(JeffreyZJasonLProject3.class.getResource("Portal.png"));
        ImageIcon MonsterC= new ImageIcon(JeffreyZJasonLProject3.class.getResource("MonsterC.PNG"));
        ImageIcon MonsterF= new ImageIcon(JeffreyZJasonLProject3.class.getResource("MonsterF.PNG"));
        ImageIcon MonsterGP= new ImageIcon(JeffreyZJasonLProject3.class.getResource("MonsterGP.PNG"));
        ImageIcon MonsterL= new ImageIcon(JeffreyZJasonLProject3.class.getResource("MonsterL.PNG"));
        ImageIcon MonsterLP= new ImageIcon(JeffreyZJasonLProject3.class.getResource("MonsterLP.PNG"));
        ImageIcon MonsterM= new ImageIcon(JeffreyZJasonLProject3.class.getResource("MonsterM.PNG"));
        ImageIcon Boss= new ImageIcon(JeffreyZJasonLProject3.class.getResource("Boss.PNG"));
        ImageIcon Cave= new ImageIcon(JeffreyZJasonLProject3.class.getResource("Cave.png"));
        ImageIcon Mountain= new ImageIcon(JeffreyZJasonLProject3.class.getResource("Mountain.PNG"));
        ImageIcon LavaPit= new ImageIcon(JeffreyZJasonLProject3.class.getResource("LavaPit.PNG"));
        ImageIcon Lake= new ImageIcon(JeffreyZJasonLProject3.class.getResource("Lake.PNG"));
        ImageIcon GrassPlain= new ImageIcon(JeffreyZJasonLProject3.class.getResource("GrassPlain.PNG"));
        ImageIcon Forest= new ImageIcon(JeffreyZJasonLProject3.class.getResource("Forest.PNG"));
        ImageIcon HorizontalArc=new ImageIcon(JeffreyZJasonLProject3.class.getResource("HorizontalArc.PNG"));
        ImageIcon DivineSword=new ImageIcon(JeffreyZJasonLProject3.class.getResource("DivineSword.JPG"));
        ImageIcon Heal=new ImageIcon(JeffreyZJasonLProject3.class.getResource("Heal.PNG"));
        ImageIcon DoubleCircular=new ImageIcon(JeffreyZJasonLProject3.class.getResource("DoubleCircular.PNG"));
        ImageIcon Eclipse=new ImageIcon(JeffreyZJasonLProject3.class.getResource("Eclipse.PNG"));
        ImageIcon SerrationWave=new ImageIcon(JeffreyZJasonLProject3.class.getResource("SerrationWave.PNG"));
        ImageIcon SnakeBite=new ImageIcon(JeffreyZJasonLProject3.class.getResource("SnakeBite.PNG"));
        ImageIcon ShootingStar=new ImageIcon(JeffreyZJasonLProject3.class.getResource("ShootingStar.PNG"));
        ImageIcon StarSplash=new ImageIcon(JeffreyZJasonLProject3.class.getResource("StarSplash.PNG"));
        ImageIcon Pierce=new ImageIcon(JeffreyZJasonLProject3.class.getResource("Pierce.PNG"));
        ImageIcon Sting=new ImageIcon(JeffreyZJasonLProject3.class.getResource("Sting.PNG"));
        ImageIcon ParallelSting=new ImageIcon(JeffreyZJasonLProject3.class.getResource("ParallelSting.PNG"));
        ImageIcon FlashingPenetrator=new ImageIcon(JeffreyZJasonLProject3.class.getResource("FlashingPenetrator.PNG"));
        ImageIcon StarburstStream=new ImageIcon(JeffreyZJasonLProject3.class.getResource("StarburstStream.gif"));
        ImageIcon PiercingStream=new ImageIcon(JeffreyZJasonLProject3.class.getResource("PiercingStream.gif"));
        ImageIcon OldMan=new ImageIcon(JeffreyZJasonLProject3.class.getResource("OldMan.PNG"));
        ImageIcon Choose=new ImageIcon(JeffreyZJasonLProject3.class.getResource("Choose.PNG"));
        ImageIcon Victory=new ImageIcon(JeffreyZJasonLProject3.class.getResource("Victory.PNG"));
        
        
        
        //declaring image icons
        
        
        boolean partner = false;
        
        
        JOptionPane.showMessageDialog(null,"RISE AND SHINE MY CHILD","Asleep",0,mom);
        //Asking user for name. Stops program is cancelled or nothing is typed in
        String name = JOptionPane.showInputDialog("What is your name?");
        if (name==null){
            System.exit(1);
        }
        //Creating arrays for future options
        String[]genders = {"Male","Female"};
        String[]options ={"Yes","No"};
        //Asking user for gender
        int gender = JOptionPane.showOptionDialog(null,"Are you a male or female","Sex",0,0,Choose,genders,null);
        //If the user is a male it does this if statement, If girl skip to else if
        if(gender==0)
        {
           JOptionPane.showMessageDialog(null,"GOOD MORNING "+name+"!"+" My lovely son!","Morning",0,Male);
           //Asking user if they had a good night's sleep. Its a Yes or No Option question
           int lovelysleep = JOptionPane.showOptionDialog(null,"Did you have a good night's sleep?","Good Sleep?",0,0,null,options,null);
           //If and else statements that differ depending on choice of user
           if (lovelysleep==0){
               JOptionPane.showMessageDialog(null,"Thats nice to hear. David called earlier today looking for you. You should call him back. ","Call",0,MissedCall);
           }
           else if (lovelysleep==1){
               JOptionPane.showMessageDialog(null,"I'm sorry to hear that. David called earlier today looking for you. You should call him back","Call",0,MissedCall);
           }
           //Using MessageDialog to furthur the story
           JOptionPane.showMessageDialog(null,"You pick up your phone, and see a text from David","Text",0,DavidText);
           JOptionPane.showMessageDialog(null,"You run towards your computer,and in your head you're thinking about your login information ","Thinking",0,ThinkingMale);
           //Declaring arrays for future use
           String S2="";
           String S1="";
           //3 outcomes for usernames depending on the number rolled between 1-3
           int username = 1 + (int)(Math.random() * ((3 - 1) + 1));
           if(username==1){
               JOptionPane.showMessageDialog(null,"You remember that your Username: "+name+"69 (Remember this)","Username",0,null);
               S1 = name+"69";
           }
           else if (username==2){
               JOptionPane.showMessageDialog(null,"You remember that your Username: "+name+"Strider (Remember this)","Username",0,null);
               S1 = name+"Strider";
           }
           else if (username==3){
               JOptionPane.showMessageDialog(null,"You remember that your Username: "+name+"OnFire (Remember this)","Username",0,null);
               S1 = name+"OnFire";
           }
           //3 outcomes for passwords depending on the number rolled between 1-3
           int password = 1 + (int)(Math.random() * ((3 - 1) + 1));
           if(password==1){
               JOptionPane.showMessageDialog(null,"You also remember your password is GummyBear (Remember this)","Password",0,null);
               S2="GummyBear";
           }
           else if (password==2){
               JOptionPane.showMessageDialog(null,"You also remember your password is Cyclone (Remember this)","Password",0,null);
               S2="Cyclone";
           }
           else if (password==3){
               JOptionPane.showMessageDialog(null,"You also remember your password is FlyOnWall (Remember this)","Password,",0,null);
               S2="FlyOnWall";
           }
           //Asking user for the username
           String S3 = JOptionPane.showInputDialog("Please enter your Username");
           //Comparing the input to the correct username.
           boolean User = S1.equalsIgnoreCase(S3);
           //If correct goes to password, else it stops program
           if(User==true){
               //Askes the User for the password
               String S4 = JOptionPane.showInputDialog("Username exists. Please Enter your password");
               //Comparing input password to actual password
               boolean truepass = S2.equalsIgnoreCase(S4);
               //If correct proceeds to next party, else program stops
               if(truepass==true){
                   JOptionPane.showMessageDialog(null,"Sucessful Login","Login Sucess",0,LoginSuccess);
                   //Giving user another Yes or No Option
                   int party = JOptionPane.showOptionDialog(null,"You recieve a party invite from David. Do you accept?","Party invite",0,0,PartyInvite,options,null);
                   if (party==0){
                       partner = true;
                       JOptionPane.showMessageDialog(null,"David is happy you join his party, and starts up talking to you.","Party",0,null);
                       int hear = JOptionPane.showOptionDialog(null,"Did you hear about the new endgame move Starburst Stream?","New Move",0,0,null,options,null);
                       if(hear==0){
                           JOptionPane.showMessageDialog(null,"Isn't it cool? I heard they also had another move called The Eclipse if you go Grass Plains then Forest.","Hinted",0,null);
                           JOptionPane.showMessageDialog(null,"Alright, enough with the talking lets start the queue!","Hint Missed",0,null);
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
                       partner = false;
                       JOptionPane.showMessageDialog(null,"David messages you in confusion on your decline, but you ignore, and start up the queue","What?",0,null);
                   }
               }
               else{
                   JOptionPane.showMessageDialog(null,"So you remembered the Username, but not the password.... GET IT NEXT TIME","Fail",0,GameOver);
                   System.exit(1);
               }
           }
           else{
               JOptionPane.showMessageDialog(null, "You HAD ONE JOB to remember the username and password. GET IT NEXT TIME","Fail",0,GameOver);
               System.exit(1);
               //Game over when player submits wrong password
           }
           String[]optionss ={"Yes","No"};
        JOptionPane.showMessageDialog(null,"You get a message ingame from an unknown source, with a link","Link",0,Message);
        //Player receives a message
        int open =JOptionPane.showOptionDialog(null,"Do you open the email?","Opening?",0,0,Message,optionss,null);
        //Giving user option to open email
        while (open!=0){
            //not allowing user to use choice 1
            open =JOptionPane.showOptionDialog(null,"Looks like you cannot say no.....","Opening?",0,0,Message,optionss,null);
            //Asking User if they want to open the message but giving them only one option
        }
        if (open==0){
            JOptionPane.showMessageDialog(null,"The email opens, and your screen turns blue","Opened",0,BlueScreen);
            //User receives blue screen after choice 0
            JOptionPane.showMessageDialog(null,"All of a sudden the world around you turns white, and beams of colors come at you. You question if you're dreaming. YOU BLACK OUT","Portal",0,Portal);
            //Displaying what the user sees after the blue screen
        }
        JOptionPane.showMessageDialog(null,".....","Wake",0,Fields);
        JOptionPane.showMessageDialog(null,"You wake up and see you are in an open field near a lake. Mountains surround you, it seems very peaceful","Waking up",0,Fields);
        //Displaying where the user is 
        int cabin = JOptionPane.showOptionDialog(null,"You see a cabin. Do you walk towards it?","Cabin",0,0,Cabin,optionss,null);
        //Asking user if they want to walk torwards the cabin
        if (cabin==0){
            JOptionPane.showMessageDialog(null,"You walk towards the cabin and get there. You knock on the door but no one answers.","Knocking",0,Cabin);
            JOptionPane.showMessageDialog(null,"You walk around scouting it,all of sudden you hear someone yelling.\"HEY WHAT ARE YOU DOING NEAR MY HOME\"","Yelling",0,null);
            //User meets old man throught interaction after choice 0
        }
        else{
            JOptionPane.showMessageDialog(null,"You walk away from the Cabin and towards the lake, You see an old man and walk towards him ","Lake",0,null);
            JOptionPane.showMessageDialog(null,"As you walk towards him the old man twitches and turns around,and yells \"WHAT DO YOU WANT CHILD\"","Confront",0,null);
            //User meets old man through interaction through choice 1
        
    }
        String[]choices={"Where am I","Who are you?"};
        //Declaring String choice
        int choicess = JOptionPane.showOptionDialog(null,"You continue to walk towards him. You decide to ask him?","Choice",0,0,OldMan,choices,null);
        //Asking user which question to ask the old man
        if (choicess==0){
            JOptionPane.showMessageDialog(null,"This is the beta test. If you die here, you die in real life!.","Where am I?",0,OldMan);
            JOptionPane.showMessageDialog(null,"You must beat the game to get out.","Where am I?",0,OldMan);
            //User interaction after choice 0
            String[]choice1={"Who are you?"};
                int single = JOptionPane.showOptionDialog(null,"You ask him another question?","Another Question",0,0,OldMan,choice1,null);
                //Asking user if they want to ask the other question
                if (single==0){
                    JOptionPane.showMessageDialog(null,"Me? I'm an elder who has been stuck here for centuries. I'm Immortal here but I want to get out.","Who are you?",0,OldMan);
                    // Npc gives player information about them
                }
            }
        else if (choicess==1){
            JOptionPane.showMessageDialog(null,"Me? I'm an elder who has been stuck here for centuries. I'm Immortal here but I want to get out.","Who are you?",0,OldMan);
            //User interaction after choice 1
            String[]choice1={"Where am I"};
            int single = JOptionPane.showOptionDialog(null,"You ask him another question?","Another Question",0,0,OldMan,choice1,null);
            //Giving player an option to ask another question
            if (single==0){
                     JOptionPane.showMessageDialog(null,"This is the beta test. If you die here, you die in real life!.","Where am I?",0,OldMan);
                     JOptionPane.showMessageDialog(null,"You must beat the game to get out.","Where am I?",0,OldMan);
                     //Npc giving player information
                }
        }
        JOptionPane.showMessageDialog(null,"I've been waiting for someone like to come. You shall set of on your journey, to free yourself.","Waiting",0,null);
        JOptionPane.showMessageDialog(null,"I shall come with you as a healer.","Waiting",0,null);
        if(partner==true){
            JOptionPane.showMessageDialog(null,"David spawns in and joins you on your journey.(He does an extra 30 DMG to the Monster with every turn)","David",0,null);
        }
        //Npc comes along with player on the journey
           //BATTLE CODE
           JOptionPane.showMessageDialog(null,"According to your build, you're the Warrior class. ","Warrior",0,null);
           //Giving player his class
            JOptionPane.showMessageDialog(null,"You set off your on your adventure","Adventure",0,null);
            //Npc displaying message to player
            String[]twoareas ={"Cave","Grass Plain"};
            //declaring choice strings
            int area1 = JOptionPane.showOptionDialog(null,"You encounter a cross road, where do you want to go?","Where do go",0,0,null,twoareas,null);
            //giving player two choices of either choosing cave or grass plain
            int really = JOptionPane.showConfirmDialog(null,"Are you sure?","Really?",0,0,null);
            //asking player are they sure?
            while (really!=0){
                //Not allowing user to choose choice 0
            area1 = JOptionPane.showOptionDialog(null,"You encounter a cross road, where do you want to go?","Where do go",0,0,null,twoareas,null);
            //giving player two choices of either choosing cave or grass plain
            really = JOptionPane.showConfirmDialog(null,"Are you sure?","Really?",0,0,null);
            //asking player are they sure?
            }
            //CHOICE IS TO CAVE (Warrior)
            if(area1==0){
                //if player chooses choice 0(cave)
                JOptionPane.showMessageDialog(null,"You and the old man walk into the cave","Cave",0,Cave);
                //player and Npc walks into the cave.
                 JOptionPane.showMessageDialog(null,"All of a sudden a monster appears, and you ready your weapon!","Cave",0,MonsterC);
                 //Enemy appears and player gets ready to engage in battle
                 String[]options1={"Horizontal Arc (30 DMG)","Recover (+50 HP, Can overheal)"};
                 //declaring two string choices for combat
            int Monster = 200;
            //declaring an int for monster health
            int character = 200;
            //declaring an int for player health
            
        
            JOptionPane.showMessageDialog(null,"You encountered a monster that is at "+Monster+" health","Monster encounter",0,MonsterC);
            //displaying monster health
             while(Monster>0)
            { 
            int choice = JOptionPane.showOptionDialog(null,"What do you want to do","Move",0,0,null,options1,MonsterC);    
            if (choice==0)
            {
                
                Monster = Monster-30;
                //if choice 0 monster takes 30 damage
                JOptionPane.showMessageDialog(null,"You used Horizontal Arc","Move Used",0,HorizontalArc);
            }
            else if (choice==1)
            {
                character = character+50;
                //if choice 1 character gains 50 health
                JOptionPane.showMessageDialog(null,"You used Recover","Move Used",0,Heal);
                JOptionPane.showMessageDialog(null,"You're at "+character+" health.","Healed",0,null);
                //displayer player's health
            }
            if(partner==true){
                JOptionPane.showMessageDialog(null,"David attacks and does 30 DMG","Companion Attack",0,null);
                Monster = Monster-30;
            }
            if (Monster<=0){
                break;
            }
            //Min + (int)(Math.random() * ((Max - Min) + 1))
            int damage = 10 + (int)(Math.random() * ((30 - 10) + 1));
            //declaring int for monster damage
            character = character-damage;
            //player loses health against monster
            JOptionPane.showMessageDialog(null,"The Monster attacks you back!","Monster attack",0,MonsterC);
            //displaying message that monster attacks player
            if (character>0){
                JOptionPane.showMessageDialog(null,"The monster has done "+damage+" damage on you!"+" You're at "+character+" health.","Health",0,null);
                //displaying amount of damage taken and curren health points
                JOptionPane.showMessageDialog(null,"The monster's health is at "+Monster,"Monster health",0,MonsterC);
                //displaying monster's health
            }
            else{
                JOptionPane.showMessageDialog(null,"GAME OVER, The monster has defeated you with "+Monster+" health remaining!","Over",0,GameOver);
                System.exit(1);
                //displaying game over, player health points reached 0 or less
                }   
            }
                JOptionPane.showMessageDialog(null,"You have defeated the monster.","WINNER",0,null);
                //player has defeated the monster and can move forward
                JOptionPane.showMessageDialog(null,"You have learned a new ability \"Snake Bite\", it does 60 DMG","New ability",0,null);
                //player has obtained a new skill
                JOptionPane.showMessageDialog(null,"The old man restores you back to full health, any overheals were removed.","Health",0,null);
                //restoring player's health points
                
                //NEW ROUTES (Warrior, CAVE)
                String[]twoareas2 ={"Mountian","Lava Pit"};
                //declaring two string choices, Mountain or Lava Pit
                int area2 = JOptionPane.showOptionDialog(null,"You encounter a cross road, where do you want to go?","Where do go",0,0,null,twoareas2,null);
                //asking Player to pick a path
                int really2= JOptionPane.showConfirmDialog(null,"Are you sure?","Really?",0,0,null);
                //asking player if they are sure
                while (really2!=0){
                area2 = JOptionPane.showOptionDialog(null,"You encounter a cross road, where do you want to go?","Where do go",0,0,null,twoareas2,null);
                //asking player where they want to go
                really2 = JOptionPane.showConfirmDialog(null,"Are you sure?","Really?",0,0,null);
                //asking player if they are sure
                }
                
                //MOUNTIAN CHOICE (Warrior, CAVE)
                 if (area2==0){
                     //choice if chose mountain
                 JOptionPane.showMessageDialog(null,"You and the old man walk into the Mountian","Mountian",0,Mountain);
                 //player chooses mountain, displaying message
                 JOptionPane.showMessageDialog(null,"All of a sudden a monster appears, and you ready your weapon!","Mountian",0,MonsterM);
                 //player encounters monster
                String[]options2={"Horizontal Arc (30 DMG)","Recover (+50 HP, Can overheal)","Snake Bite (60 DMG)"};
                //Declaring string options for player options to attack
                int Monster2 = 250;
                //monster health
                character = 200;
                //characters health
                JOptionPane.showMessageDialog(null,"You encountered a monster that is at "+Monster2+" health","Monster encounter",0,MonsterM);
                //dispaying message
        
                while(Monster2>0)
                { 
                int choice = JOptionPane.showOptionDialog(null,"What do you want to do","Move",0,0,null,options2,MonsterM);    
                //asking player what they want to do
                if (choice==0)
                {
                    Monster2 = Monster2-30;
                    //if choice 0 then monster takes 30 damage
                    JOptionPane.showMessageDialog(null,"You used Horizontal Arc","Move Used",0,HorizontalArc);
                }
                else if (choice==1)
                {
                    character = character+50;
                    //if choice 1 then player gains 50 health points
                    JOptionPane.showMessageDialog(null,"You used Recover","Move Used",0,Heal);
                    JOptionPane.showMessageDialog(null,"You're at "+character+" health.","Healed",0,null);
                    //displaying player's health
                }
                else if (choice==2){
                    Monster2 = Monster2-60;
                    //if choice 2 then monster takes 60 damage
                    JOptionPane.showMessageDialog(null,"You used Snake Bite","Move Used",0,SnakeBite);
                }
                if(partner==true){
                JOptionPane.showMessageDialog(null,"David attacks and does 30 DMG","Companion Attack",0,null);
                Monster2 = Monster2-30;
                }
                if (Monster2<=0){
                    break;
                }
                //Min + (int)(Math.random() * ((Max - Min) + 1))
                int damage = 10 + (int)(Math.random() * ((30 - 10) + 1));
                //Monster attack
                character = character-damage;
                //player takes damage
                JOptionPane.showMessageDialog(null,"The Monster attacks you back!","Monster attack",0,MonsterM);
                //displaying monster attacks
                if (character>0){
                JOptionPane.showMessageDialog(null,"The monster has done "+damage+" damage on you!"+" You're at "+character+" health.","Health",0,null);
                //Displaying amount of damage taken
                JOptionPane.showMessageDialog(null,"The monster's health is at "+Monster2,"Monster health",0,null);
                //displaying monster's health
                }
                else{
                    JOptionPane.showMessageDialog(null,"GAME OVER, The monster has defeated you with "+Monster2+" health remaining!","Over",0,GameOver);
                    //displaying game over when player's health reaches 0 or less.
                    System.exit(1);
                    }   
                }
                    JOptionPane.showMessageDialog(null,"You have defeated the monster.","WINNER",0,null);
                    //displaying victory after defeating monster
                    JOptionPane.showMessageDialog(null,"You learned a new ability \"Divine Sword\". It does 200 DMG.","New ability",0,null); //PUT IN ABILITY 
                    //new ability learned
                    JOptionPane.showMessageDialog(null,"The old man restores you back to full health, any overheals were removed","Health",0,null);
                    //restoring player's health back to full
                     
                    //BOSS CODE AFTER THIS
                    String[]options3={"Horizontal Arc (30 DMG)","Recover (+50 HP, Can overheal)","Snake Bite (60 DMG)","Divine Sword (200 DMG)"}; //Put abilites in 
                    //declaring string options for player attack options
                    int Monster3 = 800;
                    //Boss health
                    character=200;
                    //player health
        
                    JOptionPane.showMessageDialog(null,"This is the final boss it is at "+Monster3+" health","FINAL BOSS FIGHT",0,Boss);
                    //displaying boss's health
                    
        
                    while(Monster3>0)
                    { 
                    int choice = JOptionPane.showOptionDialog(null,"What do you want to do","Move",0,0,Boss,options3,null);  
                    //asking player what they want to do
                    if (choice==0)
                    {
                    Monster3 = Monster3-30;
                    //if choice 0 then monster takes 30 damage
                    JOptionPane.showMessageDialog(null,"You used Horizontal Arc","Move Used",0,HorizontalArc);
                    }
                    else if (choice==1)
                    {
                    character = character+50;
                    //if choice 1 then character gains 50 health points
                    JOptionPane.showMessageDialog(null,"You used Recover","Move Used",0,Heal);
                    JOptionPane.showMessageDialog(null,"You're at "+character+" health.","Healed",0,null);
                    //displaying player's health
                    }
                    else if (choice==2){
                        Monster3 = Monster3-60;
                        JOptionPane.showMessageDialog(null,"You used Snake Bite","Move Used",0,SnakeBite);
                    }
                    else if (choice==3){
                        Monster3 = Monster3-200;
                        JOptionPane.showMessageDialog(null,"You used Divine Sword","Move Used",0,DivineSword);
                    }
                    if(partner==true){
                    JOptionPane.showMessageDialog(null,"David attacks and does 30 DMG","Companion Attack",0,null);
                    Monster3 = Monster3-30;
                    }
                    if (Monster3<=0){
                    break;
                    }
                    //Min + (int)(Math.random() * ((Max - Min) + 1))
                    int damage = 40 + (int)(Math.random() * ((50 - 40) + 1));
                    character = character-damage;
                    JOptionPane.showMessageDialog(null,"The Final Boss attacks you back!","Boss attack",0,Boss);
                    //boss attacks player
                    if (character>0){
                    JOptionPane.showMessageDialog(null,"The Final Boss has done "+damage+" damage on you!"+" You're at "+character+" health.","Health",0,null);
                    //displaying damage done to player
                    JOptionPane.showMessageDialog(null,"The Final Boss's health is at "+Monster3," HP",0,null);
                    //displaying boss's health
                    }
                    else{
                    JOptionPane.showMessageDialog(null,"GAME OVER, The FINAL BOSS has defeated you with "+Monster3+" health remaining!","Over",0,GameOver);
                    //displaying game over screen after player's health reached 0 or less
                    System.exit(1);
                    }   
                }
                JOptionPane.showMessageDialog(null,"You have defeated the FINAL BOSS.","WINNER",0,Victory);
                //player has defeated boss
                JOptionPane.showMessageDialog(null,"It is finally over you get to go home","WINNER",0,Victory);
                //displaying message to player
                JOptionPane.showMessageDialog(null,"Thank you for playing","Thanks",0,null);
                //JOptionPane.showMessageDialog(null,"","",0,null);
                JOptionPane.showMessageDialog(null,"Your name is "+name,"Name",0,null);
                //displaying user's name
                JOptionPane.showMessageDialog(null,"You're a male","Sex",0,null);
                //displaying user's gender
                if (lovelysleep==0){
                    JOptionPane.showMessageDialog(null,"You had a good night's sleep.","Good night's sleep",0,null);
                }
                else{
                    JOptionPane.showMessageDialog(null,"You did not have a good night's sleep","No good sleep",0,null);
                }
                JOptionPane.showMessageDialog(null,"Your username was "+S1,"Username was",0,null);
                JOptionPane.showMessageDialog(null,"Your password was "+S2,"Password was",0,null);
                if (partner==true){
                    JOptionPane.showMessageDialog(null,"You joined David's party","Joined Party",0,null);
                }
                else{
                    JOptionPane.showMessageDialog(null,"You did not David's party","Did not join!",0,null);
                }
                if(cabin==0){
                    JOptionPane.showMessageDialog(null,"You went towards the cabin","Cabin",0,null);
                }
                else{
                    JOptionPane.showMessageDialog(null,"You did not go towards the cabin","Cabin",0,null);
                }
                if(choicess==0){
                    JOptionPane.showMessageDialog(null,"The first question you asked the old man was \"Where am I?\"","Question",0,null);
                }
                else{
                    JOptionPane.showMessageDialog(null,"The first question you asked the old man was \"Who are you?\"","Question",0,null);
                }
                JOptionPane.showMessageDialog(null,"On your journey you were a Warrior Class. You went through Cave and Mountian.","Path",0,null);
                //Displaying messages on choices that the player has made throughout the game
                
              }
                 



                //LAVA PIT (TANK, CAVE)
                else if (area2==1){
                JOptionPane.showMessageDialog(null,"You and the old man walk into the Lava Pit","Lava Pit",0,LavaPit);
                //displaying message after choosing to go to lava pit
                JOptionPane.showMessageDialog(null,"You encountered a monster that is at 300 health","Monster encounter",0,MonsterLP);
                //player runs into a monster
                String[]options2={"Horizontal Arc (30 DMG)","Recover (+50 HP, Can overheal)","Snake Bite (60 DMG)"};
                //string options for player attacks
                int Monster2 = 300;
                //monster health
                character = 200;
                //player health
                while(Monster2>0)
                { 
                int choice = JOptionPane.showOptionDialog(null,"What do you want to do","Move",0,0,null,options2,null);
                //asking player what they want to do
                if (choice==0)
                {
                Monster2 = Monster2-30;
                //if choice 0 monster takes 30 damage
                JOptionPane.showMessageDialog(null,"You used Horizontal Arc","Move Used",0,HorizontalArc);
                }
                else if (choice==1)
                {
                character = character+50;
                //if choice 1 then player gains 50 health
                JOptionPane.showMessageDialog(null,"You used Recover","Move Used",0,Heal);
                JOptionPane.showMessageDialog(null,"You're at "+character+" health.","Healed",0,null);
                //displaying player's health
                }
                else if (choice==2){
                    Monster2 = Monster2-60;
                    //if choice 2 monster takes 60 damage
                    JOptionPane.showMessageDialog(null,"You used Snake Bite","Move Used",0,SnakeBite);
                }
                if(partner==true){
                JOptionPane.showMessageDialog(null,"David attacks and does 30 DMG","Companion Attack",0,null);
                Monster2 = Monster2-30;
                }
                if (Monster2<=0){
                break;
                }
                //Min + (int)(Math.random() * ((Max - Min) + 1))
                 int damage = 10 + (int)(Math.random() * ((30 - 10) + 1));
                 //monster damage
                character = character-damage;
                //health after damage taken
                JOptionPane.showMessageDialog(null,"The Monster attacks you back!","Monster attack",0,MonsterLP);
                //displaying message
                if (character>0){
                JOptionPane.showMessageDialog(null,"The monster has done "+damage+" damage on you!"+" You're at "+character+" health.","Health",0,null);
                //displaying damage boss has dealt
                JOptionPane.showMessageDialog(null,"The monster's health is at "+Monster2,"Monster health",0,MonsterLP);
                //displaying monster health
                }
                else{
                JOptionPane.showMessageDialog(null,"GAME OVER, The monster has defeated you with "+Monster2+" health remaining!","Over",0,GameOver);
                //displaying game over after player's health has reached 0 or less
                System.exit(1);
                }   
            }
                JOptionPane.showMessageDialog(null,"You have defeated the monster.","WINNER",0,null);
                //Player has defeated the monster
                JOptionPane.showMessageDialog(null,"You learned \"Starburst Stream\". This ability heals 300 DMG","New",0,null); //PUT IN ABILITY 
                //displaying new ability learned
                JOptionPane.showMessageDialog(null,"The old man restores you back to full health, overheals have been removed.","Health",0,null);
                //restoring player's health to normal
                
                //BOSS FIGHT CODE AFTER THIS
                String[]options3={"Horizontal Arc (30 DMG)","Recover (+50 HP, Can overheal)","Snake Bite (60 DMG)","Starburst Stream (300 DMG)"}; //Put abilites in 
                //player options for battle
                int Monster3 = 800;
                //boss health
                character=200; 
                //player health
        
                JOptionPane.showMessageDialog(null,"This is the final boss it is at "+Monster3+" health","FINAL BOSS FIGHT",0,Boss);
                //displaying boss's health
        
                while(Monster3>0)
                { 
                int choice = JOptionPane.showOptionDialog(null,"What do you want to do","Move",0,0,null,options3,null);  
                //asking user what do they want to do?
                if (choice==0)
                {
                Monster3 = Monster3-30;
                //if choice is 0 then monster takes 30 damage
                JOptionPane.showMessageDialog(null,"You used Horizontal Arc","Move Used",0,HorizontalArc);
                }
                else if (choice==1)
                {
                character = character+50;
                //if choice 1 then player gains 50 health points
                JOptionPane.showMessageDialog(null,"You used Recover","Move Used",0,Heal);
                JOptionPane.showMessageDialog(null,"You're at "+character+" health.","Healed",0,null);
                //displaying player's health
                }
                else if (choice==2){
                    Monster3 = Monster3-60;
                    //if choice 2 damage takes 60 damage
                    JOptionPane.showMessageDialog(null,"You used Snake Bite","Move Used",0,SnakeBite);
                }
                else if (choice==3){
                    Monster3 = Monster3-300;
                    //if choice 3 monster takes 300 damage
                    JOptionPane.showMessageDialog(null,"You used Starburst Stream","Move Used",0,StarburstStream);
                }
                if(partner==true){
                JOptionPane.showMessageDialog(null,"David attacks and does 30 DMG","Companion Attack",0,null);
                Monster3 = Monster3-30;
                }
                if (Monster3<=0){
                break;
                }
                //Min + (int)(Math.random() * ((Max - Min) + 1))
                int damage = 40 + (int)(Math.random() * ((50 - 40) + 1));
                //monster damage
                character = character-damage;
                //player damage taken
                JOptionPane.showMessageDialog(null,"The Final Boss attacks you back!","Boss attack",0,Boss);
                //displaying message that boss is attacking player
                if (character>0){
                JOptionPane.showMessageDialog(null,"The Final Boss has done "+damage+" damage on you!"+" You're at "+character+" health.","Health",0,null);
                //damage boss has dealt
                JOptionPane.showMessageDialog(null,"The Final Boss's health is at "+Monster3," HP",0,null);
                //displaying boss's health
                }
                else{
                JOptionPane.showMessageDialog(null,"GAME OVER, The FINAL BOSS has defeated you with "+Monster3+" health remaining!","Over",0,GameOver);
                //displaying game over player has been defeated
                
                System.exit(1);
                }   
            }
                JOptionPane.showMessageDialog(null,"You have defeated the FINAL BOSS.","WINNER",0,Victory);
                //displaying message, player has defeated the final boss
                JOptionPane.showMessageDialog(null,"It is finally over you get to go home","WINNER",0,Victory);
                JOptionPane.showMessageDialog(null,"Thank you for playing","Thanks",0,null);
                JOptionPane.showMessageDialog(null,"Your name is "+name,"Name",0,null);
                JOptionPane.showMessageDialog(null,"You're a male","Sex",0,null);
                if (lovelysleep==0){
                    JOptionPane.showMessageDialog(null,"You had a good night's sleep.","Good night's sleep",0,null);
                }
                else{
                    JOptionPane.showMessageDialog(null,"You did not have a good night's sleep","No good sleep",0,null);
                }
                JOptionPane.showMessageDialog(null,"Your username was "+S1,"Username was",0,null);
                JOptionPane.showMessageDialog(null,"Your password was "+S2,"Password was",0,null);
                if(partner==true){
                    JOptionPane.showMessageDialog(null,"You joined David's party.","Joined Party",0,null);
                }
                else{
                    JOptionPane.showMessageDialog(null,"You did not join David's party.","Did not join",0,null);
                }
                if(cabin==0){
                    JOptionPane.showMessageDialog(null,"You went towards the cabin","Cabin",0,null);
                }
                else{
                    JOptionPane.showMessageDialog(null,"You did not go towards the cabin","Cabin",0,null);
                }
                if(choicess==0){
                    JOptionPane.showMessageDialog(null,"The first question you asked the old man was \"Where am I?\"","Question",0,null);
                }
                else{
                    JOptionPane.showMessageDialog(null,"The first question you asked the old man was \"Who are you?\"","Question",0,null);
                }
                JOptionPane.showMessageDialog(null,"On your journey you were a Warrior Class. You went through Cave and Lavapit.","Path",0,null);
                //displaying player's history throughout the game
                }
            }
            
            
            
           
            




            //CHOICE IS TO GRASS PLAINS
            else if (area1==1){
                 JOptionPane.showMessageDialog(null,"You and the old man walk towards the grass plains ","Grass Plains",0,GrassPlain);
                 //displaying message of path player chose
                 JOptionPane.showMessageDialog(null,"All of a sudden a monster appears, and you ready your weapon!","Grass Plains",0,MonsterGP);
                 //displaying message to player that they are about to engage into battle
                 String[]options1={"Horizontal Arc(30 DMG)","Recover(+50 HP)"};
                 //string options for attack
            int Monster = 200;
            //monster health
            int character = 200;
            //character health
        
            JOptionPane.showMessageDialog(null,"You encountered a monster that is at "+Monster+" health.","Monster encounter",0,MonsterGP);
            //displaying monster health
        
             while(Monster>0)
            { 
            int choice = JOptionPane.showOptionDialog(null,"What do you want to do","Move",0,0,null,options1,null);
            //asking player which move they want to use
            if (choice==0)
            {
                Monster = Monster-30;
                //if choice 0 monster takes 30 damage
                JOptionPane.showMessageDialog(null,"You used Horizontal Arc","Move Used",0,HorizontalArc);
            }
            else if (choice==1)
            {
                 character = character+50;
                 //if choice 1 player gains 50 health
                 JOptionPane.showMessageDialog(null,"You used Recover","Move Used",0,Heal);
                    JOptionPane.showMessageDialog(null,"You're at "+character+" health.","Healed",0,null);
                    //displaying player's health
            }
            if(partner==true){
                JOptionPane.showMessageDialog(null,"David attacks and does 30 DMG","Companion Attack",0,null);
                Monster = Monster-30;
            }
            if (Monster<=0){
                break;
            }
            //Min + (int)(Math.random() * ((Max - Min) + 1))
            int damage = 10 + (int)(Math.random() * ((30 - 10) + 1));
            //monster damage
            character = character-damage;
            //damage taken by monster
            JOptionPane.showMessageDialog(null,"The Monster attacks you back!","Monster attack",0,MonsterGP);
            //displaying message that monster is attacking
            if (character>0){
                JOptionPane.showMessageDialog(null,"The monster has done "+damage+" damage on you!"+" You're at "+character+" health.","Health",0,null);
                //displaying damage monster has done
                JOptionPane.showMessageDialog(null,"The monster's health is at "+Monster,"Monster health",0,MonsterGP);
                //displaying monster's health
            }
            else{
                JOptionPane.showMessageDialog(null,"GAME OVER, The monster has defeated you with "+Monster+" health remaining!","Over",0,GameOver);
                //displaying game over screen player's health has reached 0 or less
                System.exit(1);
                }   
            }
                JOptionPane.showMessageDialog(null,"You have defeated the monster.","WINNER",0,null);
                //displaying message monster has been defeated
                JOptionPane.showMessageDialog(null,"You learned a new ability \"Serration Wave\". It does 40 DMG and get 20 Health healed","New Ability",0,null);
                //displaying new ability learned
                JOptionPane.showMessageDialog(null,"The old man restores you back to full health, overheals have been removed.","Health",0,null);
                //restoring player's health to normal and removing all overheals
                
                //NEW ROUTES
                String[]twoareas2 ={"Lake","Forest"};
                int area2 = JOptionPane.showOptionDialog(null,"You encounter a cross road, where do you want to go?","Where do go",0,0,null,twoareas2,null);
                //asking player where they want to go
                int really2= JOptionPane.showConfirmDialog(null,"Are you sure?","Really?",0,0,null);
                //asking player are they sure
                while (really2!=0){
                area2 = JOptionPane.showOptionDialog(null,"You encounter a cross road, where do you want to go?","Where do go",0,0,null,twoareas2,null);
                //asking player where they want to go
                really2 = JOptionPane.showConfirmDialog(null,"Are you sure?","Really?",0,0,null);
                //asking are they sure
                }
                
                //LAKE CHOICE
                 if (area2==0){
                JOptionPane.showMessageDialog(null,"You and the old man walk into the Lake","Lake",0,Lake);
                //displaying message player chooses lake path
                JOptionPane.showMessageDialog(null,"All of a sudden a monster appears, and you ready your weapon!","Lake",0,null);
                //displaying monster player encounters
                String[]options2={"Horizontal Arc(30 DMG)","Recover(+50 HP)","Serration Wave(40 DMG, +20 Health)"} ;
                //string options for player attacks
                int Monster2 = 300;
                //monster health
                character = 200;
                //player health
                JOptionPane.showMessageDialog(null,"You encountered a monster that is at 300 health","Monster encounter",0,MonsterL);
                //displaying monser's health
        
                while(Monster2>0)
                {                  
                int choice = JOptionPane.showOptionDialog(null,"What do you want to do","Move",0,0,null,options2,null);
                //asking player what they want to do
                if (choice==0)
                {
                    Monster2 = Monster2-30;
                    //if choice 0 monster takes 30 damage
                    JOptionPane.showMessageDialog(null,"You used Horizontal Arc","Move Used",0,HorizontalArc);
                }
                else if (choice==1)
                { 
                   character = character+50;
                   //if choice 1 player heals 50 health
                   JOptionPane.showMessageDialog(null,"You used Recover","Move Used",0,Heal);
                    JOptionPane.showMessageDialog(null,"You're at "+character+" health.","Healed",0,null);
                    //displaying player's health
                }
                else if (choice==2){
                    Monster2 = Monster-40;
                    character= character+20;
                    JOptionPane.showMessageDialog(null,"You used Serration Wave","Move Used",0,SerrationWave);
                    //if choice 2 monster takes 40 damage and player gains 20 health
                     JOptionPane.showMessageDialog(null,"You're at "+character+" health.","Healed",0,null);
                     //displaying player's health
                }
                if(partner==true){
                JOptionPane.showMessageDialog(null,"David attacks and does 30 DMG","Companion Attack",0,null);
                Monster2 = Monster2-30;
                }
                if (Monster2<=0){
                    break;
                }
                //Min + (int)(Math.random() * ((Max - Min) + 1))
                int damage = 10 + (int)(Math.random() * ((30 - 10) + 1));
                //monster damage
                character = character-damage;
                //damage player takes
                JOptionPane.showMessageDialog(null,"The Monster attacks you back!","Monster attack",0,MonsterL);
                //displaying message that monster is attacking
                if (character>0){
                JOptionPane.showMessageDialog(null,"The monster has done "+damage+" damage on you!"+" You're at "+character+" health.","Health",0,null);
                //displaying damage taken and current health of player
                JOptionPane.showMessageDialog(null,"The monster's health is at "+Monster2,"Monster health",0,MonsterL);
                //displaying monster health
                }
                else{
                    JOptionPane.showMessageDialog(null,"GAME OVER, The monster has defeated you with "+Monster2+" health remaining!","Over",0,GameOver);
                    //displaying game over screen player health has reached 0 or less
                    System.exit(1);
                    }   
                }
                    JOptionPane.showMessageDialog(null,"You have defeated the monster.","WINNER",0,null);
                    //player has defeated monster
                    JOptionPane.showMessageDialog(null,"You learned \"The Eclipse\". It does 200 DMG and heals 50 HP).","New ability",0,null); //PUT IN ABILITY 
                    //new skill learned for player
                    JOptionPane.showMessageDialog(null,"The old man restores you back to full health, overheals have been removed.","Health",0,null);
                    //restoring player's health to normal
                    //BOSS FIGHT AFTER THIS
                    String[]options3={"Horizontal Arc(30 DMG)","Recover(+50 HP)","Serration Wave(40 DMG, +20 Health)","The Eclipise(200 DMG, +50 HP"}; //Put abilites in 
                    //string options for player attacks
                    int Monster3 = 800;
                    //displaying monster health
                    character=200; 
        
                    JOptionPane.showMessageDialog(null,"This is the final boss it is at "+Monster3+" health","FINAL BOSS FIGHT",0,Boss);
                    //displaying boss's health
        
                    while(Monster3>0)
                    { 
                    int choice = JOptionPane.showOptionDialog(null,"What do you want to do","Move",0,0,null,options3,null);
                    //asking player what they want to do
                    if (choice==0)
                    {
                    Monster3 = Monster3-30;
                    //if choice 0 boss takes 30 damage
                    JOptionPane.showMessageDialog(null,"You used Horizontal Arc","Move Used",0,HorizontalArc);
                    }
                    else if (choice==1)
                    {
                    character = character+50;
                    //if choice 1 player heals 50 health
                    JOptionPane.showMessageDialog(null,"You used Recover","Move Used",0,Heal);
                    JOptionPane.showMessageDialog(null,"You're at "+character+" health.","Healed",0,null);
                    //displaying player's health
                    }
                    else if (choice==2){
                    Monster3 = Monster3-40;
                    character= character+20;
                    //if choice 2 boss takes 40 damage and heals 20 health
                    JOptionPane.showMessageDialog(null,"You used Serration Wave","Move Used",0,SerrationWave);
                     JOptionPane.showMessageDialog(null,"You're at "+character+" health.","Healed",0,null);
                     //displaying player's health
                    }
                    else if (choice==3){
                        Monster3 = Monster3-200;
                    character= character+50;
                    //if choice 3 monster takes 200 damage and player heals 50 health
                    JOptionPane.showMessageDialog(null,"You used The Eclipse","Move Used",0,Eclipse);
                     JOptionPane.showMessageDialog(null,"You're at "+character+" health.","Healed",0,null);
                     //displaying character's health
                    }
                    if(partner==true){
                    JOptionPane.showMessageDialog(null,"David attacks and does 30 DMG","Companion Attack",0,null);
                    Monster3 = Monster3-30;
                    }
                    if (Monster3<=0){
                        break;
                    }
                    //Min + (int)(Math.random() * ((Max - Min) + 1))
                    int damage = 40 + (int)(Math.random() * ((50 - 40) + 1));
                    //boss damage
                    character = character-damage;
                    //damage taken by boss
                    JOptionPane.showMessageDialog(null,"The Final Boss attacks you back!","Boss attack",0,Boss);
                    //displaying message that boss is attacking
                    if (character>0){
                        JOptionPane.showMessageDialog(null,"The Final Boss has done "+damage+" damage on you!"+" You're at "+character+" health.","Health",0,null);
                        //displaying boss damage and player's health
                        JOptionPane.showMessageDialog(null,"The Final Boss's health is at "+Monster3," HP",0,Boss);
                        //displaying boss's health
                    }
                    else{
                     JOptionPane.showMessageDialog(null,"GAME OVER, The FINAL BOSS has defeated you with "+Monster3+" health remaining!","Over",0,GameOver);
                     //displaying game over screen player's health has reached 0 or less
                        System.exit(1);
                    }   
                }
                JOptionPane.showMessageDialog(null,"You have defeated the FINAL BOSS.","WINNER",0,Victory);
                //player has defeated boss
                JOptionPane.showMessageDialog(null,"It is finally over you get to go home","WINNER",0,Victory);
                //player has won the game
                JOptionPane.showMessageDialog(null,"Thank you for playing","Thanks",0,null);
                JOptionPane.showMessageDialog(null,"Your name is "+name,"Name",0,null);
                JOptionPane.showMessageDialog(null,"You're a male","Sex",0,null);
                if (lovelysleep==0){
                    JOptionPane.showMessageDialog(null,"You had a good night's sleep.","Good night's sleep",0,null);
                }
                else{
                    JOptionPane.showMessageDialog(null,"You did not have a good night's sleep","No good sleep",0,null);
                }
                JOptionPane.showMessageDialog(null,"Your username was "+S1,"Username was",0,null);
                JOptionPane.showMessageDialog(null,"Your password was "+S2,"Password was",0,null);
                if(partner==true){
                    JOptionPane.showMessageDialog(null,"You joined David's party.","Joined Party",0,null);
                }
                else{
                    JOptionPane.showMessageDialog(null,"You did not join David's party.","Did not join",0,null);
                }
                if(cabin==0){
                    JOptionPane.showMessageDialog(null,"You went towards the cabin","Cabin",0,null);
                }
                else{
                    JOptionPane.showMessageDialog(null,"You did not go towards the cabin","Cabin",0,null);
                }
                if(choicess==0){
                    JOptionPane.showMessageDialog(null,"The first question you asked the old man was \"Where am I?\"","Question",0,null);
                }
                else{
                    JOptionPane.showMessageDialog(null,"The first question you asked the old man was \"Who are you?\"","Question",0,null);
                }
                JOptionPane.showMessageDialog(null,"On your journey you were a Warrior Class. You went through Grass Plains and Lake.","Path",0,null);
                //displaying player choices throughout the game
             }
                 



                //FOREST CHOICE
                else if (area2==1){
                JOptionPane.showMessageDialog(null,"You and the old man walk into the Forest","Forest",0,Forest);
                //displaying player's choice forest
                
                int Monster2 = 300;
                //monster health
                JOptionPane.showMessageDialog(null,"You encountered a monster that is at "+Monster2+" health","Monster encounter",0,MonsterF);
                //displaying monster player encounters and its health
                String[]options2={"Horizontal Arc(30 DMG)","Recover(+50 HP)","Serration Wave(40 DMG, +20 Health)"} ;
                //string options for battle
                character = 200;
                //player's health
                while(Monster2>0)
                { 
                int choice = JOptionPane.showOptionDialog(null,"What do you want to do","Move",0,0,null,options2,null);
                //asking player what they want to do
                if (choice==0)
                {
                Monster2 = Monster2-30;
                //if choice 0 monster takes 30 damage
                JOptionPane.showMessageDialog(null,"You used Horizontal Arc","Move Used",0,HorizontalArc);
                }
                else if (choice==1)
                    {
                    character = character+50;
                    //if choice 1 player heals 50
                    JOptionPane.showMessageDialog(null,"You used Recover","Move Used",0,Heal);
                    JOptionPane.showMessageDialog(null,"You're at "+character+" health.","Healed",0,null);
                    //displaying character's health
                    }
                    else if (choice==2){
                    Monster2 = Monster2-40;
                    character= character+20;
                    //if choice 2 monster takes 40 damage and player heals 20 health
                    JOptionPane.showMessageDialog(null,"You used Serration Wave","Move Used",0,SerrationWave);
                    JOptionPane.showMessageDialog(null,"You're at "+character+" health.","Healed",0,null);
                    //displaying player's health
                    }
                if(partner==true){
                JOptionPane.showMessageDialog(null,"David attacks and does 30 DMG","Companion Attack",0,null);
                Monster2 = Monster2-30;
                }
                if (Monster2<=0){
                break;
                }
                //Min + (int)(Math.random() * ((Max - Min) + 1))
                 int damage = 10 + (int)(Math.random() * ((30 - 10) + 1));
                 //monster damage
                character = character-damage;
                //damage taken from monster
                JOptionPane.showMessageDialog(null,"The Monster attacks you back!","Monster attack",0,MonsterF);
                //displaying monster attacks player
                if (character>0){
                JOptionPane.showMessageDialog(null,"The monster has done "+damage+" damage on you!"+" You're at "+character+" health.","Health",0,null);
                //displaying damage monster dealt and health of player
                JOptionPane.showMessageDialog(null,"The monster's health is at "+Monster2,"Monster health",0,MonsterF);
                //displaying monster's health
                }
                else{
                JOptionPane.showMessageDialog(null,"GAME OVER, The monster has defeated you with "+Monster2+" health remaining!","Over",0,GameOver);
                //displaying game over screen player's health has reached 0 or less
                System.exit(1);
                }   
            }
                JOptionPane.showMessageDialog(null,"You have defeated the monster.","WINNER",0,null);
                //player has defeated monster
                JOptionPane.showMessageDialog(null,"You learned \"Double Circular\". This does 180 DMG.","New",0,null);
                //new skill learned
                JOptionPane.showMessageDialog(null,"The old man restores you back to full health, overheals have been removed.","Health",0,null);
                //restoring player's health to normal
                
                //BOSS FIGHT AFTER THIS CODE
                String[]options3={"Horizontal Arc(30 DMG)","Recover(+50 HP)","Serration Wave(40 DMG, +20 Health)","Double Circular(180 DMG)"}; 
                //string choices to attack
                int Monster3 = 800;
                //boss health
                character=200; //PUT IN HP DEPENDING ON THE CHARACTER CLASS 
                //character health
        
                JOptionPane.showMessageDialog(null,"This is the final boss it is at "+Monster3+" health","FINAL BOSS FIGHT",0,Boss);
                //displaying boss's health
        
                while(Monster3>0)
                { 
                int choice = JOptionPane.showOptionDialog(null,"What do you want to do","Move",0,0,null,options3,Boss);
                //asking player what they want to do
                    if (choice==0)
                {
                Monster3 = Monster3-30;
                //if choice 0 monster takes 30 damage
                JOptionPane.showMessageDialog(null,"You used Horizontal Arc","Move Used",0,HorizontalArc);
                }
                else if (choice==1)
                    {
                    character = character+50;
                    //if choice 1 player heals 50
                    JOptionPane.showMessageDialog(null,"You used Recover","Move Used",0,Heal);
                    JOptionPane.showMessageDialog(null,"You're at "+character+" health.","Healed",0,null);
                    //displaying player's health
                    }
                    else if (choice==2){
                    Monster3 = Monster3-40;
                    character= character+20;
                    //if choice 2 monster takes 40 damage and player gains 20 health
                    JOptionPane.showMessageDialog(null,"You used Serration Wave","Move Used",0,SerrationWave);
                    JOptionPane.showMessageDialog(null,"You're at "+character+" health.","Healed",0,null);
                    //displaying player's health
                    }
                    else if (choice==3){
                        Monster3 = Monster3-180;
                        //if choice 3 monster takes 180 damage
                        JOptionPane.showMessageDialog(null,"You used Double Circular","Move Used",0,DoubleCircular);
                    }
                    if(partner==true){
                    JOptionPane.showMessageDialog(null,"David attacks and does 30 DMG","Companion Attack",0,null);
                    Monster3 = Monster3-30;
                    }
                    if (Monster3<=0){
                        break;
                    }
                    //Min + (int)(Math.random() * ((Max - Min) + 1))
                    int damage = 40 + (int)(Math.random() * ((50 - 40) + 1));
                    //boss damage calculation
                    character = character-damage;
                    //damage taken
                    JOptionPane.showMessageDialog(null,"The Final Boss attacks you back!","Boss attack",0,Boss);
                    //displaying message that boss attacks
                    if (character>0){
                    JOptionPane.showMessageDialog(null,"The Final Boss has done "+damage+" damage on you!"+" You're at "+character+" health.","Health",0,null);
                    //displaying damage boss is doing to player and displaying player's health
                    JOptionPane.showMessageDialog(null,"The Final Boss's health is at "+Monster3," HP",0,Boss);
                    //displaying boss's health
                    }
                    else{
                    JOptionPane.showMessageDialog(null,"GAME OVER, The FINAL BOSS has defeated you with "+Monster3+" health remaining!","Over",0,GameOver);
                    //displaying game over screen player's health has reached 0 or less
                    System.exit(1);
                        }   
                    }
                    JOptionPane.showMessageDialog(null,"You have defeated the FINAL BOSS.","WINNER",0,Victory);
                    //player has defeated the boss
                    JOptionPane.showMessageDialog(null,"It is finally over you get to go home","WINNER",0,Victory);
                    //displaying message to player saying they can go home
                    JOptionPane.showMessageDialog(null,"Thank you for playing","Thanks",0,null);
                    JOptionPane.showMessageDialog(null,"Your name is "+name,"Name",0,null);
                    JOptionPane.showMessageDialog(null,"You're a male","Sex",0,null);
                    if (lovelysleep==0){
                        JOptionPane.showMessageDialog(null,"You had a good night's sleep.","Good night's sleep",0,null);
                    }
                    else{
                        JOptionPane.showMessageDialog(null,"You did not have a good night's sleep","No good sleep",0,null);
                    }
                    JOptionPane.showMessageDialog(null,"Your username was "+S1,"Username was",0,null);
                    JOptionPane.showMessageDialog(null,"Your password was "+S2,"Password was",0,null);
                    if(partner==true){
                        JOptionPane.showMessageDialog(null,"You joined David's party.","Joined Party",0,null);
                    }
                    else{
                        JOptionPane.showMessageDialog(null,"You did not join David's party.","Did not join",0,null);
                    }
                    if(cabin==0){
                        JOptionPane.showMessageDialog(null,"You went towards the cabin","Cabin",0,null);
                    }
                    else{
                        JOptionPane.showMessageDialog(null,"You did not go towards the cabin","Cabin",0,null);
                    }
                    if(choicess==0){
                        JOptionPane.showMessageDialog(null,"The first question you asked the old man was \"Where am I?\"","Question",0,null);
                    }
                    else{
                        JOptionPane.showMessageDialog(null,"The first question you asked the old man was \"Who are you?\"","Question",0,null);
                    }
                    JOptionPane.showMessageDialog(null,"On your journey you were a Warrior Class. You went through Grass Plains and Forest.","Path",0,null);
                    //displaying choices player has made throughout the game
                }
                
            }
        }
        //If user is a female they run this code
        else if (gender==1){
            JOptionPane.showMessageDialog(null,"GOOD MORNING "+name+"!"+" My lovely daughter!","Morning",0,mom);
            int lovelysleep = JOptionPane.showOptionDialog(null,"Did you have a good night's sleep?","Good Sleep?",0,0,null,options,null);
            //Asking user a Yes or No question with if and else that have different responses
            if (lovelysleep==0){
                JOptionPane.showMessageDialog(null,"I'm happy to hear that. Nikki called earlier today looking for you. You call her back.","Call",0,MissedCall);
                //display message, response to player's message if choice 0
            }
            else if (lovelysleep==1){
                JOptionPane.showMessageDialog(null,"I hope everything to alright. Nikki called earlier today looking for you. You should call her back.","Call",0,MissedCall);
                //dialog message in response to choice 1
            }
            //Using showMessageDialog to further the story
            JOptionPane.showMessageDialog(null,"You pick up your phone, and see a text from Nikki","Text",0,null);
            JOptionPane.showMessageDialog(null,"You start running towards your computer, and in your head you're thinking about your login infomation","Login",0,ThinkingFemale);
            //Declaring arrays for future use
            String S2="";
            String S1="";
           //3 outcomes for usernames depending on the number rolled between 1-3
           int username = 1 + (int)(Math.random() * ((3 - 1) + 1));
           if(username==1){
               JOptionPane.showMessageDialog(null,"You remember that your Username: fluffy"+name+" (Remember this)","Username",0,null);
               S1 = "fluffy"+name;
           }
           else if (username==2){
               JOptionPane.showMessageDialog(null,"You remember that your Username: "+name+"TheLegend (Remember this)","Username",0,null);
               S1 = name+"TheLegend";
           }
           else if (username==3){
               JOptionPane.showMessageDialog(null,"You remember that your Username: "+name+"Valk (Remember this)","Username",0,null);
               S1 = name+"Valk";
           }
           //3 outcomes for passwords depending on the number rolled between 1-3
           int password = 1 + (int)(Math.random() * ((3 - 1) + 1));
           if(password==1){
               JOptionPane.showMessageDialog(null,"You also remember your password is SDSDF (Remember this)","Password",0,null);
               S2="SDSDF";
           }
           else if (password==2){
               JOptionPane.showMessageDialog(null,"You also remember your password is Smiles (Remember this)","Password",0,null);
               S2="Smiles";
           }
           else if (password==3){
               JOptionPane.showMessageDialog(null,"You also remember your password is DogsHavePants (Remember this)","Password,",0,null);
               S2="DogsHavePants";
           }
            //Asking user to type in username
            String S3 = JOptionPane.showInputDialog("Please enter your Username");
            //Comparing input username to real username. If correct proceeds to password input, else program stops
            boolean User = S1.equalsIgnoreCase(S3);
            if(User==true){
                String S4 = JOptionPane.showInputDialog("Username exists. Please enter your password.");
                //Asking user for the password
                boolean truepass = S2.equalsIgnoreCase(S4);
                //Comparing input password to real password. If correct proceeds to next part, else program stops
                if(truepass==true){
                    JOptionPane.showMessageDialog(null,"Sucessful Login","Login Sucess",0,LoginSuccess);
                    //Giving user another Yes or No Choice
                    int party = JOptionPane.showOptionDialog(null,"You recieve a party invite from Nikki. Do you accept?","Party Invite",0,0,PartyInvite,options,null);
                    if(party==0){
                        partner = true;
                        JOptionPane.showMessageDialog(null,"Nikki is happy you join his party, and starts up talking to you.","Party",0,null);
                       int hear = JOptionPane.showOptionDialog(null,"Did you hear about the new endgame move Piercing Stream?","New Move",0,0,null,options,null);
                       if(hear==0){
                           JOptionPane.showMessageDialog(null,"Isn't it cool? I heard they also had another move called Flashing Penetrator if you go Grass Plains then Forest.","Hinted",0,null);
                           JOptionPane.showMessageDialog(null,"Alright, enough with the talking lets start the queue!","Hint Missed",0,null);
                       }
                       else{
                           JOptionPane.showMessageDialog(null,"Oh. Its a move that does 300 DMG in one hit. You get it if you go through Cave then Lavapit","Hinted",0,null);
                           int another = JOptionPane.showOptionDialog(null,"Do you want to hear about another move?","Another Hint",0,0,null,options,null);
                           if(another==0){
                               JOptionPane.showMessageDialog(null,"There is another move they added called Flashing Penetrator. It does 250 DMG, kind of a downgrade from Piercing Stream but still good. You learn it from going through Grass Plains and Forest.","Hinted",0,null);
                           }
                           else{
                               JOptionPane.showMessageDialog(null,"Oh ok. Lets just start the queue then!","Hint Missed",0,null);
                           }
                       }
                    }
                    else{
                        partner = false;
                        JOptionPane.showMessageDialog(null,"Nikki messages you on why you declined, but you ignore it and queue up on your own","What?",0,null);
                    }
                }
                else{
                    JOptionPane.showMessageDialog(null,"You remembered the username but not the password.... GET IT NEXT TIME","Fail",0,GameOver);
                    System.exit(1);
                }
            }
            else{
                JOptionPane.showMessageDialog(null,"You HAD ONE JOB to remember the username and password. GET IT NEXT TIME","Fail",0,GameOver);
                System.exit(1);
            }
            String[]optionss ={"Yes","No"};
        JOptionPane.showMessageDialog(null,"You get a message ingame from an unknown source, with a link","Link",0,Message);
        int open =JOptionPane.showOptionDialog(null,"Do you open the email?","Opening?",0,0,Message,optionss,null);
        while (open!=0){
            open =JOptionPane.showOptionDialog(null,"Looks like you cannot say no.....","Opening?",0,0,Message,optionss,Message);
            //Asking User if they want to open the message but giving them only one option
        }
        if (open==0){
            JOptionPane.showMessageDialog(null,"The email opens, and your screen turns blue","Opened",0,BlueScreen);
            JOptionPane.showMessageDialog(null,"All of a sudden the world around you turns white, and beams of colors come at you. You question if you're dreaming. YOU BLACK OUT","Portal",0,Portal);
        }
        JOptionPane.showMessageDialog(null,".....","Wake",0,null);
        JOptionPane.showMessageDialog(null,"You wake up and see you are in an open field near a lake. Mountains surround you, it seems very peaceful","Waking up",0,Fields);
        //Displaying where the user is 
        int cabin = JOptionPane.showOptionDialog(null,"You see a cabin. Do you walk towards it?","Cabin",0,0,Cabin,optionss,null);
        //Asking user if they want to walk torwards the cabin
        if (cabin==0){
            JOptionPane.showMessageDialog(null,"You walk towards the cabin and get there. You knock on the door but no one answers.","Knocking",0,null);
            JOptionPane.showMessageDialog(null,"You walk around scouting it,all of sudden you hear someone yelling.\"HEY WHAT ARE YOU DOING NEAR MY HOME\"","Yelling",0,null);
            //User meets old man throught interaction after choice 0
        }
        else{
            JOptionPane.showMessageDialog(null,"You walk away from the Cabin and towards the lake, You see an old man and walk towards him ","Lake",0,null);
            JOptionPane.showMessageDialog(null,"As you walk towards him the old man twitches and turns around,and yells \"WHAT DO YOU WANT CHILD\"","Confront",0,null);
            //User meets old man through interaction through choice 1
        
    }
        String[]choices={"Where am I","Who are you?"};
        //Declaring String choice
        int choicess = JOptionPane.showOptionDialog(null,"You continue to walk towards him. You decide to ask him?","Choice",0,0,OldMan,choices,null);
        //Asking user which question to ask the old man
        if (choicess==0){
            JOptionPane.showMessageDialog(null,"This is the beta test. If you die here, you die in real life!.","Where am I?",0,OldMan);
            JOptionPane.showMessageDialog(null,"You must beat the game to get out.","Where am I?",0,OldMan);
            //User interaction after choice 0
            String[]choice1={"Who are you?"};
                int single = JOptionPane.showOptionDialog(null,"You ask him another question?","Another Question",0,0,OldMan,choice1,null);
                //Asking user if they want to ask the other question
                if (single==0){
                    JOptionPane.showMessageDialog(null,"Me? I'm an elder who has been stuck here for centuries. I'm Immortal here but I want to get out.","Who are you?",0,OldMan);
                }
            }
                else if (choicess==1){
                JOptionPane.showMessageDialog(null,"Me? I'm an elder who has been stuck here for centuries. I'm Immortal here but I want to get out.","Who are you?",0,OldMan);
                //User interaction after choice 1
                String[]choice1={"Where am I"};
                int single = JOptionPane.showOptionDialog(null,"You ask him another question?","Another Question",0,0,OldMan,choice1,null);
                if (single==0){
                   
                     JOptionPane.showMessageDialog(null,"This is the beta test. If you die here, you die in real life!.","Where am I?",0,OldMan);
                     JOptionPane.showMessageDialog(null,"You must beat the game to get out.","Where am I?",0,OldMan);
                     //if choice 0 dialog message is displayed
                }
            }
            JOptionPane.showMessageDialog(null,"I've been waiting for someone like to come. You shall set of on your journey, to free yourself.","Waiting",0,null);
            JOptionPane.showMessageDialog(null,"I shall come with you as a healer.","Waiting",0,null);
            if(partner==true){
            JOptionPane.showMessageDialog(null,"Nikki spawns in and joins you on your journey.(He does an extra 30 DMG to the Monster with every turn)","David",0,null);
            }
            //dialog message from npc
            //START OF THE BATTLE SYSTEM
            JOptionPane.showMessageDialog(null,"According to your build, you're the DPS class.","DPS",0,null);
            //displaying player's class
            JOptionPane.showMessageDialog(null,"You set off your on your adventure","Adventure",0,null);
            //message dialog from npc
            String[]twoareas ={"Cave","Grass Plain"};
            //string choice to choose which path
            int area1 = JOptionPane.showOptionDialog(null,"You encounter a cross road, where do you want to go?","Where do go",0,0,null,twoareas,null);
            //asking player to choose a path
            int really = JOptionPane.showConfirmDialog(null,"Are you sure?","Really?",0,0,null);
            //asking player are they sure
            while (really!=0){
            area1 = JOptionPane.showOptionDialog(null,"You encounter a cross road, where do you want to go?","Where do go",0,0,null,twoareas,null);
            //asking player to choose  path
            really = JOptionPane.showConfirmDialog(null,"Are you sure?","Really?",0,0,null);
            //asking player are they sure
            }
            //CHOICE IS TO CAVE (DPS)
            if(area1==0){
                JOptionPane.showMessageDialog(null,"You and the old man walk into the cave","Cave",0,Cave);
                //if choice 0 player and npc walks into a cave
                 JOptionPane.showMessageDialog(null,"All of a sudden a monster appears, and you ready your weapon!","Cave",0,MonsterC);
                 //monster appears
                 String[]options1={"Pierce (60 DMG)","Sting (30 DMG, +20 HP)"};
                 //string options for attack options
            int Monster = 200;
            //monster health
            int character = 100;
            //player health
        
            JOptionPane.showMessageDialog(null,"You encountered a monster that is at "+Monster+" health","Monster encounter",0,MonsterC);
            //displaying mounter encounter and monster health
        
             while(Monster>0)
            { 
            int choice = JOptionPane.showOptionDialog(null,"What do you want to do","Move",0,0,MonsterC,options1,null);
            //asking player what they want to do
            if (choice==0)
            {
                Monster = Monster-60;
                //if choice 0 monster takes 60 damage
                JOptionPane.showMessageDialog(null,"You used Pierce","Move Used",0,Pierce);
            }
            else if (choice==1)
            {
                Monster = Monster-30;
                character= character+20;
                //if choice 1 monster takes 30 damage and player heals 20 health
                JOptionPane.showMessageDialog(null,"You used Sting","Move Used",0,Sting);
                JOptionPane.showMessageDialog(null,"You're at "+character+" health.","Healed",0,null);
                //displaying player's health
            }
            if(partner==true){
                JOptionPane.showMessageDialog(null,"Nikki attacks and does 30 DMG","Companion Attack",0,null);
                Monster = Monster-30;
            }
            if (Monster<=0){
                break;
            }
            //Min + (int)(Math.random() * ((Max - Min) + 1))
            int damage = 10 + (int)(Math.random() * ((30 - 10) + 1));
            int random = 1 + (int)(Math.random() * ((100- 1) + 1));
            //damage and dodge chance
            JOptionPane.showMessageDialog(null,"The Monster attacks you back!","Monster attack",0,MonsterC);
            //monster attacks
            if(random<=15){
                damage = 0;
                JOptionPane.showMessageDialog(null,"You were able to dodge the monster Dodged","Dodged",0,null);
                //dodge
            }
            else{
                JOptionPane.showMessageDialog(null,"You failed to dodge","Did not dodge",0,null);
                character = character-damage;
                //damage taken
            }
            JOptionPane.showMessageDialog(null,"The Monster attacks you back!","Monster attack",0,MonsterC);
            //monster attacks
            if (character>0){
                JOptionPane.showMessageDialog(null,"The monster has done "+damage+" damage on you!"+" You're at "+character+" health.","Health",0,null);
                //monster damage and displaying player's health
                JOptionPane.showMessageDialog(null,"The monster's health is at "+Monster,"Monster health",0,MonsterC);
                //displaying monster's health
            }
            else{
                JOptionPane.showMessageDialog(null,"GAME OVER, The monster has defeated you with "+Monster+" health remaining!","Over",0,GameOver);
                //displaying game over screen player's health has reached 0 or less
                System.exit(1);
                }   
            }
                JOptionPane.showMessageDialog(null,"You have defeated the monster.","WINNER",0,null);
                //player has defeated monster
                JOptionPane.showMessageDialog(null,"You have learned a new ability \"Shooting Star \". It deals 70 DMG and heals 40 HP.","New ability",0,null);
                //new skill learned
                JOptionPane.showMessageDialog(null,"You also have 5% higher dodge chance. You're now at 20% dodge chance.","New ability",0,null);
                //higher dodge percentage increased
                JOptionPane.showMessageDialog(null,"The old man restores you back to full health, any overheals have been removed.","Health",0,null);
                //restoring player's health to normal
                
                
                //NEW ROUTES (DPS,CAVE)
                String[]twoareas2 ={"Mountian","Lava Pit"};
                //string choice 2 paths
                int area2 = JOptionPane.showOptionDialog(null,"You encounter a cross road, where do you want to go?","Where do go",0,0,null,twoareas2,null);
                //asking player where they want to go
                int really2= JOptionPane.showConfirmDialog(null,"Are you sure?","Really?",0,0,null);
                //asking player are they sure
                while (really2!=0){
                area2 = JOptionPane.showOptionDialog(null,"You encounter a cross road, where do you want to go?","Where do go",0,0,null,twoareas2,null);
                //asking player where they want to go
                really2 = JOptionPane.showConfirmDialog(null,"Are you sure?","Really?",0,0,null);
                //asking player are they sure
                }
                
                // CHOICE MOUNTIAN DPS
                 if (area2==0){
                JOptionPane.showMessageDialog(null,"You and the old man walk into the Mountian","Mountian",0,Mountain);
                //if mountain choice player goes to mountain
                JOptionPane.showMessageDialog(null,"All of a sudden a monster appears, and you ready your weapon!","Lake",0,MonsterM);
                //monster encounter
                String[]options2={"Pierce (60 DMG)","Sting (30 DMG, +20 HP)","Shooting Star (70 DMG, +40 HP)"};
                //displaying string options for attacks
                int Monster2 = 300;
                //monster health
                character = 100;
                //player health
                JOptionPane.showMessageDialog(null,"You encountered a monster that is at 300 health","Monster encounter",0,MonsterM);
                //displaying monster's health
        
                while(Monster2>0)
                { 
                int choice = JOptionPane.showOptionDialog(null,"What do you want to do","Move",0,0,MonsterM,options2,null);
                //asking player what they want to do
                if (choice==0)
                {
                    Monster2 = Monster2-60;
                    //if choice 0 monster takes 60 damage
                    JOptionPane.showMessageDialog(null,"You used Pierce","Move Used",0,Pierce);
                }
                else if (choice==1)
                {
                    Monster2 = Monster2-30;
                    character= character+20;
                    //if choice 1 monster takes 30 damage and character heals 20 health
                    JOptionPane.showMessageDialog(null,"You used Sting","Move Used",0,Sting);
                    JOptionPane.showMessageDialog(null,"You're at "+character+" health.","Healed",0,null);
                    //displaying player's health
                }
                else if (choice==2){
                    Monster2 = Monster2-70;
                    character= character+40;
                    //if choice 2 monster takes 70 damage and player gains 40 health
                    JOptionPane.showMessageDialog(null,"You used Shooting Star","Move Used",0,ShootingStar);
                    JOptionPane.showMessageDialog(null,"You're at "+character+" health.","Healed",0,null);
                    //displaying player's health
                }
                if(partner==true){
                JOptionPane.showMessageDialog(null,"Nikki attacks and does 30 DMG","Companion Attack",0,null);
                Monster2 = Monster2-30;
                }
                if (Monster2<=0){
                    break;
                }
                //Min + (int)(Math.random() * ((Max - Min) + 1))
                int damage = 10 + (int)(Math.random() * ((30 - 10) + 1));
                int random = 1 + (int)(Math.random() * ((100- 1) + 1));
                //monster damage
                JOptionPane.showMessageDialog(null,"The Monster attacks you back!","Monster attack",0,MonsterM);
                //monster attacks
                if(random<=20){
                damage = 0;
                JOptionPane.showMessageDialog(null,"You were able to dodge the monster Dodged","Dodged",0,null);
                //dodge
                }
                else{
                JOptionPane.showMessageDialog(null,"You failed to dodge","Did not dodge",0,null);
                character = character-damage;
                //damage taken
                }
                JOptionPane.showMessageDialog(null,"The Monster attacks you back!","Monster attack",0,MonsterM);
                //monster attacks
                if (character>0){
                JOptionPane.showMessageDialog(null,"The monster has done "+damage+" damage on you!"+" You're at "+character+" health.","Health",0,null);
                //monster damage and player's health
                JOptionPane.showMessageDialog(null,"The monster's health is at "+Monster2,"Monster health",0,MonsterM);
                //monster's health
                }
                else{
                    JOptionPane.showMessageDialog(null,"GAME OVER, The monster has defeated you with "+Monster2+" health remaining!","Over",0,GameOver);
                    //displaying game over screen player's health has reached 0 or less
                    System.exit(1);
                    }   
                  }
                    JOptionPane.showMessageDialog(null,"You have defeated the monster.","WINNER",0,null);
                    //Player has defeated the monster
                    JOptionPane.showMessageDialog(null,"You learned \"Parallel Sting\". It does (300 DMG)","New ability",0,null); 
                    JOptionPane.showMessageDialog(null,"Your dodge chance has increased to 30 Percent","New ability",0,null);  
                    //new skill and dodge chance increased
                    JOptionPane.showMessageDialog(null,"The old man restores you back to full health, any overheals have been removed.","Health",0,null);
                    //restoring player's health to full
                    //BOSS FIGHT AFTER THIS CODE
                    String[]options3={"Pierce (60 DMG)","Sting (30 DMG, +20 HP)","Shooting Star (70 DMG, +40 HP)","Parallel String (300 DMG)"}; 
                    //String options for attack
                    int Monster3 = 800;
                    //boss's health
                    character=100; 
                    //player's health
        
                    JOptionPane.showMessageDialog(null,"This is the final boss it is at "+Monster3+" health","FINAL BOSS FIGHT",0,Boss);
                    //displaying boss's health
        
                    while(Monster3>0)
                    { 
                    int choice = JOptionPane.showOptionDialog(null,"What do you want to do","Move",0,0,Boss,options3,null);    
                    //asking player what they want to do
                    if (choice==0)
                    {
                     Monster3 = Monster3-60;
                     //if choice 0 boss takes 60 damage
                     JOptionPane.showMessageDialog(null,"You used Pierce","Move Used",0,Pierce);
                    }
                    else if (choice==1)
                    {
                     Monster3 = Monster3-30;
                     character= character+20;
                     //if choice 1 boss takes 30 damage and character heals 20 health
                     JOptionPane.showMessageDialog(null,"You used Sting","Move Used",0,Sting);
                     JOptionPane.showMessageDialog(null,"You're at "+character+" health.","Healed",0,null);
                     //displaying player's health
                    }
                    else if(choice==2){
                     Monster3 = Monster3-70;
                     character= character+40;
                     //if choice 2 monster takes 70 damage and player heals 40 health
                     JOptionPane.showMessageDialog(null,"You used Shooting Star","Move Used",0,ShootingStar);
                     JOptionPane.showMessageDialog(null,"You're at "+character+" health.","Healed",0,null);  
                     //displaying player's health
                    }
                    else if (choice==3){
                     Monster3 = Monster3-300;
                     JOptionPane.showMessageDialog(null,"You used Parallel Sting","Move Used",0,ParallelSting);
                     //if choice 3 monster takes 300 damage
                    }
                    if(partner==true){
                    JOptionPane.showMessageDialog(null,"Nikki attacks and does 30 DMG","Companion Attack",0,null);
                    Monster3 = Monster3-30;
                    }
                    if (Monster3<=0){
                        break;
                    }
                    //Min + (int)(Math.random() * ((Max - Min) + 1))
                    int damage = 40 + (int)(Math.random() * ((50 - 40) + 1));
                    int random = 1 + (int)(Math.random() * ((100- 1) + 1));
                    //boss's damage
                    JOptionPane.showMessageDialog(null,"The Monster attacks you back!","Monster attack",0,Boss);
                    //boss attacks
                    if(random<=30){
                    damage = 0;
                    JOptionPane.showMessageDialog(null,"You were able to dodge the monster Dodged","Dodged",0,null);
                    //dodge
                    }
                    else{
                        JOptionPane.showMessageDialog(null,"You failed to dodge","Did not dodge",0,null);
                        character = character-damage;
                        //damage player takes
                    }
                    JOptionPane.showMessageDialog(null,"The Final Boss attacks you back!","Boss attack",0,Boss);
                    //boss attack
                    if (character>0){
                        JOptionPane.showMessageDialog(null,"The Final Boss has done "+damage+" damage on you!"+" You're at "+character+" health.","Health",0,null);
                        //boss damage dealt and player's health
                        JOptionPane.showMessageDialog(null,"The Final Boss's health is at "+Monster3," HP",0,Boss);
                        //Boss's health
                    }
                    else{
                        JOptionPane.showMessageDialog(null,"GAME OVER, The FINAL BOSS has defeated you with "+Monster3+" health remaining!","Over",0,GameOver);
                        //displaying game over screen, player's health has reached 0 or less
                        System.exit(1);
                    }   
                }
                JOptionPane.showMessageDialog(null,"You have defeated the FINAL BOSS.","WINNER",0,Victory);
                //Boss defeated
                JOptionPane.showMessageDialog(null,"It is finally over you get to go home","WINNER",0,Victory);
                JOptionPane.showMessageDialog(null,"Thank you for playing","Thanks",0,null);
                JOptionPane.showMessageDialog(null,"Your name is "+name,"Name",0,null);
                JOptionPane.showMessageDialog(null,"You're a female","Sex",0,null);
                if (lovelysleep==0){
                    JOptionPane.showMessageDialog(null,"You had a good night's sleep.","Good night's sleep",0,null);
                }
                else{
                    JOptionPane.showMessageDialog(null,"You did not have a good night's sleep","No good sleep",0,null);
                }
                JOptionPane.showMessageDialog(null,"Your username was "+S1,"Username was",0,null);
                JOptionPane.showMessageDialog(null,"Your password was "+S2,"Password was",0,null);
                if(partner==true){
                    JOptionPane.showMessageDialog(null,"You joined Nikki's party.","Joined Party",0,null);
                }
                else{
                    JOptionPane.showMessageDialog(null,"You did not join Nikki's party.","Did not join",0,null);
                }
                if(cabin==0){
                    JOptionPane.showMessageDialog(null,"You went towards the cabin","Cabin",0,null);
                }
                else{
                    JOptionPane.showMessageDialog(null,"You did not go towards the cabin","Cabin",0,null);
                }
                if(choicess==0){
                    JOptionPane.showMessageDialog(null,"The first question you asked the old man was \"Where am I?\"","Question",0,null);
                }
                else{
                    JOptionPane.showMessageDialog(null,"The first question you asked the old man was \"Who are you?\"","Question",0,null);
                }
                JOptionPane.showMessageDialog(null,"On your journey you were a DPS Class. You went through Cave and Mountian.","Path",0,null);
                //Reviewing choices made during the game

            }
                 



                //LAVA PIT DPS  
                else if (area2==1){
                JOptionPane.showMessageDialog(null,"You and the old man walk into the Lava Pit","Lava Pit",0,LavaPit);
                //Lava pit if player chose choice 1
                JOptionPane.showMessageDialog(null,"You encountered a monster that is at 300 health","Monster encounter",0,MonsterLP);
                //monster encounter
                
                
                int Monster2 = 300;
                //monster health
                String[]options2={"Pierce (60 DMG)","Sting (30 DMG, +20 HP)","Shooting Star (70 DMG, +40 DMG"};
                //string choices for attack
                character = 100;
                //player health
                while(Monster2>0)
                { 
                int choice = JOptionPane.showOptionDialog(null,"What do you want to do","Move",0,0,MonsterLP,options2,null);    
                //asking player what they want to do
                if (choice==0)
                {
                Monster2 = Monster2-60;
                //if choice 0 monster takes 60 damage
                JOptionPane.showMessageDialog(null,"You used Pierce","Move Used",0,Pierce);
                }
                else if (choice==1)
                {
                Monster2 = Monster2-30;
                character= character+20;
                //if choice 1 monster takes 30 damage and player heals 20 health
                JOptionPane.showMessageDialog(null,"You used Sting","Move Used",0,Sting);
                JOptionPane.showMessageDialog(null,"You're at "+character+" health.","Healed",0,null);
                //displaying player's health
                }
                else if (choice==2){
                Monster2 = Monster2-70;
                character= character+40;
                JOptionPane.showMessageDialog(null,"You used Shooting Star","Move Used",0,ShootingStar);
                //if choice 2 monster takes 70 damage and player heals 40 health
                JOptionPane.showMessageDialog(null,"You're at "+character+" health.","Healed",0,null);
                //Displaying player's health
                }
                if(partner==true){
                JOptionPane.showMessageDialog(null,"Nikki attacks and does 30 DMG","Companion Attack",0,null);
                Monster2 = Monster2-30;
                }
                if (Monster2<=0){
                break;
                }
                //Min + (int)(Math.random() * ((Max - Min) + 1))
                 int damage = 10 + (int)(Math.random() * ((30 - 10) + 1));
                 int random = 1 + (int)(Math.random() * ((100- 1) + 1));
                 //monster damage
                 JOptionPane.showMessageDialog(null,"The Monster attacks you back!","Monster attack",0,MonsterLP);
                 //monster attacks player
                if(random<=20){
                damage = 0;
                JOptionPane.showMessageDialog(null,"You were able to dodge the monster Dodged","Dodged",0,null);
                //dodge
                }
                else{
                JOptionPane.showMessageDialog(null,"You failed to dodge","Did not dodge",0,null);
                character = character-damage;
                //damage taken
                }
                JOptionPane.showMessageDialog(null,"The Monster attacks you back!","Monster attack",0,MonsterLP);
                //monster attacks player
                if (character>0){
                JOptionPane.showMessageDialog(null,"The monster has done "+damage+" damage on you!"+" You're at "+character+" health.","Health",0,null);
                //damage monster has dealt and player's health
                JOptionPane.showMessageDialog(null,"The monster's health is at "+Monster2,"Monster health",0,MonsterLP);
                //displaying monster's health
                }
                else{
                JOptionPane.showMessageDialog(null,"GAME OVER, The monster has defeated you with "+Monster2+" health remaining!","Over",0,GameOver);
                //displaying game over screen player's health has reached 0 or less
                System.exit(1);
                }   
            }
                JOptionPane.showMessageDialog(null,"You have defeated the monster.","WINNER",0,null);
                //monster defeated
                JOptionPane.showMessageDialog(null,"You learned \"Piercing Stream\". This ability does 350 DMG.","New",0,null); 
                JOptionPane.showMessageDialog(null,"You now have a 30% dodge rate","New",0,null);
                //new skill and increased dodge chance
                JOptionPane.showMessageDialog(null,"The old man restores you back to full health, any overheals have been removed.","Health",0,null);
                //restoring player's health to normal
                //BOSS FIGHT CODE AFTER THIS
                String[]options3={"Pierce (60 DMG)","Sting (30 DMG, +20 HP)","Shooting Star (70 DMG, +40 DMG","Piercing Stream (350 DMG)"};
                //displaying string choices for attack
                int Monster3 = 800;
                //boss health
                character=100; 
                //player's health
        
                JOptionPane.showMessageDialog(null,"This is the final boss it is at "+Monster3+" health","FINAL BOSS FIGHT",0,Boss);
                //displaying boss's health
        
                while(Monster3>0)
                { 
                int choice = JOptionPane.showOptionDialog(null,"What do you want to do","Move",0,0,Boss,options3,null);  
                //asking player what they want to do
                    if (choice==0)
                    {
                        Monster3 = Monster3-60;
                        //if choice 0 boss takes 60 damage
                        JOptionPane.showMessageDialog(null,"You used Pierce","Move Used",0,Pierce);
                    }
                    else if (choice==1)
                    {
                        Monster3 = Monster3-30;
                        character= character+20;
                        //if choice 1 monster takes 30 damage and player heals 20 health    
                        JOptionPane.showMessageDialog(null,"You used Sting","Move Used",0,Sting);
                        JOptionPane.showMessageDialog(null,"You're at "+character+" health.","Healed",0,null);
                        //displaying player's health
                    }
                    else if (choice==2)
                    {
                        Monster3 = Monster3-70;
                        character= character+40;
                        //if choice 2 boss takes 70 damage and player heals 40 health
                        JOptionPane.showMessageDialog(null,"You used Shooting Star","Move Used",0,ShootingStar);
                        JOptionPane.showMessageDialog(null,"You're at "+character+" health.","Healed",0,null);
                        //displaying player's health
                    }
                    else if (choice==3){
                        Monster3 = Monster3-350;
                        //if choice 3 boss takes 350 health
                        JOptionPane.showMessageDialog(null,"You used Piercing Stream","Move Used",0,PiercingStream);
                    }
                    if(partner==true){
                    JOptionPane.showMessageDialog(null,"Nikki attacks and does 30 DMG","Companion Attack",0,null);
                    Monster3 = Monster3-30;
                    }
                    if (Monster3<=0){
                        break;
                    }
                    //Min + (int)(Math.random() * ((Max - Min) + 1))
                    int damage = 40 + (int)(Math.random() * ((50 - 40) + 1));
                    int random = 1 + (int)(Math.random() * ((100- 1) + 1));
                    //boss damage
                    JOptionPane.showMessageDialog(null,"The Monster attacks you back!","Monster attack",0,Boss);
                    //monster attacks player
                    if(random<=30){
                        damage = 0;
                        JOptionPane.showMessageDialog(null,"You were able to dodge the monster Dodged","Dodged",0,null);
                        //dodge
                    }
                    else{
                    JOptionPane.showMessageDialog(null,"You failed to dodge","Did not dodge",0,null);
                    character = character-damage;
                    //damage taken
                    }
                    JOptionPane.showMessageDialog(null,"The Final Boss attacks you back!","Boss attack",0,Boss);
                    //boss attacks player
                     if (character>0){
                     JOptionPane.showMessageDialog(null,"The Final Boss has done "+damage+" damage on you!"+" You're at "+character+" health.","Health",0,null);
                     //boss's damage and player's health
                     JOptionPane.showMessageDialog(null,"The Final Boss's health is at "+Monster3," HP",0,Boss);
                     //displaying boss's health
                    }
                    else{
                        JOptionPane.showMessageDialog(null,"GAME OVER, The FINAL BOSS has deafed you with "+Monster3+" health remaining!","Over",0,GameOver);
                        //displaying game over screen player's health has reached 0 or less
                        System.exit(1);
                    }   
                }
                    JOptionPane.showMessageDialog(null,"You have defeated the FINAL BOSS.","WINNER",0,Victory);
                    //player has defeated the boss
                    JOptionPane.showMessageDialog(null,"It is finally over you get to go home","WINNER",0,Victory);
                    JOptionPane.showMessageDialog(null,"Thank you for playing","Thanks",0,null);
                    JOptionPane.showMessageDialog(null,"Your name is "+name,"Name",0,null);
                    JOptionPane.showMessageDialog(null,"You're a female","Sex",0,null);
                    if (lovelysleep==0){
                        JOptionPane.showMessageDialog(null,"You had a good night's sleep.","Good night's sleep",0,null);
                    }
                    else{
                        JOptionPane.showMessageDialog(null,"You did not have a good night's sleep","No good sleep",0,null);
                    }
                    JOptionPane.showMessageDialog(null,"Your username was "+S1,"Username was",0,null);
                    JOptionPane.showMessageDialog(null,"Your password was "+S2,"Password was",0,null);
                    if(partner==true){
                    JOptionPane.showMessageDialog(null,"You joined Nikki's party.","Joined Party",0,null);
                    }
                    else{
                    JOptionPane.showMessageDialog(null,"You did not join Nikki's party.","Did not join",0,null);
                    }
                    if(cabin==0){
                        JOptionPane.showMessageDialog(null,"You went towards the cabin","Cabin",0,null);
                    }
                    else{
                        JOptionPane.showMessageDialog(null,"You did not go towards the cabin","Cabin",0,null);
                    }
                    if(choicess==0){
                        JOptionPane.showMessageDialog(null,"The first question you asked the old man was \"Where am I?\"","Question",0,null);
                    }
                    else{
                        JOptionPane.showMessageDialog(null,"The first question you asked the old man was \"Who are you?\"","Question",0,null);
                    }
                        JOptionPane.showMessageDialog(null,"On your journey you were a DPS Class. You went through Cave and Lavapit.","Path",0,null);
                        //reviewing choices player has made through out the game
            }
        }
            
            
            

            
            
            //CHOICE IS TO GRASS PLAINS  DPS
            else if (area1==1){
                 JOptionPane.showMessageDialog(null,"You and the old man walk towards the grass plains ","Grass Plains",0,GrassPlain);
                 //player chooses grass plains
                 JOptionPane.showMessageDialog(null,"All of a sudden a monster appears, and you ready your weapon!","Grass Plains",0,MonsterGP);
                 //monster encounter
                 String[]options1={"Pierce (60 DMG)","Sting (30 DMG, +20 HP)"};
                 //string option for attacks
                 int Monster = 200;
                 //monster health
                 int character = 100;
                 //player health
        
                 JOptionPane.showMessageDialog(null,"You encountered a monster that is at 200 health","Monster encounter",0,MonsterGP);
                 //monster encounter
        
                 while(Monster>0)
                 { 
                    int choice = JOptionPane.showOptionDialog(null,"What do you want to do","Move",0,0,MonsterGP,options1,null);
                    //asking player what to do
                    if (choice==0)
                    {
                        Monster = Monster-60;
                        //if choice 0 monster takes 60 damage
                        JOptionPane.showMessageDialog(null,"You used Pierce","Move Used",0,Pierce);
                    }
                    else if (choice==1)
                    {
                    Monster = Monster-30;
                    character= character+20;
                    //if choice 1 monster takes 30 damage and player gains 20 health
                    JOptionPane.showMessageDialog(null,"You used Sting","Move Used",0,Sting);
                    JOptionPane.showMessageDialog(null,"You're at "+character+" health.","Healed",0,null);
                    //displaying player's health
                    }
                    if(partner==true){
                    JOptionPane.showMessageDialog(null,"Nikki attacks and does 30 DMG","Companion Attack",0,null);
                    Monster = Monster-30;
                    }
                    if (Monster<=0){
                        break;
                    }
                    //Min + (int)(Math.random() * ((Max - Min) + 1))
                    int damage = 10 + (int)(Math.random() * ((30 - 10) + 1));
                    int random = 1 + (int)(Math.random() * ((100- 1) + 1));
                    //monster damage
                    JOptionPane.showMessageDialog(null,"The Monster attacks you back!","Monster attack",0,MonsterGP);
                    //monster attacks
                    if(random<=15){
                        damage = 0;
                    JOptionPane.showMessageDialog(null,"You were able to dodge the monster Dodged","Dodged",0,null);
                    //dodge
                    }
                else{
                    JOptionPane.showMessageDialog(null,"You failed to dodge","Did not dodge",0,null);
                    character = character-damage;
                    //damage taken from monster
                }
                JOptionPane.showMessageDialog(null,"The Monster attacks you back!","Monster attack",0,MonsterGP);
                //monster attacks
                if (character>0){
                    JOptionPane.showMessageDialog(null,"The monster has done "+damage+" damage on you!"+" You're at "+character+" health.","Health",0,null);
                    //damage monster dealt and player's health
                    JOptionPane.showMessageDialog(null,"The monster's health is at "+Monster,"Monster health",0,MonsterGP);
                    //displaying monster's health
                }
                else{
                    JOptionPane.showMessageDialog(null,"GAME OVER, The monster has defeated you with "+Monster+" health remaining!","Over",0,GameOver);
                    //displaying game over screen player's health has reached 0 or less
                    System.exit(1);
                    }   
                }
                JOptionPane.showMessageDialog(null,"You have defeated the monster.","WINNER",0,null);
                //player has defeated the monster
                JOptionPane.showMessageDialog(null,"Your dodge chance has increased to 40% ","New Ability",0,null);
                //dodge chance increase
                JOptionPane.showMessageDialog(null,"The old man restores you back to full health","Health",0,null);
                //restoring player's health
                
                //NEW ROUTES
                String[]twoareas2 ={"Lake","Forest"};
                //string choices new paths
                int area2 = JOptionPane.showOptionDialog(null,"You encounter a cross road, where do you want to go?","Where do go",0,0,null,twoareas2,null);
                //asking player where they want to go
                int really2= JOptionPane.showConfirmDialog(null,"Are you sure?","Really?",0,0,null);
                //asking player are they sure
                while (really2!=0){
                area2 = JOptionPane.showOptionDialog(null,"You encounter a cross road, where do you want to go?","Where do go",0,0,null,twoareas2,null);
                //asking player where they want to go
                really2 = JOptionPane.showConfirmDialog(null,"Are you sure?","Really?",0,0,null);
                //asking player are they sure
                }
                
                //LAKE CHOICE DPS
                 if (area2==0){
                JOptionPane.showMessageDialog(null,"You and the old man walk into the Lake","Lake",0,Lake);
                //player walks into lake if choice is lake
                JOptionPane.showMessageDialog(null,"All of a sudden a monster appears, and you ready your weapon!","Lake",0,MonsterL);
                //monster encounter
                String[]options2={"Pierce (60 DMG)","Sting (30 DMG, +20 HP)"};
                //string choices for attacks
                int Monster2 = 300;
                //monster health
                character = 100;
                //player health
                JOptionPane.showMessageDialog(null,"You encountered a monster that is at 300 health","Monster encounter",0,MonsterL);
                //monster encounter
        
                while(Monster2>0)
                { 
                int choice = JOptionPane.showOptionDialog(null,"What do you want to do","Move",0,0,MonsterL,options2,null);
                //asking player what they want to do
                if (choice==0)
                {
                    Monster2 = Monster2-60;
                    //if choice 0 monster takes 60 damage
                    JOptionPane.showMessageDialog(null,"You used Pierce","Move Used",0,Pierce);
                }
                else if (choice==1)
                {
                    Monster2 = Monster2-30;
                    character= character+20;
                    //if choice 1 monster takes 30 damage and player heals 20 health
                    JOptionPane.showMessageDialog(null,"You used Sting","Move Used",0,Sting);
                    JOptionPane.showMessageDialog(null,"You're at "+character+" health.","Healed",0,null);
                    //displaying player's health
                }
                if(partner==true){
                JOptionPane.showMessageDialog(null,"Nikki attacks and does 30 DMG","Companion Attack",0,null);
                Monster2 = Monster2-30;
                }
                if (Monster2<=0){
                    break;
                }
                //Min + (int)(Math.random() * ((Max - Min) + 1))
                int damage = 10 + (int)(Math.random() * ((30 - 10) + 1));
                int random = 1 + (int)(Math.random() * ((100- 1) + 1));
                //monster damage
                JOptionPane.showMessageDialog(null,"The Monster attacks you back!","Monster attack",0,MonsterL);
                //monster attacks
                if(random<=40){
                damage = 0;
                JOptionPane.showMessageDialog(null,"You were able to dodge the monster Dodged","Dodged",0,null);
                //dodge
                }
                else{
                JOptionPane.showMessageDialog(null,"You failed to dodge","Did not dodge",0,null);
                character = character-damage;
                //damage player takes
                }
                JOptionPane.showMessageDialog(null,"The Monster attacks you back!","Monster attack",0,MonsterL);
                //monster attacks
                if (character>0){
                JOptionPane.showMessageDialog(null,"The monster has done "+damage+" damage on you!"+" You're at "+character+" health.","Health",0,null);
                //damage monster has dealt and player's health
                JOptionPane.showMessageDialog(null,"The monster's health is at "+Monster2,"Monster health",0,MonsterL);
                //displaying monster's health
                }
                else{
                    JOptionPane.showMessageDialog(null,"GAME OVER, The monster has defeated you with "+Monster2+" health remaining!","Over",0,GameOver);
                    //displaying game over screen player's health has reached 0 or less
                    System.exit(1);
                    }   
                }
                    JOptionPane.showMessageDialog(null,"You have defeated the monster.","WINNER",0,null);
                    //monster defeated
                    JOptionPane.showMessageDialog(null,"You have learned \"Star Splash\". It does 180 DMG.","New ability",0,null); 
                    JOptionPane.showMessageDialog(null,"Your dodge chance is at 60% dodge","New ability",0,null); 
                    //new skill learned and higher dodge chance
                    JOptionPane.showMessageDialog(null,"The old man restores you back to full health, any overheals have been removed.","Health",0,null);
                    //restoring player's health to normal
                    //BOSS FIGHT CODE AFTER THIS
                     String[]options3={"Pierce (60 DMG)","Sting (30 DMG, +20 HP)","Star Splash (180 DMG)"}; //Put abilites in 
                     //string options for attack
                    int Monster3 = 800;
                    //boss health
                    character=100; 
                    //player health
        
                    JOptionPane.showMessageDialog(null,"This is the final boss it is at "+Monster3+" health","FINAL BOSS FIGHT",0,Boss);
                    //final boss encounter
        
                    while(Monster3>0)
                    { 
                    int choice = JOptionPane.showOptionDialog(null,"What do you want to do","Move",0,0,Boss,options3,null);    
                    //asking user what they want to do
                    if (choice==0)
                    {
                        Monster3 = Monster3-60;
                        //if choice 0 monster takes 60 damage
                        JOptionPane.showMessageDialog(null,"You used Pierce","Move Used",0,Pierce);
                     }
                    else if (choice==1)
                    {
                        Monster3 = Monster3-30;
                        character= character+20;
                        //if choice 1 monster takes 30 damage and player gains 20 health
                        JOptionPane.showMessageDialog(null,"You used Sting","Move Used",0,Sting);
                        JOptionPane.showMessageDialog(null,"You're at "+character+" health.","Healed",0,null);
                        //displaying player's health
                    }
                    else if (choice==2){
                        Monster3 = Monster3-180;
                        //if choice 2 monster takes 180 damage
                        JOptionPane.showMessageDialog(null,"You used Star Splash","Move Used",0,StarSplash);
                    }
                    if(partner==true){
                    JOptionPane.showMessageDialog(null,"Nikki attacks and does 30 DMG","Companion Attack",0,null);
                    Monster3 = Monster3-30;
                    }
                    if (Monster3<=0){
                        break;
                    }
                    //Min + (int)(Math.random() * ((Max - Min) + 1))
                    int damage = 40 + (int)(Math.random() * ((50 - 40) + 1));
                    int random = 1 + (int)(Math.random() * ((100- 1) + 1));
                    //monster damage
                    JOptionPane.showMessageDialog(null,"The Monster attacks you back!","Monster attack",0,Boss);
                    //monster attacks
                    if(random<=60){
                    damage = 0;
                    JOptionPane.showMessageDialog(null,"You were able to dodge the monster Dodged","Dodged",0,null);
                    //dodge
                    }
                    else{
                    JOptionPane.showMessageDialog(null,"You failed to dodge","Did not dodge",0,null);
                    character = character-damage;
                    //damage player takes
                    }
                    JOptionPane.showMessageDialog(null,"The Final Boss attacks you back!","Boss attack",0,Boss);
                    //monster attacks
                    if (character>0){
                        JOptionPane.showMessageDialog(null,"The Final Boss has done "+damage+" damage on you!"+" You're at "+character+" health.","Health",0,null);
                        //damage boss dealt and player's health
                        JOptionPane.showMessageDialog(null,"The Final Boss's health is at "+Monster3," HP",0,Boss);
                        //boss health
                    }
                    else{
                        JOptionPane.showMessageDialog(null,"GAME OVER, The FINAL BOSS has deafed you with "+Monster3+" health remaining!","Over",0,GameOver);
                        //displaying game over screen player's health has reached 0 or less
                        System.exit(1);
                    }   
                }
                JOptionPane.showMessageDialog(null,"You have defeated the FINAL BOSS.","WINNER",0,Victory);
                //boss defeated
                JOptionPane.showMessageDialog(null,"It is finally over you get to go home","WINNER",0,Victory);
                JOptionPane.showMessageDialog(null,"Thank you for playing","Thanks",0,null);
                //player has won
                JOptionPane.showMessageDialog(null,"Your name is "+name,"Name",0,null);
                JOptionPane.showMessageDialog(null,"You're a female","Sex",0,null);
                if (lovelysleep==0){
                    JOptionPane.showMessageDialog(null,"You had a good night's sleep.","Good night's sleep",0,null);
                }
                else{
                    JOptionPane.showMessageDialog(null,"You did not have a good night's sleep","No good sleep",0,null);
                }
                JOptionPane.showMessageDialog(null,"Your username was "+S1,"Username was",0,null);
                JOptionPane.showMessageDialog(null,"Your password was "+S2,"Password was",0,null);
                if(partner==true){
                    JOptionPane.showMessageDialog(null,"You joined Nikki's party.","Joined Party",0,null);
                }
                else{
                    JOptionPane.showMessageDialog(null,"You did not join Nikki's party.","Did not join",0,null);
                }
                if(cabin==0){
                    JOptionPane.showMessageDialog(null,"You went towards the cabin","Cabin",0,null);
                }
                else{
                    JOptionPane.showMessageDialog(null,"You did not go towards the cabin","Cabin",0,null);
                }
                if(choicess==0){
                    JOptionPane.showMessageDialog(null,"The first question you asked the old man was \"Where am I?\"","Question",0,null);
                }
                else{
                    JOptionPane.showMessageDialog(null,"The first question you asked the old man was \"Who are you?\"","Question",0,null);
                }
                JOptionPane.showMessageDialog(null,"On your journey you were a DPS Class. You went through Grass Plain and Lake.","Path",0,null);
                //Reviewing choices player has made through out the game
            }
                 



                //FOREST CHOICE DPS
                else if (area2==1){
                JOptionPane.showMessageDialog(null,"You and the old man walk into the Forest","Forest",0,Forest);
                //player chooses lava pool
                String[]options2={"Pierce (60 DMG)","Sting (30 DMG, +20 HP)"};
                //string options for attacks
                int Monster2 = 300;
                //monster health
                JOptionPane.showMessageDialog(null,"You encountered a monster that is at "+Monster2+" health","Monster encounter",0,MonsterF);
                //monster encounter
                character = 100;
                //player health
                while(Monster2>0)
                { 
                int choice = JOptionPane.showOptionDialog(null,"What do you want to do","Move",0,0,MonsterF,options2,null);    
                //asking player what they want to do
                if (choice==0)
                {
                Monster2 = Monster2-60;
                //if choice 0 monster takes 60 damage
                JOptionPane.showMessageDialog(null,"You used Pierce","Move Used",0,Pierce);
                }
                else if (choice==1)
                {
                Monster = Monster-30;
                character= character+20;
                //if choice 1 monster takes 30 damage and player heals 20 health
                JOptionPane.showMessageDialog(null,"You used Sting","Move Used",0,Sting);
                JOptionPane.showMessageDialog(null,"You're at "+character+" health.","Healed",0,null);
                //displaying player's health
                }
                if(partner==true){
                JOptionPane.showMessageDialog(null,"Nikki attacks and does 30 DMG","Companion Attack",0,null);
                Monster2 = Monster2-30;
                }
                if (Monster2<=0){
                break;
                }
                //Min + (int)(Math.random() * ((Max - Min) + 1))
                 int damage = 10 + (int)(Math.random() * ((30 - 10) + 1));
                 int random = 1 + (int)(Math.random() * ((100- 1) + 1));
                 //monster damage
                 JOptionPane.showMessageDialog(null,"The Monster attacks you back!","Monster attack",0,MonsterF);
                 //monster attack
                 if(random<=40){
                 damage = 0;
                 JOptionPane.showMessageDialog(null,"You were able to dodge the monster Dodged","Dodged",0,null);
                 //dodge
                }
                else{
                JOptionPane.showMessageDialog(null,"You failed to dodge","Did not dodge",0,null);
                character = character-damage;
                //damage taken
                }
                JOptionPane.showMessageDialog(null,"The Monster attacks you back!","Monster attack",0,MonsterF);
                //monster attack
                if (character>0){
                JOptionPane.showMessageDialog(null,"The monster has done "+damage+" damage on you!"+" You're at "+character+" health.","Health",0,null);
                //damage monster has dealt and displaying player's health
                JOptionPane.showMessageDialog(null,"The monster's health is at "+Monster2,"Monster health",0,MonsterF);
                //displaying monster's health
                }
                else{
                JOptionPane.showMessageDialog(null,"GAME OVER, The monster has defeated you with "+Monster2+" health remaining!","Over",0,GameOver);
                //displaying game over screen player's health has reached 0 or less
                System.exit(1);
                }   
            }
                JOptionPane.showMessageDialog(null,"You have defeated the monster.","WINNER",0,null);
                //player has defeated the monster
                JOptionPane.showMessageDialog(null,"You learned a new ability \"Flashing Penetrator\". It does 250 DMG.","New",0,null); 
                //new skill
                JOptionPane.showMessageDialog(null,"Your dodge chance  has been increased to 50%.","New",0,null); 
                //better dodge
                JOptionPane.showMessageDialog(null,"The old man restores you back to full health, any overheals have been removed.","Health",0,null);
                //restoring player's health to normal
                //BOSS FIGHT CODE AFTER THIS
                String[]options3={"Pierce (60 DMG)","Sting (30 DMG, +20 HP)","Flashing Penetrator (250 DMG)"}; 
                //String choices for attacks
                int Monster3 = 800;
                //bosses health
                character=100; //PUT IN HP DEPENDING ON THE CHARACTER CLASS 
        
                JOptionPane.showMessageDialog(null,"This is the final boss it is at "+Monster3+" health","FINAL BOSS FIGHT",0,Boss);
                //boss encounter
        
                while(Monster3>0)
                { 
                int choice = JOptionPane.showOptionDialog(null,"What do you want to do","Move",0,0,Boss,options3,null);    
                //asking player what they want to do
                    if (choice==0)
                    {
                        Monster3 = Monster3-60;
                        //if choice 0 boss takes 60 damage
                        JOptionPane.showMessageDialog(null, "You used Pierce", "Move Used", 0, Pierce);
                    }
                    else if (choice==1)
                    {
                        Monster3 = Monster3-30;
                        character= character+20;
                        //if choice 1 boss takes 30 damage and player heals 20 health
                        JOptionPane.showMessageDialog(null,"You used Sting","Move Used",0,Sting);
                        JOptionPane.showMessageDialog(null,"You're at "+character+" health.","Healed",0,null);
                        //displaying boss's health
                    }
                    else if (choice==2){
                        Monster3 = Monster3-250;
                        //if choice 2 boss takes 250 damage
                        JOptionPane.showMessageDialog(null,"You used Flashing Penetrator","Move Used",0,FlashingPenetrator);
                    }
                    if(partner==true){
                    JOptionPane.showMessageDialog(null,"Nikki attacks and does 30 DMG","Companion Attack",0,null);
                    Monster3 = Monster3-30;
                    }
                    if (Monster3<=0){
                        break;
                    }
                    //Min + (int)(Math.random() * ((Max - Min) + 1))
                    int damage = 40 + (int)(Math.random() * ((50 - 40) + 1));
                    int random = 1 + (int)(Math.random() * ((100- 1) + 1));
                    //boss damage
                    JOptionPane.showMessageDialog(null,"The Monster attacks you back!","Monster attack",0,Boss);
                    //boss attacks
                    if(random<=50){
                    damage = 0;
                    JOptionPane.showMessageDialog(null,"You were able to dodge the monster Dodged","Dodged",0,null);
                    //dodge
                    }
                    else{
                    JOptionPane.showMessageDialog(null,"You failed to dodge","Did not dodge",0,null);
                    character = character-damage;
                    //damage taken
                    }
                    JOptionPane.showMessageDialog(null,"The Final Boss attacks you back!","Boss attack",0,Boss);
                    //boss attacks
                    if (character>0){
                        JOptionPane.showMessageDialog(null,"The Final Boss has done "+damage+" damage on you!"+" You're at "+character+" health.","Health",0,null);
                        //boss damage and displaying player's health
                        JOptionPane.showMessageDialog(null,"The Final Boss's health is at "+Monster3," HP",0,Boss);
                        //displaying boss's health
                    }
                    else{
                        JOptionPane.showMessageDialog(null,"GAME OVER, The FINAL BOSS has deafed you with "+Monster3+" health remaining!","Over",0,GameOver);
                        //displaying game over screen player's health has reached 0 or less
                        System.exit(1);
                    }   
                }
                JOptionPane.showMessageDialog(null,"You have defeated the FINAL BOSS.","WINNER",0,Victory);
                //player has defeated the boss
                JOptionPane.showMessageDialog(null,"It is finally over you get to go home","WINNER",0,Victory);
                JOptionPane.showMessageDialog(null,"Thank you for playing","Thanks",0,null);
                JOptionPane.showMessageDialog(null,"Your name is "+name,"Name",0,null);
                JOptionPane.showMessageDialog(null,"You're a female","Sex",0,null);
                if (lovelysleep==0){
                    JOptionPane.showMessageDialog(null,"You had a good night's sleep.","Good night's sleep",0,null);
                }
                else{
                    JOptionPane.showMessageDialog(null,"You did not have a good night's sleep","No good sleep",0,null);
                }
                JOptionPane.showMessageDialog(null,"Your username was "+S1,"Username was",0,null);
                JOptionPane.showMessageDialog(null,"Your password was "+S2,"Password was",0,null);
                if(partner==true){
                    JOptionPane.showMessageDialog(null,"You joined Nikki's party.","Joined Party",0,null);
                }
                else{
                    JOptionPane.showMessageDialog(null,"You did not join Nikki's party.","Did not join",0,null);
                }
                if(cabin==0){
                    JOptionPane.showMessageDialog(null,"You went towards the cabin","Cabin",0,null);
                }
                else{
                    JOptionPane.showMessageDialog(null,"You did not go towards the cabin","Cabin",0,null);
                }
                if(choicess==0){
                    JOptionPane.showMessageDialog(null,"The first question you asked the old man was \"Where am I?\"","Question",0,null);
                }
                else{
                    JOptionPane.showMessageDialog(null,"The first question you asked the old man was \"Who are you?\"","Question",0,null);
                }
                JOptionPane.showMessageDialog(null,"On your journey you were a DPS Class. You went through Grass Plains and Forest.","Path",0,null);
                //reviewing choices player has chose during the game
                }
                
            }
        }
    }
        
}