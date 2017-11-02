package capitaly;

public class Careful extends Player {
    
     public Careful(String name) {
        super(name);
    }
    /**
    *visszaadja vasarol-e a jatekos
    */    
    @Override
    public boolean willBuy(Field f){
        return((this.getMoney()/2)>=f.getFieldCost());
    }
    /**
    *visszaadja epit-e a jatekos
    */
    @Override
    public boolean willBuild(Field f){
        return((this.getMoney()/2)>=4000);
    }

   
   

    
            
}
