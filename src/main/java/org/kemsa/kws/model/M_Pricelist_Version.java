/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.kemsa.kws.model;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlTransient;

import com.google.gson.annotations.Expose;

/**
 *
 * @author laban
 */
@Entity
@Table(name = "m_pricelist_version")
public class M_Pricelist_Version implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "m_pricelist_version_id")
    @Expose
    private Long mPricelistVersionId;
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
    @Size(max = 255)
    @Column(name = "description")
    @Expose
    private String description;
    @Basic(optional = false)
    @NotNull
    @Column(name = "validfrom")
    @Temporal(TemporalType.TIMESTAMP)
    @Expose
    private Date validfrom;
    @Column(name = "proccreate")
    private Character proccreate;
    @Column(name = "issynch")
    private Character issynch;
    @Column(name = "synchdate")
    @Temporal(TemporalType.TIMESTAMP)
    private Date synchdate;
    @Column(name = "cssynchdate")
    @Temporal(TemporalType.TIMESTAMP)
    private Date cssynchdate;
    @OneToMany(mappedBy = "mPricelistVersionBaseId")
    private List<M_Pricelist_Version> mPricelistVersionList;
    @JoinColumn(name = "m_pricelist_version_base_id", referencedColumnName = "m_pricelist_version_id")
    @ManyToOne
    private M_Pricelist_Version mPricelistVersionBaseId;

    public M_Pricelist_Version() {
    }

    public M_Pricelist_Version(Long mPricelistVersionId) {
        this.mPricelistVersionId = mPricelistVersionId;
    }
    
    public Long getMPricelistVersionId() {
        return mPricelistVersionId;
    }

    public void setMPricelistVersionId(Long mPricelistVersionId) {
        this.mPricelistVersionId = mPricelistVersionId;
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

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Date getValidfrom() {
        return validfrom;
    }

    public void setValidfrom(Date validfrom) {
        this.validfrom = validfrom;
    }

    public Character getProccreate() {
        return proccreate;
    }

    public void setProccreate(Character proccreate) {
        this.proccreate = proccreate;
    }

    public Character getIssynch() {
        return issynch;
    }

    public void setIssynch(Character issynch) {
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

    @XmlTransient
    public List<M_Pricelist_Version> getMPricelistVersionList() {
        return mPricelistVersionList;
    }

    public void setMPricelistVersionList(List<M_Pricelist_Version> mPricelistVersionList) {
        this.mPricelistVersionList = mPricelistVersionList;
    }

    public M_Pricelist_Version getMPricelistVersionBaseId() {
        return mPricelistVersionBaseId;
    }

    public void setMPricelistVersionBaseId(M_Pricelist_Version mPricelistVersionBaseId) {
        this.mPricelistVersionBaseId = mPricelistVersionBaseId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (mPricelistVersionId != null ? mPricelistVersionId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof M_Pricelist_Version)) {
            return false;
        }
        M_Pricelist_Version other = (M_Pricelist_Version) object;
        if ((this.mPricelistVersionId == null && other.mPricelistVersionId != null) || (this.mPricelistVersionId != null && !this.mPricelistVersionId.equals(other.mPricelistVersionId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "org.kemsa.codegenproject.M_Pricelist_Version[ mPricelistVersionId=" + mPricelistVersionId + " ]";
    }
    
}
