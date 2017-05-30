/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gotkcups.inventory;

import com.gotkcups.inventory.data.Productinfos;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author rfteves
 */
public interface PIRepository extends JpaRepository<Productinfos, Long> {
    
}
