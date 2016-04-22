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
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

import com.google.gson.annotations.Expose;

/**
 * 
 * @author laban
 */
@Entity
@Table(name = "m_warehouse")
public class M_Warehouse implements Serializable {
	private static final long serialVersionUID = 1L;
	@Id
	@Basic(optional = false)
	@NotNull
	@Column(name = "m_warehouse_id")
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
	@Size(min = 1, max = 60)
	@Column(name = "name")
	@Expose
	private String name;
	@Size(max = 255)
	@Column(name = "description")
	private String description;
	@Basic(optional = false)
	@NotNull
	@Column(name = "separator")
	private char separator;
	@Size(max = 60)
	@Column(name = "replenishmentclass")
	private String replenishmentclass;
	@Column(name = "isintransit")
	private Character isintransit;
	@Column(name = "iswms")
	private Character iswms;
	@Column(name = "isdisnegativeinventory")
	private Character isdisnegativeinventory;
	/**
	@Column(name = "issynch")
	private Character issynch;
	
	@Size(max = 255)
	@Column(name = "warehouseip")
	private String warehouseip;
	
	@Size(max = 50)
	@Column(name = "username")
	private String username;
	@Size(max = 50)
	@Column(name = "password")
	private String password;
	**/
	
	@Size(max = 3)
	@Column(name = "pickingrule")
	private String pickingrule;
	@Size(max = 3)
	@Column(name = "putawayrule")
	private String putawayrule;
	@Column(name = "synchdate")
	@Temporal(TemporalType.TIMESTAMP)
	private Date synchdate;
	@Column(name = "cssynchdate")
	@Temporal(TemporalType.TIMESTAMP)
	private Date cssynchdate;
	@OneToMany(mappedBy = "mWarehousesourceId")
	private List<M_Warehouse> mWarehouseList;
	@JoinColumn(name = "m_warehousesource_id", referencedColumnName = "m_warehouse_id")
	@ManyToOne
	private M_Warehouse mWarehousesourceId;

	public M_Warehouse() {
	}

	public M_Warehouse(Long mWarehouseId) {
		this.id = mWarehouseId;
	}

	public M_Warehouse(Long mWarehouseId, char isactive, Date created,
			long createdby, Date updated, long updatedby, String value,
			String name, char separator) {
		this.id = mWarehouseId;
		this.isactive = isactive;
		this.created = created;
		this.createdby = createdby;
		this.updated = updated;
		this.updatedby = updatedby;
		this.code = value;
		this.name = name;
		this.separator = separator;
	}

	public Long getMWarehouseId() {
		return id;
	}

	public void setMWarehouseId(Long mWarehouseId) {
		this.id = mWarehouseId;
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

	public char getSeparator() {
		return separator;
	}

	public void setSeparator(char separator) {
		this.separator = separator;
	}

	public String getReplenishmentclass() {
		return replenishmentclass;
	}

	public void setReplenishmentclass(String replenishmentclass) {
		this.replenishmentclass = replenishmentclass;
	}

	public Character getIsintransit() {
		return isintransit;
	}

	public void setIsintransit(Character isintransit) {
		this.isintransit = isintransit;
	}

	public Character getIswms() {
		return iswms;
	}

	public void setIswms(Character iswms) {
		this.iswms = iswms;
	}

	public Character getIsdisnegativeinventory() {
		return isdisnegativeinventory;
	}

	public void setIsdisnegativeinventory(Character isdisnegativeinventory) {
		this.isdisnegativeinventory = isdisnegativeinventory;
	}

	/**
	public Character getIssynch() {
		return issynch;
	}

	public void setIssynch(Character issynch) {
		this.issynch = issynch;
	}
	

	public String getWarehouseip() {
		return warehouseip;
	}

	public void setWarehouseip(String warehouseip) {
		this.warehouseip = warehouseip;
	}

	
	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	**/

	public String getPickingrule() {
		return pickingrule;
	}

	public void setPickingrule(String pickingrule) {
		this.pickingrule = pickingrule;
	}

	public String getPutawayrule() {
		return putawayrule;
	}

	public void setPutawayrule(String putawayrule) {
		this.putawayrule = putawayrule;
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

	@XmlTransient
	public List<M_Warehouse> getMWarehouseList() {
		return mWarehouseList;
	}

	public void setMWarehouseList(List<M_Warehouse> mWarehouseList) {
		this.mWarehouseList = mWarehouseList;
	}

	public M_Warehouse getMWarehousesourceId() {
		return mWarehousesourceId;
	}

	public void setMWarehousesourceId(M_Warehouse mWarehousesourceId) {
		this.mWarehousesourceId = mWarehousesourceId;
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
		if (!(object instanceof M_Warehouse)) {
			return false;
		}
		M_Warehouse other = (M_Warehouse) object;
		if ((this.id == null && other.id != null)
				|| (this.id != null && !this.id
						.equals(other.id))) {
			return false;
		}
		return true;
	}

	@Override
	public String toString() {
		return "org.kemsa.codegenproject.MWarehouse[ mWarehouseId="
				+ id + " ]";
	}

}
