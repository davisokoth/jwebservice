/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.kemsa.kws.model;

import java.io.Serializable;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.validation.constraints.NotNull;

/**
 *
 * @author laban
 */
@Embeddable
public class MStoragePK implements Serializable {
    @Basic(optional = false)
    @NotNull
    @Column(name = "m_product_id")
    private long mProductId;
    @Basic(optional = false)
    @NotNull
    @Column(name = "m_locator_id")
    private long mLocatorId;
    @Basic(optional = false)
    @NotNull
    @Column(name = "m_attributesetinstance_id")
    private long mAttributesetinstanceId;

    public MStoragePK() {
    }

    public MStoragePK(long mProductId, long mLocatorId, long mAttributesetinstanceId) {
        this.mProductId = mProductId;
        this.mLocatorId = mLocatorId;
        this.mAttributesetinstanceId = mAttributesetinstanceId;
    }

    public long getMProductId() {
        return mProductId;
    }

    public void setMProductId(long mProductId) {
        this.mProductId = mProductId;
    }

    public long getMLocatorId() {
        return mLocatorId;
    }

    public void setMLocatorId(long mLocatorId) {
        this.mLocatorId = mLocatorId;
    }

    public long getMAttributesetinstanceId() {
        return mAttributesetinstanceId;
    }

    public void setMAttributesetinstanceId(long mAttributesetinstanceId) {
        this.mAttributesetinstanceId = mAttributesetinstanceId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (int) mProductId;
        hash += (int) mLocatorId;
        hash += (int) mAttributesetinstanceId;
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof MStoragePK)) {
            return false;
        }
        MStoragePK other = (MStoragePK) object;
        if (this.mProductId != other.mProductId) {
            return false;
        }
        if (this.mLocatorId != other.mLocatorId) {
            return false;
        }
        if (this.mAttributesetinstanceId != other.mAttributesetinstanceId) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "org.kemsa.codegenproject.MStoragePK[ mProductId=" + mProductId + ", mLocatorId=" + mLocatorId + ", mAttributesetinstanceId=" + mAttributesetinstanceId + " ]";
    }
    
}
