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
@Table(name = "productinfos")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Productinfos.findAll", query = "SELECT p FROM Productinfos p")
    , @NamedQuery(name = "Productinfos.findById", query = "SELECT p FROM Productinfos p WHERE p.id = :id")
    , @NamedQuery(name = "Productinfos.findByProductid", query = "SELECT p FROM Productinfos p WHERE p.productid = :productid")
    , @NamedQuery(name = "Productinfos.findByVariantid", query = "SELECT p FROM Productinfos p WHERE p.variantid = :variantid and p.alpha = :alpha")
    , @NamedQuery(name = "Productinfos.findByDescription", query = "SELECT p FROM Productinfos p WHERE p.description = :description")
    , @NamedQuery(name = "Productinfos.findByVariantsku", query = "SELECT p FROM Productinfos p WHERE p.variantsku = :variantsku")
    , @NamedQuery(name = "Productinfos.findByAlpha", query = "SELECT p FROM Productinfos p WHERE p.alpha = :alpha")
    , @NamedQuery(name = "Productinfos.findByStatus", query = "SELECT p FROM Productinfos p WHERE p.status = :status")
    , @NamedQuery(name = "Productinfos.findByReason", query = "SELECT p FROM Productinfos p WHERE p.reason = :reason")
    , @NamedQuery(name = "Productinfos.findByInstock", query = "SELECT p FROM Productinfos p WHERE p.instock = :instock")
    , @NamedQuery(name = "Productinfos.findByCurrentstock", query = "SELECT p FROM Productinfos p WHERE p.currentstock = :currentstock")
    , @NamedQuery(name = "Productinfos.findByTaxable", query = "SELECT p FROM Productinfos p WHERE p.taxable = :taxable")
    , @NamedQuery(name = "Productinfos.findByCost", query = "SELECT p FROM Productinfos p WHERE p.cost = :cost")
    , @NamedQuery(name = "Productinfos.findByListcost", query = "SELECT p FROM Productinfos p WHERE p.listcost = :listcost")
    , @NamedQuery(name = "Productinfos.findByDefaultcost", query = "SELECT p FROM Productinfos p WHERE p.defaultcost = :defaultcost")
    , @NamedQuery(name = "Productinfos.findByPrice", query = "SELECT p FROM Productinfos p WHERE p.price = :price")
    , @NamedQuery(name = "Productinfos.findByListprice", query = "SELECT p FROM Productinfos p WHERE p.listprice = :listprice")
    , @NamedQuery(name = "Productinfos.findByMinprice", query = "SELECT p FROM Productinfos p WHERE p.minprice = :minprice")
    , @NamedQuery(name = "Productinfos.findByMaxprice", query = "SELECT p FROM Productinfos p WHERE p.maxprice = :maxprice")
    , @NamedQuery(name = "Productinfos.findByShipping", query = "SELECT p FROM Productinfos p WHERE p.shipping = :shipping")
    , @NamedQuery(name = "Productinfos.findByDefaultshipping", query = "SELECT p FROM Productinfos p WHERE p.defaultshipping = :defaultshipping")
    , @NamedQuery(name = "Productinfos.findByMinqty", query = "SELECT p FROM Productinfos p WHERE p.minqty = :minqty")
    , @NamedQuery(name = "Productinfos.findByDefaultminqty", query = "SELECT p FROM Productinfos p WHERE p.defaultminqty = :defaultminqty")
    , @NamedQuery(name = "Productinfos.findByDefaultinv", query = "SELECT p FROM Productinfos p WHERE p.defaultinv = :defaultinv")})
public class Productinfos implements Serializable {

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
    @Column(name = "DESCRIPTION")
    private String description;
    @Size(max = 255)
    @Column(name = "VARIANTSKU")
    private String variantsku;
    @Size(max = 255)
    @Column(name = "ALPHA")
    private String alpha;
    @Size(max = 255)
    @Column(name = "STATUS")
    private String status;
    @Size(max = 255)
    @Column(name = "REASON")
    private String reason;
    @Column(name = "INSTOCK")
    private Boolean instock;
    @Column(name = "CURRENTSTOCK")
    private Boolean currentstock;
    @Column(name = "TAXABLE")
    private Boolean taxable;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "COST")
    private Double cost;
    @Column(name = "LISTCOST")
    private Double listcost;
    @Column(name = "DEFAULTCOST")
    private Double defaultcost;
    @Column(name = "PRICE")
    private Double price;
    @Column(name = "LISTPRICE")
    private Double listprice;
    @Column(name = "MINPRICE")
    private Double minprice;
    @Column(name = "MAXPRICE")
    private Double maxprice;
    @Column(name = "SHIPPING")
    private Double shipping;
    @Column(name = "DEFAULTSHIPPING")
    private Double defaultshipping;
    @Column(name = "MINQTY")
    private Integer minqty;
    @Column(name = "DEFAULTMINQTY")
    private Integer defaultminqty;
    @Column(name = "DEFAULTINV")
    private Integer defaultinv;

    public Productinfos() {
    }

    public Productinfos(Long id) {
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

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getVariantsku() {
        return variantsku;
    }

    public void setVariantsku(String variantsku) {
        this.variantsku = variantsku;
    }

    public String getAlpha() {
        return alpha;
    }

    public void setAlpha(String alpha) {
        this.alpha = alpha;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
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

    public Boolean getTaxable() {
        return taxable;
    }

    public void setTaxable(Boolean taxable) {
        this.taxable = taxable;
    }

    public Double getCost() {
        return cost;
    }

    public void setCost(Double cost) {
        this.cost = cost;
    }

    public Double getListcost() {
        return listcost;
    }

    public void setListcost(Double listcost) {
        this.listcost = listcost;
    }

    public Double getDefaultcost() {
        return defaultcost;
    }

    public void setDefaultcost(Double defaultcost) {
        this.defaultcost = defaultcost;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Double getListprice() {
        return listprice;
    }

    public void setListprice(Double listprice) {
        this.listprice = listprice;
    }

    public Double getMinprice() {
        return minprice;
    }

    public void setMinprice(Double minprice) {
        this.minprice = minprice;
    }

    public Double getMaxprice() {
        return maxprice;
    }

    public void setMaxprice(Double maxprice) {
        this.maxprice = maxprice;
    }

    public Double getShipping() {
        return shipping;
    }

    public void setShipping(Double shipping) {
        this.shipping = shipping;
    }

    public Double getDefaultshipping() {
        return defaultshipping;
    }

    public void setDefaultshipping(Double defaultshipping) {
        this.defaultshipping = defaultshipping;
    }

    public Integer getMinqty() {
        return minqty;
    }

    public void setMinqty(Integer minqty) {
        this.minqty = minqty;
    }

    public Integer getDefaultminqty() {
        return defaultminqty;
    }

    public void setDefaultminqty(Integer defaultminqty) {
        this.defaultminqty = defaultminqty;
    }

    public Integer getDefaultinv() {
        return defaultinv;
    }

    public void setDefaultinv(Integer defaultinv) {
        this.defaultinv = defaultinv;
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
        if (!(object instanceof Productinfos)) {
            return false;
        }
        Productinfos other = (Productinfos) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.gotkcups.inventory.data.Productinfos[ id=" + id + " ]";
    }
    
}
