public class Main {
  public static void main(String args[]) {
    HotPot hotPot = new HotPot(new Pot());
    Factory factory = createFactory("");
    hotPot.addSoup(factory.getSoup());
    hotPot.addMain(factory.getMain());
    hotPot.addVegetables(factory.getVegetables());
    hotPot.addOtherIngredients(factory.getOtherIngredients());
  }
  private static Factory createFactory(String str) {
    return new MizutakiFactory();
  }
}
