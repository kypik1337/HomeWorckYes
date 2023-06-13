package Model;

import java.time.LocalDate;

public class Teacher extends User implements Comparable<Teacher> {

    static Long idGenerator = 0l;
    private Long teacherId;

    public Teacher(String firstName, String secondName, String patronymic, LocalDate dateOfBirth) {
        super(firstName, secondName, patronymic, dateOfBirth);
        this.teacherId = idGenerator++;
    }

    public Long getTeacherId() {
        return teacherId;
    }

    public void setTeacherId(Long teacherId) {
        this.teacherId = teacherId;
    }

    @Override
    public int compareTo(Teacher o) {
        return Long.compare(this.teacherId, o.getTeacherId());
    }

    @Override
    public String toString() {
        return "Teacher " + teacherId + " " + super.toString();
    }

}