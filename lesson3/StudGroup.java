package lesson3;


import java.util.ArrayList;
import java.util.List;

public class StudGroup {
    private String groupName;
    private Integer groupId;
    private List<Student> studentList = new ArrayList<>();
    private Teacher teacher;

    StudGroup(Integer groupId,String groupName, Teacher teacher) {
        this.groupId = groupId;
        this.groupName = groupName;
        this.teacher = teacher;
        teacher.addStudGroup(this);
    }

    public List<Student> getStudentList() {
        return studentList;
    }

    public void addStudent(Student student) {
        if (!studentList.contains(student))
            studentList.add(student);
    }

    public void setTeacher(Teacher teacher) {
        if (this.teacher != null) {
            this.teacher.removeStudGroup(this);
        }
        this.teacher = teacher;
    }

    public Teacher getTeacher() {
        return teacher;
    }

    public Integer getGroupId() {
        return groupId;
    }

    public String getGroupName() {
        return groupName;
    }

    public String toString() {
        return String.format("ID: %d,Group: %s, Teacher: %s", groupId, groupName, teacher);
    }

}