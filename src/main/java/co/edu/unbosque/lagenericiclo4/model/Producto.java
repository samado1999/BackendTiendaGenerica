package co.edu.unbosque.lagenericiclo4.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "productos")
public class Producto {

	@Id
	private String productCode;
	private String productName;
	private String supplierNit;
	private Double buyPrice;
	private Double iva;
	private Double sellPrice;

	public Producto() {
	}

	public Producto(String productCode, String productName, String supplierNit, Double buyPrice, Double iva,
			Double sellPrice) {
		this.productCode = productCode;
		this.productName = productName;
		this.supplierNit = supplierNit;
		this.buyPrice = buyPrice;
		this.iva = iva;
		this.sellPrice = sellPrice;
	}

	public String getProductCode() {
		return productCode;
	}

	public void setProductCode(String productCode) {
		this.productCode = productCode;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public String getSupplierNit() {
		return supplierNit;
	}

	public void setSupplierNit(String supplierNit) {
		this.supplierNit = supplierNit;
	}

	public Double getBuyPrice() {
		return buyPrice;
	}

	public void setBuyPrice(Double buyPrice) {
		this.buyPrice = buyPrice;
	}

	public Double getIva() {
		return iva;
	}

	public void setIva(Double iva) {
		this.iva = iva;
	}

	public Double getSellPrice() {
		return sellPrice;
	}

	public void setSellPrice(Double sellPrice) {
		this.sellPrice = sellPrice;
	}

	@Override
	public String toString() {
		return "Producto [productCode=" + productCode + ", productName=" + productName + ", supplierNit=" + supplierNit
				+ ", buyPrice=" + buyPrice + ", iva=" + iva + ", sellPrice=" + sellPrice + "]";
	}

}