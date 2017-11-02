package capitaly;

public class Tactical extends Player {
    
    private int cooldown=1;
        
    public Tactical(String name) {
        super(name);
    }
    /**
    *visszaadja vasarol-e a jatekos
    */
    @Override
    public boolean willBuy(Field f) {
        if(this.cooldown%2==0){
            this.cooldown++;
            return false;
        }
        else{
            this.cooldown++;
            return(this.hasEnoughMoney(f));
        }
    }
    /**
    *visszaadja epit-e a jatekos
    */
    @Override
    public boolean willBuild(Field f) {
        if(this.cooldown%2==0){
            cooldown++;
            return false;
        }
        else{
            cooldown++;
            return(this.enoughToBuild(f));
        }
    }

}
