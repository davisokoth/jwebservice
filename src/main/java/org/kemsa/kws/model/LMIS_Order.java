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
@Table(name = "lmis_order")
public class LMIS_Order implements Serializable {
	private static final long serialVersionUID = 1L;
	
	@Id
	@Basic(optional = false)
	@NotNull
	@Column(name = "lmis_order_id")
	@Expose
	private Long id;
	
	@Basic(optional = false)
	@NotNull
	@Column(name = "lmis_batch_id")
	@Expose
	private Long lmisBatchId;
	
	@Basic(optional = false)
	@NotNull
	@Column(name = "c_bpartner_id")
	@Expose
	private long cBpartnerId;
	
	@Column(name = "m_warehouse_id")
	@Expose
	private long mWarehouseId;
	
	@Basic(optional = false)
	@NotNull
	@Column(name = "ad_client_id")
	private long adClientId;
	
	@Column(name = "ad_org_id")
	@NotNull
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
	@Column(name = "issotrx")
	@Expose
	private char issotrx;
	
	@Basic(optional = false)
	@NotNull
	@Size(min = 1, max = 50)
	@Column(name = "documentno")
	@Expose
	private String documentno;
	
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
	
	@Column(name="c_currency_id")
	private Long currencyId;
	
	@Size(max = 255)
	@Column(name = "description")
	@Expose
	private String description;	
	
	@Basic(optional = false)
	@NotNull
	@Column(name = "grandtotal")
	@Expose
	private Double grandtotal;
	
	@Basic(optional = false)
	@NotNull
	@Column(name = "processed")
	private char processed;
	
	@OneToMany(fetch = FetchType.LAZY)
	@LazyCollection(LazyCollectionOption.FALSE)
	@Cascade((org.hibernate.annotations.CascadeType.ALL))
	@JoinColumn(name = "lmis_order_id")
	@Expose
	private List<LMIS_OrderLine> lineitems;

	public LMIS_Order() {
	}

	public LMIS_Order(Long lmisOrderId) {
		this.id = lmisOrderId;
	}

	public Long getLmisOrderId() {
		return id;
	}

	public void setLmisOrderId(Long lmisOrderId) {
		this.id = lmisOrderId;
	}

	public Long getLmisBatchId() {
		return lmisBatchId;
	}

	public void setLmisBatchId(Long lmisBatchId) {
		this.lmisBatchId = lmisBatchId;
	}

	public Long getMwarehouseId() {
		return mWarehouseId;
	}

	public void setMwarehouseId(Long mWarehouseId) {
		this.mWarehouseId = mWarehouseId;
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

	public String getDocumentno() {
		return documentno;
	}

	public void setDocumentno(String documentno) {
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

	public Double getGrandtotal() {
		return grandtotal;
	}

	public void setGrandtotal(Double grandtotal) {
		this.grandtotal = grandtotal;
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
		if (!(object instanceof LMIS_Order)) {
			return false;
		}
		LMIS_Order other = (LMIS_Order) object;
		if ((this.id == null && other.id != null)
				|| (this.id != null && !this.id.equals(other.id))) {
			return false;
		}
		return true;
	}

	@Override
	public String toString() {
		return "org.kemsa.codegenproject.LMISOrder[ lmisOrderId=" + id + " ]";
	}

	public void setLineItems(List<LMIS_OrderLine> lineItems) {
		this.lineitems = lineItems;
	}

	public List<LMIS_OrderLine> getLineItems() {
		return lineitems;
	}

	public void setcBpartnerId(long cBpartnerId) {
		this.cBpartnerId = cBpartnerId;
	}

	public long getcBpartnerId() {
		return cBpartnerId;
	}

	public void setAdOrgId(long adOrgId) {
		this.adOrgId = adOrgId;
	}

	public long getAdOrgId() {
		return adOrgId;
	}

	public void setCurrencyId(Long currencyId) {
		this.currencyId = currencyId;
	}

	public Long getCurrencyId() {
		return currencyId;
	}
}
