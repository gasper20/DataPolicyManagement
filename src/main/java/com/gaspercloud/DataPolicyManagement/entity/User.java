/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gaspercloud.DataPolicyManagement.entity;

import java.sql.Timestamp;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.validation.constraints.NotBlank;
import lombok.Data;

/**
 *
 * @author gasperthompson
 */
@Entity
@Data
public class User {

    @Id
    @GeneratedValue
    private int id;
    private String surname;
    private String firstname;
    private String email;
    private String password;
    private boolean status;
    private Timestamp datecreated;
    private Timestamp datemodified;

}
