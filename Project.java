import java.util.Scanner;

class Project
{
  public static void main(String args[])
  {
    Scanner scan = new Scanner(System.in);
    System.out.println("What is your name?");
    String name = scan.nextLine();
    System.out.println("Hello " + name + "! Are you ready to crack the code?");
    String answerString = scan.nextLine();
    int answerInt = 0;
    if (!(answerString.toUpperCase().equals("Y") || answerString.toUpperCase().equals("YES")))
    {
      System.exit(0);
    }
    
    
    System.out.println("\n\nAlright " + name + ", here is your first hint:\n\nString output = \"\";\nString[] arr = {\"First\", \"Second\", \"Third\", \"Fourth\", \"Fifth\"};\nfor (String n : arr){\n\toutput = output + n.substring(0, 2);\n}\nSystem.out.println(output);\n\nWhat is printed?");
    //output should be FiSeThFoFi
    answerString = scan.nextLine();
    if (answerString.equals("FiSeThFoFi"))
    {
      System.out.println("You passed! Moving on...\n\n");
      System.out.println("Second hint:\n\nFictional Dystopian dictatorship where your every move is being watched");
      answerInt = scan.nextInt();
      if (answerInt == 1984)
      {
        System.out.println("You passed the second gate! Finally..\n\n");
        System.out.println("Third hint:\n\n+%2");
        answerInt = scan.nextInt();
        if (answerInt > 0 && answerInt % 2 == 0)
        {
          System.out.println("You cracked the code!! Good job!");
        }
      }
    }
  } 
}
