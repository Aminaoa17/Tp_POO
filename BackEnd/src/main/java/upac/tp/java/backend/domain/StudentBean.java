/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package upac.tp.java.backend.domain;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

/**
 *
 * @author ryank
 */

@Data
@Getter
@Setter
public class StudentBean {
    private int id;
    private String firstname;
    private String lastname;

    public StudentBean() {

    }
}
