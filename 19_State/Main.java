public class Main {
  public static void main(String args[]) {
    StatePatternYumichan yumichan = new StatePatternYumichan();
    yumichan.changeState(new OrdinaryState());
    System.out.println(yumichan.morningGreet());
    yumichan.changeState(new BadMoodState());
    System.out.println(yumichan.morningGreet());
  }
}
