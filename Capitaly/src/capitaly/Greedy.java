package capitaly;

public class Greedy extends Player {
    
    @Override
    public boolean willBuy(Field f){
        return(this.hasEnoughMoney(f));
    }
    @Override
    public boolean willBuild(Field f){
        return(this.enoughToBuild(f));
    }
    public Greedy(String name) {
        super(name);
    }

    
}
