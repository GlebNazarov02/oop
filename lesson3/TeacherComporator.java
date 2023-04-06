package lesson3;

import java.util.Comparator;

public class TeacherComporator implements Comparator<People> {
    public int compare(People People, People anotherPeople) {
        Teacher teacher = (Teacher) People;
        Teacher anotherTeacher = (Teacher) anotherPeople;
        if (teacher.getStudGroup().size() > anotherTeacher.getStudGroup().size())
            return -1;
        if (teacher.getStudGroup().size() < anotherTeacher.getStudGroup().size())
            return 1;
        return 0;
    }
}