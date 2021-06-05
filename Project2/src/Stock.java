public class Stock
{
    public static void main (String[]args)
    {
    String tvShow = ("American Idol");
    String movie = ("Rise of the Planet the Apes");
    String movie2 = ("The Devil Wears Prada");
    int length;
    int position;
    char letter;
    String tmp;
 
    length = tvShow.length();
    System.out.println(length);
    
    letter = tvShow.charAt(4); 
    System.out.println(letter);
    
    letter = tvShow.charAt(8);
    System.out.println(letter);
    
    position = tvShow.indexOf("can");
    System.out.println(position);
    
    tmp = tvShow.substring(7);
    System.out.println(tmp);
    
    tmp = tvShow.substring(6, 10);
    System.out.println(tmp);
    
    tmp = tvShow.substring(6, 10);
    System.out.println(tmp);
    
    length = movie.length();
    System.out.println(length);
    
    length = movie2.length();
    System.out.println(length);
    
    letter = movie2.charAt(11);
    System.out.println(letter);
    
    letter = movie.charAt(0);
    System.out.println(letter);
    
    letter = movie.charAt(13);
    System.out.println(letter);
    
    tmp = movie2.substring(10);
    System.out.println(tmp);



    }
}