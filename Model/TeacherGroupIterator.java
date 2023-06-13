
package Model;

import java.util.Iterator;
import java.util.List;

public class TeacherGroupIterator implements Iterator<Teacher> {
    private int counter;
    private final List<Teacher> teachers;

    public TeacherGroupIterator(TeacherGroup teacherGroup) {
        this.teachers = teacherGroup.getTeacherList();
        this.counter = 0;
    }

    @Override
    public boolean hasNext() {
        return counter < teachers.size();
    }

    @Override
    public Teacher next() {
        if (!hasNext()){
            throw new RuntimeException("Teacher");
        }

        return teachers.get(counter++);
    }
}