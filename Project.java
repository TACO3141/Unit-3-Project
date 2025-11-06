import java.lang.Scanner;

class Project
{
  public static void main(String args[])
  {
    Scanner scan = new Scanner(System.in);
    System.out.println("What is your name?");
    String name = scan.nextLine();
    System.out.println("Hello " + name + "! Are you ready to crack the code?");
    String answer = scan.nextLine();
    if (!(answer.toUpperCase() == "Y" || answer.toUpperCase() == "YES"))
    {
      System.exit(0);
    }
    
    System.out.println("Alright " + name + ", here is your first hint:\n\nint count = 0;\nString[] arr = {\"First\", \"Second\", \"Third\", \"Fourth\", \"Fifth\"};\nfor (String n : arr){\n\t")
  }
}
