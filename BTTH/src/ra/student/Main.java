package ra.student;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<StudentComparable> stackStudent = new ArrayList<>();
        stackStudent.add(new StudentComparable(0, "binh", 25, true));
        stackStudent.add(new StudentComparable(1, "nam", 15, true));
        stackStudent.add(new StudentComparable(2, "cong", 15, true));
//        StudentComparable student = new StudentComparable();
//        student.input();
//        stackStudent.add(student);
//      Collections.addAll(stackStudent);
        System.out.println(stackStudent.toString());
//      Comparable
//      Collections.sort(stackStudent);


//      Comparator
//        StudentComparator comparator = new StudentComparator();
//        Collections.sort(stackStudent, comparator);
//        System.out.println(stackStudent.toString());

        NewCom student2=new NewCom();
        Collections.sort(stackStudent,student2);
        System.out.println(stackStudent.toString());


    }
}
