/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package upac.tp.java.backend.entity;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.domain.Persistable;

/**
 *
 * @author ryank
 */

@Entity
@Table(name = "Student")
@Getter
@Setter
public class StudentEntity implements Persistable<Long>, Serializable
{
    
    @Id  
    @GeneratedValue
    @Column(name = "id")
    private Long id;
    
    @Column(name = "first_name")
    private String firstname;
    
    @Column(name = "last_name")
    private String lastname;
    
    
    
public StudentEntity(){}

    @Override
    public Long getId() {
       return id;
    }

    @Override
    public boolean isNew() {
        return id == null;
    }
}