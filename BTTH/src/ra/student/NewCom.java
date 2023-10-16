package ra.student;


import java.util.Comparator;

public class NewCom implements Comparator<StudentComparable> {



    @Override
    public int compare(StudentComparable o1, StudentComparable o2) {

        if(o1.getAge()>o2.getAge()){
        return 1;
        } else if (o1.getAge()<o2.getAge()) {
            return -1;
        }else {
            if(o1.getId()>o2.getId()){
                return 1;
            } else if (o1.getId()<o2.getId()) {
                return -1;
            }else {
                return 0;
            }
        }
//        int compareAge=Integer.compare(o1.getAge(),o2.getAge());
//        if(compareAge==0){
//            return o1.getId()-(o2.getId());
//        }else {
//            return compareAge;
//        }
    }
}
