package com.android4dev.navigationview.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;
import java.util.List;

import okhttp3.internal.framed.Variant;

/**
 * Created by TheAppExperts on 14/10/2016.
 */

public class ProductDetailsResults {

    @SerializedName("BasePrice")
    @Expose
    private Double basePrice;
    @SerializedName("Brand")
    @Expose
    private String brand;
    @SerializedName("Colour")
    @Expose
    private Object colour;
    @SerializedName("CurrentPrice")
    @Expose
    private String currentPrice;
    @SerializedName("InStock")
    @Expose
    private Boolean inStock;
    @SerializedName("IsInSet")
    @Expose
    private Boolean isInSet;
    @SerializedName("PreviousPrice")
    @Expose
    private String previousPrice;
    @SerializedName("PriceType")
    @Expose
    private String priceType;
    @SerializedName("ProductId")
    @Expose
    private Integer productId;
    @SerializedName("ProductImageUrls")
    @Expose
    private List<String> productImageUrls = new ArrayList<String>();
    @SerializedName("RRP")
    @Expose
    private String rRP;
    @SerializedName("Size")
    @Expose
    private Object size;
    @SerializedName("Sku")
    @Expose
    private String sku;
    @SerializedName("Title")
    @Expose
    private String title;
    @SerializedName("AdditionalInfo")
    @Expose
    private String additionalInfo;
    @SerializedName("AssociatedProducts")
    @Expose
    private List<AssociatedProduct> associatedProducts = new ArrayList<AssociatedProduct>();
    @SerializedName("CareInfo")
    @Expose
    private String careInfo;
    @SerializedName("Description")
    @Expose
    private String description;
    @SerializedName("Variants")
    @Expose
    private List<Variant> variants = new ArrayList<Variant>();

    /**
     *
     * @return
     * The basePrice
     */
    public Double getBasePrice() {
        return basePrice;
    }

    /**
     *
     * @param basePrice
     * The BasePrice
     */
    public void setBasePrice(Double basePrice) {
        this.basePrice = basePrice;
    }

    /**
     *
     * @return
     * The brand
     */
    public String getBrand() {
        return brand;
    }

    /**
     *
     * @param brand
     * The Brand
     */
    public void setBrand(String brand) {
        this.brand = brand;
    }

    /**
     *
     * @return
     * The colour
     */
    public Object getColour() {
        return colour;
    }

    /**
     *
     * @param colour
     * The Colour
     */
    public void setColour(Object colour) {
        this.colour = colour;
    }

    /**
     *
     * @return
     * The currentPrice
     */
    public String getCurrentPrice() {
        return currentPrice;
    }

    /**
     *
     * @param currentPrice
     * The CurrentPrice
     */
    public void setCurrentPrice(String currentPrice) {
        this.currentPrice = currentPrice;
    }

    /**
     *
     * @return
     * The inStock
     */
    public Boolean getInStock() {
        return inStock;
    }

    /**
     *
     * @param inStock
     * The InStock
     */
    public void setInStock(Boolean inStock) {
        this.inStock = inStock;
    }

    /**
     *
     * @return
     * The isInSet
     */
    public Boolean getIsInSet() {
        return isInSet;
    }

    /**
     *
     * @param isInSet
     * The IsInSet
     */
    public void setIsInSet(Boolean isInSet) {
        this.isInSet = isInSet;
    }

    /**
     *
     * @return
     * The previousPrice
     */
    public String getPreviousPrice() {
        return previousPrice;
    }

    /**
     *
     * @param previousPrice
     * The PreviousPrice
     */
    public void setPreviousPrice(String previousPrice) {
        this.previousPrice = previousPrice;
    }

    /**
     *
     * @return
     * The priceType
     */
    public String getPriceType() {
        return priceType;
    }

    /**
     *
     * @param priceType
     * The PriceType
     */
    public void setPriceType(String priceType) {
        this.priceType = priceType;
    }

    /**
     *
     * @return
     * The productId
     */
    public Integer getProductId() {
        return productId;
    }

    /**
     *
     * @param productId
     * The ProductId
     */
    public void setProductId(Integer productId) {
        this.productId = productId;
    }

