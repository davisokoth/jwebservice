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
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
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
@Table(name = "atl_crmcyclesline")
public class ATL_CRMCyclesLine implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "atl_crmcyclesline_id")
    @Expose
    private Long atlCrmcycleslineId;
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
    @Column(name = "startdate")
    @Temporal(TemporalType.TIMESTAMP)
    @Expose
    private Date startdate;
    @Basic(optional = false)
    @NotNull
    @Column(name = "enddate")
    @Temporal(TemporalType.TIMESTAMP)
    @Expose
    private Date enddate;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 30)
    @Column(name = "name")
    @Expose
    private String name;
    @Column(name = "isclosed")    
    private Character isclosed;
    @JoinColumn(name = "atl_crmcycles_id", referencedColumnName = "atl_crmcycles_id")
    @ManyToOne(optional = false)
    private ATL_CRMCycles atlCrmcyclesId;

    public ATL_CRMCyclesLine() {
    }

    public ATL_CRMCyclesLine(Long atlCrmcycleslineId) {
        this.atlCrmcycleslineId = atlCrmcycleslineId;
    }   

    public Long getAtlCrmcycleslineId() {
        return atlCrmcycleslineId;
    }

    public void setAtlCrmcycleslineId(Long atlCrmcycleslineId) {
        this.atlCrmcycleslineId = atlCrmcycleslineId;
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

    public Date getStartdate() {
        return startdate;
    }

    public void setStartdate(Date startdate) {
        this.startdate = startdate;
    }

    public Date getEnddate() {
        return enddate;
    }

    public void setEnddate(Date enddate) {
        this.enddate = enddate;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Character getIsclosed() {
        return isclosed;
    }

    public void setIsclosed(Character isclosed) {
        this.isclosed = isclosed;
    }

    public ATL_CRMCycles getAtlCrmcyclesId() {
        return atlCrmcyclesId;
    }

    public void setAtlCrmcyclesId(ATL_CRMCycles atlCrmcyclesId) {
        this.atlCrmcyclesId = atlCrmcyclesId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (atlCrmcycleslineId != null ? atlCrmcycleslineId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ATL_CRMCyclesLine)) {
            return false;
        }
        ATL_CRMCyclesLine other = (ATL_CRMCyclesLine) object;
        if ((this.atlCrmcycleslineId == null && other.atlCrmcycleslineId != null) || (this.atlCrmcycleslineId != null && !this.atlCrmcycleslineId.equals(other.atlCrmcycleslineId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "org.kemsa.codegenproject.ATL_CRMCyclesLine[ atlCrmcycleslineId=" + atlCrmcycleslineId + " ]";
    }
    
}
