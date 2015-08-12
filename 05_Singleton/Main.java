public class Main {
  public static void main(String args[]) {
    RegisterNote rn1 = RegisterNote.getInstance();
    rn1.register();
    System.out.println(rn1.getRegisterNumber());
    RegisterNote rn2 = RegisterNote.getInstance();
    rn2.register();
    System.out.println(rn2.getRegisterNumber());
  }
}
