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
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.hibernate.annotations.NamedNativeQuery;

import com.google.gson.annotations.Expose;

/**
 *
 * @author davis
 */
@Entity
@NamedNativeQuery(name = "dcounties", query = "select * from kem_dcounties", 
		resultClass = KEM_DCounties.class)

/**
@Entity
@Table(name = "KEM_DCounties")
**/
public class KEM_DCounties implements Serializable {
    private static final long serialVersionUID = 1L;
    
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
    
    @Size(min = 1, max = 255)
	@Column(name = "county")
	@Expose
	private String county;
    
    @Basic(optional = false)
	@NotNull
	@Size(min = 1, max = 255)
	@Column(name = "district")
	@Expose
	private String district;
	
    @Basic(optional = false)
    @NotNull
    @Column(name = "updatedby")
    private long updatedby;
    
    @Id 
    @Basic(optional = false)
    @NotNull
    @Expose
    @Column(name = "atl_district_id")
    private long atlDistrictId;
    
    @Expose
    @Column(name = "atl_county_id")
    private Long atlCountyId;
    
    
    public KEM_DCounties() {
    }

    public KEM_DCounties(Long mProductId) {
        this.atlDistrictId = atlDistrictId;
    }
    
    public long getAtlDistrictId() {
        return atlDistrictId;
    }

    public void setAtlDistrictId(long atlDistrictId) {
    	this.atlDistrictId = atlDistrictId;
    }
    
    public Long getAtlCountyId() {
        return atlCountyId;
    }

    public void setAtlCountyId(Long atlCountyId) {
    	this.atlCountyId = atlCountyId;
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

    public String getDistrict() {
        return district;
    }

    public void setDistrict(String district) {
        this.district = district;
    }

    public String getCounty() {
        return county;
    }

    public void setCounty(String county) {
        this.county = county;
    }

    @Override
    public String toString() {
        return "org.kemsa.codegenproject.KEM_DCounties[ atlDistrictId=" + atlDistrictId + " ]";
    }
    
}
