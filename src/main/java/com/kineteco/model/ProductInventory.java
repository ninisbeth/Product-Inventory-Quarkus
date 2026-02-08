package com.kineteco.model;

import java.math.BigDecimal;

public class ProductInventory {
    private String sku;
    private String name;
    private String category;
    private int quantity;
    private int powerWatts;
    private float footprint;
    private BigDecimal manufacturingCost;
    private BigDecimal price;
    private ProductLine productLine;
    private ConsumerType[] targetConsumer;
    private ProductAvailability productAvailability;
    private int unitsAvailable;

    public String getSku() {
        return sku;
    }

    public void setSku(String sku) {
        this.sku = sku;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public int getPowerWatts() {
        return powerWatts;
    }

    public void setPowerWatts(int powerWatts) {
        this.powerWatts = powerWatts;
    }

    public float getFootprint() {
        return footprint;
    }

    public void setFootprint(float footprint) {
        this.footprint = footprint;
    }

    public BigDecimal getManufacturingCost() {
        return manufacturingCost;
    }

    public void setManufacturingCost(BigDecimal manufacturingCost) {
        this.manufacturingCost = manufacturingCost;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public ProductLine getProductLine() {
        return productLine;
    }

    public void setProductLine(ProductLine productLine) {
        this.productLine = productLine;
    }

    public ConsumerType[] getTargetConsumer() {
        return targetConsumer;
    }

    public void setTargetConsumer(ConsumerType[] targetConsumer) {
        this.targetConsumer = targetConsumer;
    }

    public ProductAvailability getProductAvailability() {
        return productAvailability;
    }

    public void setProductAvailability(ProductAvailability productAvailability) {
        this.productAvailability = productAvailability;
    }

    public int getUnitsAvailable() {
        return unitsAvailable;
    }

    public void setUnitsAvailable(int unitsAvailable) {
        this.unitsAvailable = unitsAvailable;
    }
}
