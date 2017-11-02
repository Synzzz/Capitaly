package capitaly;

public class Greedy extends Player {
    
    public Greedy(String name) {
        super(name);
    }
    /**
    *visszaadja vasarol-e a jatekos
    */
    @Override
    public boolean willBuy(Field f){
        return(this.hasEnoughMoney(f));
    }
    /**
    *visszaadja epit-e a jatekos
    */
    @Override
    public boolean willBuild(Field f){
        return(this.enoughToBuild(f));
    }
    

    
}
