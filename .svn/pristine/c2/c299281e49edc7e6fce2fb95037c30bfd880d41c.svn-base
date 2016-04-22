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
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
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
@Table(name = "atl_facilitydrightsline")
public class ATL_FacilityDrightsLine implements Serializable {
	private static final long serialVersionUID = 1L;
	@Id
	@Basic(optional = false)
	@NotNull
	@Column(name = "atl_facilitydrightsline_id")
	@Expose
	private Long atlFacilitydrightslineId;
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
	@Column(name = "balforward")
	@Expose
	private BigDecimal balforward;
	@Column(name = "cycletotaldr")
	@Expose
	private BigDecimal cycletotaldr;
	@Column(name = "utilizeddr")
	@Expose
	private BigDecimal utilizeddr;
	@Column(name = "balancedr")
	@Expose
	private BigDecimal balancedr;
	@Basic(optional = false)
	@NotNull
	@Column(name = "atl_crmcyclesline_id")
	@Expose
	private long atlCrmcycleslineId;
	@Basic(optional = false)
	@NotNull
	@Column(name = "reserveddr")
	@Expose
	private BigDecimal reserveddr;
	@Basic(optional = false)
	@NotNull
	@Column(name = "balforwardnp")
	@Expose
	private BigDecimal balforwardnp;
	@Basic(optional = false)
	@NotNull
	@Column(name = "cycletotaldrnp")
	@Expose
	private BigDecimal cycletotaldrnp;
	@Basic(optional = false)
	@NotNull
	@Column(name = "reserveddrnp")
	@Expose
	private BigDecimal reserveddrnp;
	@Basic(optional = false)
	@NotNull
	@Column(name = "utilizeddrnp")
	@Expose
	private BigDecimal utilizeddrnp;
	@Basic(optional = false)
	@NotNull
	@Column(name = "balancedrnp")
	@Expose
	private BigDecimal balancedrnp;
	@JoinColumn(name = "atl_facilitydrights_id", referencedColumnName = "atl_facilitydrights_id")
	@ManyToOne(optional = false)
	private ATL_FacilityDrights atlFacilitydrightsId;

	public ATL_FacilityDrightsLine() {
	}
	public Long getAtlFacilitydrightslineId() {
		return atlFacilitydrightslineId;
	}

	public void setAtlFacilitydrightslineId(Long atlFacilitydrightslineId) {
		this.atlFacilitydrightslineId = atlFacilitydrightslineId;
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

	

	public long getAtlCrmcycleslineId() {
		return atlCrmcycleslineId;
	}

	public void setAtlCrmcycleslineId(long atlCrmcycleslineId) {
		this.atlCrmcycleslineId = atlCrmcycleslineId;
	}

	
	public ATL_FacilityDrights getAtlFacilitydrightsId() {
		return atlFacilitydrightsId;
	}

	public void setAtlFacilitydrightsId(ATL_FacilityDrights atlFacilitydrightsId) {
		this.atlFacilitydrightsId = atlFacilitydrightsId;
	}

	@Override
	public int hashCode() {
		int hash = 0;
		hash += (atlFacilitydrightslineId != null ? atlFacilitydrightslineId
				.hashCode() : 0);
		return hash;
	}

	@Override
	public boolean equals(Object object) {
		// TODO: Warning - this method won't work in the case the id fields are
		// not set
		if (!(object instanceof ATL_FacilityDrightsLine)) {
			return false;
		}
		ATL_FacilityDrightsLine other = (ATL_FacilityDrightsLine) object;
		if ((this.atlFacilitydrightslineId == null && other.atlFacilitydrightslineId != null)
				|| (this.atlFacilitydrightslineId != null && !this.atlFacilitydrightslineId
						.equals(other.atlFacilitydrightslineId))) {
			return false;
		}
		return true;
	}

	@Override
	public String toString() {
		return "org.kemsa.codegenproject.ATL_FacilityDrightsLine[ atlFacilitydrightslineId="
				+ atlFacilitydrightslineId + " ]";
	}
	public void setBalforward(BigDecimal balforward) {
		this.balforward = balforward;
	}
	public BigDecimal getBalforward() {
		return balforward;
	}
	public void setCycletotaldr(BigDecimal cycletotaldr) {
		this.cycletotaldr = cycletotaldr;
	}
	public BigDecimal getCycletotaldr() {
		return cycletotaldr;
	}
	public void setUtilizeddr(BigDecimal utilizeddr) {
		this.utilizeddr = utilizeddr;
	}
	public BigDecimal getUtilizeddr() {
		return utilizeddr;
	}
	public void setBalancedr(BigDecimal balancedr) {
		this.balancedr = balancedr;
	}
	public BigDecimal getBalancedr() {
		return balancedr;
	}
	public void setReserveddr(BigDecimal reserveddr) {
		this.reserveddr = reserveddr;
	}
	public BigDecimal getReserveddr() {
		return reserveddr;
	}
	public void setBalforwardnp(BigDecimal balforwardnp) {
		this.balforwardnp = balforwardnp;
	}
	public BigDecimal getBalforwardnp() {
		return balforwardnp;
	}
	public void setCycletotaldrnp(BigDecimal cycletotaldrnp) {
		this.cycletotaldrnp = cycletotaldrnp;
	}
	public BigDecimal getCycletotaldrnp() {
		return cycletotaldrnp;
	}
	public void setReserveddrnp(BigDecimal reserveddrnp) {
		this.reserveddrnp = reserveddrnp;
	}
	public BigDecimal getReserveddrnp() {
		return reserveddrnp;
	}
	public void setUtilizeddrnp(BigDecimal utilizeddrnp) {
		this.utilizeddrnp = utilizeddrnp;
	}
	public BigDecimal getUtilizeddrnp() {
		return utilizeddrnp;
	}
	public void setBalancedrnp(BigDecimal balancedrnp) {
		this.balancedrnp = balancedrnp;
	}
	public BigDecimal getBalancedrnp() {
		return balancedrnp;
	}

}
