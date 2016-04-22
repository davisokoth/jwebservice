/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.kemsa.kws.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import com.google.gson.annotations.Expose;

/**
 * 
 * @author laban
 */
@Entity
@Table(name = "c_uom")
public class C_UOM implements Serializable {
	private static final long serialVersionUID = 1L;
	@Id
	@Basic(optional = false)
	@NotNull
	@Column(name = "c_uom_id")
	@Expose
	private Long cUomId;
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
	@Column(name = "updated")
	@Temporal(TemporalType.TIMESTAMP)
	private Date updated;
	@Basic(optional = false)
	@NotNull
	@Column(name = "createdby")
	private long createdby;
	@Basic(optional = false)
	@NotNull
	@Column(name = "updatedby")
	private long updatedby;
	@Basic(optional = false)
	@NotNull
	@Size(min = 1, max = 4)
	@Column(name = "x12de355")
	private String x12de355;
	@Size(max = 10)
	@Column(name = "uomsymbol")
	@Expose
	private String uomsymbol;
	@Basic(optional = false)
	@NotNull
	@Size(min = 1, max = 60)
	@Column(name = "name")
	@Expose
	private String name;
	@Size(max = 255)
	@Column(name = "description")
	private String description;
	@Basic(optional = false)
	@NotNull
	@Column(name = "stdprecision")
	private long stdprecision;
	@Basic(optional = false)
	@NotNull
	@Column(name = "costingprecision")
	private long costingprecision;
	@Basic(optional = false)
	@NotNull
	@Column(name = "isdefault")
	private char isdefault;
	/**
	@Basic(optional = false)
	@NotNull
	@Column(name = "issynch")
	private char issynch;
	@Column(name = "synchdate")
	@Temporal(TemporalType.TIMESTAMP)
	private Date synchdate;
	@Column(name = "cssynchdate")
	@Temporal(TemporalType.TIMESTAMP)
	private Date cssynchdate;
	**/

	public C_UOM() {
	}

	public C_UOM(Long cUomId) {
		this.cUomId = cUomId;
	}

	public C_UOM(Long cUomId, char isactive, Date created, Date updated,
			long createdby, long updatedby, String x12de355, String name,
			long stdprecision, long costingprecision, char isdefault) {
		this.cUomId = cUomId;
		this.isactive = isactive;
		this.created = created;
		this.updated = updated;
		this.createdby = createdby;
		this.updatedby = updatedby;
		this.x12de355 = x12de355;
		this.name = name;
		this.stdprecision = stdprecision;
		this.costingprecision = costingprecision;
		this.isdefault = isdefault;
	}

	public Long getCUomId() {
		return cUomId;
	}

	public void setCUomId(Long cUomId) {
		this.cUomId = cUomId;
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

	public Date getUpdated() {
		return updated;
	}

	public void setUpdated(Date updated) {
		this.updated = updated;
	}

	public long getCreatedby() {
		return createdby;
	}

	public void setCreatedby(long createdby) {
		this.createdby = createdby;
	}

	public long getUpdatedby() {
		return updatedby;
	}

	public void setUpdatedby(long updatedby) {
		this.updatedby = updatedby;
	}

	public String getX12de355() {
		return x12de355;
	}

	public void setX12de355(String x12de355) {
		this.x12de355 = x12de355;
	}

	public String getUomsymbol() {
		return uomsymbol;
	}

	public void setUomsymbol(String uomsymbol) {
		this.uomsymbol = uomsymbol;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public long getStdprecision() {
		return stdprecision;
	}

	public void setStdprecision(long stdprecision) {
		this.stdprecision = stdprecision;
	}

	public long getCostingprecision() {
		return costingprecision;
	}

	public void setCostingprecision(long costingprecision) {
		this.costingprecision = costingprecision;
	}

	public char getIsdefault() {
		return isdefault;
	}

	public void setIsdefault(char isdefault) {
		this.isdefault = isdefault;
	}

	/**
	public char getIssynch() {
		return issynch;
	}

	public void setIssynch(char issynch) {
		this.issynch = issynch;
	}

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
	**/

	@Override
	public int hashCode() {
		int hash = 0;
		hash += (cUomId != null ? cUomId.hashCode() : 0);
		return hash;
	}

	@Override
	public boolean equals(Object object) {
		// TODO: Warning - this method won't work in the case the id fields are
		// not set
		if (!(object instanceof C_UOM)) {
			return false;
		}
		C_UOM other = (C_UOM) object;
		if ((this.cUomId == null && other.cUomId != null)
				|| (this.cUomId != null && !this.cUomId.equals(other.cUomId))) {
			return false;
		}
		return true;
	}

	@Override
	public String toString() {
		return "org.kemsa.codegenproject.C_UOM[ cUomId=" + cUomId + " ]";
	}

}
