package Model;

import java.time.LocalDate;

public class Student extends User implements Comparable<Student> {
    private Long studentId;


    public Student(long studentId, String firstName, String secondName,
                   String patronymic, LocalDate dateOfBirth) {
        super(firstName, secondName, patronymic, dateOfBirth);
        this.studentId = studentId;
    }

    public Long getStudentId() {
        return studentId;
    }

    public void setStudentId(Long studentId) {
        this.studentId = studentId;
    }


    @Override
    public String toString() {
        return "Student " + studentId + " " + super.toString();
    }

    @Override
    public int compareTo(Student o) {
        return this.studentId.compareTo(o.studentId);
    }
}