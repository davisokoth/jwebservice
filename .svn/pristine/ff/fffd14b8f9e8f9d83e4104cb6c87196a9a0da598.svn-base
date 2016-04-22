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
@Table(name = "atl_province")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "ATLProvince.findAll", query = "SELECT a FROM ATLProvince a"),
    @NamedQuery(name = "ATLProvince.findByName", query = "SELECT a FROM ATLProvince a WHERE a.name = :name")})
public class ATL_Province implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "atl_province_id")
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

    public ATL_Province() {
    }

    public ATL_Province(Long atlProvinceId) {
        this.id = atlProvinceId;
    }

    public ATL_Province(Long atlProvinceId, long adClientId, long adOrgId, char isactive, Date created, long createdby, Date updated, long updatedby, String name) {
        this.id = atlProvinceId;
        this.adClientId = adClientId;
        this.adOrgId = adOrgId;
        this.isactive = isactive;
        this.created = created;
        this.createdby = createdby;
        this.updated = updated;
        this.updatedby = updatedby;
        this.name = name;
    }

    public Long getAtlProvinceId() {
        return id;
    }

    public void setAtlProvinceId(Long atlProvinceId) {
        this.id = atlProvinceId;
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

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ATL_Province)) {
            return false;
        }
        ATL_Province other = (ATL_Province) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "org.kemsa.codegenproject.ATLProvince[ atlProvinceId=" + id + " ]";
    }
    
}
