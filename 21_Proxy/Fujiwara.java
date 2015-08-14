public class Fujiwara implements Teacher {
  private Teacher yamada = new Yamada();
  private boolean am = true;

  public Fujiwara(boolean am) {
    this.am = am;
  }

  public void question1() {
    System.out.println("それは「～～解答1～～」です。");
  }
  public void question2() {
    System.out.println("それは「～～解答2～～」です。");
  }
  public void question3() {
    if (am) {
      System.out.print("答えは「");
      // 藤原先生には答えられないので、山田先生に聞く
      yamada.question3();
      System.out.println("」となります。");
    } else {
      System.out.println("明日、返答します。");
    }
  }
}
