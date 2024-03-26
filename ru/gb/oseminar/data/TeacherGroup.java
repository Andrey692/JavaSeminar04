package ru.gb.oseminar.data;

import java.util.ArrayList;
import java.util.List;

public class TeacherGroup {
    private List<Teacher> teachers;
    Teacher teacher;

    public TeacherGroup() {
        teachers = new ArrayList<>();
    }

    public void setTeacher(List<Teacher> teachers) {
        this.teachers = teachers;
    }

    public void addTeacherGroup(Teacher teahcer) {
        teachers.add(teacher);
    }

    public Teacher getTeacher() {
        return teacher;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }

    @Override
    public String toString() {
        return "TeacherGroup{" +
                ", teacher=" + teacher +
                '}';
    }

}
