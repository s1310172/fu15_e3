import java.util.Random;

class HeadsOrTails{
  public static void main(String[] args){
    Random rnd = new Random();
    String str;
    int heads = 0, tails = 0;

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
    if(heads > tails){
      System.out.println("You won");
    }
    else{
      System.out.println("You lost");
    }
  }
}
