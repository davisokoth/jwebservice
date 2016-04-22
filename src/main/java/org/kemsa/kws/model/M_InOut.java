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
import javax.persistence.ManyToOne;
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
@Table(name = "m_inout")
public class M_InOut implements Serializable {
	private static final long serialVersionUID = 1L;
	@Id
	@Basic(optional = false)
	@NotNull
	@Column(name = "m_inout_id")
	@Expose
	private Long id;
	
	@ManyToOne
	@JoinColumn(name = "c_order_id")
	private C_Order order;
	
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
	@Column(name = "iscancel")
	@Expose
	private char iscancelled;
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
	
	@Column(name="c_doctype_id")
	private Long doctypeId ;
	
	@Column(name="salesrep_id")
	private Long salesrepId;
	@Column(name="m_warehouse_id")
	private Long warehouseId ;
	
	@Size(max = 255)
	@Column(name = "description")
	@Expose
	private String description;	
	
	
	@OneToMany(fetch = FetchType.LAZY)
	@LazyCollection(LazyCollectionOption.FALSE)
	@Cascade((org.hibernate.annotations.CascadeType.ALL))
	@JoinColumn(name = "m_inout_id")
	@Expose
	private List<M_InOutLine> lineitems;

	public M_InOut() {
	}

	public M_InOut(Long cOrderId) {
		this.id = cOrderId;
	}

	/**
	 * @return the id
	 */
	public Long getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(Long id) {
		this.id = id;
	}

	/**
	 * @return the order
	 */
	public C_Order getOrder() {
		return order;
	}

	/**
	 * @param order the order to set
	 */
	public void setOrder(C_Order order) {
		this.order = order;
	}

	/**
	 * @return the cBpartnerId
	 */
	public long getcBpartnerId() {
		return cBpartnerId;
	}

	/**
	 * @param cBpartnerId the cBpartnerId to set
	 */
	public void setcBpartnerId(long cBpartnerId) {
		this.cBpartnerId = cBpartnerId;
	}

	/**
	 * @return the cBpartnerlocationId
	 */
	public long getcBpartnerlocationId() {
		return cBpartnerlocationId;
	}

	/**
	 * @param cBpartnerlocationId the cBpartnerlocationId to set
	 */
	public void setcBpartnerlocationId(long cBpartnerlocationId) {
		this.cBpartnerlocationId = cBpartnerlocationId;
	}

	/**
	 * @return the adClientId
	 */
	public long getAdClientId() {
		return adClientId;
	}

	/**
	 * @param adClientId the adClientId to set
	 */
	public void setAdClientId(long adClientId) {
		this.adClientId = adClientId;
	}

	/**
	 * @return the adOrgId
	 */
	public long getAdOrgId() {
		return adOrgId;
	}

	/**
	 * @param adOrgId the adOrgId to set
	 */
	public void setAdOrgId(long adOrgId) {
		this.adOrgId = adOrgId;
	}

	/**
	 * @return the isactive
	 */
	public char getIsactive() {
		return isactive;
	}

	/**
	 * @param isactive the isactive to set
	 */
	public void setIsactive(char isactive) {
		this.isactive = isactive;
	}
	

	/**
	 * @return the iscancelled
	 */
	public char getIscancelled() {
		return iscancelled;
	}

	/**
	 * @param iscancelled the iscancelled to set
	 */
	public void setIscancelled(char iscancelled) {
		this.iscancelled = iscancelled;
	}

	/**
	 * @return the created
	 */
	public Date getCreated() {
		return created;
	}

	/**
	 * @param created the created to set
	 */
	public void setCreated(Date created) {
		this.created = created;
	}

	/**
	 * @return the createdby
	 */
	public long getCreatedby() {
		return createdby;
	}

	/**
	 * @param createdby the createdby to set
	 */
	public void setCreatedby(long createdby) {
		this.createdby = createdby;
	}

	/**
	 * @return the updated
	 */
	public Date getUpdated() {
		return updated;
	}

	/**
	 * @param updated the updated to set
	 */
	public void setUpdated(Date updated) {
		this.updated = updated;
	}

	/**
	 * @return the updatedby
	 */
	public long getUpdatedby() {
		return updatedby;
	}

	/**
	 * @param updatedby the updatedby to set
	 */
	public void setUpdatedby(long updatedby) {
		this.updatedby = updatedby;
	}

	/**
	 * @return the issotrx
	 */
	public char getIssotrx() {
		return issotrx;
	}

	/**
	 * @param issotrx the issotrx to set
	 */
	public void setIssotrx(char issotrx) {
		this.issotrx = issotrx;
	}

	/**
	 * @return the documentno
	 */
	public String getDocumentno() {
		return documentno;
	}

	/**
	 * @param documentno the documentno to set
	 */
	public void setDocumentno(String documentno) {
		this.documentno = documentno;
	}	

	/**
	 * @return the docstatus
	 */
	public String getDocstatus() {
		return docstatus;
	}

	/**
	 * @param docstatus the docstatus to set
	 */
	public void setDocstatus(String docstatus) {
		this.docstatus = docstatus;
	}

	/**
	 * @return the docaction
	 */
	public String getDocaction() {
		return docaction;
	}

	/**
	 * @param docaction the docaction to set
	 */
	public void setDocaction(String docaction) {
		this.docaction = docaction;
	}

	/**
	 * @return the processing
	 */
	public Character getProcessing() {
		return processing;
	}

	/**
	 * @param processing the processing to set
	 */
	public void setProcessing(Character processing) {
		this.processing = processing;
	}

	/**
	 * @return the processed
	 */
	public char getProcessed() {
		return processed;
	}

	/**
	 * @param processed the processed to set
	 */
	public void setProcessed(char processed) {
		this.processed = processed;
	}	

	/**
	 * @return the doctypeId
	 */
	public Long getDoctypeId() {
		return doctypeId;
	}

	/**
	 * @param doctypeId the doctypeId to set
	 */
	public void setDoctypeId(Long doctypeId) {
		this.doctypeId = doctypeId;
	}
	

	/**
	 * @return the salesrepId
	 */
	public Long getSalesrepId() {
		return salesrepId;
	}

	/**
	 * @param salesrepId the salesrepId to set
	 */
	public void setSalesrepId(Long salesrepId) {
		this.salesrepId = salesrepId;
	}

	/**
	 * @return the warehouseId
	 */
	public Long getWarehouseId() {
		return warehouseId;
	}

	/**
	 * @param warehouseId the warehouseId to set
	 */
	public void setWarehouseId(Long warehouseId) {
		this.warehouseId = warehouseId;
	}

	/**
	 * @return the description
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * @param description the description to set
	 */
	public void setDescription(String description) {
		this.description = description;
	}	

	/**
	 * @return the lineitems
	 */
	public List<M_InOutLine> getLineitems() {
		return lineitems;
	}

	/**
	 * @param lineitems the lineitems to set
	 */
	public void setLineitems(List<M_InOutLine> lineitems) {
		this.lineitems = lineitems;
	}	
}