    /**
     *
     * @return
     * The productImageUrls
     */
    public List<String> getProductImageUrls() {
        return productImageUrls;
    }

    /**
     *
     * @param productImageUrls
     * The ProductImageUrls
     */
    public void setProductImageUrls(List<String> productImageUrls) {
        this.productImageUrls = productImageUrls;
    }

    /**
     *
     * @return
     * The rRP
     */
    public String getRRP() {
        return rRP;
    }

    /**
     *
     * @param rRP
     * The RRP
     */
    public void setRRP(String rRP) {
        this.rRP = rRP;
    }

    /**
     *
     * @return
     * The size
     */
    public Object getSize() {
        return size;
    }

    /**
     *
     * @param size
     * The Size
     */
    public void setSize(Object size) {
        this.size = size;
    }

    /**
     *
     * @return
     * The sku
     */
    public String getSku() {
        return sku;
    }

    /**
     *
     * @param sku
     * The Sku
     */
    public void setSku(String sku) {
        this.sku = sku;
    }

    /**
     *
     * @return
     * The title
     */
    public String getTitle() {
        return title;
    }

    /**
     *
     * @param title
     * The Title
     */
    public void setTitle(String title) {
        this.title = title;
    }

    /**
     *
     * @return
     * The additionalInfo
     */
    public String getAdditionalInfo() {
        return additionalInfo;
    }

    /**
     *
     * @param additionalInfo
     * The AdditionalInfo
     */
    public void setAdditionalInfo(String additionalInfo) {
        this.additionalInfo = additionalInfo;
    }

    /**
     *
     * @return
     * The associatedProducts
     */
    public List<AssociatedProduct> getAssociatedProducts() {
        return associatedProducts;
    }

    /**
     *
     * @param associatedProducts
     * The AssociatedProducts
     */
    public void setAssociatedProducts(List<AssociatedProduct> associatedProducts) {
        this.associatedProducts = associatedProducts;
    }

    /**
     *
     * @return
     * The careInfo
     */
    public String getCareInfo() {
        return careInfo;
    }

    /**
     *
     * @param careInfo
     * The CareInfo
     */
    public void setCareInfo(String careInfo) {
        this.careInfo = careInfo;
    }

    /**
     *
     * @return
     * The description
     */
    public String getDescription() {
        return description;
    }

    /**
     *
     * @param description
     * The Description
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     *
     * @return
     * The variants
     */
    public List<Variant> getVariants() {
        return variants;
    }

    /**
     *
     * @param variants
     * The Variants
     */
    public void setVariants(List<Variant> variants) {
        this.variants = variants;
    }


public class AssociatedProduct {

    @SerializedName("BasePrice")
    @Expose
    private Double basePrice;
    @SerializedName("Brand")
    @Expose
    private String brand;
    @SerializedName("Colour")
    @Expose
    private Object colour;
    @SerializedName("CurrentPrice")
    @Expose
    private String currentPrice;
    @SerializedName("InStock")
    @Expose
    private Boolean inStock;
    @SerializedName("IsInSet")
    @Expose
    private Boolean isInSet;
    @SerializedName("PreviousPrice")
    @Expose
    private String previousPrice;
    @SerializedName("PriceType")
    @Expose
    private String priceType;
    @SerializedName("ProductId")
    @Expose
    private Integer productId;
    @SerializedName("ProductImageUrls")
    @Expose
    private List<String> productImageUrls = new ArrayList<String>();
    @SerializedName("RRP")
    @Expose
    private String rRP;
    @SerializedName("Size")
    @Expose
    private Object size;
    @SerializedName("Sku")
    @Expose
    private Object sku;
    @SerializedName("Title")
    @Expose
    private String title;
    @SerializedName("ProductType")
    @Expose
    private String productType;

    /**
     *
     * @return
     * The basePrice
     */
    public Double getBasePrice() {
        return basePrice;
    }

    /**
     *
     * @param basePrice
     * The BasePrice
     */
    public void setBasePrice(Double basePrice) {
        this.basePrice = basePrice;
    }

    /**
     *
     * @return
     * The brand
     */
    public String getBrand() {
        return brand;
    }

