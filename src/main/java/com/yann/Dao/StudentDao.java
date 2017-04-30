package com.yann.Dao;

import com.yann.Entity.Student;
import org.springframework.stereotype.Repository;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by yann on 30/04/2017.
 */
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
        return this.students.values();
    }

    public Student getStudentById(int id) {
        return this.students.get(id);
    }

    public void removeStudeById(int id) {
        this.students.remove(id);
    }
}
