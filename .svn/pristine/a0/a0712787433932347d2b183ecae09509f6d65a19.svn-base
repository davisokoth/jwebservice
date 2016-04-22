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
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

import com.google.gson.annotations.Expose;

/**
 *
 * @author laban
 */
@Entity
@Table(name = "atl_district")
/**
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "ATLDistrict.findAll", query = "SELECT a FROM ATLDistrict a"),
    @NamedQuery(name = "ATLDistrict.findByName", query = "SELECT a FROM ATLDistrict a WHERE a.name = :name"),
    @NamedQuery(name = "ATLDistrict.findByCSalesregionId", query = "SELECT a FROM ATLDistrict a WHERE a.cSalesregionId = :cSalesregionId")})
**/
public class ATL_District implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "atl_district_id")
    @Expose
    private Long id;
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
    @Column(name = "name")
    @Expose
    private String name;
    @Column(name = "c_salesregion_id")
    private Long cSalesregionId;

    public ATL_District() {
    }

    public ATL_District(Long atlDistrictId) {
        this.id = atlDistrictId;
    }

    public ATL_District(Long atlDistrictId, long adClientId, long adOrgId, char isactive, Date created, long createdby, Date updated, long updatedby, String name) {
        this.id = atlDistrictId;
        this.adClientId = adClientId;
        this.adOrgId = adOrgId;
        this.isactive = isactive;
        this.created = created;
        this.createdby = createdby;
        this.updated = updated;
        this.updatedby = updatedby;
        this.name = name;
    }

    public Long getAtlDistrictId() {
        return id;
    }

    public void setAtlDistrictId(Long atlDistrictId) {
        this.id = atlDistrictId;
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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getCSalesregionId() {
        return cSalesregionId;
    }

    public void setCSalesregionId(Long cSalesregionId) {
        this.cSalesregionId = cSalesregionId;
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
        if (!(object instanceof ATL_District)) {
            return false;
        }
        ATL_District other = (ATL_District) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "org.kemsa.codegenproject.ATLDistrict[ atlDistrictId=" + id + " ]";
    }
    
}
