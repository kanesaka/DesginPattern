public class MyStudentListIterator implements Iterator {
  private MyStudentList myStudentList;
  private int index;

  public MyStudentListIterator(MyStudentList list) {
    myStudentList = list;
  }
  public boolean hasNext() {
    if(index < myStudentList.getLastNum()) {
      return true;
    } else {
      return false;
    }
  }
  public Student next() {
    Student student = myStudentList.getStudentAt(index);
    index++;
    return student;
  }
}
