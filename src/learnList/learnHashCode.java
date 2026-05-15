package learnList;

import java.util.EnumSet;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

class Student{
    int rollNo;
    String Name;

    public Student(int rollNo, String name) {
        this.rollNo = rollNo;
        Name = name;
    }

    @Override
    public String toString() {
        return "Student{" +
                "rollNo=" + rollNo +
                ", Name='" + Name + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return rollNo == student.rollNo;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(rollNo);
    }
}

enum Gender{
    MALE, FEMALE, OTHERS
}

public class learnHashCode {
    public static void main(String[] args) {

        Set<Student> set1 = new HashSet<>();

        Student s1 = new Student(1, "Rohit");
        Student s2 = new Student(2, "Visal");
        Student s3 = new Student(1, "Singha");

        set1.add(s1);
        set1.add(s2);
        set1.add(s3);

        System.out.println(set1);

        EnumSet<Gender> enum1 = EnumSet.allOf(Gender.class);
    }
}
