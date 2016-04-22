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
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.hibernate.annotations.Cascade;
import org.hibernate.annotations.LazyCollection;
import org.hibernate.annotations.LazyCollectionOption;

import com.google.gson.annotations.Expose;

/**
 * 
 * @author davis
 */
@Entity
@Table(name = "LMIS_Batch")
public class LMIS_Batch implements Serializable {
	private static final long serialVersionUID = 1L;
	
	@Id
	@Basic(optional = false)
	@NotNull
	@Column(name = "lmis_batch_id")
	@Expose
	private Long id;
	
	@Basic(optional = false)
	@NotNull
	@Column(name = "atl_county_id")
	@Expose
	private long atlCountyId;
	
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
	@Column(name = "ispaidbythirdparty")
	@Expose
	private char isPaidByThirdParty;
	
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
	@Column(name = "issotrx")
	@Expose
	private char issotrx;
	
	@Basic(optional = false)
	@NotNull
	@Size(min = 1, max = 50)
	@Column(name = "documentno")
	@Expose
	private String documentno;
	
	@Column(name = "bookingno")
	@Expose
	private String bookingno;
	
	@Basic(optional = false)
	@NotNull
	@Size(min = 1, max = 2)
	@Column(name = "docstatus")
	@Expose
	private String docstatus;
	
	@Basic(optional = false)
	@NotNull
	@Size(min = 1, max = 2)
	@Column(name = "docaction")
	private String docaction;
	
	@Column(name = "processing")
	private Character processing;
	
	@Size(max = 255)
	@Column(name = "description")
	@Expose
	private String description;	
	
	@Column(name = "dateordered")
	@Temporal(TemporalType.TIMESTAMP)
	@Expose
	private Date dateordered;	
	
	@Column(name = "datereceived")
	@Temporal(TemporalType.TIMESTAMP)
	@Expose
	private Date datereceived;	
	
	@Basic(optional = false)
	@NotNull
	@Column(name = "grandtotal")
	@Expose
	private BigDecimal grandtotal;
	
	@Size(min=3, max = 3)
	@Column(name = "ordertype")
	private String ordertype;
	
	@Basic(optional = false)
	@NotNull
	@Column(name = "processed")
	private char processed;
	
	@Column(name = "isclosed")
	private char isclosed;
	
	@Column(name = "atl_sourceoffunds_id")
	@Expose
	private long atlSourceOfFundsId;
	
	@Expose
	@Column(name = "poreference")
	private String  poreference;
	
	@OneToMany(fetch = FetchType.LAZY)
	@LazyCollection(LazyCollectionOption.FALSE)
	@Cascade((org.hibernate.annotations.CascadeType.ALL))
	@JoinColumn(name = "lmis_batch_id")
	@Expose
	private List<LMIS_Order> orders;

	public LMIS_Batch() {
	}

	public LMIS_Batch(Long lmisBatchId) {
		this.id = lmisBatchId;
	}

	public Long getLmisBatchId() {
		return id;
	}

	public void setLmisBatchId(Long lmisBatchId) {
		this.id = lmisBatchId;
	}

	public long getAdClientId() {
		return adClientId;
	}

	public void setAdClientId(long adClientId) {
		this.adClientId = adClientId;
	}

	public char getIsactive() {
		return isactive;
	}

	public void setIsactive(char isactive) {
		this.isactive = isactive;
	}
	
	public char getIsClosed() {
		return isclosed;
	}

	public void setIsClosed(char isclosed) {
		this.isclosed = isclosed;
	}

	public char getIsPaidByThirdParty() {
		return isPaidByThirdParty;
	}

	public void setIsPaidByThirdParty(char isPaidByThirdParty) {
		this.isPaidByThirdParty = isPaidByThirdParty;
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

	public char getIssotrx() {
		return issotrx;
	}

	public void setIssotrx(char issotrx) {
		this.issotrx = issotrx;
	}

	public String getBookingNo() {
		return bookingno;
	}

	public void setBookingNo(String bookingno) {
		this.bookingno = bookingno;
	}

	public String getDocumentNo() {
		return documentno;
	}

	public void setDocumentNo(String documentno) {
		this.documentno = documentno;
	}

	public String getDocstatus() {
		return docstatus;
	}

	public void setDocstatus(String docstatus) {
		this.docstatus = docstatus;
	}

	public String getDocaction() {
		return docaction;
	}

	public void setPoreference(String poreference) {
		this.poreference = poreference;
	}

	public String getPoreference() {
		return poreference;
	}

	public void setDocaction(String docaction) {
		this.docaction = docaction;
	}

	public Character getProcessing() {
		return processing;
	}

	public void setProcessing(Character processing) {
		this.processing = processing;
	}

	public char getProcessed() {
		return processed;
	}

	public void setProcessed(char processed) {
		this.processed = processed;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	
	public Date getDateordered() {
		return dateordered;
	}

	public void setDateordered(Date dateordered) {
		this.dateordered = dateordered;
	}

	public Date getDateReceived() {
		return datereceived;
	}

	public void setDateReceived(Date datereceived) {
		this.datereceived = datereceived;
	}

	public BigDecimal getGrandtotal() {
		return grandtotal;
	}

	public void setGrandtotal(BigDecimal grandtotal) {
		this.grandtotal = grandtotal;
	}

	public String getOrdertype() {
		return ordertype;
	}

	public void setOrdertype(String ordertype) {
		this.ordertype = ordertype;
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
		if (!(object instanceof LMIS_Batch)) {
			return false;
		}
		LMIS_Batch other = (LMIS_Batch) object;
		if ((this.id == null && other.id != null)
				|| (this.id != null && !this.id.equals(other.id))) {
			return false;
		}
		return true;
	}

	@Override
	public String toString() {
		return "org.kemsa.codegenproject.LMISBatch[ lmisBatchId=" + id + " ]";
	}

	public void setLMISOrders(List<LMIS_Order> orders) {
		this.orders = orders;
	}

	public List<LMIS_Order> getLMISOrders() {
		return orders;
	}

	public void setAtlCountyId(long atlCountyId) {
		this.atlCountyId = atlCountyId;
	}

	public long getAtlCountyId() {
		return atlCountyId;
	}

	public void setAtlSourceOffundsId(long atlSourceOfFundsId) {
		this.atlSourceOfFundsId = atlSourceOfFundsId;
	}

	public long getAtlSourceOfFundsId() {
		return atlSourceOfFundsId;
	}

	public void setAdOrgId(long adOrgId) {
		this.adOrgId = adOrgId;
	}

	public long getAdOrgId() {
		return adOrgId;
	}
}
