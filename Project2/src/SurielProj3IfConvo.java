import java.io.PrintStream;
import java.net.URL;
import java.util.Calendar;
import java.util.Date;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class SurielProj3IfConvo {
    public static void main(String[] args) {
        int monthBorn;
        int dateBorn;
        boolean goodAtMath = false;
        boolean likesMath = false;
        boolean likesNothing = false;
        String likes = "";
        String videoGame = "";
        String favChar = "";
        Calendar todayC = Calendar.getInstance();
        int currMonth = todayC.get(2);
        int currYear = todayC.get(1);
        int currDate = todayC.get(5);
        int currHour = todayC.get(10);
        int currMin = todayC.get(12);
        int currSec = todayC.get(13);
        System.out.println("" + currHour + " : " + currMin + " : " + currSec);
        int likeVGs = 1;
        boolean bDayToday = false;
        ImageIcon happy1 = new ImageIcon(SurielProj3IfConvo.class.getResource("braveM1.png"));
        ImageIcon talking1 = new ImageIcon(SurielProj3IfConvo.class.getResource("braveM2.png"));
        ImageIcon smile1 = new ImageIcon(SurielProj3IfConvo.class.getResource("braveM3.png"));
        ImageIcon hmmLookAway1 = new ImageIcon(SurielProj3IfConvo.class.getResource("braveM4.png"));
        ImageIcon hmmMad1 = new ImageIcon(SurielProj3IfConvo.class.getResource("braveM5.png"));
        ImageIcon hmmMad2 = new ImageIcon(SurielProj3IfConvo.class.getResource("braveM6.png"));
        ImageIcon hmmLookAway2 = new ImageIcon(SurielProj3IfConvo.class.getResource("braveM7.png"));
        ImageIcon smile2 = new ImageIcon(SurielProj3IfConvo.class.getResource("braveM8.png"));
        ImageIcon talking2 = new ImageIcon(SurielProj3IfConvo.class.getResource("braveM9.png"));
        ImageIcon happy2 = new ImageIcon(SurielProj3IfConvo.class.getResource("braveM10.png"));
        ImageIcon smile3 = new ImageIcon(SurielProj3IfConvo.class.getResource("braveM11.png"));
        ImageIcon frown1 = new ImageIcon(SurielProj3IfConvo.class.getResource("braveM12.png"));
        ImageIcon frown2 = new ImageIcon(SurielProj3IfConvo.class.getResource("braveM13.png"));
        ImageIcon zarya = new ImageIcon(SurielProj3IfConvo.class.getResource("Zarya.png"));
        ImageIcon reaper = new ImageIcon(SurielProj3IfConvo.class.getResource("Reaper.png"));
        ImageIcon mercy = new ImageIcon(SurielProj3IfConvo.class.getResource("Mercy.png"));
        JOptionPane.showMessageDialog(null, "Hey, my name is Brave!", "Intro", 0, happy1);
        String name = JOptionPane.showInputDialog("What is your name?");
        JOptionPane.showMessageDialog(null, "Nice to meet you " + name + ".", "Intro", 0, talking1);
        JOptionPane.showMessageDialog(null, "I am going to get to know you, by asking you a few questions!", "Intro", 0, smile1);
        String monthBornStr = JOptionPane.showInputDialog(name + " what month were you born?");
        if (monthBornStr.equalsIgnoreCase("January") || monthBornStr.equalsIgnoreCase("Jan")) {
            monthBorn = 1;
        } else if (monthBornStr.equalsIgnoreCase("Febuary") || monthBornStr.equalsIgnoreCase("Feb")) {
            monthBorn = 2;
        } else if (monthBornStr.equalsIgnoreCase("March")) {
            monthBorn = 3;
        } else if (monthBornStr.equalsIgnoreCase("April") || monthBornStr.equalsIgnoreCase("Apr")) {
            monthBorn = 4;
        } else if (monthBornStr.equalsIgnoreCase("May")) {
            monthBorn = 5;
        } else if (monthBornStr.equalsIgnoreCase("June")) {
            monthBorn = 6;
        } else if (monthBornStr.equalsIgnoreCase("July")) {
            monthBorn = 7;
        } else if (monthBornStr.equalsIgnoreCase("August") || monthBornStr.equalsIgnoreCase("aug")) {
            monthBorn = 8;
        } else if (monthBornStr.equalsIgnoreCase("September") || monthBornStr.equalsIgnoreCase("Sept")) {
            monthBorn = 9;
        } else if (monthBornStr.equalsIgnoreCase("October") || monthBornStr.equalsIgnoreCase("oct")) {
            monthBorn = 10;
        } else if (monthBornStr.equalsIgnoreCase("November") || monthBornStr.equalsIgnoreCase("nov")) {
            monthBorn = 11;
        } else if (monthBornStr.equalsIgnoreCase("December") || monthBornStr.equalsIgnoreCase("dec")) {
            monthBorn = 12;
        } else if (Integer.parseInt(monthBornStr) >= 1 && Integer.parseInt(monthBornStr) <= 12) {
            monthBorn = Integer.parseInt(monthBornStr);
        } else {
            JOptionPane.showMessageDialog(null, "hmmmmmmmm..since you typed " + Integer.parseInt(monthBornStr) + " your birthday will be in december", "Birthday Talk", 0, hmmMad2);
            monthBorn = 12;
        }
        String month = monthBorn == 1 ? "January" : (monthBorn == 2 ? "Febuary" : (monthBorn == 3 ? "March" : (monthBorn == 4 ? "April" : (monthBorn == 5 ? "May" : (monthBorn == 6 ? "June" : (monthBorn == 7 ? "July" : (monthBorn == 8 ? "August" : (monthBorn == 9 ? "September" : (monthBorn == 10 ? "October" : (monthBorn == 11 ? "November" : "December"))))))))));
        if (--monthBorn == currMonth) {
            JOptionPane.showMessageDialog(null, "Wow your birthday is this month!", "Birthday Talk", 0, happy2);
            String dateBornStr = JOptionPane.showInputDialog("What day of " + month + " is your birthday?");
            dateBorn = Integer.parseInt(dateBornStr);
            if (dateBorn == currDate) {
                JOptionPane.showMessageDialog(null, "HAPPY BIRTHDAY!!", "Birthday Talk", 0, smile1);
                bDayToday = true;
            } else if (dateBorn > currDate) {
                int daysUntilBD = dateBorn - currDate;
                JOptionPane.showMessageDialog(null, "Your birthday is in " + daysUntilBD + " days.  Happy early Birthday!", "Birthday Talk", 0, happy2);
            } else {
                int daysSinceBday = currDate - dateBorn;
                JOptionPane.showMessageDialog(null, "Your birthday was " + daysSinceBday + " days ago.  Happy belated Birthday!", "Birthday Talk", 0, talking2);
            }
        } else {
            String dateBornStr = JOptionPane.showInputDialog("What day of " + month + " is your birthday?");
            dateBorn = Integer.parseInt(dateBornStr);
            Calendar bdayThisYearC = Calendar.getInstance();
            bdayThisYearC.set(currYear, monthBorn, dateBorn, 0, 0, 0);
            Calendar bdayNextYearC = Calendar.getInstance();
            bdayNextYearC.set(currYear + 1, monthBorn, dateBorn, 0, 0, 0);
            Date bdTY = bdayThisYearC.getTime();
            System.out.println(bdTY);
            Date bdNY = bdayNextYearC.getTime();
            Date tday = todayC.getTime();
            long msbdTY = bdTY.getTime();
            long msbdNY = bdNY.getTime();
            long msToday = tday.getTime();
            if (msbdTY > msToday) {
                JOptionPane.showMessageDialog(null, "Oh your birthday has not passed this year.", "Birthday Talk", 0, talking2);
                long msUntilBD = msbdTY - msToday;
                long secUntilBD = msUntilBD / 1000;
                long minUntilBD = secUntilBD / 60;
                long hoursUntilBD = minUntilBD / 60;
                long daysUntilBD = hoursUntilBD / 24;
                long hoursLeft = hoursUntilBD - daysUntilBD * 24;
                long minsLeft = minUntilBD - hoursUntilBD * 60;
                JOptionPane.showMessageDialog(null, "Your birthday is in " + daysUntilBD + " days, " + hoursLeft + " hours and " + minsLeft + " mins.", "Birthday Talk", 0, talking1);
            } else if (msToday - msbdTY < msbdNY - msToday) {
                JOptionPane.showMessageDialog(null, "Oh your birthday already passed this year.", "Birthday Talk", 0, talking2);
                long msUntilBD = msToday - msbdTY;
                long secUntilBD = msUntilBD / 1000;
                long minUntilBD = secUntilBD / 60;
                long hoursUntilBD = minUntilBD / 60;
                long daysUntilBD = hoursUntilBD / 24;
                long hoursLeft = hoursUntilBD - daysUntilBD * 24;
                long minsLeft = minUntilBD - hoursUntilBD * 60;
                JOptionPane.showMessageDialog(null, "Your birthday was " + daysUntilBD + " days, " + hoursLeft + " hours and " + minsLeft + " mins ago.", "Birthday Talk", 0, talking1);
                JOptionPane.showMessageDialog(null, "Happy Belated Birthday.....", "Birthday Talk", 0, hmmLookAway1);
            } else {
                JOptionPane.showMessageDialog(null, "Oh your birthday already passed this year!, but your birthday is coming up relatively soon...", "Birthday Talk", 0, talking2);
                long msUntilBD = msbdNY - msToday;
                long secUntilBD = msUntilBD / 1000;
                long minUntilBD = secUntilBD / 60;
                long hoursUntilBD = minUntilBD / 60;
                long daysUntilBD = hoursUntilBD / 24;
                long hoursLeft = hoursUntilBD - daysUntilBD * 24;
                long minsLeft = minUntilBD - hoursUntilBD * 60;
                JOptionPane.showMessageDialog(null, "Your birthday is in " + daysUntilBD + " days, " + hoursLeft + " hours and " + minsLeft + " mins.", "Birthday Talk", 0, hmmLookAway2);
            }
        }
        int likeMath = JOptionPane.showConfirmDialog(null, name + " do you like math?", "Math Qs", 0, 0, happy2);
        if (likeMath == 0) {
            likesMath = true;
            JOptionPane.showMessageDialog(null, "WOW!! ME too!!", "Math Talk", 0, smile2);
            JOptionPane.showMessageDialog(null, "Let's see how good your math is!", "Math Talk", 0, smile1);
            Object[] options = new String[]{"2", "2i", "4i", "4"};
            int input = JOptionPane.showOptionDialog(null, "What is the value of \u221a(-4)", "Math Talk", 0, 0, smile3, options, null);
            if (input == 1) {
                JOptionPane.showMessageDialog(null, "Whoaoooaoaoao you are good!!", "Math Talk", 0, smile2);
                goodAtMath = true;
            } else {
                JOptionPane.showMessageDialog(null, "errr good try...", "Math Talk", 0, hmmLookAway2);
                goodAtMath = false;
                JOptionPane.showMessageDialog(null, "The answer was 2i", "Math Talk", 0, talking2);
            }
        } else {
            JOptionPane.showMessageDialog(null, "Oh I see...", "Unsure", 0, hmmLookAway1);
            JOptionPane.showMessageDialog(null, "hmmm...what could we talk about...", "Unsure", 0, frown2);
            JOptionPane.showMessageDialog(null, "......", "Unsure", 0, hmmLookAway2);
            likeVGs = JOptionPane.showConfirmDialog(null, name + ".... do you like video games?", "Videogame Talk", 0, 0, talking2);
            if (likeVGs == 0) {
                JOptionPane.showMessageDialog(null, "Cool! me too!", "Videogame Talk", 0, happy2);
                videoGame = JOptionPane.showInputDialog("What is your favorite video game?");
                if (videoGame.equalsIgnoreCase("Overwatch")) {
                    JOptionPane.showMessageDialog(null, "THAT IS MY FAVORITE GAME!!!", "Videogame Talk", 0, smile2);
                    favChar = JOptionPane.showInputDialog("Who is your favorite character?");
                    if (favChar.equalsIgnoreCase("Zarya")) {
                        JOptionPane.showMessageDialog(null, "Zarya is my favorite tank!!", "Videogame Talk", 0, smile2);
                        JOptionPane.showMessageDialog(null, "Maximum charge!!!!", "Videogame Talk", 0, zarya);
                    } else if (favChar.equalsIgnoreCase("Reaper")) {
                        JOptionPane.showMessageDialog(null, "Reaper is my favorite dps!!", "Videogame Talk", 0, smile2);
                        JOptionPane.showMessageDialog(null, "I eat tanks with him!", "Videogame Talk", 0, smile1);
                        JOptionPane.showMessageDialog(null, "From the Shadows!", "Videogame Talk", 0, reaper);
                    } else if (favChar.equalsIgnoreCase("Mercy")) {
                        JOptionPane.showMessageDialog(null, "Mercy is my favorite healer!!", "Videogame Talk", 0, smile3);
                        JOptionPane.showMessageDialog(null, "heroes never die...", "Videogame Talk", 0, mercy);
                    } else if (favChar.equalsIgnoreCase("Bastion") || favChar.equalsIgnoreCase("Torbjorn")) {
                        JOptionPane.showMessageDialog(null, "Womp womp....", "Videogame Talk", 0, hmmLookAway2);
                        JOptionPane.showMessageDialog(null, "Your one of those", "Videogame Talk", 0, hmmMad1);
                    } else {
                        JOptionPane.showMessageDialog(null, "oh I don't really play that character", "Videogame Talk", 0, hmmLookAway1);
                    }
                } else {
                    JOptionPane.showMessageDialog(null, "oh I don't really know anything about " + videoGame, "Videogame Talk", 0, hmmLookAway1);
                    JOptionPane.showMessageDialog(null, "My favorite game is Overwatch", "Videogame Talk", 0, smile1);
                }
            } else {
                JOptionPane.showMessageDialog(null, "hmmm", "hmmm", 0, hmmMad1);
                JOptionPane.showMessageDialog(null, "...", "hmmm", 0, hmmLookAway1);
                JOptionPane.showMessageDialog(null, ".....", "hmmm", 0, hmmLookAway2);
                JOptionPane.showMessageDialog(null, "........", "hmmm", 0, hmmMad2);
                likesNothing = true;
                likes = JOptionPane.showInputDialog("So what do you like?");
                JOptionPane.showMessageDialog(null, "hmm I guess that's cool...", "hmmm", 0, hmmMad2);
            }
        }
        JOptionPane.showMessageDialog(null, "So, " + name + " let me give you a summary about what I learned", "hmmm", 0, talking1);
        JOptionPane.showMessageDialog(null, "Your birthday is " + month + ", " + dateBorn, "Summary", 0, talking1);
        if (likesMath) {
            if (goodAtMath) {
                JOptionPane.showMessageDialog(null, "Not only do you like math but you are good at math.", "Summary", 0, happy1);
            } else {
                JOptionPane.showMessageDialog(null, "You like math but you got my question wrong.  Maybe you are still in Geometry...", "Summary", 0, hmmLookAway1);
            }
        } else if (likeVGs == 0) {
            JOptionPane.showMessageDialog(null, "You don't like math but you like playing video games!", "Summary", 0, happy1);
            if (videoGame.equalsIgnoreCase("Overwatch")) {
                JOptionPane.showMessageDialog(null, "Me and you have the same favorite video game.  OVERWATCH!!", "Summary", 0, happy1);
                JOptionPane.showMessageDialog(null, "and your favorite char is " + favChar, "Summary", 0, happy1);
            } else {
                JOptionPane.showMessageDialog(null, "and your favorite video game is " + videoGame, "Summary", 0, smile2);
            }
        } else {
            JOptionPane.showMessageDialog(null, "and you like " + likes, "Summary", 0, talking2);
        }
        JOptionPane.showMessageDialog(null, "It was nice getting to know you " + name, "Goodbye", 0, talking1);
        JOptionPane.showMessageDialog(null, "Bye " + name + "!!", "Goodbye", 0, happy1);
    }
}