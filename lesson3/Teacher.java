package lesson3;

import java.util.ArrayList;
import java.util.List;

public class Teacher extends People {
    Teacher(String name,String lastName){
        super(name, lastName);
    }

    public String getName(){
        return name;
    }

    public String getLastName(){
        return lastName;
    }
    private List<StudGroup> StudGroupList = new ArrayList<>();

    public void addStudGroup(StudGroup StudGroup) {
        StudGroupList.add(StudGroup);
    }
    
    public List<StudGroup> getStudGroup(){
        return StudGroupList;
    }

    public String toString() {
        return String.format("%s , groupListSize: %d", super.toString(), StudGroupList.size());
    }
}
