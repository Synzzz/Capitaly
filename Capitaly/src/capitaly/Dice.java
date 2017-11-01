package capitaly;
import java.util.Random;


public class Dice {
  Random rand = new Random();
    
  public int rollDice(){
    int randomNum = rand.nextInt((6 - 1) + 1) + 1;
    return randomNum;
  } 
  
  public boolean overroll(int r,Game g,Player p){
      return (p.getCurrentField()+r>g.getFieldCount()-1);
  }
  
  public int overrolled(int r,Game g, Player p){
      int leftover=r-(g.getFieldCount()-1-p.getCurrentField());
      return(leftover-1);
  }
  
}
