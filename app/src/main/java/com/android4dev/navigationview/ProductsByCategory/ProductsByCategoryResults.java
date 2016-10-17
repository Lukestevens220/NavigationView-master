package com.android4dev.navigationview.ProductsByCategory;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by TheAppExperts on 14/10/2016.
 */

public class ProductsByCategoryResults {

    @SerializedName("AlsoSearched")
    @Expose
    private List<Object> alsoSearched = new ArrayList<Object>();
    @SerializedName("Description")
    @Expose
    private String description;
    @SerializedName("Facets")
    @Expose
    private List<Listing.Facet> facets = new ArrayList<Listing.Facet>();
    @SerializedName("ItemCount")
    @Expose
    private Integer itemCount;
    @SerializedName("Listings")
    @Expose
    private List<Listing> listings = new ArrayList<Listing>();
    @SerializedName("RedirectUrl")
    @Expose
    private String redirectUrl;
    @SerializedName("SortType")
    @Expose
    private String sortType;

    /**
     *
     * @return
     * The alsoSearched
     */
    public List<Object> getAlsoSearched() {
        return alsoSearched;
    }

    /**
     *
     * @param alsoSearched
     * The AlsoSearched
     */
    public void setAlsoSearched(List<Object> alsoSearched) {
        this.alsoSearched = alsoSearched;
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
     * The facets
     */
    public List<Listing.Facet> getFacets() {
        return facets;
    }

    /**
     *
     * @param facets
     * The Facets
     */
    public void setFacets(List<Listing.Facet> facets) {
        this.facets = facets;
    }

    /**
     *
     * @return
     * The itemCount
     */
    public Integer getItemCount() {
        return itemCount;
    }

    /**
     *
     * @param itemCount
     * The ItemCount
     */
    public void setItemCount(Integer itemCount) {
        this.itemCount = itemCount;
    }

    /**
     *
     * @return
     * The listings
     */
    public List<Listing> getListings() {
        return listings;
    }

    /**
     *
     * @param listings
     * The Listings
     */
    public void setListings(List<Listing> listings) {
        this.listings = listings;
    }

    /**
     *
     * @return
     * The redirectUrl
     */
    public String getRedirectUrl() {
        return redirectUrl;
    }

    /**
     *
     * @param redirectUrl
     * The RedirectUrl
     */
    public void setRedirectUrl(String redirectUrl) {
        this.redirectUrl = redirectUrl;
    }

    /**
     *
     * @return
     * The sortType
     */
    public String getSortType() {
        return sortType;
    }

    /**
     *
     * @param sortType
     * The SortType
     */
    public void setSortType(String sortType) {
        this.sortType = sortType;
    }


    public class Listing {

        @SerializedName("BasePrice")
        @Expose
        private Double basePrice;
        @SerializedName("Brand")
        @Expose
        private String brand;
        @SerializedName("CurrentPrice")
        @Expose
        private String currentPrice;
        @SerializedName("HasMoreColours")
        @Expose
        private Boolean hasMoreColours;
        @SerializedName("IsInSet")
        @Expose
        private Boolean isInSet;
        @SerializedName("PreviousPrice")
        @Expose
        private String previousPrice;
        @SerializedName("ProductId")
        @Expose
        private Integer productId;
        @SerializedName("ProductImageUrl")
        @Expose
        private List<String> productImageUrl = new ArrayList<String>();
        @SerializedName("RRP")
        @Expose
        private String rRP;
        @SerializedName("Title")
        @Expose
        private String title;

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
         * The hasMoreColours
         */
        public Boolean getHasMoreColours() {
            return hasMoreColours;
        }

        /**
         *
         * @param hasMoreColours
         * The HasMoreColours
         */
        public void setHasMoreColours(Boolean hasMoreColours) {
            this.hasMoreColours = hasMoreColours;
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
         * The productImageUrl
         */
        public List<String> getProductImageUrl() {
            return productImageUrl;
        }

        /**
         *
         * @param productImageUrl
         * The ProductImageUrl
         */
        public void setProductImageUrl(List<String> productImageUrl) {
            this.productImageUrl = productImageUrl;
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


        public class Facet {

            @SerializedName("FacetValues")
            @Expose
            private List<FacetValue> facetValues = new ArrayList<FacetValue>();
            @SerializedName("Id")
            @Expose
            private String id;
            @SerializedName("Name")
            @Expose
            private String name;
            @SerializedName("Sequence")
            @Expose
            private Integer sequence;

            /**
             * @return The facetValues
             */
            public List<FacetValue> getFacetValues() {
                return facetValues;
            }

            /**
             * @param facetValues The FacetValues
             */
            public void setFacetValues(List<FacetValue> facetValues) {
                this.facetValues = facetValues;
            }

            /**
             * @return The id
             */
            public String getId() {
                return id;
            }

            /**
             * @param id The Id
             */
            public void setId(String id) {
                this.id = id;
            }

            /**
             * @return The name
             */
            public String getName() {
                return name;
            }

            /**
             * @param name The Name
             */
            public void setName(String name) {
                this.name = name;
            }

            /**
             * @return The sequence
             */
            public Integer getSequence() {
                return sequence;
            }

            /**
             * @param sequence The Sequence
             */
            public void setSequence(Integer sequence) {
                this.sequence = sequence;
            }

            public class FacetValue {

                @SerializedName("Count")
                @Expose
                private Integer count;
                @SerializedName("Id")
                @Expose
                private String id;
                @SerializedName("Name")
                @Expose
                private String name;

                /**
                 * @return The count
                 */
                public Integer getCount() {
                    return count;
                }

                /**
                 * @param count The Count
                 */
                public void setCount(Integer count) {
                    this.count = count;
                }

                /**
                 * @return The id
                 */
                public String getId() {
                    return id;
                }

                /**
                 * @param id The Id
                 */
                public void setId(String id) {
                    this.id = id;
                }

                /**
                 * @return The name
                 */
                public String getName() {
                    return name;
                }

                /**
                 * @param name The Name
                 */
                public void setName(String name) {
                    this.name = name;
                }

            }


        }
    }
}