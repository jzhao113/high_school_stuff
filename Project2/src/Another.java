import javax.swing.JOptionPane;
public class Another
{
    public static void main (String[]args)
    {
        
        //declaring image icons
        
        JOptionPane.showMessageDialog(null,"RISE AND SHINE MY CHILD","Asleep",0,null);
        //Asking user for name. Stops program is cancelled or nothing is typed in
        String name = JOptionPane.showInputDialog("What is your name?");
        if (name==null){
            System.exit(1);
        }
        //Creating arrays for future options
        String[]genders = {"Male","Female"};
        String[]options ={"Yes","No"};
        //Asking user for gender
        int gender = JOptionPane.showOptionDialog(null,"Are you a male or female","Sex",0,0,null,genders,null);
        //If the user is a male it does this if statement, If girl skip to else if
        if(gender==0)
        {
           JOptionPane.showMessageDialog(null,"GOOD MORNING "+name+"!"+" My lovely son!","Morning",0,null);
           //Asking user if they had a good night's sleep. Its a Yes or No Option question
           int lovelysleep = JOptionPane.showOptionDialog(null,"Did you have a good night's sleep?","Good Sleep?",0,0,null,options,null);
           //If and else statements that differ depending on choice of user
           if (lovelysleep==0){
               JOptionPane.showMessageDialog(null,"Thats nice to hear. David called earlier today looking for you. You should call him back. ","Call",0,null);
           }
           else if (lovelysleep==1){
               JOptionPane.showMessageDialog(null,"I'm sorry to hear that. David called earlier today looking for you. You should call him back","Call",0,null);
           }
           //Using MessageDialog to furthur the story
           JOptionPane.showMessageDialog(null,"You pick up your phone, and see a text from David","Text",0,null);
           JOptionPane.showMessageDialog(null,"You run towards your computer,and in your head you're thinking about your login information ","Thinking",0,null);
           //Declaring arrays for future use
           String S2="";
           String S1="";
           //CHANGE THE ENDING SUMMARIES IF ADDED
           /*
           JOptionPane.showMessageDialog(null,"Your username was "+S1,"Username was",0,null);
           JOptionPane.showMessageDialog(null,"Your password was "+S2,"Password was",0,null);
           */
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
           }
           JOptionPane.showMessageDialog(null,"You get to your computer, and start logging in","Logging in",0,null);
           //Asking user for the username
           String S3 = JOptionPane.showInputDialog("Please enter your Username");
           //Comparing the input to the correct username.
           boolean User = S1.equalsIgnoreCase(S3);
           //If correct goes to password, else it stops program
           Vari obj1 = new Vari();
           if(User==true){
               //Askes the User for the password
               String S4 = JOptionPane.showInputDialog("Username exists. Please Enter your password");
               //Comparing input password to actual password
               boolean truepass = S2.equalsIgnoreCase(S4);
               //If correct proceeds to next party, else program stops
               if(truepass==true){
                   JOptionPane.showMessageDialog(null,"Sucessful Login","Login Sucess",0,null);
                   //Giving user another Yes or No Option
                   int party = JOptionPane.showOptionDialog(null,"You recieve a party invite from David. Do you accept?","Party invite",0,0,null,options,null);
                   if (party==0){
                       obj1.setx(true);
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
               }
               else{
                   JOptionPane.showMessageDialog(null,"So you remembered the Username, but not the password.... GET IT NEXT TIME","Fail",0,null);
                   System.exit(1);
               }
           }
           else{
               JOptionPane.showMessageDialog(null, "You HAD ONE JOB to remember the username and password. GET IT NEXT TIME","Fail",0,null);
               System.exit(1);
               //Game over when player submits wrong password
           }
           String[]optionss ={"Yes","No"};
        JOptionPane.showMessageDialog(null,"You get a message ingame from an unknown source, with a link","Link",0,null);
        //Player receives a message
        int open =JOptionPane.showOptionDialog(null,"Do you open the email?","Opening?",0,0,null,optionss,null);
        //Giving user option to open email
        while (open!=0){
            //not allowing user to use choice 1
            open =JOptionPane.showOptionDialog(null,"Looks like you cannot say no.....","Opening?",0,0,null,optionss,null);
            //Asking User if they want to open the message but giving them only one option
        }
        if (open==0){
            JOptionPane.showMessageDialog(null,"The email opens, and your screen turns blue","Opened",0,null);
            //User receives blue screen after choice 0
            JOptionPane.showMessageDialog(null,"All of a sudden the world around you turns white, and beams of colors come at you. You question if you're dreaming. YOU BLACK OUT","Portal",0,null);
            //Displaying what the user sees after the blue screen
        }
        JOptionPane.showMessageDialog(null,".....","Wake",0,null);
        JOptionPane.showMessageDialog(null,"You wake up and see you are in an open field near a lake. Mountains surround you, it seems very peaceful","Waking up",0,null);
        //Displaying where the user is 
        int cabin = JOptionPane.showOptionDialog(null,"You see a cabin. Do you walk towards it?","Cabin",0,0,null,optionss,null);
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
        int choicess = JOptionPane.showOptionDialog(null,"You continue to walk towards him. You decide to ask him?","Choice",0,0,null,choices,null);
        //Asking user which question to ask the old man
        if (choicess==0){
            JOptionPane.showMessageDialog(null,"This is the beta test. If you die here, you die in real life!.","Where am I?",0,null);
            JOptionPane.showMessageDialog(null,"You must beat the game to get out.","Where am I?",0,null);
            //User interaction after choice 0
            String[]choice1={"Who are you?"};
                int single = JOptionPane.showOptionDialog(null,"You ask him another question?","Another Question",0,0,null,choice1,null);
                //Asking user if they want to ask the other question
                if (single==0){
                    JOptionPane.showMessageDialog(null,"Me? I'm an elder who has been stuck here for centuries. I'm Immortal here but I want to get out.","Who are you?",0,null);
                    // Npc gives player information about them
                }
            }
        else if (choicess==1){
            JOptionPane.showMessageDialog(null,"Me? I'm an elder who has been stuck here for centuries. I'm Immortal here but I want to get out.","Who are you?",0,null);
            //User interaction after choice 1
            String[]choice1={"Where am I"};
            int single = JOptionPane.showOptionDialog(null,"You ask him another question?","Another Question",0,0,null,choice1,null);
            //Giving player an option to ask another question
            if (single==0){
                     JOptionPane.showMessageDialog(null,"This is the beta test. If you die here, you die in real life!.","Where am I?",0,null);
                     JOptionPane.showMessageDialog(null,"You must beat the game to get out.","Where am I?",0,null);
                     //Npc giving player information
                }
        }
        JOptionPane.showMessageDialog(null,"I've been waiting for someone like to come. You shall set of on your journey, to free yourself.","Waiting",0,null);
        JOptionPane.showMessageDialog(null,"I shall come with you as a healer.","Waiting",0,null);
        if(obj1.getx()==true){
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
                JOptionPane.showMessageDialog(null,"You and the old man walk into the cave","Cave",0,null);
                //player and Npc walks into the cave.
                 JOptionPane.showMessageDialog(null,"All of a sudden a monster appears, and you ready your weapon!","Cave",0,null);
                 //Enemy appears and player gets ready to engage in battle
                 String[]options1={"Horizontal Arc (30 DMG)","Recover (+50 HP, Can overheal)"};
                 //declaring two string choices for combat
            int Monster = 200;
            //declaring an int for monster health
            int character = 200;
            //declaring an int for player health
            
        
            JOptionPane.showMessageDialog(null,"You encountered a monster that is at "+Monster+" health","Monster encounter",0,null);
            //displaying monster health
             while(Monster>0)
            { 
            int choice = JOptionPane.showOptionDialog(null,"What do you want to do","Move",0,0,null,options1,null);    
            if (choice==0)
            {
                
                Monster = Monster-150;
                //if choice 0 monster takes 30 damage
                JOptionPane.showMessageDialog(null,"You used Horizontal Arc","Move Used",0,null);
            }
            else if (choice==1)
            {
                character = character+50;
                //if choice 1 character gains 50 health
                JOptionPane.showMessageDialog(null,"You used Recover","Move Used",0,null);
                JOptionPane.showMessageDialog(null,"You're at "+character+" health.","Healed",0,null);
                //displayer player's health
            }
            if(obj1.getx()==true){
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
            JOptionPane.showMessageDialog(null,"The Monster attacks you back!","Monster attack",0,null);
            //displaying message that monster attacks player
            if (character>0){
                JOptionPane.showMessageDialog(null,"The monster has done "+damage+" damage on you!"+" You're at "+character+" health.","Health",0,null);
                //displaying amount of damage taken and curren health points
                JOptionPane.showMessageDialog(null,"The monster's health is at "+Monster,"Monster health",0,null);
                //displaying monster's health
            }
            else{
                JOptionPane.showMessageDialog(null,"GAME OVER, The monster has defeated you with "+Monster+" health remaining!","Over",0,null);
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
                 JOptionPane.showMessageDialog(null,"You and the old man walk into the Mountian","Mountian",0,null);
                 //player chooses mountain, displaying message
                 JOptionPane.showMessageDialog(null,"All of a sudden a monster appears, and you ready your weapon!","Mountian",0,null);
                 //player encounters monster
                String[]options2={"Horizontal Arc (30 DMG)","Recover (+50 HP, Can overheal)","Snake Bite (60 DMG)"};
                //Declaring string options for player options to attack
                int Monster2 = 250;
                //monster health
                character = 200;
                //characters health
                JOptionPane.showMessageDialog(null,"You encountered a monster that is at "+Monster2+" health","Monster encounter",0,null);
                //dispaying message
        
                while(Monster2>0)
                { 
                int choice = JOptionPane.showOptionDialog(null,"What do you want to do","Move",0,0,null,options2,null);    
                //asking player what they want to do
                if (choice==0)
                {
                    Monster2 = Monster2-1000;
                    //if choice 0 then monster takes 30 damage
                    JOptionPane.showMessageDialog(null,"You used Horizontal Arc","Move Used",0,null);
                }
                else if (choice==1)
                {
                    character = character+50;
                    //if choice 1 then player gains 50 health points
                    JOptionPane.showMessageDialog(null,"You used Recover","Move Used",0,null);
                    JOptionPane.showMessageDialog(null,"You're at "+character+" health.","Healed",0,null);
                    //displaying player's health
                }
                else if (choice==2){
                    Monster2 = Monster2-60;
                    //if choice 2 then monster takes 60 damage
                    JOptionPane.showMessageDialog(null,"You used Snake Bite","Move Used",0,null);
                }
                if (Monster2<=0){
                    break;
                }
                //Min + (int)(Math.random() * ((Max - Min) + 1))
                int damage = 10 + (int)(Math.random() * ((30 - 10) + 1));
                //Monster attack
                character = character-damage;
                //player takes damage
                JOptionPane.showMessageDialog(null,"The Monster attacks you back!","Monster attack",0,null);
                //displaying monster attacks
                if (character>0){
                JOptionPane.showMessageDialog(null,"The monster has done "+damage+" damage on you!"+" You're at "+character+" health.","Health",0,null);
                //Displaying amount of damage taken
                JOptionPane.showMessageDialog(null,"The monster's health is at "+Monster2,"Monster health",0,null);
                //displaying monster's health
                }
                else{
                    JOptionPane.showMessageDialog(null,"GAME OVER, The monster has defeated you with "+Monster2+" health remaining!","Over",0,null);
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
        
                    JOptionPane.showMessageDialog(null,"This is the final boss it is at "+Monster3+" health","FINAL BOSS FIGHT",0,null);
                    //displaying boss's health
                    
        
                    while(Monster3>0)
                    { 
                    int choice = JOptionPane.showOptionDialog(null,"What do you want to do","Move",0,0,null,options3,null);  
                    //asking player what they want to do
                    if (choice==0)
                    {
                    Monster3 = Monster3-1000;
                    //if choice 0 then monster takes 30 damage
                    JOptionPane.showMessageDialog(null,"You used Horizontal Arc","Move Used",0,null);
                    }
                    else if (choice==1)
                    {
                    character = character+50;
                    //if choice 1 then character gains 50 health points
                    JOptionPane.showMessageDialog(null,"You used Recover","Move Used",0,null);
                    JOptionPane.showMessageDialog(null,"You're at "+character+" health.","Healed",0,null);
                    //displaying player's health
                    }
                    else if (choice==2){
                        Monster3 = Monster3-60;
                        JOptionPane.showMessageDialog(null,"You used Snake Bite","Move Used",0,null);
                    }
                    else if (choice==3){
                        Monster3 = Monster3-200;
                        JOptionPane.showMessageDialog(null,"You used Divine Sword","Move Used",0,null);
                    }
                    if (Monster3<=0){
                    break;
                    }
                    //Min + (int)(Math.random() * ((Max - Min) + 1))
                    int damage = 40 + (int)(Math.random() * ((50 - 40) + 1));
                    character = character-damage;
                    JOptionPane.showMessageDialog(null,"The Final Boss attacks you back!","Boss attack",0,null);
                    //boss attacks player
                    if (character>0){
                    JOptionPane.showMessageDialog(null,"The Final Boss has done "+damage+" damage on you!"+" You're at "+character+" health.","Health",0,null);
                    //displaying damage done to player
                    JOptionPane.showMessageDialog(null,"The Final Boss's health is at "+Monster3," HP",0,null);
                    //displaying boss's health
                    }
                    else{
                    JOptionPane.showMessageDialog(null,"GAME OVER, The FINAL BOSS has defeated you with "+Monster3+" health remaining!","Over",0,null);
                    //displaying game over screen after player's health reached 0 or less
                    System.exit(1);
                    }   
                }
                JOptionPane.showMessageDialog(null,"You have defeated the FINAL BOSS.","WINNER",0,null);
                //player has defeated boss
                JOptionPane.showMessageDialog(null,"It is finally over you get to go home","WINNER",0,null);
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
                if (obj1.getx()==true){
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
            }
        }
    }
}

           
            