package ra.student;

import java.util.Scanner;

public class StudentComparable implements Comparable<StudentComparable> {
    private int id=3;
    private String name;
    private int age;
    private boolean status;
private static int count=0;
    public StudentComparable() {
        this.id=count++;
    }

    public StudentComparable(int id, String name, int age, boolean status) {
        this.id = count++;
        this.name = name;
        this.age = age;
        this.status = status;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public void input(){
    Scanner scanner=new Scanner(System.in);
        System.out.println("Nhập tên sinh viên: ");
        this.name=scanner.nextLine();
        System.out.println("Nhập tuổi: ");
        this.age= Integer.parseInt(scanner.nextLine());
        System.out.println("Nhập trạng thái: ");
        this.status= Boolean.parseBoolean(scanner.nextLine());
}
    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", status=" + status +
                '}';
    }

    @Override
    public int compareTo(StudentComparable o) {
        return this.name.compareTo(o.name);
    }


}
