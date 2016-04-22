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
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlTransient;

import org.hibernate.annotations.LazyCollection;
import org.hibernate.annotations.LazyCollectionOption;

import com.google.gson.annotations.Expose;

/**
 *
 * @author laban
 */
@Entity
@Table(name = "atl_crmcycles")
public class ATL_CRMCycles implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "atl_crmcycles_id")
    @Expose
    private Long atlCrmcyclesId;
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
    @Column(name = "c_year_id")
    @Expose
    private long cYearId;
    @Column(name = "nocycles")
    private BigDecimal nocycles;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 3)
    @Column(name = "facilitytype")
    @Expose
    private String facilitytype;
    @Size(max = 60)
    @Column(name = "description")
    @Expose
    private String description;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "atlCrmcyclesId")
    @LazyCollection(LazyCollectionOption.FALSE)
    @Expose
    private List<ATL_CRMCyclesLine> aTLCRMCyclesLineList;

    public ATL_CRMCycles() {
    }

    public ATL_CRMCycles(Long atlCrmcyclesId) {
        this.atlCrmcyclesId = atlCrmcyclesId;
    }   

    public Long getAtlCrmcyclesId() {
        return atlCrmcyclesId;
    }

    public void setAtlCrmcyclesId(Long atlCrmcyclesId) {
        this.atlCrmcyclesId = atlCrmcyclesId;
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

    public long getCYearId() {
        return cYearId;
    }

    public void setCYearId(long cYearId) {
        this.cYearId = cYearId;
    }    
    public String getFacilitytype() {
        return facilitytype;
    }

    public void setFacilitytype(String facilitytype) {
        this.facilitytype = facilitytype;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @XmlTransient
    public List<ATL_CRMCyclesLine> getATLCRMCyclesLineList() {
        return aTLCRMCyclesLineList;
    }

    public void setATLCRMCyclesLineList(List<ATL_CRMCyclesLine> aTLCRMCyclesLineList) {
        this.aTLCRMCyclesLineList = aTLCRMCyclesLineList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (atlCrmcyclesId != null ? atlCrmcyclesId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ATL_CRMCycles)) {
            return false;
        }
        ATL_CRMCycles other = (ATL_CRMCycles) object;
        if ((this.atlCrmcyclesId == null && other.atlCrmcyclesId != null) || (this.atlCrmcyclesId != null && !this.atlCrmcyclesId.equals(other.atlCrmcyclesId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "org.kemsa.codegenproject.ATL_CRMCycles[ atlCrmcyclesId=" + atlCrmcyclesId + " ]";
    }

	public void setNocycles(BigDecimal nocycles) {
		this.nocycles = nocycles;
	}

	public BigDecimal getNocycles() {
		return nocycles;
	}
    
}
