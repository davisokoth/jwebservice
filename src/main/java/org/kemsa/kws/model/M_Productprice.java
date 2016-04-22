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
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.hibernate.annotations.NamedNativeQuery;

import com.google.gson.annotations.Expose;

/**
 * 
 * @author laban
 */
@Entity
@Table(name = "kem_activeproductprice")
public class M_Productprice implements Serializable {
	private static final long serialVersionUID = 1L;
	@EmbeddedId
	protected M_ProductpricePK m_ProductpricePK;
	@Basic(optional = false)
	@NotNull
	@Column(name = "ad_client_id")
	private long adClientId;
	@Column(name = "m_product_id", insertable=false, updatable=false)
	@Expose
	private Long mProductId;
	@Column(name = "m_pricelist_version_id", insertable=false, updatable=false)
	@Expose	
	private Long mPricelistVersionId;
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
	@Column(name = "pricelist")
	private BigDecimal pricelist;
	@Basic(optional = false)
	@NotNull
	@Column(name = "pricestd")
	@Expose
	private BigDecimal pricestd;
	@Basic(optional = false)
	@NotNull
	@Column(name = "pricelimit")
	@Expose
	private BigDecimal pricelimit;
	/**
	@Basic(optional = false)
	@NotNull
	@Column(name = "issynch")
	private char issynch;
	**/	
	@Column(name = "synchdate")
	@Temporal(TemporalType.TIMESTAMP)
	private Date synchdate;
	@Column(name = "cssynchdate")
	@Temporal(TemporalType.TIMESTAMP)
	private Date cssynchdate;
	@Column(name = "m_productprice_id")
	@Expose
	private Long mProductpriceId;
	// @Max(value=?) @Min(value=?)//if you know range of your decimal fields
	// consider using these annotations to enforce field validation
	/**
	@Column(name = "lastpoprice")
	private BigDecimal lastpoprice;
	@Size(max = 60)
	@Column(name = "lpolastcur")
	private String lpolastcur;
	@Column(name = "ppoaprice")
	private BigDecimal ppoaprice;
	**/

	public M_Productprice() {
	}

	public M_Productprice(M_ProductpricePK m_ProductpricePK) {
		this.m_ProductpricePK = m_ProductpricePK;
	}

	public M_Productprice(long mPricelistVersionId, long mProductId) {
		this.m_ProductpricePK = new M_ProductpricePK(mPricelistVersionId,
				mProductId);
	}

	public M_ProductpricePK getM_ProductpricePK() {
		return m_ProductpricePK;
	}

	public void setM_ProductpricePK(M_ProductpricePK m_ProductpricePK) {
		this.m_ProductpricePK = m_ProductpricePK;
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

	/**
	public char getIssynch() {
		return issynch;
	}

	public void setIssynch(char issynch) {
		this.issynch = issynch;
	}	
	**/

	public Date getSynchdate() {
		return synchdate;
	}

	public void setSynchdate(Date synchdate) {
		this.synchdate = synchdate;
	}

	public Date getCssynchdate() {
		return cssynchdate;
	}

	public void setCssynchdate(Date cssynchdate) {
		this.cssynchdate = cssynchdate;
	}

	public Long getMProductpriceId() {
		return mProductpriceId;
	}

	public void setMProductpriceId(Long mProductpriceId) {
		this.mProductpriceId = mProductpriceId;
	}

	/**
	public BigDecimal getLastpoprice() {
		return lastpoprice;
	}

	public void setLastpoprice(BigDecimal lastpoprice) {
		this.lastpoprice = lastpoprice;
	}

	public String getLpolastcur() {
		return lpolastcur;
	}

	public void setLpolastcur(String lpolastcur) {
		this.lpolastcur = lpolastcur;
	}

	public BigDecimal getPpoaprice() {
		return ppoaprice;
	}

	public void setPpoaprice(BigDecimal ppoaprice) {
		this.ppoaprice = ppoaprice;
	}
	**/

	@Override
	public int hashCode() {
		int hash = 0;
		hash += (m_ProductpricePK != null ? m_ProductpricePK.hashCode() : 0);
		return hash;
	}

	@Override
	public boolean equals(Object object) {
		// TODO: Warning - this method won't work in the case the id fields are
		// not set
		if (!(object instanceof M_Productprice)) {
			return false;
		}
		M_Productprice other = (M_Productprice) object;
		if ((this.m_ProductpricePK == null && other.m_ProductpricePK != null)
				|| (this.m_ProductpricePK != null && !this.m_ProductpricePK
						.equals(other.m_ProductpricePK))) {
			return false;
		}
		return true;
	}

	@Override
	public String toString() {
		return "org.kemsa.codegenproject.M_Productprice[ m_ProductpricePK="
				+ m_ProductpricePK + " ]";
	}

	public void setPricestd(BigDecimal pricestd) {
		this.pricestd = pricestd;
	}

	public BigDecimal getPricestd() {
		return pricestd;
	}

	public void setPricelimit(BigDecimal pricelimit) {
		this.pricelimit = pricelimit;
	}

	public BigDecimal getPricelimit() {
		return pricelimit;
	}

	public void setPricelist(BigDecimal pricelist) {
		this.pricelist = pricelist;
	}

	public BigDecimal getPricelist() {
		return pricelist;
	}

	public void setmProductId(Long mProductId) {
		this.mProductId = mProductId;
	}

	public Long getmProductId() {
		return mProductId;
	}

	public void setmPricelistVersionId(Long mPricelistVersionId) {
		this.mPricelistVersionId = mPricelistVersionId;
	}

	public Long getmPricelistVersionId() {
		return mPricelistVersionId;
	}

}
