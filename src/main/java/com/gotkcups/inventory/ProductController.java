/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gotkcups.inventory;

import com.gotkcups.inventory.data.Productchanges;
import com.gotkcups.inventory.data.Productinfos;
import java.util.Collection;
import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import static org.springframework.web.bind.annotation.RequestMethod.GET;

/**
 *
 * @author rfteves
 */
@RestController
public class ProductController {
    
    @RequestMapping(value = "/pcs", method = GET)
    public Collection<Productchanges> listPC() {
        return this.pcChanges.findAll();
    }
    
    @RequestMapping(value = "pis", method = GET)
    public Collection<Productinfos> listPI() {
        return this.pcInfos.findAll();
    }
    
    @RequestMapping(value = "/pcs/{id}", method = GET)
    public Productchanges getPC(@PathVariable Long id) {
        return this.pcChanges.findOne(id);
    }
    
    @RequestMapping(value = "/pis/{id}", method = GET)
    public Productinfos getPI(@PathVariable Long id) {
        return this.pcInfos.findOne(id);
    }
    
    @RequestMapping(value = "/pis/variant/{variantid}", method = GET)
    public Productinfos getPIVariant(@PathVariable String variantid) {
        TypedQuery<Productinfos> query = em.createNamedQuery("Productinfos.findByVariantid", Productinfos.class);
        query.setParameter("variantid", variantid);
        query.setParameter("alpha", "Alpha product");
        if (query.getResultList().isEmpty()) {
            return null;
        } else {
            return query.getSingleResult();
        }
        
    }
    
    
    /*@RequestMapping(value = "/{id}", method = PUT)
    public ResponseEntity<?> put(@PathVariable String id, @RequestBody Object input) {
        return null;
    }
    
    @RequestMapping(value = "/{id}", method = POST)
    public ResponseEntity<?> post(@PathVariable String id, @RequestBody Object input) {
        return null;
    }
    
    @RequestMapping(value = "/{id}", method = DELETE)
    public ResponseEntity<Object> delete(@PathVariable String id) {
        return null;
    }*/
    
    @Autowired
    private PCRepository pcChanges;
    
    @Autowired
    private PIRepository pcInfos;
    
    @Autowired
    private EntityManager em;
}
