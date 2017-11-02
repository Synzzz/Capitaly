package capitaly;
import java.util.*;
import static jdk.nashorn.internal.objects.NativeString.indexOf;

public abstract  class Player {

    private String name;
    private int money;
    private ArrayList<Integer> owned = new ArrayList<Integer>();
    private int currentField;
    
    public Player (String name) {
      this.name=name;
      this.money=10000;
      this.currentField=0;
    }
    public String getName() {
        return name;
    }
    public int getMoney() {
        return money;
    }
    public void setMoney(int money) {
        this.money = money;
    }
    public ArrayList<Integer> getOwned() {
        return owned;
    }
    public int getCurrentField() {
        return currentField;
    }
    public void setCurrentField(int currentField) {
        this.currentField = currentField;
    }
    
    /**
    *visszaadja van-e eleg penze a jatekosnak hogy fizessen
    */
    public boolean hasEnoughMoney(Field f){
        return((this.money-f.getFieldCost())>0);
    }
    /**
    *visszaadja van-e eleg penze a jatekosnak hogy epitsen
    */
    public boolean enoughToBuild(Field f){
        return((this.money-4000)>0);
    }
    /**
    *visszaadja kell-e a jatekosnak fizetnie a mezore lepesert
    */
    public boolean hasToPay(Field f){
        return (!(this.name==f.getFieldOwner()));
    }
    /**
    *megvasarolja a mezot
    */
    public void buyProperty(Field f,Game g){
        f.setFieldOwner(this.getName());
        f.setOwner(this);
        f.setFieldCost(500);
        this.money-=1000;
        this.owned.add(g.indexof(f));
    }
    /**
    *fizet a mezo tulajdonosanak
    */
    public void pay(Field f){
        if (f instanceof Property) {
            f.getOwner().setMoney((f.getFieldCost()+f.getOwner().getMoney()));
        }
        this.setMoney(this.getMoney()-f.getFieldCost());
    }
 
    public abstract boolean willBuy(Field f);
    public abstract boolean willBuild(Field f);
    
    

}
