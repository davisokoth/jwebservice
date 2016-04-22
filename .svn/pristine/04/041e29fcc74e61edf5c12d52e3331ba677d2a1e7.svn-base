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
import javax.validation.constraints.Size;

import com.google.gson.annotations.Expose;

/**
 * 
 * @author laban
 */
@Entity
@Table(name = "c_orderline")
public class C_OrderLine implements Serializable {
	private static final long serialVersionUID = 1L;
	@Id
	@Basic(optional = false)
	@NotNull
	@Column(name = "c_orderline_id")
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
	@ManyToOne
	@JoinColumn(name = "c_order_id", nullable = false)
	private C_Order order;
	
	@NotNull
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
	@Column(name = "c_tax_id")
	private long ctaxId;

	@Basic(optional = false)
	@NotNull
	@Column(name = "dateordered")
	@Temporal(TemporalType.TIMESTAMP)
	private Date dateordered;
	@Column(name = "datepromised")
	@Temporal(TemporalType.TIMESTAMP)
	private Date datepromised;
	@Column(name = "datedelivered")
	@Temporal(TemporalType.TIMESTAMP)
	private Date datedelivered;
	@Column(name = "dateinvoiced")
	@Temporal(TemporalType.TIMESTAMP)
	private Date dateinvoiced;
	@Size(max = 402)
	@Column(name = "description")
	@Expose
	private String description;
	@Basic(optional = false)
	@NotNull
	@Column(name = "qtyordered")
	@Expose
	private BigDecimal qtyordered;
	@Basic(optional = false)
	@NotNull
	@Column(name = "qtyreserved")
	private BigDecimal qtyreserved;
	@Basic(optional = false)
	@NotNull
	@Column(name = "qtydelivered")
	private BigDecimal qtydelivered;
	@Basic(optional = false)
	@NotNull
	@Column(name = "qtyinvoiced")
	private BigDecimal qtyinvoiced;
	@Basic(optional = false)
	@NotNull
	@Column(name = "pricelist")
	private BigDecimal pricelist;
	@Basic(optional = false)
	@NotNull
	@Column(name = "priceactual")
	@Expose
	private BigDecimal unitprice;
	@Basic(optional = false)
	@NotNull
	@Column(name = "pricelimit")
	private BigDecimal pricelimit;
	
	@Basic(optional = false)
	@NotNull
	@Column(name = "linenetamt")
	private BigDecimal linenetamt;
	
	@Column(name = "discount")
	private BigDecimal discount;
	@Basic(optional = false)
	@NotNull
	@Column(name = "freightamt")
	private BigDecimal freightamt;
	@Basic(optional = false)
	@NotNull
	@Column(name = "qtyentered")
	private BigDecimal qtyentered;
	@Basic(optional = false)
	@NotNull
	@Column(name = "priceentered")
	private BigDecimal priceentered;
	@Column(name = "pricecost")
	private BigDecimal pricecost;
	@Basic(optional = false)
	@NotNull
	@Column(name = "qtylostsales")
	private BigDecimal qtylostsales;
	/**
	@Column(name = "rrstartdate")
	@Temporal(TemporalType.TIMESTAMP)
	private Date rrstartdate;
	@Column(name = "rramt")
	private BigDecimal rramt;
	@Column(name = "pp_cost_collector_id")
	private Long ppCostCollectorId;
	@Column(name = "istaxincluded")
	private Character istaxincluded;
	@Column(name = "taxamt")
	private BigDecimal taxamt;
	**/
	
	@Column(name = "atl_sourceoffunds_id")
	private Long atlSourceoffundsId;
	@Column(name="c_currency_id")
	private Long currencyId;

	public C_OrderLine() {
	}

	public C_OrderLine(Long cOrderlineId) {
		this.id = cOrderlineId;
	}

	public Long getCOrderlineId() {
		return id;
	}

