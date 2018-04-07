package com.test.model;

import org.hibernate.annotations.NaturalId;

import javax.persistence.*;

@Entity
@Table(name = "fund_detail")
public class FundDetail extends BaseEntity {

    @Id
    @GeneratedValue
    long id;

    @NaturalId
    @Column(name = "mstar_id", nullable = false)
    String mStarID;

    @Column(name = "isin")
    String isin;

    @Column(name="fund_house", nullable = false)
    String fundHouse;

    @Column(name="product_risk")
    String productRisk;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getmStarID() {
        return mStarID;
    }

    public void setmStarID(String mStarID) {
        this.mStarID = mStarID;
    }

    public String getIsin() {
        return isin;
    }

    public void setIsin(String isin) {
        this.isin = isin;
    }

    public String getFundHouse() {
        return fundHouse;
    }

    public void setFundHouse(String fundHouse) {
        this.fundHouse = fundHouse;
    }

    public String getProductRisk() {
        return productRisk;
    }

    public void setProductRisk(String productRisk) {
        this.productRisk = productRisk;
    }
}
