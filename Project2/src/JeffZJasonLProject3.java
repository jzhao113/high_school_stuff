import javax.swing.JOptionPane;
public class JeffZJasonLProject3
{
    public static void main (String[]args)
    {
        JOptionPane.showMessageDialog(null,"GOOD MORNING SUN SHINE","Asleep",0,null);
        //Asking user for name
        String name = JOptionPane.showInputDialog("What is your name?");
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
           String S1 = name+"69";
           String S2 = "Puppies";
           JOptionPane.showMessageDialog(null,"You remember that your Username:"+name+"69. And your password is\"Puppies\"(You might need to remember this)");
           JOptionPane.showMessageDialog(null,"You get to your computer, and start logging in","Logging in",0,null);
           //Asking user for the username
           String S3 = JOptionPane.showInputDialog("Please enter your Username");
           //Comparing the input to the correct username.
           boolean User = S1.equalsIgnoreCase(S3);
           //If correct goes to password, else it stops program
           if(User==true){
               //Askes the User for the password
               String S4 = JOptionPane.showInputDialog("Username exists.Please Enter your password");
               //Comparing input password to actual password
               boolean truepass = S2.equalsIgnoreCase(S4);
               //If correct proceeds to next party, else program stops
               if(truepass==true){
                   JOptionPane.showMessageDialog(null,"Sucessful Login","Login Sucess",0,null);
                   //Giving user another Yes or No Option
                   int party = JOptionPane.showOptionDialog(null,"You recieve a party invite from David. Do you accept?","Party invite",0,0,null,options,null);
                   if (party==0){
                       JOptionPane.showMessageDialog(null,"David is happy you join his party, and starts up the queue","Nice",0,null);
                   }
                   else{
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
           }
        }
        //If user is a female they run this code
        else if (gender==1){
            JOptionPane.showMessageDialog(null,"GOOD MORNING "+name+"!"+" My lovely daughter!","Morning",0,null);
            int lovelysleep = JOptionPane.showOptionDialog(null,"Did you have a good night's sleep?","Good Sleep?",0,0,null,options,null);
            //Asking user a Yes or No question with if and else that have different responses
            if (lovelysleep==0){
                JOptionPane.showMessageDialog(null,"I'm happy to hear that. Nikki called earlier today looking for you. You call her back.","Call",0,null);
            }
            else if (lovelysleep==1){
                JOptionPane.showMessageDialog(null,"I hope everything to alright. Nikki called earlier today looking for you. You should call her back.","Call",0,null);
            }
            //Using showMessageDialog to furthur the story
            JOptionPane.showMessageDialog(null,"You pick up your phone, and see a text from Nikki","Text",0,null);
            JOptionPane.showMessageDialog(null,"You start running towards your computer, and in your head you're thinking about your login infomation","Login",0,null);
            //Declaring arrays for future use
            String S1 = "Fluffy"+name;
            String S2 = "CatsRule";
            JOptionPane.showMessageDialog(null,"You remember your Username:Fluffy"+name+" And your password is \"CatsRule\"(You should remember this)");
            JOptionPane.showMessageDialog(null,"You get to your computer, and start logging in","Logging in",0,null);
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
                    JOptionPane.showMessageDialog(null,"Sucessful Login","Login Sucess",0,null);
                    //Giving user another Yes or No Choice
                    int party = JOptionPane.showOptionDialog(null,"You recieve a party invite from Nikki. Do you accept?","Party Invite",0,0,null,options,null);
                    if(party==0){
                        JOptionPane.showMessageDialog(null,"Nikki is glad you joined her party, and starts up the queue","Nice",0,null);
                    }
                    else{
                        JOptionPane.showMessageDialog(null,"Nikki messages you on why you declined, but you ignore it and queue up on your own","What?",0,null);
                    }
                }
                else{
                    JOptionPane.showMessageDialog(null,"You remembered the username but not the password.... GET IT NEXT TIME","Fail",0,null);
                    System.exit(1);
                }
            }
            else{
                JOptionPane.showMessageDialog(null,"You HAD ONE JOB to remember the username and password. GET IT NEXT TIME","Fail",0,null);
                System.exit(1);
            }
            
        }
        
    }
}