	public void setCOrderlineId(Long cOrderlineId) {
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

	/**public long getCOrderId() {
		return cOrderId;
	}

	public void setCOrderId(long cOrderId) {
		this.cOrderId = cOrderId;
	}**/

	public long getLine() {
		return line;
	}

	public void setLine(long line) {
		this.line = line;
	}

	public Date getDateordered() {
		return dateordered;
	}

	public void setDateordered(Date dateordered) {
		this.dateordered = dateordered;
	}

	public Date getDatepromised() {
		return datepromised;
	}

	public void setDatepromised(Date datepromised) {
		this.datepromised = datepromised;
	}

	public Date getDatedelivered() {
		return datedelivered;
	}

	public void setDatedelivered(Date datedelivered) {
		this.datedelivered = datedelivered;
	}

	public Date getDateinvoiced() {
		return dateinvoiced;
	}

	public void setDateinvoiced(Date dateinvoiced) {
		this.dateinvoiced = dateinvoiced;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public BigDecimal getQtyordered() {
		return qtyordered;
	}

	public void setQtyordered(BigDecimal qtyordered) {
		this.qtyordered = qtyordered;
	}

	public BigDecimal getQtyreserved() {
		return qtyreserved;
	}

	public void setQtyreserved(BigDecimal qtyreserved) {
		this.qtyreserved = qtyreserved;
	}

	public BigDecimal getQtydelivered() {
		return qtydelivered;
	}

	public void setQtydelivered(BigDecimal qtydelivered) {
		this.qtydelivered = qtydelivered;
	}

	public BigDecimal getQtyinvoiced() {
		return qtyinvoiced;
	}

	public void setQtyinvoiced(BigDecimal qtyinvoiced) {
		this.qtyinvoiced = qtyinvoiced;
	}

	public BigDecimal getPricelist() {
		return pricelist;
	}

	public void setPricelist(BigDecimal pricelist) {
		this.pricelist = pricelist;
	}

	public BigDecimal getPriceactual() {
		return unitprice;
	}

	public void setPriceactual(BigDecimal priceactual) {
		this.unitprice = priceactual;
	}

	public BigDecimal getPricelimit() {
		return pricelimit;
	}

	public void setPricelimit(BigDecimal pricelimit) {
		this.pricelimit = pricelimit;
	}

	public BigDecimal getLinenetamt() {
		return linenetamt;
	}

	public void setLinenetamt(BigDecimal linenetamt) {
		this.linenetamt = linenetamt;
	}

	public BigDecimal getDiscount() {
		return discount;
	}

	public void setDiscount(BigDecimal discount) {
		this.discount = discount;
	}

	public BigDecimal getFreightamt() {
		return freightamt;
	}

	public void setFreightamt(BigDecimal freightamt) {
		this.freightamt = freightamt;
	}

	public BigDecimal getQtyentered() {
		return qtyentered;
	}

	public void setQtyentered(BigDecimal qtyentered) {
		this.qtyentered = qtyentered;
	}

	public BigDecimal getPriceentered() {
		return priceentered;
	}

	public void setPriceentered(BigDecimal priceentered) {
		this.priceentered = priceentered;
	}

	public BigDecimal getPricecost() {
		return pricecost;
	}

	public void setPricecost(BigDecimal pricecost) {
		this.pricecost = pricecost;
	}

	public BigDecimal getQtylostsales() {
		return qtylostsales;
	}

	public void setQtylostsales(BigDecimal qtylostsales) {
		this.qtylostsales = qtylostsales;
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
		if (!(object instanceof C_OrderLine)) {
			return false;
		}
		C_OrderLine other = (C_OrderLine) object;
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

	public void setOrder(C_Order order) {
		this.order = order;
	}

	public C_Order getOrder() {
		return order;
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

	public void setCtaxId(long ctaxId) {
		this.ctaxId = ctaxId;
	}

	public long getCtaxId() {
		return ctaxId;
	}

	public void setWarehouseId(Long warehouseId) {
		this.warehouseId = warehouseId;
	}

	public Long getWarehouseId() {
		return warehouseId;
	}

	public void setCurrencyId(Long currencyId) {
		this.currencyId = currencyId;
	}

	public Long getCurrencyId() {
		return currencyId;
	}

}
