package capitaly;
import java.io.FileNotFoundException;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) throws FileNotFoundException{
        
        System.out.println("1: Rolls in file");
        System.out.println("2: Rolls are random");
        Scanner sc= new Scanner(System.in);
        Capitaly capitaly;
        boolean x=false;
        do{
            int a=sc.nextInt();
            switch (a) {
            case 1: 
                capitaly=new Capitaly("withRolls.txt");
                capitaly.playCapitaly();
                x=true;
                break;
            case 2:   
                capitaly=new Capitaly("withoutRolls.txt");
                capitaly.playCapitaly();
                x=true;
                break;
            default:
                System.out.println("Invalid must enter 1 or 2");                    
                break;
        }                    
    } while(x==false);   
        
    }
            
    
}

