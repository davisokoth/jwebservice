package org.kemsa.kws.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.persistence.FetchType;

import org.hibernate.annotations.Cascade;
import org.hibernate.annotations.LazyCollection;
import org.hibernate.annotations.LazyCollectionOption;
import com.google.gson.annotations.Expose;


@Entity
@Table(name = "lmis_orderdata")
public class LMIS_OrderData implements Serializable {
	
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
	private long cBpartnerLocationId;
	
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
	private char issotrx;
	
	@Basic(optional = false)
	@NotNull
	@Size(min = 1, max = 30)
	@Column(name = "bookingno")
	@Expose
	private String bookingno;

	@Basic(optional = false)
	@NotNull
	@Size(min = 1, max = 30)
	@Column(name = "documentno")
	@Expose
	private String documentno;

	@Basic(optional = false)
	@NotNull
	@Size(min = 1, max = 30)
	@Column(name = "orderno")
	@Expose
	private String orderno;

	@Basic(optional = false)
	@NotNull
	@Size(min = 1, max = 3)
	@Column(name = "ordertype")
	@Expose
	private String ordertype;

	@Basic(optional = false)
	@NotNull
	@Size(min = 1, max = 30)
	@Column(name = "deliverynote")
	@Expose
	private String deliverynote;

	@Basic(optional = false)
	@NotNull
	@Size(min = 1, max = 2)
	@Column(name = "status")
	@Expose
	private String status;
	
	@Column(name = "ispaidbythirdparty")
	@Expose
	private Character ispaidbythirdparty;
	
	@Column(name="lmis_batch_id")
	private Long lmisBatchId ;
	
	@Column(name="m_warehouse_id")
	private Long mWarehouseId ;
	
	@Column(name="m_inout_id")
	private Long mInoutId ;
	
	@Column(name="m_pricelist_id")
	private Long mPricelistId ;
	
	@Column(name="a1_ordercounty_id")
	private Long a1ordercountyId ;
	
	@Column(name="atl_county_id")
	private Long atlCountyId ;
	
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
	@Column(name = "dnotedate")
	@Temporal(TemporalType.TIMESTAMP)
	@Expose
	private Date dnotedate;	
	
	@Basic(optional = false)
	@NotNull
	@Column(name = "orderamt")
	@Expose
	private BigDecimal orderamt;
	
	@OneToMany(fetch = FetchType.LAZY)
	@LazyCollection(LazyCollectionOption.FALSE)
	@Cascade((org.hibernate.annotations.CascadeType.ALL))
	@JoinColumn(name = "c_order_id")
	@Expose
	private List<C_OrderLine> lineitems;
	
	public LMIS_OrderData() {
	}

	public LMIS_OrderData(Long cOrderId) {
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

	public long getAdorgId() {
		return adOrgId;
	}

	public void setAdOrgId(long adOrgId) {
		this.adOrgId = adOrgId;
	}

	public long getLmisBatchId() {
		return lmisBatchId;
	}

	public void setLmisBatchId(long lmisBatchId) {
		this.lmisBatchId = lmisBatchId;
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

	public String getBookingno() {
		return bookingno;
	}

	public void setBookingno(String bookingno) {
		this.bookingno = bookingno;
	}

	public String getOrderno() {
		return orderno;
	}

	public void setOrderno(String orderno) {
		this.orderno = orderno;
	}

	public String getDeliverynote() {
		return deliverynote;
	}

	public void setDeliverynote(String deliverynote) {
		this.deliverynote = deliverynote;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getOrdertype() {
		return ordertype;
	}

	public void setOrdertype(String ordertype) {
		this.ordertype = ordertype;
	}

	public Character isPaidByThirdParty() {
		return ispaidbythirdparty;
	}

	public void setIsPaidByThirdParty(Character ispaidbythirdparty) {
		this.ispaidbythirdparty = ispaidbythirdparty;
	}

	public long getMWarehouseId() {
		return mWarehouseId;
	}

	public void setMWarehouseId(long mWarehouseId) {
		this.mWarehouseId = mWarehouseId;
	}

	public long getMPricelistId() {
		return mPricelistId;
	}

	public void setMPricelistId(long mPricelistId) {
		this.mPricelistId = mPricelistId;
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

	public Date getDnotedate() {
		return dnotedate;
	}

	public void setDnotedate(Date dnotedate) {
		this.dnotedate = dnotedate;
	}

	public long getA1orderCountyId() {
		return a1ordercountyId;
	}

	public void setA1ordercountyId(long a1ordercountyId) {
		this.a1ordercountyId = a1ordercountyId;
	}

	public long getAtlCountyId() {
		return atlCountyId;
	}

	public void setAtlCountyId(long atlCountyId) {
		this.atlCountyId = atlCountyId;
	}

	public long getMinoutId() {
		return mInoutId;
	}

	public void setMinoutId(long mInoutId) {
		this.mInoutId = mInoutId;
	}

	public long getCBpartnerLocationId() {
		return cBpartnerLocationId;
	}

	public void setCbpartnerLocationId(long cBpartnerLocationId) {
		this.cBpartnerLocationId = cBpartnerLocationId;
	}

	public long getCbpartnerId() {
		return cBpartnerId;
	}

	public void setCbpartnerId(long cBpartnerId) {
		this.cBpartnerId = cBpartnerId;
	}

	public BigDecimal getOrderamt() {
		return orderamt;
	}

	public void setCbpartnerId(BigDecimal orderamt) {
		this.orderamt = orderamt;
	}

}
