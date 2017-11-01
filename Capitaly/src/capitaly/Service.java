package capitaly;

public class Service extends Field {

    public Service (int i) {
      setFieldCost(i);
      setFieldOwner("Bank");
    };

    @Override
    public boolean canBuild() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void buildHouse() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
