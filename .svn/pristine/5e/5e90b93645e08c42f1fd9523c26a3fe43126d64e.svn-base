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
@Table(name = "c_bpartner_location")
@XmlRootElement
public class C_BPartner_Location implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "c_bpartner_location_id")
    @Expose
    private Long id;
    @Basic(optional = false)
    @NotNull
    @Column(name = "c_bpartner_id")
    @Expose
    private Long c_bpartner_id;
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
    @Basic(optional = false)
    @NotNull
    @Column(name = "isbillto")
    private char isbillto;
    @Basic(optional = false)
    @NotNull
    @Column(name = "isshipto")
    private char isshipto;
    @Basic(optional = false)
    @NotNull
    @Column(name = "ispayfrom")
    private char ispayfrom;
    @Basic(optional = false)
    @NotNull
    @Column(name = "isremitto")
    private char isremitto;
    // @Pattern(regexp="^\\(?(\\d{3})\\)?[- ]?(\\d{3})[- ]?(\\d{4})$", message="Invalid phone/fax format, should be as xxx-xxx-xxxx")//if the field contains phone or fax number consider using this annotation to enforce field validation
    @Size(max = 40)
    @Column(name = "phone")
    @Expose
    private String phone;
    @Size(max = 40)
    @Column(name = "phone2")
    @Expose
    private String phone2;
    // @Pattern(regexp="^\\(?(\\d{3})\\)?[- ]?(\\d{3})[- ]?(\\d{4})$", message="Invalid phone/fax format, should be as xxx-xxx-xxxx")//if the field contains phone or fax number consider using this annotation to enforce field validation
    @Size(max = 40)
    @Column(name = "fax")
    private String fax;
    @Size(max = 40)
    @Column(name = "isdn")
    private String isdn;
    // @Pattern(regexp="[a-z0-9!#$%&'*+/=?^_`{|}~-]+(?:\\.[a-z0-9!#$%&'*+/=?^_`{|}~-]+)*@(?:[a-z0-9](?:[a-z0-9-]*[a-z0-9])?\\.)+[a-z0-9](?:[a-z0-9-]*[a-z0-9])?", message="Invalid email")//if the field contains email address consider using this annotation to enforce field validation
    @Size(max = 40)
    @Column(name = "email")
    @Expose
    private String email;
    @Column(name = "atl_district_id")
    private Long atlDistrictId;
    @Column(name = "atl_province_id")
    private Long atlProvinceId;
    @Basic(optional = false)
    @NotNull
    @Column(name = "issynch")
    private char issynch;
    @Column(name = "synchdate")
    @Temporal(TemporalType.TIMESTAMP)
    private Date synchdate;
    @Column(name = "cssynchdate")
    @Temporal(TemporalType.TIMESTAMP)
    private Date cssynchdate;

    public C_BPartner_Location() {
    }

    public C_BPartner_Location(Long cBpartnerLocationId) {
        this.id = cBpartnerLocationId;
    }  

    public Long getCBpartnerLocationId() {
        return id;
    }

    public void setCBpartnerLocationId(Long cBpartnerLocationId) {
        this.id = cBpartnerLocationId;
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

    public char getIsbillto() {
        return isbillto;
    }

    public void setIsbillto(char isbillto) {
        this.isbillto = isbillto;
    }

    public char getIsshipto() {
        return isshipto;
    }

    public void setIsshipto(char isshipto) {
        this.isshipto = isshipto;
    }

    public char getIspayfrom() {
        return ispayfrom;
    }

    public void setIspayfrom(char ispayfrom) {
        this.ispayfrom = ispayfrom;
    }

    public char getIsremitto() {
        return isremitto;
    }

    public void setIsremitto(char isremitto) {
        this.isremitto = isremitto;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getPhone2() {
        return phone2;
    }

    public void setPhone2(String phone2) {
        this.phone2 = phone2;
    }

    public String getFax() {
        return fax;
    }

    public void setFax(String fax) {
        this.fax = fax;
    }

    public String getIsdn() {
        return isdn;
    }

    public void setIsdn(String isdn) {
        this.isdn = isdn;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Long getAtlDistrictId() {
        return atlDistrictId;
    }

    public void setAtlDistrictId(Long atlDistrictId) {
        this.atlDistrictId = atlDistrictId;
    }

    public Long getAtlProvinceId() {
        return atlProvinceId;
    }

    public void setAtlProvinceId(Long atlProvinceId) {
        this.atlProvinceId = atlProvinceId;
    }

    public char getIssynch() {
        return issynch;
    }

    public void setIssynch(char issynch) {
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

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof C_BPartner_Location)) {
            return false;
        }
        C_BPartner_Location other = (C_BPartner_Location) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "org.kemsa.codegenproject.CBPartnerLocation[ cBpartnerLocationId=" + id + " ]";
    }

	public void setC_bpartner_id(Long c_bpartner_id) {
		this.c_bpartner_id = c_bpartner_id;
	}

	public Long getC_bpartner_id() {
		return c_bpartner_id;
	}
    
}
