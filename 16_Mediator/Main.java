public class Main {
  public static void main(String args[]) {
    LoveMediator saito = new Saito();
    Colleague nitta = new Nitta();
    nitta.setSecretLover(new Rena());
    nitta.needsAdvice();
  }
}
