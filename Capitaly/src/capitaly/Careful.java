package capitaly;

public class Careful extends Player {
   
    @Override
    public boolean willBuy(Field f){
        return((this.getMoney()/2)>=f.getFieldCost());
    }
    
    @Override
    public boolean willBuild(Field f){
        return((this.getMoney()/2)>=4000);
    }

    public Careful(String name) {
        super(name);
    }
   

    
            
}
