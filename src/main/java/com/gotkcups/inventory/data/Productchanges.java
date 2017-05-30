/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gotkcups.inventory.data;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author rfteves
 */
@Entity
@Table(name = "productchanges")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Productchanges.findAll", query = "SELECT p FROM Productchanges p")
    , @NamedQuery(name = "Productchanges.findById", query = "SELECT p FROM Productchanges p WHERE p.id = :id")
    , @NamedQuery(name = "Productchanges.findByProductid", query = "SELECT p FROM Productchanges p WHERE p.productid = :productid")
    , @NamedQuery(name = "Productchanges.findByVariantid", query = "SELECT p FROM Productchanges p WHERE p.variantid = :variantid")
    , @NamedQuery(name = "Productchanges.findByVariantsku", query = "SELECT p FROM Productchanges p WHERE p.variantsku = :variantsku")
    , @NamedQuery(name = "Productchanges.findByDescription", query = "SELECT p FROM Productchanges p WHERE p.description = :description")
    , @NamedQuery(name = "Productchanges.findByReason", query = "SELECT p FROM Productchanges p WHERE p.reason = :reason")
    , @NamedQuery(name = "Productchanges.findByPrice", query = "SELECT p FROM Productchanges p WHERE p.price = :price")
    , @NamedQuery(name = "Productchanges.findByCurrentprice", query = "SELECT p FROM Productchanges p WHERE p.currentprice = :currentprice")
    , @NamedQuery(name = "Productchanges.findByListprice", query = "SELECT p FROM Productchanges p WHERE p.listprice = :listprice")
    , @NamedQuery(name = "Productchanges.findByCurrentlistprice", query = "SELECT p FROM Productchanges p WHERE p.currentlistprice = :currentlistprice")
    , @NamedQuery(name = "Productchanges.findByInstock", query = "SELECT p FROM Productchanges p WHERE p.instock = :instock")
    , @NamedQuery(name = "Productchanges.findByCurrentstock", query = "SELECT p FROM Productchanges p WHERE p.currentstock = :currentstock")
    , @NamedQuery(name = "Productchanges.findByApplied", query = "SELECT p FROM Productchanges p WHERE p.applied = :applied")
    , @NamedQuery(name = "Productchanges.findByInvqty", query = "SELECT p FROM Productchanges p WHERE p.invqty = :invqty")})
public class Productchanges implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "ID")
    private Long id;
    @Size(max = 255)
    @Column(name = "PRODUCTID")
    private String productid;
    @Size(max = 255)
    @Column(name = "VARIANTID")
    private String variantid;
    @Size(max = 255)
    @Column(name = "VARIANTSKU")
    private String variantsku;
    @Size(max = 255)
    @Column(name = "DESCRIPTION")
    private String description;
    @Size(max = 255)
    @Column(name = "REASON")
    private String reason;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "PRICE")
    private Double price;
    @Column(name = "CURRENTPRICE")
    private Double currentprice;
    @Column(name = "LISTPRICE")
    private Double listprice;
    @Column(name = "CURRENTLISTPRICE")
    private Double currentlistprice;
    @Column(name = "INSTOCK")
    private Boolean instock;
    @Column(name = "CURRENTSTOCK")
    private Boolean currentstock;
    @Column(name = "APPLIED")
    private Boolean applied;
    @Column(name = "INVQTY")
    private Integer invqty;

    public Productchanges() {
    }

    public Productchanges(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getProductid() {
        return productid;
    }

    public void setProductid(String productid) {
        this.productid = productid;
    }

    public String getVariantid() {
        return variantid;
    }

    public void setVariantid(String variantid) {
        this.variantid = variantid;
    }

    public String getVariantsku() {
        return variantsku;
    }

    public void setVariantsku(String variantsku) {
        this.variantsku = variantsku;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Double getCurrentprice() {
        return currentprice;
    }

    public void setCurrentprice(Double currentprice) {
        this.currentprice = currentprice;
    }

    public Double getListprice() {
        return listprice;
    }

    public void setListprice(Double listprice) {
        this.listprice = listprice;
    }

    public Double getCurrentlistprice() {
        return currentlistprice;
    }

    public void setCurrentlistprice(Double currentlistprice) {
        this.currentlistprice = currentlistprice;
    }

    public Boolean getInstock() {
        return instock;
    }

    public void setInstock(Boolean instock) {
        this.instock = instock;
    }

    public Boolean getCurrentstock() {
        return currentstock;
    }

    public void setCurrentstock(Boolean currentstock) {
        this.currentstock = currentstock;
    }

    public Boolean getApplied() {
        return applied;
    }

    public void setApplied(Boolean applied) {
        this.applied = applied;
    }

    public Integer getInvqty() {
        return invqty;
    }

    public void setInvqty(Integer invqty) {
        this.invqty = invqty;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Productchanges)) {
            return false;
        }
        Productchanges other = (Productchanges) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.gotkcups.inventory.data.Productchanges[ id=" + id + " ]";
    }
    
}
