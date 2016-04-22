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
@Table(name = "lmis_bpartner")
public class C_BPartner implements Serializable {
	private static final long serialVersionUID = 1L;
	@Id
	@Basic(optional = false)
	@NotNull
	@Column(name = "c_bpartner_id")
	@Expose
	private Long id;
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
	@Size(min = 1, max = 40)
	@Column(name = "value")
	@Expose
	private String code;
	@Basic(optional = false)
	@NotNull
	@Size(min = 1, max = 60)
	@Column(name = "name")
	@Expose
	private String name;
	@Size(max = 60)
	@Column(name = "name2")
	private String name2;
	@Size(max = 255)
	@Basic(optional = false)
	@NotNull
	@Column(name = "isvendor")
	@Expose
	private char isvendor;
	@Basic(optional = false)
	@NotNull
	@Column(name = "iscustomer")
	@Expose
	private char iscustomer;
	@Basic(optional = false)
	@NotNull
	@Column(name = "isemployee")
	@Expose
	private char isemployee;
	@Column(name = "socreditstatus")
	private Character socreditstatus;
	// @Pattern(regexp="[a-z0-9!#$%&'*+/=?^_`{|}~-]+(?:\\.[a-z0-9!#$%&'*+/=?^_`{|}~-]+)*@(?:[a-z0-9](?:[a-z0-9-]*[a-z0-9])?\\.)+[a-z0-9](?:[a-z0-9-]*[a-z0-9])?",
	// message="Invalid email")//if the field contains email address consider
	// using this annotation to enforce field validation
	
	@Size(max = 70)
	@Column(name = "email")
	private String email;
	
	@Size(max = 70)
	@Expose
	@Column(name = "county")
	private String county;
	
	@Size(max = 70)
	@Expose
	@Column(name = "district")
	private String district;
	
	@Size(max = 5)
	@Column(name = "facilitytype")
	private String facilitytype;
	
	@Size(max = 3)
	@Column(name = "facilitylevel")
	private String facilitylevel;

	@Size(max = 5)
	@Column(name = "facilitycategory")
	private String facilitycategory;
	
	@Column(name = "isdonor")
	private Character isdonor;
	
	@Column(name = "atl_district_id")
	@Expose
	private Long atlDistrictId;
	
	@Column(name = "atl_county_id")
	@Expose
	private Long atlCountyId;
	
	@Column(name = "c_bpartner_location_id")
	@Expose
	private Long cBpartnerLocationId;
	
	@OneToMany(mappedBy = "bpartnerParentId")
	private List<C_BPartner> cBPartnerList;
	@JoinColumn(name = "bpartner_parent_id", referencedColumnName = "c_bpartner_id")
	@ManyToOne
	private C_BPartner bpartnerParentId;

	public C_BPartner() {
	}

	public C_BPartner(Long cBpartnerId) {
		this.id = cBpartnerId;
	}

	public Long getCBpartnerId() {
		return id;
	}

	public void setCBpartnerId(Long cBpartnerId) {
		this.id = cBpartnerId;
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

	public String getValue() {
		return code;
	}

	public void setValue(String value) {
		this.code = value;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getName2() {
		return name2;
	}

	public void setName2(String name2) {
		this.name2 = name2;
	}

	public char getIsvendor() {
		return isvendor;
	}

	public void setIsvendor(char isvendor) {
		this.isvendor = isvendor;
	}

	public char getIscustomer() {
		return iscustomer;
	}

	public void setIscustomer(char iscustomer) {
		this.iscustomer = iscustomer;
	}

	public char getIsemployee() {
		return isemployee;
	}

	public void setIsemployee(char isemployee) {
		this.isemployee = isemployee;
	}

	public Character getSocreditstatus() {
		return socreditstatus;
	}

	public void setSocreditstatus(Character socreditstatus) {
		this.socreditstatus = socreditstatus;
	}
	
	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getFacilitytype() {
		return facilitytype;
	}

	public void setFacilitytype(String facilitytype) {
		this.facilitytype = facilitytype;
	}

	public String getFacilitylevel() {
		return facilitylevel;
	}

	public void setFacilitylevel(String facilitylevel) {
		this.facilitylevel = facilitylevel;
	}

	/**
	public String getVatnumber() {
		return vatnumber;
	}

	public void setVatnumber(String vatnumber) {
		this.vatnumber = vatnumber;
	}
	public String getIstransporter() {
		return istransporter;
	}

	public void setIstransporter(String istransporter) {
		this.istransporter = istransporter;
	}

	public Character getIstaxwithholding() {
		return istaxwithholding;
	}

	public void setIstaxwithholding(Character istaxwithholding) {
		this.istaxwithholding = istaxwithholding;
	}
	public Long getSuppliercategory() {
		return suppliercategory;
	}

	public void setSuppliercategory(Long suppliercategory) {
		this.suppliercategory = suppliercategory;
	}

	public Long getCustomercategory() {
		return customercategory;
	}

	public void setCustomercategory(Long customercategory) {
		this.customercategory = customercategory;
	}

	**/

	public String getFacilitycategory() {
		return facilitycategory;
	}

	public void setFacilitycategory(String facilitycategory) {
		this.facilitycategory = facilitycategory;
	}

	public Character getIsdonor() {
		return isdonor;
	}

	public void setIsdonor(Character isdonor) {
		this.isdonor = isdonor;
	}

	/**
	public String getNames() {
		return names;
	}

	public void setNames(String names) {
		this.names = names;
	}

	public char getIssynch() {
		return issynch;
	}

	public void setIssynch(char issynch) {
		this.issynch = issynch;
	}
	**/

	public Long getCBpartnerLocationId() {
		return cBpartnerLocationId;
	}

	public void setCBpartnerLocationId(Long cBpartnerLocationId) {
		this.cBpartnerLocationId = cBpartnerLocationId;
	}

	public Long getATLCountyId() {
		return atlCountyId;
	}

	public void setATLCountyId(Long atlCountyId) {
		this.atlCountyId = atlCountyId;
	}

	public Long getATLDistrictId() {
		return atlDistrictId;
	}

	public void setATLDistrictId(Long atlDistrictId) {
		this.atlDistrictId = atlDistrictId;
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

	
	@XmlTransient
	public List<C_BPartner> getCBPartnerList() {
		return cBPartnerList;
	}

	public void setCBPartnerList(List<C_BPartner> cBPartnerList) {
		this.cBPartnerList = cBPartnerList;
	}

	public C_BPartner getBpartnerParentId() {
		return bpartnerParentId;
	}

	public void setBpartnerParentId(C_BPartner bpartnerParentId) {
		this.bpartnerParentId = bpartnerParentId;
	}

	@Override
	public int hashCode() {
		int hash = 0;
		hash += (id != null ? id.hashCode() : 0);
		return hash;
	}

	@Override
	public boolean equals(Object object) {
		// TODO: Warning - this method won't work in the case the id fields are
		// not set
		if (!(object instanceof C_BPartner)) {
			return false;
		}
		C_BPartner other = (C_BPartner) object;
		if ((this.id == null && other.id != null)
				|| (this.id != null && !this.id.equals(other.id))) {
			return false;
		}
		return true;
	}

	@Override
	public String toString() {
		return "org.kemsa.codegenproject.CBPartner[ cBpartnerId=" + id + " ]";
	}

}
