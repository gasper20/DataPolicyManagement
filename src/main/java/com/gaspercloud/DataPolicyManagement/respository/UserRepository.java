/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gaspercloud.DataPolicyManagement.respository;

import com.gaspercloud.DataPolicyManagement.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author gasperthompson
 */
@Repository
public interface UserRepository extends JpaRepository<User, Long> {

}
