package capitaly;
import capitaly.Game;
import java.io.*;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;


public class Capitaly {
    
    private Game g;

    public Capitaly(String theFile) throws FileNotFoundException{
        this.g=new Game(theFile);
    }
        
    public void playCapitaly(){    
        Dice d= new Dice();
        boolean rollInFile=false;
        int roll;
        int z = 0,x = 0;
        if(this.g.getRolls().size()>0){
            z=this.g.getRolls().size();
            rollInFile=true;
        }
        else{
            Scanner sc=new Scanner(System.in);
            System.out.println("Type in the number of rounds:");
            z=sc.nextInt();
        }
        ArrayList<Player> copyplayers=this.g.getPlayers();
        while(x<z && this.g.getPlayers().size()>1){
            for (Iterator<Player> iterator = copyplayers.iterator(); iterator.hasNext();) {    
            Player s = iterator.next();
                //no copypasta protection
                Field f=this.g.getField(s.getCurrentField());
                if(rollInFile){
                    roll=this.g.getRolls().get(x);
                }
                else{
                    roll=d.rollDice();
                }
                if(d.overroll(roll, g,s)){
                    s.setCurrentField(d.overrolled(roll,g,s));
                }
                else{
                    s.setCurrentField(s.getCurrentField()+roll);
                }
                if(f.getFieldOwner()==null && f instanceof Property){
                    if(s.willBuy(f)){
                        s.buyProperty(f,g);
                    }
                }
                else if(s.hasToPay(f)){
                    if(s.hasEnoughMoney(f)){
                        s.pay(f);
                    }
                    else{
                        System.out.println(s.getName()+" lost.");
                        for(Field v: this.g.getTable()){
                            if(v.getOwner()==s){
                                v.loseProperty();
                            }
                        }
                        s.getOwned().clear();
                        iterator.remove();
                    }
                }
                else if(!s.hasToPay(f) && f.canBuild() && s.willBuild(f) ){
                    f.buildHouse();
                }
            }
            x++;
        }
         for(Player s:this.g.getPlayers()){
            System.out.println(s.getName()+" owns "+s.getOwned());
            System.out.println(s.getName()+" has "+s.getMoney());
         }
    }   

}
