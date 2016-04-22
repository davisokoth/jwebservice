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
 * @author laban
 */
@Entity
@Table(name = "c_order")
public class C_Order implements Serializable {
	private static final long serialVersionUID = 1L;
	@Id
	@Basic(optional = false)
	@NotNull
	@Column(name = "c_order_id")
	@Expose
	private Long id;
	@Basic(optional = false)
	@NotNull
	@Column(name = "c_bpartner_id")
	@Expose
	private long cBpartnerId;
	@Column(name = "c_bpartner_location_id")	
	private long cBpartnerlocationId;
	@Basic(optional = false)
	@NotNull
	@Column(name = "ad_client_id")
	private long adClientId;
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
	@Column(name = "issotrx")
	@Expose
	private char issotrx;
	@Basic(optional = false)
	@NotNull
	@Size(min = 1, max = 30)
	@Column(name = "documentno")
	@Expose
	private String documentno;
	
	@Column(name = "lmis_batch_id")
	@Expose
	private Long lmisBatchId;
	
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
	@Basic(optional = false)
	@NotNull
	@Column(name = "processed")
	private char processed;
	@Column(name="c_paymentterm_id")
	private Long paymentTermId;
	@Column(name="c_currency_id")
	private Long currencyId;
	@Column(name="atl_sourceoffunds_id")
	private Long sourceoffundsId;
	@Column(name="c_doctype_id")
	private Long doctypeId ;
	@Column(name="c_doctypetarget_id")
	private Long doctypeTargetId;
	@Column(name="salesrep_id")
	private Long salesrepId;
	@Column(name="m_warehouse_id")
	private Long warehouseId ;
	@Column(name="m_pricelist_id")
	private Long pricelistId ;
	@Size(max = 255)
	@Column(name = "description")
	@Expose
	private String description;	
	@Basic(optional = false)
	@NotNull
	@Column(name = "dateordered")
	@Temporal(TemporalType.TIMESTAMP)
	@Expose
	private Date dateordered;	
	@Basic(optional = false)
	@NotNull
	@Column(name = "dateacct")
	@Temporal(TemporalType.TIMESTAMP)
	private Date dateacct;	
	@Basic(optional = false)
	@NotNull
	@Column(name = "paymentrule")
	private char paymentrule;
	@Basic(optional = false)
	@NotNull
	@Column(name = "priorityrule")
	private char priorityrule;
	@Basic(optional = false)
	@NotNull
	@Column(name = "invoicerule")
	private char invoicerule;
	@Basic(optional = false)
	@NotNull
	@Column(name = "deliveryrule")
	private char deliveryrule;
	@Basic(optional = false)
	@NotNull
	@Column(name = "freightcostrule")
	private char freightcostrule;
	
	@Basic(optional = false)
	@NotNull
	@Column(name = "deliveryviarule")
	private char deliveryviarule;
	
	@Basic(optional = false)
	@NotNull
	@Column(name = "totallines")
	@Expose
	private BigDecimal totallines;
	@Basic(optional = false)
	@NotNull
	@Column(name = "grandtotal")
	@Expose
	private BigDecimal grandtotal;
	@Size(max = 510)
	@Column(name = "ordertype")
	private String ordertype;
	@OneToMany(fetch = FetchType.LAZY)
	@LazyCollection(LazyCollectionOption.FALSE)
	@Cascade((org.hibernate.annotations.CascadeType.ALL))
	@JoinColumn(name = "c_order_id")
	@Expose
	private List<C_OrderLine> lineitems;

	public C_Order() {
	}

	public C_Order(Long cOrderId) {
		this.id = cOrderId;
	}

	public Long getCOrderId() {
		return id;
	}

	public void setCOrderId(Long cOrderId) {
		this.id = cOrderId;
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

	
	public Date getDateordered() {
		return dateordered;
	}

	public void setDateordered(Date dateordered) {
		this.dateordered = dateordered;
	}

	
	public Date getDateacct() {
		return dateacct;
	}

	public void setDateacct(Date dateacct) {
		this.dateacct = dateacct;
	}

	public char getPaymentrule() {
		return paymentrule;
	}

	public void setPaymentrule(char paymentrule) {
		this.paymentrule = paymentrule;
	}

	public char getInvoicerule() {
		return invoicerule;
	}

	public void setInvoicerule(char invoicerule) {
		this.invoicerule = invoicerule;
	}

	public char getDeliveryrule() {
		return deliveryrule;
	}

	public void setDeliveryrule(char deliveryrule) {
		this.deliveryrule = deliveryrule;
	}

	public char getFreightcostrule() {
		return freightcostrule;
	}

	public void setFreightcostrule(char freightcostrule) {
		this.freightcostrule = freightcostrule;
	}

	
	public char getDeliveryviarule() {
		return deliveryviarule;
	}

	public void setDeliveryviarule(char deliveryviarule) {
		this.deliveryviarule = deliveryviarule;
	}
	
	public BigDecimal getTotallines() {
		return totallines;
	}

	public void setTotallines(BigDecimal totallines) {
		this.totallines = totallines;
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
		if (!(object instanceof C_Order)) {
			return false;
		}
		C_Order other = (C_Order) object;
		if ((this.id == null && other.id != null)
				|| (this.id != null && !this.id.equals(other.id))) {
			return false;
		}
		return true;
	}

	@Override
	public String toString() {
		return "org.kemsa.codegenproject.COrder[ cOrderId=" + id + " ]";
	}

	public void setLineItems(List<C_OrderLine> lineItems) {
		this.lineitems = lineItems;
	}

	public List<C_OrderLine> getLineItems() {
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

	public void setPaymentTermId(Long paymentTermId) {
		this.paymentTermId = paymentTermId;
	}

	public Long getPaymentTermId() {
		return paymentTermId;
	}

	public void setCurrencyId(Long currencyId) {
		this.currencyId = currencyId;
	}

	public Long getCurrencyId() {
		return currencyId;
	}

	public void setDoctypeId(Long doctypeId) {
		this.doctypeId = doctypeId;
	}

	public Long getDoctypeId() {
		return doctypeId;
	}

	public void setDoctypeTargetId(Long doctypeTargetId) {
		this.doctypeTargetId = doctypeTargetId;
	}

	public Long getDoctypeTargetId() {
		return doctypeTargetId;
	}

	public void setSalesrepId(Long salesrepId) {
		this.salesrepId = salesrepId;
	}

	public Long getSalesrepId() {
		return salesrepId;
	}

	public void setWarehouseId(Long warehouseId) {
		this.warehouseId = warehouseId;
	}

	public Long getWarehouseId() {
		return warehouseId;
	}

	public void setLmisBatchId(Long lmisBatchId) {
		this.lmisBatchId = lmisBatchId;
	}

	public Long getLmisBatchId() {
		return lmisBatchId;
	}

	public void setPricelistId(Long pricelistId) {
		this.pricelistId = pricelistId;
	}

	public Long getPricelistId() {
		return pricelistId;
	}

	public void setcBpartnerlocationId(long cBpartnerlocationId) {
		this.cBpartnerlocationId = cBpartnerlocationId;
	}

	public long getcBpartnerlocationId() {
		return cBpartnerlocationId;
	}

	public void setSourceoffundsId(Long sourceoffundsId) {
		this.sourceoffundsId = sourceoffundsId;
	}

	public Long getSourceoffundsId() {
		return sourceoffundsId;
	}

	public void setPriorityrule(char priorityrule) {
		this.priorityrule = priorityrule;
	}

	public char getPriorityrule() {
		return priorityrule;
	}

}
