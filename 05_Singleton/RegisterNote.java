public class RegisterNote {
  private static RegisterNote registerNote = new RegisterNote();
  private int registerCount;
  private RegisterNote() {
    registerCount = 0;
  }
  public static RegisterNote getInstance() {
    return registerNote;
  }
  public void register() {
    registerCount++;
  }
  public int getRegisterNumber() {
    return registerCount;
  }
}
