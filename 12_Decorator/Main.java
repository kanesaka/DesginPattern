public class Main {
  public static void main(String args[]) {
    Icecream ice1 = new VanillaIcecream();
    Icecream ice2 = new CashewNutsToppingIcecream(new VanillaIcecream());
    System.out.println(ice1.getName());
    System.out.println(ice2.getName());
  }
}
