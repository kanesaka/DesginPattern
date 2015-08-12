public class Paper implements Cloneable {
  private String name;
  public Paper() {}
  public Paper(String name) {
    this.name = name;
  }
  public Cloneable createClone() {
    Paper newPaper = new Paper();
    // newPaper と this を重ねて、this の形に切り抜く
    newPaper.name = this.name;
    return newPaper;
  }
}
