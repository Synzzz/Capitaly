package capitaly;

public class Property extends Field {

    private boolean hasHouse=false;

    public Property () {
        this.setFieldCost(1000);
    };
  
    public boolean isHasHouse(){
        return(hasHouse);
    }

    public void setIsHouse(boolean isHouse) {
        this.hasHouse = isHouse;
    }
    /**
    *visszaadja van-e mar haz a mezon
    */
    @Override
     public boolean canBuild() {
        return(!this.isHasHouse());
    }
     
    /**
    *hazat epit a mezore
    */
    public void buildHouse(){
         this.setIsHouse(true);
         this.setFieldCost(2000);
         this.getOwner().setMoney(this.getOwner().getMoney()-4000);
    }
    /**
    *visszaallitja a mezot az eredeti vasarlas elotti allapotba
    */
    @Override
    public void loseProperty(){
        this.setIsHouse(false);
        this.setFieldCost(1000);
        this.setOwner(null);
        this.setFieldOwner(null);
    }

}
