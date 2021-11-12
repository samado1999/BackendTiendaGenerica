package co.edu.unbosque.lagenericiclo4.model;

import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "DetalleVentas")
public class DetalleVenta {
    private Integer productQuantity;
    private String sellId;
    private String productCode;
    private Double totalSale;
    private Double totalCost;
    private Double totalIva;

    public DetalleVenta() {
        this.productQuantity = 0;
        this.productCode = "";
        this.totalSale = 0.0;
        this.totalCost = 0.0;
        this.totalIva = 0.0;
    }

    public DetalleVenta(Integer productQuantity, String productCode, Double totalSale, Double totalCost,
            Double totalIva) {
        this.productQuantity = productQuantity;
        this.productCode = productCode;
        this.totalSale = totalSale;
        this.totalCost = totalCost;
        this.totalIva = totalIva;
    }

    public Integer getProductQuantity() {
        return productQuantity;
    }

    public void setProductQuantity(Integer productQuantity) {
        this.productQuantity = productQuantity;
    }

    public String getSellId() {
        return sellId;
    }

    public void setSellId(String sellId) {
        this.sellId = sellId;
    }

    public String getProductCode() {
        return productCode;
    }

    public void setProductCode(String productCode) {
        this.productCode = productCode;
    }

    public Double getTotalSale() {
        return totalSale;
    }

    public void setTotalSale(Double totalSale) {
        this.totalSale = totalSale;
    }

    public Double getTotalCost() {
        return totalCost;
    }

    public void setTotalCost(Double totalCost) {
        this.totalCost = totalCost;
    }

    public Double getTotalIva() {
        return totalIva;
    }

    public void setTotalIva(Double totalIva) {
        this.totalIva = totalIva;
    }

    @Override
    public String toString() {
        return "DetalleVenta [productQuantity=" + productQuantity + ", sellId=" + sellId + ", productCode="
                + productCode + ", totalSale=" + totalSale + ", totalCost=" + totalCost + ", totalIva=" + totalIva
                + "]";
    }
}