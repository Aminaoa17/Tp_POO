/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package upac.tp.java.backend.services.impl;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import upac.tp.java.backend.domain.StudentBean;
import upac.tp.java.backend.entity.StudentEntity;
import upac.tp.java.backend.repository.StudentRepositoryInterface;
import upac.tp.java.backend.services.StudentService;

import java.util.ArrayList;
import java.util.List;

/**
 * @author ryank
 */
@Service
public class StudentServiceImpl implements StudentService {

    private final StudentRepositoryInterface studentQuery;

    public StudentServiceImpl(@Qualifier("StudentRepositoryInterface") StudentRepositoryInterface studentQuery) {
        this.studentQuery = studentQuery;
    }

    @Override
    public StudentBean getAllStudent() {
        List<StudentEntity> studentE = studentQuery.findAll();
        List<StudentBean> student = new ArrayList<>();
        studentE.forEach((cs) -> {


        });

        return null;
    }
}
