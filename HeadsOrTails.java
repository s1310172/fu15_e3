import java.util.Random;
import java.util.Scanner;

class HeadsOrTails{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    Random rnd = new Random();
    String name, str;
    int heads = 0, tails = 0;

    System.out.println("Who are you?");
    System.out.print("> ");
    name = sc.next();
    System.out.println("Hello, " + name + "!");
    System.out.println("Tossing a coin...");
    for(int i = 1; i <= 3; i++){
      if(rnd.nextBoolean()){
        str = "Heads";
        heads++;
      }
      else{
        str = "Tails";
        tails++;
      }
      System.out.println("Round " + i + ": " + str);
    }
    System.out.println("Heads: " + heads + ", Tails: " + tails);
  }
}
