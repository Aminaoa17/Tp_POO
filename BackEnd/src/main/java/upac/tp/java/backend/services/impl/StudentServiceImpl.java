/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package upac.tp.java.backend.services.impl;

import upac.tp.java.backend.entity.StudentEntity;
import upac.tp.java.backend.repository.impl.StudentRepositoryImpl;
import upac.tp.java.backend.services.StudentService;

/**
 * @author ryank
 */

public class StudentServiceImpl implements StudentService {
    private final StudentRepositoryImpl query;

    public StudentServiceImpl() {
        query = new StudentRepositoryImpl();
    }

    public void test(String firstname, String lastname) {
        StudentEntity stu = new StudentEntity();
        stu.setLastname(lastname);
        stu.setFirstname(firstname);
        query.addStudent(stu);
    }
}
