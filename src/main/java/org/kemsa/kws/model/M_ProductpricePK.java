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
public class M_ProductpricePK implements Serializable {
    @Basic(optional = false)
    @NotNull
    @Column(name = "m_pricelist_version_id")
    private long mPricelistVersionId;
    @Basic(optional = false)
    @NotNull
    @Column(name = "m_product_id")
    private long mProductId;

    public M_ProductpricePK() {
    }

    public M_ProductpricePK(long mPricelistVersionId, long mProductId) {
        this.mPricelistVersionId = mPricelistVersionId;
        this.mProductId = mProductId;
    }

    public long getMPricelistVersionId() {
        return mPricelistVersionId;
    }

    public void setMPricelistVersionId(long mPricelistVersionId) {
        this.mPricelistVersionId = mPricelistVersionId;
    }

    public long getMProductId() {
        return mProductId;
    }

    public void setMProductId(long mProductId) {
        this.mProductId = mProductId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (int) mPricelistVersionId;
        hash += (int) mProductId;
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof M_ProductpricePK)) {
            return false;
        }
        M_ProductpricePK other = (M_ProductpricePK) object;
        if (this.mPricelistVersionId != other.mPricelistVersionId) {
            return false;
        }
        if (this.mProductId != other.mProductId) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "org.kemsa.codegenproject.M_ProductpricePK[ mPricelistVersionId=" + mPricelistVersionId + ", mProductId=" + mProductId + " ]";
    }
    
}
