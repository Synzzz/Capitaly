package capitaly;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class Game {
    private int fieldCount;
    private int playerCount;
    private  File gameFile;
    private   ArrayList<Player> players = new ArrayList<Player>();
    private   ArrayList<Field> table = new ArrayList<Field>();
    private   ArrayList<Integer> rolls = new ArrayList<Integer>();

    
    public  ArrayList<Field> getTable() {
        return table;
    }
    public void addToTable(Field f) {
        this.table.add(f);
    }
    public int getFieldCount() {
        return fieldCount;
    }
    public void setFieldCount(int fieldCount) {
        this.fieldCount = fieldCount;
    }
    public int getPlayerCount() {
        return playerCount;
    }
    public void setPlayerCount(int playerCount) {
        this.playerCount = playerCount;
    }
    public  ArrayList<Player> getPlayers() {
        return players;
    }
    public void addToPlayers(Player p) {
        this.players.add(p);
    }
    public  Field getField(int f){
        return table.get(f);
    }
    public void addToRolls(int r) {
        this.rolls.add(r);
    }
    public  ArrayList<Integer> getRolls() {
        return rolls;
    }
    /**
    *visszaadja a mezo indexet a listaban
    */
    public int indexof(Field f){
            return (this.getTable().indexOf(f));
    }
    /**
    *visszaadja a jatekos indexet a listaban
    */
    public int playerIndex(Player s){
            return (this.getPlayers().indexOf(s));
    }
    /**
    *elkesziti a jatekot a fajlbol,kiolvassa a mezok szamat,elkesziti a tablat a mezokbol,
    *kiolvassa a jatekosook szamat es hozzaadja oket a listahoz, ha meg vannak adva a 
    *kockadobasok is, azt is elmenti listaban
    */ 
    public  Game (String theFile)throws FileNotFoundException {
        this.gameFile=new File(theFile);
        Scanner rFile = new Scanner(gameFile);
        int n=0;
        try{
            n= rFile.nextInt();
        }catch(NoSuchElementException e){
            System.err.println("The file is empty or the data format is incorrect");
            System.exit(0);
        }    
        //read table
        this.setFieldCount(n);
        for(int i=0;i<n;i++){
            int j=rFile.nextInt();
            if(j==1){ this.addToTable(new Property()); }
            if(j==2){ this.addToTable(new Service(rFile.nextInt()));}
            if(j==3){ this.addToTable(new Luck(rFile.nextInt()));}
        }
        //read players
        this.setPlayerCount(rFile.nextInt());
        for(int i=0;i<this.getPlayerCount();i++){
            String name=rFile.next();
            int playstyle=rFile.nextInt();
            if(playstyle==1){this.addToPlayers(new Greedy(name));}
            if(playstyle==2){this.addToPlayers(new Careful(name));}
            if(playstyle==3){this.addToPlayers(new Tactical(name));}
        }
        while(rFile.hasNextInt()){
            this.addToRolls(rFile.nextInt());    
        }
        rFile.close();
    }
         
}
