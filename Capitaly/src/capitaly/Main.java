package capitaly;
import java.io.FileNotFoundException;


public class Main {
    public static void main(String[] args){
        if(args.length<1){
                System.err.println("Wrong number of arguments");
            }
        else{
            try{
                Capitaly capitaly=new Capitaly(args[0]);
                capitaly.playCapitaly();
            }catch(FileNotFoundException e){}
        }
        
    }
            
    
}

