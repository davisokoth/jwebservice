/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.kemsa.kws.model;

import java.io.Serializable;
import java.math.BigInteger;
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

import com.google.gson.annotations.Expose;

/**
 * 
 * @author laban
 */
@Entity
@Table(name = "m_product")
public class M_Product implements Serializable {
	private static final long serialVersionUID = 1L;
	@Id
	@Basic(optional = false)
	@NotNull
	@Column(name = "m_product_id")
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
	@Size(min = 1, max = 255)
	@Column(name = "name")
	@Expose
	private String name;
	@Size(max = 255)
	@Column(name = "description")
	private String description;
	@Size(max = 2000)
	@Column(name = "documentnote")
	private String documentnote;
	@Size(max = 2000)
	@Column(name = "help")
	private String help;
	@Size(max = 30)
	@Column(name = "upc")
	private String upc;
	@Size(max = 30)
	@Column(name = "sku")
	private String sku;
	@Basic(optional = false)
	@NotNull
	@Column(name = "issummary")
	private char issummary;
	@Basic(optional = false)
	@NotNull
	@Column(name = "isstocked")
	private char isstocked;
	@Basic(optional = false)
	@NotNull
	@Column(name = "ispurchased")
	private char ispurchased;
	@Basic(optional = false)
	@NotNull
	@Column(name = "issold")
	private char issold;
	@Basic(optional = false)
	@NotNull
	@Column(name = "isbom")
	private char isbom;
	@Basic(optional = false)
	@NotNull
	@Column(name = "isinvoiceprintdetails")
	private char isinvoiceprintdetails;
	@Basic(optional = false)
	@NotNull
	@Column(name = "ispicklistprintdetails")
	private char ispicklistprintdetails;
	@Basic(optional = false)
	@NotNull
	@Column(name = "isverified")
	private char isverified;
	@Size(max = 12)
	@Column(name = "classification")
	private String classification;
	@Column(name = "volume")
	private BigInteger volume;
	@Column(name = "weight")
	private BigInteger weight;
	@Column(name = "shelfwidth")
	private Long shelfwidth;
	@Column(name = "shelfheight")
	private BigInteger shelfheight;
	@Column(name = "shelfdepth")
	private Long shelfdepth;
	@Column(name = "unitsperpallet")
	private BigInteger unitsperpallet;
	@Column(name = "discontinued")
	private Character discontinued;
	@Column(name = "discontinuedby")
	@Temporal(TemporalType.TIMESTAMP)
	private Date discontinuedby;
	@Column(name = "processing")
	private Character processing;
	@Basic(optional = false)
	@NotNull
	@Column(name = "producttype")
	private char producttype;
	@Size(max = 120)
	@Column(name = "imageurl")
	private String imageurl;
	@Size(max = 120)
	@Column(name = "descriptionurl")
	private String descriptionurl;
	@Column(name = "guaranteedays")
	private Long guaranteedays;
	@Size(max = 20)
	@Column(name = "versionno")
	private String versionno;
	@Size(max = 120)
	@Column(name = "downloadurl")
	private String downloadurl;
	@Column(name = "guaranteedaysmin")
	private Long guaranteedaysmin;
	@Basic(optional = false)
	@NotNull
	@Column(name = "iswebstorefeatured")
	private char iswebstorefeatured;
	@Basic(optional = false)
	@NotNull
	@Column(name = "isselfservice")
	private char isselfservice;
	@Basic(optional = false)
	@NotNull
	@Column(name = "isdropship")
	private char isdropship;
	@Basic(optional = false)
	@NotNull
	@Column(name = "isexcludeautodelivery")
	private char isexcludeautodelivery;
	@Size(max = 255)
	@Column(name = "group1")
	private String group1;
	@Size(max = 255)
	@Column(name = "group2")
	private String group2;
	@Column(name = "istoformule")
	private Character istoformule;
	@Basic(optional = false)
	@NotNull
	@Column(name = "lowlevel")
	private long lowlevel;
	@Basic(optional = false)
	@NotNull
	@Column(name = "unitsperpack")
	private long unitsperpack;
	/**
	@Column(name = "islocal")
	private Character islocal;
	@Basic(optional = false)
	@NotNull
	@Column(name = "issynch")
	private char issynch;
	**/
	@Column(name = "isbatchmanaged")
	private Character isbatchmanaged;
	@Column(name = "nextbatchno")
	private BigInteger nextbatchno;
	@Column(name = "pickingrule")
	private Character pickingrule;
	@Column(name = "atl_abcranking_id")
	private Long atlAbcrankingId;
	@Size(max = 5)
	@Column(name = "batchprefix")
	private String batchprefix;
	@Column(name = "shelflifedays")
	private BigInteger shelflifedays;
	@Basic(optional = false)
	@Column(name = "isinternalinventory")
	@Expose
	private char isinternalinventory;
	@Column(name = "affectsdr")
	private Character affectsdr;
	@Column(name = "c_uom_id")
	@Expose
	private Long cuomid;	
	@Column(name = "m_warehouse_id")
	private Long mWarehouseId;
	@Column(name = "synchdate")
	@Temporal(TemporalType.TIMESTAMP)
	private Date synchdate;
	@Column(name = "cssynchdate")
	@Temporal(TemporalType.TIMESTAMP)
	private Date cssynchdate;

