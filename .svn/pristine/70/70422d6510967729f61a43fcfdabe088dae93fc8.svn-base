/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.kemsa.kws.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.xml.bind.annotation.XmlTransient;

import org.hibernate.annotations.LazyCollection;
import org.hibernate.annotations.LazyCollectionOption;

import com.google.gson.annotations.Expose;

/**
 * 
 * @author laban
 */
@Entity
@Table(name = "atl_facilitydrights")
public class ATL_FacilityDrights implements Serializable {
	private static final long serialVersionUID = 1L;
	@Id
	@Basic(optional = false)
	@NotNull
	@Column(name = "atl_facilitydrights_id")
	@Expose
	private Long atlFacilitydrightsId;
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
	@Column(name = "c_bpartner_id")
	@Expose
	private long cBpartnerId;
	@Column(name = "annualdr")
	@Expose
	private BigDecimal annualdr;
	@Column(name = "nocycles")
	@Expose
	private BigDecimal nocycles;
	@Basic(optional = false)
	@NotNull
	@Column(name = "atl_crmcycles_id")
	@Expose
	private long atlCrmcyclesId;
	@Column(name = "iscyclescreated")
	private Character iscyclescreated;
	@Basic(optional = false)
	@NotNull
	@Column(name = "annualdrnp")
	@Expose
	private BigDecimal annualdrnp;
	@Basic(optional = false)
	@NotNull
	@Column(name = "processed")
	private char processed;
	@OneToMany(cascade = CascadeType.ALL, mappedBy = "atlFacilitydrightsId")
	@LazyCollection(LazyCollectionOption.FALSE)
	@Expose
	private List<ATL_FacilityDrightsLine> aTLFacilityDrightsLineList;

	public ATL_FacilityDrights() {
	}

	public Long getAtlFacilitydrightsId() {
		return atlFacilitydrightsId;
	}

	public void setAtlFacilitydrightsId(Long atlFacilitydrightsId) {
		this.atlFacilitydrightsId = atlFacilitydrightsId;
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

	public long getCBpartnerId() {
		return cBpartnerId;
	}

	public void setCBpartnerId(long cBpartnerId) {
		this.cBpartnerId = cBpartnerId;
	}

	public long getAtlCrmcyclesId() {
		return atlCrmcyclesId;
	}

	public void setAtlCrmcyclesId(long atlCrmcyclesId) {
		this.atlCrmcyclesId = atlCrmcyclesId;
	}

	public Character getIscyclescreated() {
		return iscyclescreated;
	}

	public void setIscyclescreated(Character iscyclescreated) {
		this.iscyclescreated = iscyclescreated;
	}

	public char getProcessed() {
		return processed;
	}

	public void setProcessed(char processed) {
		this.processed = processed;
	}

	@XmlTransient
	public List<ATL_FacilityDrightsLine> getATLFacilityDrightsLineList() {
		return aTLFacilityDrightsLineList;
	}

	public void setATLFacilityDrightsLineList(
			List<ATL_FacilityDrightsLine> aTLFacilityDrightsLineList) {
		this.aTLFacilityDrightsLineList = aTLFacilityDrightsLineList;
	}

	@Override
	public int hashCode() {
		int hash = 0;
		hash += (atlFacilitydrightsId != null ? atlFacilitydrightsId.hashCode()
				: 0);
		return hash;
	}

	@Override
	public boolean equals(Object object) {
		// TODO: Warning - this method won't work in the case the id fields are
		// not set
		if (!(object instanceof ATL_FacilityDrights)) {
			return false;
		}
		ATL_FacilityDrights other = (ATL_FacilityDrights) object;
		if ((this.atlFacilitydrightsId == null && other.atlFacilitydrightsId != null)
				|| (this.atlFacilitydrightsId != null && !this.atlFacilitydrightsId
						.equals(other.atlFacilitydrightsId))) {
			return false;
		}
		return true;
	}

	@Override
	public String toString() {
		return "org.kemsa.codegenproject.ATL_FacilityDrights[ atlFacilitydrightsId="
				+ atlFacilitydrightsId + " ]";
	}

	public void setAnnualdr(BigDecimal annualdr) {
		this.annualdr = annualdr;
	}

	public BigDecimal getAnnualdr() {
		return annualdr;
	}

	public void setNocycles(BigDecimal nocycles) {
		this.nocycles = nocycles;
	}

	public BigDecimal getNocycles() {
		return nocycles;
	}

	public void setAnnualdrnp(BigDecimal annualdrnp) {
		this.annualdrnp = annualdrnp;
	}

	public BigDecimal getAnnualdrnp() {
		return annualdrnp;
	}

}
