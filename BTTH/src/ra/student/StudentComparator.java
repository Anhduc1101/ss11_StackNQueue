package ra.student;

import java.util.Comparator;

public class StudentComparator implements Comparator<StudentComparable> {

  public int compare(StudentComparable s1, StudentComparable s2){
      return s1.getName().compareTo(s2.getName());
  }
}
