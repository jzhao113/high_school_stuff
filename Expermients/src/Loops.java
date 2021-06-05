import java.util.Random;
public class Loops
{
    public static void main (String[]args)
    {
        //arrays;
        int testing[]= new int [10];//the 10 is the number values being stored in it
        //or
        //remember its not (((( its {{{{{
        int testing1[] ={1,2,4,5,6,7};
        testing[0]=10;
        testing[1]=20;
        testing[9]=30;
        System.out.println(testing[1]);
        System.out.println(testing1[0]);
       
        
        
        
        
        for(int counter =1; counter <=10; counter++)
        {
            System.out.println(counter);
        }
        int a = 10;
        do{
            System.out.println("HHH");
            //change the a to <= or <
        }while(a<10);
        
        
        //Array index shower thingy
        System.out.println("Index\tValue");
        for(int counter=0;counter<testing1.length;counter++)
        {
            System.out.println(counter+"\t"+testing1[counter]);
        }
        
        
        
        //Random
        Random rand = new Random();
        int freq[]=new int[7];
        for(int roll=1;roll<1000;roll++)
        {
            ++freq[1+rand.nextInt(6)];
        }
        for (int face=1;face<freq.length;face++)
        {
            System.out.println(face+"\t"+freq[face]);
        }
        
        
    }
}