package lesson3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class less3 {
    public static void main(String[] args) {

        Teacher teacher01 = new Teacher("Teacher1", "LName1");
        Teacher teacher02 = new Teacher("Teacher2", "LName2");
        Teacher teacher03 = new Teacher("Teacher3", "LName3");
        Teacher teacher04 = new Teacher("Teacher4", "LName4");

        StudGroup StudGroup01 = new StudGroup(1, "Alfa", teacher01);
        StudGroup StudGroup02 = new StudGroup(2, "Beta", teacher02);
        StudGroup StudGroup03 = new StudGroup(3,"Gamma", teacher03);
        
        List<People> students = new ArrayList<People>();
        students.add(new Student("Алексей", "Петров", 5));
        students.add(new Student("Василий", "Соловьев", 4));
        students.add(new Student("Михаил", "Марков", 5));
        students.add(new Student("Екатерина", "Ветрова", 3));
        students.add(new Student("Владислав", "Листьев", 2));
        students.add(new Student("Мария", "Петрова", 5));

        Collections.sort(students, new StudentComporator());
        PeopleIterator studentListIter = new PeopleIterator(students);
        while (studentListIter.hasNext()) {
            System.out.println(studentListIter.next());
        }

        List<People> teacherList = new ArrayList<People>();
        teacherList.add(teacher01);
        teacherList.add(teacher02);
        teacherList.add(teacher03);
        teacherList.add(teacher04);

        Collections.sort(teacherList, new TeacherComporator());
        PeopleIterator teacherListIter = new PeopleIterator(teacherList);
        while (teacherListIter.hasNext()) {
            System.out.println(teacherListIter.next());
        }
        System.out.println(StudGroup01);
        System.out.println(StudGroup02);
        System.out.println(StudGroup03);
        StudGroup01.setTeacher(teacher04);
        System.out.println(StudGroup01);
    }
}