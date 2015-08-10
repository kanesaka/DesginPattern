import java.util.Vector;

public class NewVeteranStudentList extends StudentList implements Aggregate {
  protected Vector<Student> students;

  public NewVeteranStudentList() {
    super();
    students = new Vector<Student>();
  }

  public void add(Student student) {
    students.add(student);
  }

  public Student getStudentAt(int index) {
    return students.get(index);
  }

  public int getLastNum() {
    return students.size();
  }

  public Iterator iterator() {
    return new NewVeteranStudentListIterator(this);
  }
}
