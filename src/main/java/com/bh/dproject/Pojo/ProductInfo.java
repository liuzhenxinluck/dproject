package com.bh.dproject.Pojo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.TimerTask;
//实体类
@Entity
@Table(name="product_info")
public class ProductInfo {
        @Id //主键 必须要写
        @Column(name = "product_id")
        private  String   productid;
        @Column(name = "product_name")
        private  String    productname;
        @Column(name = "product_price")
        private  Integer  productprice;
        @Column(name = "product_stock")
        private  BigDecimal productstock;
        @Column(name = "product_description")
        private  String productdescription;
        @Column(name = "product_icon")
        private  String producticon;
        @Column(name = "product_status")
        private  Integer productstatus;
        @Column(name = "category_type")
        private  Integer categorytype;
        @Column(name = "create_time")
        private  Timestamp createtime;
        @Column(name = "update_time")
        private  Timestamp updatetime;

    public String getProductid() {
        return productid;
    }

    public void setProductid(String productid) {
        this.productid = productid;
    }

    public String getProductname() {
        return productname;
    }

    public void setProductname(String productname) {
        this.productname = productname;
    }

    public Integer getProductprice() {
        return productprice;
    }

    public void setProductprice(Integer productprice) {
        this.productprice = productprice;
    }

    public BigDecimal getProductstock() {
        return productstock;
    }

    public void setProductstock(BigDecimal productstock) {
        this.productstock = productstock;
    }

    public String getProductdescription() {
        return productdescription;
    }

    public void setProductdescription(String productdescription) {
        this.productdescription = productdescription;
    }

    public String getProducticon() {
        return producticon;
    }

    public void setProducticon(String producticon) {
        this.producticon = producticon;
    }

    public Integer getProductstatus() {
        return productstatus;
    }

    public void setProductstatus(Integer productstatus) {
        this.productstatus = productstatus;
    }

    public Integer getCategorytype() {
        return categorytype;
    }

    public void setCategorytype(Integer categorytype) {
        this.categorytype = categorytype;
    }

    public Timestamp getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Timestamp createtim) {
        this.createtime = createtim;
    }

    public Timestamp getUpdatetime() {
        return updatetime;
    }

    public void setUpdatetime(Timestamp updatetime) {
        this.updatetime = updatetime;
    }
}
