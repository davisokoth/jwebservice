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
@Table(name = "m_pricelist")
public class M_Pricelist implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "m_pricelist_id")
    @Expose
    private Long mPricelistId;
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
    @Column(name = "istaxincluded")
    private char istaxincluded;
    @Basic(optional = false)
    @NotNull
    @Column(name = "issopricelist")
    @Expose
    private char issopricelist;
    @Basic(optional = false)
    @NotNull
    @Column(name = "isdefault")
    @Expose
    private char isdefault;
    @Basic(optional = false)
    @NotNull
    @Column(name = "enforcepricelimit")
    private char enforcepricelimit;
    @Basic(optional = false)
    @NotNull
    @Column(name = "priceprecision")
    @Expose
    private long priceprecision;
    @Column(name = "ismandatory")
    private Character ismandatory;
    @Column(name = "ispresentforproduct")
    private Character ispresentforproduct;
    @Column(name = "issynch")
    private Character issynch;
    @Column(name = "synchdate")
    @Temporal(TemporalType.TIMESTAMP)
    private Date synchdate;
    @Column(name = "cssynchdate")
    @Temporal(TemporalType.TIMESTAMP)
    private Date cssynchdate;
    @Size(max = 10)
    @Column(name = "roundingcharge")
    private String roundingcharge;
    @Column(name = "roundingrule")
    private Character roundingrule;
    @OneToMany(mappedBy = "basepricelistId")
    private List<M_Pricelist> mPricelistList;
    @JoinColumn(name = "basepricelist_id", referencedColumnName = "m_pricelist_id")
    @ManyToOne
    private M_Pricelist basepricelistId;

    public M_Pricelist() {
    }

    public M_Pricelist(Long mPricelistId) {
        this.mPricelistId = mPricelistId;
    }

    public Long getMPricelistId() {
        return mPricelistId;
    }

    public void setMPricelistId(Long mPricelistId) {
        this.mPricelistId = mPricelistId;
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

    public char getIstaxincluded() {
        return istaxincluded;
    }

    public void setIstaxincluded(char istaxincluded) {
        this.istaxincluded = istaxincluded;
    }

    public char getIssopricelist() {
        return issopricelist;
    }

    public void setIssopricelist(char issopricelist) {
        this.issopricelist = issopricelist;
    }

    public char getIsdefault() {
        return isdefault;
    }

    public void setIsdefault(char isdefault) {
        this.isdefault = isdefault;
    }

    public char getEnforcepricelimit() {
        return enforcepricelimit;
    }

    public void setEnforcepricelimit(char enforcepricelimit) {
        this.enforcepricelimit = enforcepricelimit;
    }

    public long getPriceprecision() {
        return priceprecision;
    }

    public void setPriceprecision(long priceprecision) {
        this.priceprecision = priceprecision;
    }

    public Character getIsmandatory() {
        return ismandatory;
    }

    public void setIsmandatory(Character ismandatory) {
        this.ismandatory = ismandatory;
    }

    public Character getIspresentforproduct() {
        return ispresentforproduct;
    }

    public void setIspresentforproduct(Character ispresentforproduct) {
        this.ispresentforproduct = ispresentforproduct;
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

    public String getRoundingcharge() {
        return roundingcharge;
    }

    public void setRoundingcharge(String roundingcharge) {
        this.roundingcharge = roundingcharge;
    }

    public Character getRoundingrule() {
        return roundingrule;
    }

    public void setRoundingrule(Character roundingrule) {
        this.roundingrule = roundingrule;
    }

    @XmlTransient
    public List<M_Pricelist> getMPricelistList() {
        return mPricelistList;
    }

    public void setMPricelistList(List<M_Pricelist> mPricelistList) {
        this.mPricelistList = mPricelistList;
    }

    public M_Pricelist getBasepricelistId() {
        return basepricelistId;
    }

    public void setBasepricelistId(M_Pricelist basepricelistId) {
        this.basepricelistId = basepricelistId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (mPricelistId != null ? mPricelistId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof M_Pricelist)) {
            return false;
        }
        M_Pricelist other = (M_Pricelist) object;
        if ((this.mPricelistId == null && other.mPricelistId != null) || (this.mPricelistId != null && !this.mPricelistId.equals(other.mPricelistId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "org.kemsa.codegenproject.M_Pricelist[ mPricelistId=" + mPricelistId + " ]";
    }
    
}
