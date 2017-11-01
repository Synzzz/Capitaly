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
        }catch(FileNotFoundException e){
            System.err.println("File doesn't exist");
        }
    }
        
}
            
    

