package capitaly;

public class Luck extends Field {

  public Luck (int i) {
      setFieldCost(-i);
      setFieldOwner("Bank");
  };

    @Override
    public boolean canBuild() {
        throw new UnsupportedOperationException();
    }

    @Override
    public void buildHouse() {
        throw new UnsupportedOperationException();
    }

    

}
