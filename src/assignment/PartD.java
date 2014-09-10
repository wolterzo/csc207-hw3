package assignment;

public class PartD
{
  public static String nameGame(String inputName)
  {
    String name = inputName.toLowerCase();
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

    String result =
        inputName + "!\n" + inputName + ", " + inputName + " bo B" + ame
            + " Bonana fana fo F" + ame + "\n" + "Fee fy mo M" + ame + ", "
            + inputName + "!\n";

    return result;
  }//nameGame(String name)

  public static void main(String[] args)
  {

    System.out.println(nameGame("Zoltan"));
    System.out.println(nameGame("zoe"));
    System.out.println(nameGame("ZHI"));
    System.out.println(nameGame("Harry"));
    System.out.println(nameGame("SamR"));

  }//main(String[] args)

}
