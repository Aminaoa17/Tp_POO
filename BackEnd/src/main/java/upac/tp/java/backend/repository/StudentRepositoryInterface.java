/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package upac.tp.java.backend.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import upac.tp.java.backend.entity.StudentEntity;


public interface StudentRepositoryInterface extends JpaRepository<StudentEntity, Long>{}