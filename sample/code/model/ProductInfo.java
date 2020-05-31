package sample.code.model;

import java.sql.Timestamp;

//POJO
public class ProductInfo {

    private String productId;
    private int categoryType;
    private Timestamp createTime;
    private String productIcon;
    private float productPrice;

    public ProductInfo(String productId, int categoryType, Timestamp createTime, String productIcon, float productPrice) {
        this.productId = productId;
        this.categoryType = categoryType;
        this.createTime = createTime;
        this.productIcon = productIcon;
        this.productPrice = productPrice;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    public void setCategoryType(int categoryType) {
        this.categoryType = categoryType;
    }

    public void setCreateTime(Timestamp createTime) {
        this.createTime = createTime;
    }

    public void setProductIcon(String productIcon) {
        this.productIcon = productIcon;
    }

    public void setProductPrice(float productPrice) {
        this.productPrice = productPrice;
    }

    public String getProductId() {
        return productId;
    }

    public int getCategoryType() {
        return categoryType;
    }

    public Timestamp getCreateTime() {
        return createTime;
    }

    public String getProductIcon() {
        return productIcon;
    }

    public float getProductPrice() {
        return productPrice;
    }

    @Override
    public String toString() {
        return "ProductInfo{" +
                "productId='" + productId + '\'' +
                ", categoryType=" + categoryType +
                ", createTime=" + createTime +
                ", productIcon='" + productIcon + '\'' +
                ", productPrice=" + productPrice +
                '}';
    }
}
