import java.util.Scanner;//Scanner
class Main {
  public static void main(String[] args) {
    //Scanner
    Scanner in = new Scanner(System.in);

    String[] roster1 = new String[10];
    String[] roster2 = new String[roster1.length + 2];


    //Print Statement
    System.out.println("Please enter 10 name for roster 1.");
    roster1 = in.nextLine().trim().split(",");

    //For statements
    for (int i=0; i < roster1.length; i++) {
      roster2[i] = roster1[i];
    }

    //Print statement to add 2 final names

    System.out.println("\nPlease enter last two names.");
    String[] namesf = in.nextLine().trim().split(",");


    roster2[10] = namesf[0];
    roster2[11] = namesf[1];

    //Print statement for 1st roster

    System.out.println("\nFirst roster is :");

    for(String i : roster1){
      System.out.print(i + " ");
    }

    //Print statement for 2nd roster
    
    System.out.println("\nSecond roster is:");

    for(String i : roster2){
      System.out.print(i + " ");
    }






  }
}