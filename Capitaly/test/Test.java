import capitaly.Capitaly;
import java.io.FileNotFoundException;

public class Test {
    public static void main(String[] args){
        try{
            System.out.println("Game with random rolls ");
            Capitaly game1=new Capitaly("withoutRolls.txt");
            game1.playCapitaly();
            System.out.println("Game with rolls from file ");
            Capitaly game2=new Capitaly("withRolls.txt");
            game2.playCapitaly();
            //egyszerre csak egyik mukodik(game3,4,5 kozul), kilep a programbol hiba miatt
            /*System.out.println("Game with empty file ");
            Capitaly game3=new Capitaly("empty.txt");
            game3.playCapitaly();
            */
            /*System.out.println("Game with only letters in file ");
            Capitaly game4=new Capitaly("onlyText.txt");
            game4.playCapitaly();
            */
            /*System.out.println("Game with not existing file ");
            Capitaly game5=new Capitaly("blabla.txt");
            game5.playCapitaly();*/
        }catch(FileNotFoundException e){
            System.err.println("File doesn't exist");
        }
    }
        
}
            
    

