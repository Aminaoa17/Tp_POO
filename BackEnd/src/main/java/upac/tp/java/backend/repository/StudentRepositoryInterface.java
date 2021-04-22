/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package upac.tp.java.backend.repository;

import upac.tp.java.backend.entity.StudentEntity;


public interface StudentRepositoryInterface {

    void addStudent(StudentEntity student);

    StudentEntity getStudentById(Integer student);
}