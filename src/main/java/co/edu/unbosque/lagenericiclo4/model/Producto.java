package co.edu.unbosque.lagenericiclo4.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "productos")
public class Producto {

    @Id
    private String productCode;
    private Double iva;
    private String supplierNit;
    private String productName;
    private Double buyPrice;
    private Double sellPrice;

    public Producto() {
    }

    public Producto(String productCode, Double iva, String supplierNit, String productName, Double buyPrice,
            Double sellPrice) {
        this.productCode = productCode;
        this.iva = iva;
        this.supplierNit = supplierNit;
        this.productName = productName;
        this.buyPrice = buyPrice;
        this.sellPrice = sellPrice;
    }

    public String getProductCode() {
        return productCode;
    }

    public void setProductCode(String productCode) {
        this.productCode = productCode;
    }

    public Double getIva() {
        return iva;
    }

    public void setIva(Double iva) {
        this.iva = iva;
    }

    public String getsupplierNit() {
        return supplierNit;
    }

    public void setsupplierNit(String supplierNit) {
        this.supplierNit = supplierNit;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public Double getBuyPrice() {
        return buyPrice;
    }

    public void setBuyPrice(Double buyPrice) {
        this.buyPrice = buyPrice;
    }

    public Double getSellPrice() {
        return sellPrice;
    }

    public void setSellPrice(Double sellPrice) {
        this.sellPrice = sellPrice;
    }

    @Override
    public String toString() {
        return "Producto{" + "productCode='" + productCode + '\'' + ", iva='" + iva + '\'' + ", supplierNit='"
                + supplierNit + '\'' + ", productName='" + productName + '\'' + ", buyPrice='" + buyPrice + '\''
                + ", sellPrice='" + sellPrice + '\'' + '}';
    }

}