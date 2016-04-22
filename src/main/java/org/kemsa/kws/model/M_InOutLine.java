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
 * @author laban
 */
@Entity
@Table(name = "m_inoutline")
public class M_InOutLine implements Serializable {
	private static final long serialVersionUID = 1L;
	@Id
	@Basic(optional = false)
	@NotNull
	@Column(name = "m_inoutline_id")
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
	
	@ManyToOne
	@JoinColumn(name = "m_product_id", nullable = false)
	@Expose
	private M_Product product;

	@Basic(optional = false)
	@NotNull
	@Column(name = "c_uom_id")
	private long cuomId;
	
	@Column(name = "description")
	@Expose
	private String description;
	@Basic(optional = false)
	@NotNull
	@Column(name = "qtyentered")
	@Expose
	private BigDecimal qtyordered;
	@Basic(optional = false)
	@NotNull
	@Column(name = "movementqty")
	private BigDecimal movementqty;	

	public M_InOutLine() {
	}

	public M_InOutLine(Long cOrderlineId) {
		this.id = cOrderlineId;
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
	 * @return the line
	 */
	public long getLine() {
		return line;
	}

	/**
	 * @param line the line to set
	 */
	public void setLine(long line) {
		this.line = line;
	}

	/**
	 * @return the product
	 */
	public M_Product getProduct() {
		return product;
	}

	/**
	 * @param product the product to set
	 */
	public void setProduct(M_Product product) {
		this.product = product;
	}

	/**
	 * @return the cuomId
	 */
	public long getCuomId() {
		return cuomId;
	}

	/**
	 * @param cuomId the cuomId to set
	 */
	public void setCuomId(long cuomId) {
		this.cuomId = cuomId;
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
	 * @return the qtyordered
	 */
	public BigDecimal getQtyordered() {
		return qtyordered;
	}

	/**
	 * @param qtyordered the qtyordered to set
	 */
	public void setQtyordered(BigDecimal qtyordered) {
		this.qtyordered = qtyordered;
	}

	/**
	 * @return the movementqty
	 */
	public BigDecimal getMovementqty() {
		return movementqty;
	}

	/**
	 * @param movementqty the movementqty to set
	 */
	public void setMovementqty(BigDecimal movementqty) {
		this.movementqty = movementqty;
	}
	
}
