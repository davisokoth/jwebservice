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
@Table(name = "atl_sourceoffunds")
public class ATL_SourceOfFunds implements Serializable {
	private static final long serialVersionUID = 1L;
	@Id
	@Basic(optional = false)
	@NotNull
	@Column(name = "atl_sourceoffunds_id")
	@Expose
	private Long atlSourceoffundsId;
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
	@Column(name = "created")
	@Temporal(TemporalType.TIMESTAMP)
	private Date created;
	@Basic(optional = false)
	@NotNull
	@Column(name = "createdby")
	private long createdby;
	@Basic(optional = false)
	@NotNull
	@Column(name = "isactive")
	@Expose
	private char isactive;
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
	@Column(name = "name")
	@Expose
	private String name;
	@Basic(optional = false)
	@NotNull
	@Size(min = 1, max = 255)
	@Column(name = "description")
	@Expose
	private String description;
	@Column(name = "synchdate")
	@Temporal(TemporalType.TIMESTAMP)
	private Date synchdate;
	@Column(name = "cssynchdate")
	@Temporal(TemporalType.TIMESTAMP)
	private Date cssynchdate;
	/**
	@Column(name = "user1_id")
	private Long user1Id;
	**/

	public ATL_SourceOfFunds() {
	}

	public ATL_SourceOfFunds(Long atlSourceoffundsId) {
		this.atlSourceoffundsId = atlSourceoffundsId;
	}

	public Long getAtlSourceoffundsId() {
		return atlSourceoffundsId;
	}

	public void setAtlSourceoffundsId(Long atlSourceoffundsId) {
		this.atlSourceoffundsId = atlSourceoffundsId;
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

	public char getIsactive() {
		return isactive;
	}

	public void setIsactive(char isactive) {
		this.isactive = isactive;
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

	/**
	public Long getUser1Id() {
		return user1Id;
	}

	public void setUser1Id(Long user1Id) {
		this.user1Id = user1Id;
	}
	**/

	@Override
	public int hashCode() {
		int hash = 0;
		hash += (atlSourceoffundsId != null ? atlSourceoffundsId.hashCode() : 0);
		return hash;
	}

	@Override
	public boolean equals(Object object) {
		// TODO: Warning - this method won't work in the case the id fields are
		// not set
		if (!(object instanceof ATL_SourceOfFunds)) {
			return false;
		}
		ATL_SourceOfFunds other = (ATL_SourceOfFunds) object;
		if ((this.atlSourceoffundsId == null && other.atlSourceoffundsId != null)
				|| (this.atlSourceoffundsId != null && !this.atlSourceoffundsId
						.equals(other.atlSourceoffundsId))) {
			return false;
		}
		return true;
	}

	@Override
	public String toString() {
		return "org.kemsa.codegenproject.ATL_SourceOfFunds[ atlSourceoffundsId="
				+ atlSourceoffundsId + " ]";
	}

}
