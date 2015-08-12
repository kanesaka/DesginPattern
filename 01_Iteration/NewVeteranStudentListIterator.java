public class NewVeteranStudentListIterator implements Iterator {
  private NewVeteranStudentList newVeteranStudentList;
  private int index;

  public NewVeteranStudentListIterator(NewVeteranStudentList list) {
    newVeteranStudentList = list;
    index = 0;
  }
  public boolean hasNext() {
    if(index < newVeteranStudentList.getLastNum()) {
      return true;
    } else {
      return false;
    }
  }
  public Student next() {
    Student student = newVeteranStudentList.getStudentAt(index);
    index++;
    return student;
  }
}
