/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.kemsa.kws.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.hibernate.annotations.NamedNativeQuery;

import com.google.gson.annotations.Expose;

/**
 *
 * @author davis
 */
@Entity
@NamedNativeQuery(name = "allStocks", query = "select * from kem_stocksbyproduct_v order by m_product_id", 
		resultClass = KEM_StocksByProduct_v.class)

/**
@Entity
@Table(name = "kem_stocksbyproduct_v")
**/
public class KEM_StocksByProduct_v implements Serializable {
    private static final long serialVersionUID = 1L;
    
    @Basic(optional = false)
    @NotNull
    @Column(name = "ad_client_id")
    private long adClientId;
    
    @Basic(optional = false)
    @NotNull
    @Column(name = "ad_org_id")
    private long adOrgId;
    
    @Basic(optional = false)
    @NotNull
    @Column(name = "isactive")
    @Expose
    private char isactive;
    
    @Basic(optional = false)
    @NotNull
    @Column(name = "created")
    @Temporal(TemporalType.TIMESTAMP)
    private Date created;
    
    @Basic(optional = false)
    @NotNull
    @Column(name = "createdby")
    private long createdby;
    
    @Basic(optional = false)
    @NotNull
    @Column(name = "updated")
    @Temporal(TemporalType.TIMESTAMP)
    private Date updated;
    
    @Basic(optional = false)
    @NotNull
    @Column(name = "updatedby")
    private long updatedby;
    
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 60)
    @Column(name = "value")
    @Expose
    private String value;
    
    @Id 
    @Basic(optional = false)
    @NotNull
    @Expose
    @Column(name = "m_product_id")
    private long mProductId;
    
    @Basic(optional = false)
    @NotNull
    @Column(name = "c_uom_id")
    private long cUomId;
    
    @Basic(optional = false)
	@NotNull
	@Column(name = "qtyonhand")
	@Expose
	private BigDecimal qtyonhand;
	
    @Basic(optional = false)
	@NotNull
	@Column(name = "qtyreserved")
	@Expose
	private BigDecimal qtyreserved;
	
    @Basic(optional = false)
	@NotNull
	@Column(name = "qtyavailable")
	@Expose
	private BigDecimal qtyavailable;
	
    /**
    @OneToMany(mappedBy = "mPricelistVersionBaseId")
    private List<KEM_StocksByProduct_v> mPricelistVersionList;
    @JoinColumn(name = "m_pricelist_version_base_id", referencedColumnName = "m_pricelist_version_id")
    @ManyToOne
    private KEM_StocksByProduct_v mPricelistVersionBaseId;
    **/

    public KEM_StocksByProduct_v() {
    }

    public KEM_StocksByProduct_v(Long mProductId) {
        this.mProductId = mProductId;
    }
    
    public long getAdClientId() {
        return adClientId;
    }

    public void setAdClientId(long adClientId) {
        this.adClientId = adClientId;
    }

    public long getAdOrgId() {
        return adOrgId;
    }

    public void setAdOrgId(long adOrgId) {
        this.adOrgId = adOrgId;
    }

    public char getIsactive() {
        return isactive;
    }

    public void setIsactive(char isactive) {
        this.isactive = isactive;
    }

    public Date getCreated() {
        return created;
    }

    public void setCreated(Date created) {
        this.created = created;
    }

    public long getCreatedby() {
        return createdby;
    }

    public void setCreatedby(long createdby) {
        this.createdby = createdby;
    }

    public Date getUpdated() {
        return updated;
    }

    public void setUpdated(Date updated) {
        this.updated = updated;
    }

    public long getUpdatedby() {
        return updatedby;
    }

    public void setUpdatedby(long updatedby) {
        this.updatedby = updatedby;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public long getMProductID() {
        return mProductId;
    }

    public void setMProductId(long mProductId) {
        this.mProductId = mProductId;
    }

    public long getCUomID() {
        return cUomId;
    }

    public void setCUomId(long cUomId) {
        this.cUomId = cUomId;
    }
    
    public void setQtyonhand(BigDecimal qtyonhand) {
		this.qtyonhand = qtyonhand;
	}

	public BigDecimal getQtyonhand() {
		return qtyonhand;
	}

	public void setQtyreserved(BigDecimal qtyreserved) {
		this.qtyreserved = qtyreserved;
	}

	public BigDecimal getQtyreserved() {
		return qtyreserved;
	}

	public void setQtyordered(BigDecimal qtyordered) {
		this.qtyavailable = qtyordered;
	}

	public BigDecimal getQtyordered() {
		return qtyavailable;
	}

    @Override
    public String toString() {
        return "org.kemsa.codegenproject.KEM_StocksByProduct[ mProductId=" + mProductId + " ]";
    }
    
}
