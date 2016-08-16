package com.ecommerce.model;

import org.springframework.web.multipart.MultipartFile;

import javax.persistence.*;

/**
 * Created by reloaded on 11.7.2016.
 */
@Entity
@Table(name="Product")
public class Product {
    // when we annotate this class as entity, this java class is stored in the database
    // when spring is running, automaticaly database table is generated

    @Id // primary key of the table, unique value
    @Column(name = "productId")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    //when we create a new instance, product id will be generated automatically with a sequence
    private int productId;
    private String productName;
    private String productCategory;
    private String productDescription;
    private double productPrice;
    private String productCondition;
    private String productStatus;
    private int unitInStock;
    private String productManufacturer;

    @Transient  // the file wont be persistent, will be stored under resource folder
    private MultipartFile productImage;

    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getProductCategory() {
        return productCategory;
    }

    public void setProductCategory(String productCategory) {
        this.productCategory = productCategory;
    }

    public String getProductDescription() {
        return productDescription;
    }

    public void setProductDescription(String productDescription) {
        this.productDescription = productDescription;
    }

    public double getProductPrice() {
        return productPrice;
    }

    public void setProductPrice(double productPrice) {
        this.productPrice = productPrice;
    }

    public String getProductCondition() {
        return productCondition;
    }

    public void setProductCondition(String productCondition) {
        this.productCondition = productCondition;
    }

    public String getProductStatus() {
        return productStatus;
    }

    public void setProductStatus(String productStatus) {
        this.productStatus = productStatus;
    }

    public int getUnitInStock() {
        return unitInStock;
    }

    public void setUnitInStock(int unitInStock) {
        this.unitInStock = unitInStock;
    }

    public String getProductManufacturer() {
        return productManufacturer;
    }

    public void setProductManufacturer(String productManufacturer) {
        this.productManufacturer = productManufacturer;
    }

    public MultipartFile getProductImage() {
        return productImage;
    }

    public void setProductImage(MultipartFile productImage) {
        this.productImage = productImage;
    }

    @Override
    public String toString(){
        return "id="+productId+", name="+productName+", category="+productCategory+", description="+productDescription
        +", price="+productPrice+", condition="+productCondition+", status="+productStatus+", units="+unitInStock+", manufacturer="+productManufacturer;
    }
}
