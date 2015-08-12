public class MyTeacher extends Teacher {
  public void createStudentList() {
    studentList = new StudentList(5);
    studentList.add(new Student("赤井亮太", 1));
    studentList.add(new Student("岡田美央", 2));
    studentList.add(new Student("赤羽里美", 2));
    studentList.add(new Student("中ノ森玲菜", 2));
    studentList.add(new Student("西森俊介", 1));
  }
  public void callStudents() {
    for(int i = 0; i < studentList.getLastNum(); i++)
      System.out.println(((Student) studentList.getStudentAt(i)).getName());
  }
}
