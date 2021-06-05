public class Snapper
{
    private String girlname;
    public void setName(String name){
        girlname=name;
    }
    public String getName(){
        return girlname;
        
    }
    public void saying(){
        System.out.printf("Your first girlfriend was %s", getName());
    }
}