public class Student2 {
  public static void main(String args[]) {
    Beaker beaker = new Beaker(90, 10);
    Command makeSaltWater = new MakeSaltWaterCommand();
    Command addSalt = new AddSaltCommand();
    MakeSaltWaterAddSaltCommand m = new MakeSaltWaterAddSaltCommand();
    makeSaltWater.setBeaker(beaker);
    addSalt.setBeaker(beaker);
    m.setBeaker(beaker);
    m.addCommand(makeSaltWater);
    m.addCommand(addSalt);
    m.execute();
  }
}