	public M_Product() {
	}

	public M_Product(Long mProductId) {
		this.id = mProductId;
	}
	public Long getMProductId() {
		return id;
	}

	public void setMProductId(Long mProductId) {
		this.id = mProductId;
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

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getDocumentnote() {
		return documentnote;
	}

	public void setDocumentnote(String documentnote) {
		this.documentnote = documentnote;
	}

	public String getHelp() {
		return help;
	}

	public void setHelp(String help) {
		this.help = help;
	}

	public String getUpc() {
		return upc;
	}

	public void setUpc(String upc) {
		this.upc = upc;
	}

	public String getSku() {
		return sku;
	}

	public void setSku(String sku) {
		this.sku = sku;
	}

	public char getIssummary() {
		return issummary;
	}

	public void setIssummary(char issummary) {
		this.issummary = issummary;
	}

	public char getIsstocked() {
		return isstocked;
	}

	public void setIsstocked(char isstocked) {
		this.isstocked = isstocked;
	}

	public char getIspurchased() {
		return ispurchased;
	}

	public void setIspurchased(char ispurchased) {
		this.ispurchased = ispurchased;
	}

	public char getIssold() {
		return issold;
	}

	public void setIssold(char issold) {
		this.issold = issold;
	}

	public char getIsbom() {
		return isbom;
	}

	public void setIsbom(char isbom) {
		this.isbom = isbom;
	}

	public char getIsinvoiceprintdetails() {
		return isinvoiceprintdetails;
	}

	public void setIsinvoiceprintdetails(char isinvoiceprintdetails) {
		this.isinvoiceprintdetails = isinvoiceprintdetails;
	}

	public char getIspicklistprintdetails() {
		return ispicklistprintdetails;
	}

	public void setIspicklistprintdetails(char ispicklistprintdetails) {
		this.ispicklistprintdetails = ispicklistprintdetails;
	}

	public char getIsverified() {
		return isverified;
	}

	public void setIsverified(char isverified) {
		this.isverified = isverified;
	}

	public String getClassification() {
		return classification;
	}

	public void setClassification(String classification) {
		this.classification = classification;
	}

	public BigInteger getVolume() {
		return volume;
	}

	public void setVolume(BigInteger volume) {
		this.volume = volume;
	}

	public BigInteger getWeight() {
		return weight;
	}

	public void setWeight(BigInteger weight) {
		this.weight = weight;
	}

	public Long getShelfwidth() {
		return shelfwidth;
	}

	public void setShelfwidth(Long shelfwidth) {
		this.shelfwidth = shelfwidth;
	}

	public BigInteger getShelfheight() {
		return shelfheight;
	}

	public void setShelfheight(BigInteger shelfheight) {
		this.shelfheight = shelfheight;
	}

	public Long getShelfdepth() {
		return shelfdepth;
	}

	public void setShelfdepth(Long shelfdepth) {
		this.shelfdepth = shelfdepth;
	}

	public BigInteger getUnitsperpallet() {
		return unitsperpallet;
	}

	public void setUnitsperpallet(BigInteger unitsperpallet) {
		this.unitsperpallet = unitsperpallet;
	}

	public Character getDiscontinued() {
		return discontinued;
	}

	public void setDiscontinued(Character discontinued) {
		this.discontinued = discontinued;
	}

	public Date getDiscontinuedby() {
		return discontinuedby;
	}

	public void setDiscontinuedby(Date discontinuedby) {
		this.discontinuedby = discontinuedby;
	}

	public Character getProcessing() {
		return processing;
	}

	public void setProcessing(Character processing) {
		this.processing = processing;
	}

	public char getProducttype() {
		return producttype;
	}

	public void setProducttype(char producttype) {
		this.producttype = producttype;
	}

	public String getImageurl() {
		return imageurl;
	}

	public void setImageurl(String imageurl) {
		this.imageurl = imageurl;
	}

	public String getDescriptionurl() {
		return descriptionurl;
	}

	public void setDescriptionurl(String descriptionurl) {
		this.descriptionurl = descriptionurl;
	}

	public Long getGuaranteedays() {
		return guaranteedays;
	}

	public void setGuaranteedays(Long guaranteedays) {
		this.guaranteedays = guaranteedays;
	}

	public String getVersionno() {
		return versionno;
	}

	public void setVersionno(String versionno) {
		this.versionno = versionno;
	}

	public String getDownloadurl() {
		return downloadurl;
	}

	public void setDownloadurl(String downloadurl) {
		this.downloadurl = downloadurl;
	}

	public Long getGuaranteedaysmin() {
		return guaranteedaysmin;
	}

	public void setGuaranteedaysmin(Long guaranteedaysmin) {
		this.guaranteedaysmin = guaranteedaysmin;
	}

	public char getIswebstorefeatured() {
		return iswebstorefeatured;
	}

	public void setIswebstorefeatured(char iswebstorefeatured) {
		this.iswebstorefeatured = iswebstorefeatured;
	}

	public char getIsselfservice() {
		return isselfservice;
	}

	public void setIsselfservice(char isselfservice) {
		this.isselfservice = isselfservice;
	}

	public char getIsdropship() {
		return isdropship;
	}

	public void setIsdropship(char isdropship) {
		this.isdropship = isdropship;
	}

	public char getIsexcludeautodelivery() {
		return isexcludeautodelivery;
	}

	public void setIsexcludeautodelivery(char isexcludeautodelivery) {
		this.isexcludeautodelivery = isexcludeautodelivery;
	}

	public String getGroup1() {
		return group1;
	}

	public void setGroup1(String group1) {
		this.group1 = group1;
	}

	public String getGroup2() {
		return group2;
	}

	public void setGroup2(String group2) {
		this.group2 = group2;
	}

	public Character getIstoformule() {
		return istoformule;
	}

	public void setIstoformule(Character istoformule) {
		this.istoformule = istoformule;
	}

	public long getLowlevel() {
		return lowlevel;
	}

	public void setLowlevel(long lowlevel) {
		this.lowlevel = lowlevel;
	}

	public long getUnitsperpack() {
		return unitsperpack;
	}

	public void setUnitsperpack(long unitsperpack) {
		this.unitsperpack = unitsperpack;
	}

	/**
	public Character getIslocal() {
		return islocal;
	}

	public void setIslocal(Character islocal) {
		this.islocal = islocal;
	}
	
	public char getIssynch() {
		return issynch;
	}

	public void setIssynch(char issynch) {
		this.issynch = issynch;
	}

	
	**/

	public Character getIsbatchmanaged() {
		return isbatchmanaged;
	}

	public void setIsbatchmanaged(Character isbatchmanaged) {
		this.isbatchmanaged = isbatchmanaged;
	}

	public BigInteger getNextbatchno() {
		return nextbatchno;
	}

	public void setNextbatchno(BigInteger nextbatchno) {
		this.nextbatchno = nextbatchno;
	}

	public Character getPickingrule() {
		return pickingrule;
	}

	public void setPickingrule(Character pickingrule) {
		this.pickingrule = pickingrule;
	}

	public Long getAtlAbcrankingId() {
		return atlAbcrankingId;
	}

	public void setAtlAbcrankingId(Long atlAbcrankingId) {
		this.atlAbcrankingId = atlAbcrankingId;
	}

	public String getBatchprefix() {
		return batchprefix;
	}

	public void setBatchprefix(String batchprefix) {
		this.batchprefix = batchprefix;
	}

	public BigInteger getShelflifedays() {
		return shelflifedays;
	}

	public void setShelflifedays(BigInteger shelflifedays) {
		this.shelflifedays = shelflifedays;
	}

	public char getIsinternalinventory() {
		return isinternalinventory;
	}

	public void setIsinternalinventory(char isinternalinventory) {
		this.isinternalinventory = isinternalinventory;
	}

	public Character getAffectsdr() {
		return affectsdr;
	}

	public void setAffectsdr(Character affectsdr) {
		this.affectsdr = affectsdr;
	}

	public Long getMWarehouseId() {
		return mWarehouseId;
	}

	public void setMWarehouseId(Long mWarehouseId) {
		this.mWarehouseId = mWarehouseId;
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
		// TODO: Warning - this method won't work in the case the id fields are
		// not set
		if (!(object instanceof M_Product)) {
			return false;
		}
		M_Product other = (M_Product) object;
		if ((this.id == null && other.id != null)
				|| (this.id != null && !this.id
						.equals(other.id))) {
			return false;
		}
		return true;
	}

	@Override
	public String toString() {
		return "org.kemsa.codegenproject.MProduct[ mProductId=" + id
				+ " ]";
	}

	public void setCuomid(Long cuomid) {
		this.cuomid = cuomid;
	}

	public Long getCuomid() {
		return cuomid;
	}

}
