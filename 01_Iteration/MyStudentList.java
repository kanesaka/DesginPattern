public class MyStudentList extends StudentList implements Aggregate {
  public MyStudentList() {
    super();
  }
  public MyStudentList(int studentCount) {
    super(studentCount);
  }
  public Iterator iterator() {
    return new MyStudentIterator(this);
  }
}