    /**
     *
     * @param brand
     * The Brand
     */
    public void setBrand(String brand) {
        this.brand = brand;
    }

    /**
     *
     * @return
     * The colour
     */
    public Object getColour() {
        return colour;
    }

    /**
     *
     * @param colour
     * The Colour
     */
    public void setColour(Object colour) {
        this.colour = colour;
    }

    /**
     *
     * @return
     * The currentPrice
     */
    public String getCurrentPrice() {
        return currentPrice;
    }

    /**
     *
     * @param currentPrice
     * The CurrentPrice
     */
    public void setCurrentPrice(String currentPrice) {
        this.currentPrice = currentPrice;
    }

    /**
     *
     * @return
     * The inStock
     */
    public Boolean getInStock() {
        return inStock;
    }

    /**
     *
     * @param inStock
     * The InStock
     */
    public void setInStock(Boolean inStock) {
        this.inStock = inStock;
    }

    /**
     *
     * @return
     * The isInSet
     */
    public Boolean getIsInSet() {
        return isInSet;
    }

    /**
     *
     * @param isInSet
     * The IsInSet
     */
    public void setIsInSet(Boolean isInSet) {
        this.isInSet = isInSet;
    }

    /**
     *
     * @return
     * The previousPrice
     */
    public String getPreviousPrice() {
        return previousPrice;
    }

    /**
     *
     * @param previousPrice
     * The PreviousPrice
     */
    public void setPreviousPrice(String previousPrice) {
        this.previousPrice = previousPrice;
    }

    /**
     *
     * @return
     * The priceType
     */
    public String getPriceType() {
        return priceType;
    }

    /**
     *
     * @param priceType
     * The PriceType
     */
    public void setPriceType(String priceType) {
        this.priceType = priceType;
    }

    /**
     *
     * @return
     * The productId
     */
    public Integer getProductId() {
        return productId;
    }

    /**
     *
     * @param productId
     * The ProductId
     */
    public void setProductId(Integer productId) {
        this.productId = productId;
    }

    /**
     *
     * @return
     * The productImageUrls
     */
    public List<String> getProductImageUrls() {
        return productImageUrls;
    }

    /**
     *
     * @param productImageUrls
     * The ProductImageUrls
     */
    public void setProductImageUrls(List<String> productImageUrls) {
        this.productImageUrls = productImageUrls;
    }

    /**
     *
     * @return
     * The rRP
     */
    public String getRRP() {
        return rRP;
    }

    /**
     *
     * @param rRP
     * The RRP
     */
    public void setRRP(String rRP) {
        this.rRP = rRP;
    }

    /**
     *
     * @return
     * The size
     */
    public Object getSize() {
        return size;
    }

    /**
     *
     * @param size
     * The Size
     */
    public void setSize(Object size) {
        this.size = size;
    }

    /**
     *
     * @return
     * The sku
     */
    public Object getSku() {
        return sku;
    }

    /**
     *
     * @param sku
     * The Sku
     */
    public void setSku(Object sku) {
        this.sku = sku;
    }

    /**
     *
     * @return
     * The title
     */
    public String getTitle() {
        return title;
    }

    /**
     *
     * @param title
     * The Title
     */
    public void setTitle(String title) {
        this.title = title;
    }

    /**
     *
     * @return
     * The productType
     */
    public String getProductType() {
        return productType;
    }

    /**
     *
     * @param productType
     * The ProductType
     */
    public void setProductType(String productType) {
        this.productType = productType;
    }


public class Variant {

    @SerializedName("BasePrice")
    @Expose
    private Double basePrice;
    @SerializedName("Brand")
    @Expose
    private Object brand;
    @SerializedName("Colour")
    @Expose
    private String colour;
    @SerializedName("CurrentPrice")
    @Expose
    private String currentPrice;
    @SerializedName("InStock")
    @Expose
    private Boolean inStock;
    @SerializedName("IsInSet")
    @Expose
    private Boolean isInSet;
    @SerializedName("PreviousPrice")
    @Expose
    private String previousPrice;
    @SerializedName("PriceType")
    @Expose
    private String priceType;
    @SerializedName("ProductId")
    @Expose
    private Integer productId;
    @SerializedName("ProductImageUrls")
    @Expose
    private List<String> productImageUrls = new ArrayList<String>();
    @SerializedName("RRP")
    @Expose
    private String rRP;
    @SerializedName("Size")
    @Expose
    private String size;
    @SerializedName("Sku")
    @Expose
    private Object sku;
    @SerializedName("Title")
    @Expose
    private Object title;

