package ss12_java_collection_framework.comparable.comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Student student1 = new Student("Quang", 22, "Hà Tĩnh");
        Student student2 = new Student("Kỳ", 25, "Huế");
        Student student3 = new Student("Hiếu", 23, "Quảng Trị");
        Student student4 = new Student("Thanh", 33, "Quảng Trị");

        List<Student> lists = new ArrayList<Student>();
        lists.add(student1);
        lists.add(student2);
        lists.add(student3);
        lists.add(student4);
        Collections.sort(lists);
        for (Student student : lists) {
            System.out.println(student.toString());
        }

        AgeComparator ageComparator = new AgeComparator();
        Collections.sort(lists, ageComparator);
        System.out.println("So sánh theo tuổi: ");
        for (Student student : lists) {
            System.out.println(student.toString());
        }
    }
}
