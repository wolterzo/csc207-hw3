package assignment;

public class PartD
{
  public static String nameGame(String name)
  {
    name = name.toLowerCase();
    String ame = "";
    
    for (int i = 0; i < name.length(); i++)
      {
        char ch = name.charAt(i);
        if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u')
          {
            ame = name.substring(i);
            break;
          } //if
      } //for
      
    /*name = name.substring(0,i).toUpperCase() + ame;*/
        
    String result = name + "!\n" + name + ", " + name + " bo B"
    + ame + " Bonana fana fo F" + ame + "\n" + "Fee fy mo M" + ame
    + ", " + name + "!\n"; 
 
    return result;
  }//nameGame(String name)
  
  public static void main(String[] args)
  {

    System.out.println(nameGame("Sholton"));
    
  }//main(String[] args)

}