    /**
     *
     * @return
     * The basePrice
     */
    public Double getBasePrice() {
        return basePrice;
    }

    /**
     *
     * @param basePrice
     * The BasePrice
     */
    public void setBasePrice(Double basePrice) {
        this.basePrice = basePrice;
    }

    /**
     *
     * @return
     * The brand
     */
    public Object getBrand() {
        return brand;
    }

    /**
     *
     * @param brand
     * The Brand
     */
    public void setBrand(Object brand) {
        this.brand = brand;
    }

    /**
     *
     * @return
     * The colour
     */
    public String getColour() {
        return colour;
    }

    /**
     *
     * @param colour
     * The Colour
     */
    public void setColour(String colour) {
        this.colour = colour;
    }

    /**
     *
     * @return
     * The currentPrice
     */
    public String getCurrentPrice() {
        return currentPrice;
    }

    /**
     *
     * @param currentPrice
     * The CurrentPrice
     */
    public void setCurrentPrice(String currentPrice) {
        this.currentPrice = currentPrice;
    }

    /**
     *
     * @return
     * The inStock
     */
    public Boolean getInStock() {
        return inStock;
    }

    /**
     *
     * @param inStock
     * The InStock
     */
    public void setInStock(Boolean inStock) {
        this.inStock = inStock;
    }

    /**
     *
     * @return
     * The isInSet
     */
    public Boolean getIsInSet() {
        return isInSet;
    }

    /**
     *
     * @param isInSet
     * The IsInSet
     */
    public void setIsInSet(Boolean isInSet) {
        this.isInSet = isInSet;
    }

    /**
     *
     * @return
     * The previousPrice
     */
    public String getPreviousPrice() {
        return previousPrice;
    }

    /**
     *
     * @param previousPrice
     * The PreviousPrice
     */
    public void setPreviousPrice(String previousPrice) {
        this.previousPrice = previousPrice;
    }

    /**
     *
     * @return
     * The priceType
     */
    public String getPriceType() {
        return priceType;
    }

    /**
     *
     * @param priceType
     * The PriceType
     */
    public void setPriceType(String priceType) {
        this.priceType = priceType;
    }

    /**
     *
     * @return
     * The productId
     */
    public Integer getProductId() {
        return productId;
    }

    /**
     *
     * @param productId
     * The ProductId
     */
    public void setProductId(Integer productId) {
        this.productId = productId;
    }

    /**
     *
     * @return
     * The productImageUrls
     */
    public List<String> getProductImageUrls() {
        return productImageUrls;
    }

    /**
     *
     * @param productImageUrls
     * The ProductImageUrls
     */
    public void setProductImageUrls(List<String> productImageUrls) {
        this.productImageUrls = productImageUrls;
    }

    /**
     *
     * @return
     * The rRP
     */
    public String getRRP() {
        return rRP;
    }

    /**
     *
     * @param rRP
     * The RRP
     */
    public void setRRP(String rRP) {
        this.rRP = rRP;
    }

    /**
     *
     * @return
     * The size
     */
    public String getSize() {
        return size;
    }

    /**
     *
     * @param size
     * The Size
     */
    public void setSize(String size) {
        this.size = size;
    }

    /**
     *
     * @return
     * The sku
     */
    public Object getSku() {
        return sku;
    }

    /**
     *
     * @param sku
     * The Sku
     */
    public void setSku(Object sku) {
        this.sku = sku;
    }

    /**
     *
     * @return
     * The title
     */
    public Object getTitle() {
        return title;
    }

    /**
     *
     * @param title
     * The Title
     */
    public void setTitle(Object title) {
        this.title = title;
    }

}}}