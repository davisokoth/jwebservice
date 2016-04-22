/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.kemsa.kws.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;

import com.google.gson.annotations.Expose;

/**
 * 
 * @author davis
 */
@Entity
@Table(name = "lmis_orderline")
public class LMIS_OrderLine implements Serializable {
	private static final long serialVersionUID = 1L;
	@Id
	@Basic(optional = false)
	@NotNull
	@Column(name = "lmis_orderline_id")
	@Expose
	private Long id;
	
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
	
	@Column(name = "processed")
	private char processed;
	
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
	@Column(name = "line")
	private long line;
	
	@Basic(optional = false)
	@NotNull
	@Column(name = "lmis_order_id")
	private Long lmis_order_id;
	
	@Column(name="m_warehouse_id")
	private Long warehouseId ;
	
	@ManyToOne
	@JoinColumn(name = "m_product_id", nullable = false)
	@Expose
	private M_Product product;

	@Basic(optional = false)
	@NotNull
	@Column(name = "c_uom_id")
	private long cuomId;

	@Basic(optional = false)
	@NotNull
	@Column(name = "qtyordered")
	@Expose
	private BigDecimal qtyordered;
	
	@Basic(optional = false)
	@NotNull
	@Column(name = "priceactual")
	@Expose
	private BigDecimal priceactual;
	
	@Basic(optional = false)
	@NotNull
	@Column(name = "linenetamt")
	@Expose
	private BigDecimal linenetamt;
	
	@Column(name = "atl_sourceoffunds_id")
	private Long atlSourceoffundsId;
	
	public LMIS_OrderLine() {
	}

	public LMIS_OrderLine(Long lmisOrderlineId) {
		this.id = lmisOrderlineId;
	}

	public Long getLmisOrderlineId() {
		return id;
	}

	public void setLmisOrderlineId(Long cOrderlineId) {
		this.id = cOrderlineId;
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

	public long getLine() {
		return line;
	}

	public void setLine(long line) {
		this.line = line;
	}

	public BigDecimal getQtyordered() {
		return qtyordered;
	}

	public void setQtyordered(BigDecimal qtyordered) {
		this.qtyordered = qtyordered;
	}

	public BigDecimal getPriceactual() {
		return priceactual;
	}

	public void setLineNetAmt(BigDecimal linenetamt) {
		this.linenetamt = linenetamt;
	}

	public BigDecimal getLineNetAmt() {
		return linenetamt;
	}

	public void setPriceactual(BigDecimal priceactual) {
		this.priceactual = priceactual;
	}

	public Long getAtlSourceoffundsId() {
		return atlSourceoffundsId;
	}

	public void setAtlSourceoffundsId(Long atlSourceoffundsId) {
		this.atlSourceoffundsId = atlSourceoffundsId;
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
		if (!(object instanceof LMIS_OrderLine)) {
			return false;
		}
		LMIS_OrderLine other = (LMIS_OrderLine) object;
		if ((this.id == null && other.id != null)
				|| (this.id != null && !this.id.equals(other.id))) {
			return false;
		}
		return true;
	}

	@Override
	public String toString() {
		return "org.kemsa.codegenproject.COrderLine[ cOrderlineId=" + id + " ]";
	}

	public void setLmisOrderId(Long lmis_order_id) {
		this.lmis_order_id = lmis_order_id;
	}

	public Long getLmisOrderId() {
		return lmis_order_id;
	}

	public void setProduct(M_Product product) {
		this.product = product;
	}

	public M_Product getProduct() {
		return product;
	}

	public void setAdOrgId(long adOrgId) {
		this.adOrgId = adOrgId;
	}

	public long getAdOrgId() {
		return adOrgId;
	}

	public void setCuomId(long cuomId) {
		this.cuomId = cuomId;
	}

	public long getCuomId() {
		return cuomId;
	}

	public void setWarehouseId(Long warehouseId) {
		this.warehouseId = warehouseId;
	}

	public Long getWarehouseId() {
		return warehouseId;
	}

	public char getProcessed() {
		return processed;
	}

	public void setProcessed(char processed) {
		this.processed = processed;
	}

	

}
