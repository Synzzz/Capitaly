package capitaly;
import java.util.Random;


public class Dice {
  Random rand = new Random();
    
  /**
    *visszaad egy random számot 1 és 6 kozott
    */
  public int rollDice(){
    int randomNum = rand.nextInt((6 - 1) + 1) + 1;
    return randomNum;
  } 
  /**
    *visszaadja ha a jatekos a tabla vegere ert es uj kort fog kezdeni
    */
  public boolean overroll(int r,Game g,Player p){
      return (p.getCurrentField()+r>g.getFieldCount()-1);
  }
  /**
    *kiszamolja az uj korben hanyas szamu mezore kerul a jatekos
    */
  public int overrolled(int r,Game g, Player p){
      int leftover=r-(g.getFieldCount()-1-p.getCurrentField());
      return(leftover-1);
  }
  
}
