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

import com.google.gson.annotations.Expose;

/**
 * 
 * @author laban
 */
@Entity
@Table(name = "m_storage")
public class M_Storage implements Serializable {
	private static final long serialVersionUID = 1L;
	@EmbeddedId
	protected MStoragePK mStoragePK;
	@Column(name = "m_product_id", insertable = false, updatable = false)
	@Expose
	private Long mProductId;
	@Basic(optional = false)
	@NotNull
	@Expose
	@Column(name = "isactive")
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
	@Column(name = "qtyordered")
	@Expose
	private BigDecimal qtyordered;
	@Column(name = "datelastinventory")
	@Temporal(TemporalType.TIMESTAMP)
	@Expose
	private Date datelastinventory;

	public M_Storage() {
	}

	public M_Storage(MStoragePK mStoragePK) {
		this.mStoragePK = mStoragePK;
	}

	public M_Storage(long mProductId, long mLocatorId,
			long mAttributesetinstanceId) {
		this.mStoragePK = new MStoragePK(mProductId, mLocatorId,
				mAttributesetinstanceId);
	}

	public MStoragePK getMStoragePK() {
		return mStoragePK;
	}

	public void setMStoragePK(MStoragePK mStoragePK) {
		this.mStoragePK = mStoragePK;
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

	public Date getDatelastinventory() {
		return datelastinventory;
	}

	public void setDatelastinventory(Date datelastinventory) {
		this.datelastinventory = datelastinventory;
	}

	@Override
	public int hashCode() {
		int hash = 0;
		hash += (mStoragePK != null ? mStoragePK.hashCode() : 0);
		return hash;
	}

	@Override
	public boolean equals(Object object) {
		// TODO: Warning - this method won't work in the case the id fields are
		// not set
		if (!(object instanceof M_Storage)) {
			return false;
		}
		M_Storage other = (M_Storage) object;
		if ((this.mStoragePK == null && other.mStoragePK != null)
				|| (this.mStoragePK != null && !this.mStoragePK
						.equals(other.mStoragePK))) {
			return false;
		}
		return true;
	}

	@Override
	public String toString() {
		return "org.kemsa.codegenproject.MStorage[ mStoragePK=" + mStoragePK
				+ " ]";
	}

	public void setmProductId(Long mProductId) {
		this.mProductId = mProductId;
	}

	public Long getmProductId() {
		return mProductId;
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
		this.qtyordered = qtyordered;
	}

	public BigDecimal getQtyordered() {
		return qtyordered;
	}

}
