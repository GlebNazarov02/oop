package lesson3;

import java.util.Iterator;
import java.util.List;

public class PeopleIterator implements Iterator<People> {
    private int counter;
    private List<People> people;

    public PeopleIterator(List<People> people) {
        this.counter = 0;
        this.people = people;
    }

    @Override
    public boolean hasNext() {
        return counter < people.size();
    }

    @Override
    public People next() {
        if (!hasNext()) {
            return null;
        }
        return people.get(counter++);
    }
}

