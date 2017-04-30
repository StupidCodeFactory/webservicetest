package com.yann.Dao;

import com.yann.Entity.Student;
import org.springframework.stereotype.Repository;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

@Repository
public class StudentDao {
    private static Map<Integer, Student> students;

    static {
        students = new HashMap<Integer, Student>() {
            {
                put(1, new Student(1, "Yann", "Ruby Developer"));
                put(2, new Student(2, "Yves", "Java Developer"));
                put(3, new Student(3, "Misha", "Frontend Developer"));
            }

        };
    }

    public Collection getAllStudents() {
        return students.values();
    }

    public Student getStudentById(int id) {
        return students.get(id);
    }

    public void removeStudeById(int id) {
        students.remove(id);
    }

    public void updateStudentById(Student student) {
        Student s= students.get(student.getId());
        s.setCourse(student.getCourse());
        s.setName(student.getName());
        students.put(student.getId(), s);
    }
}
