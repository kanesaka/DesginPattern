public class NewVeteranTeacher extends Teacher {
  private NewVeteranStudentList studentList;

  public void createStudentList() {
    studentList = new NewVeteranStudentList();
    studentList.add(new Student("赤井亮太", 1));
    studentList.add(new Student("岡田美央", 2));
    studentList.add(new Student("赤羽里美", 2));
    studentList.add(new Student("中ノ森玲菜", 2));
    studentList.add(new Student("西森俊介", 1));
  }
  public void callStudents() {
    Iterator iterator = studentList.iterator();
    while(iterator.hasNext()) {
      System.out.println(((Student) iterator.next()).getName());
    }
  }
}
