public class Main {
  public static void main(String args[]) {
    TeacherAcceptor home = new SuzukiHome();
    Teacher teacher = new RookieTeacher(null);
    home.accept(teacher);
  }
}
