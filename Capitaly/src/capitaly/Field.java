package capitaly;
import java.util.*;

public abstract class Field {

    private int fieldCost;
    private String fieldOwner=null;
    private Player Owner=null;

    public Field (){}

    public Player getOwner() {
        return Owner;
    }
    public void setOwner(Player Owner) {
        this.Owner = Owner;
    }
    public int getFieldCost() {
        return fieldCost;
    }
    public void setFieldCost(int fieldCost) {
        this.fieldCost = fieldCost;
    }
    public String getFieldOwner() {
        return fieldOwner;
    }
    public void setFieldOwner(String fieldOwner) {
        this.fieldOwner = fieldOwner;
    }

    public abstract boolean canBuild(); 
    public abstract void buildHouse();

    void loseProperty() {
        throw new UnsupportedOperationException();
    }
}
