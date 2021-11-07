package co.edu.unbosque.lagenericiclo4.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "productos")
public class Producto {

    @Id
    private String id;
    private String productCode;
    private String productName;
    private String supplierNit;
    private String buyPrice;
    private String iva;
    private String sellPrice;

    public Producto() {
    }

    public Producto(String productCode,String productName,String supplierNit,String buyPrice,String iva,String sellPrice) {
        this.productCode = productCode;
        this.productName = productName;
        this.supplierNit = supplierNit;
        this.buyPrice = buyPrice;
        this.iva = iva;
        this.sellPrice = sellPrice;
    }

    public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
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

	public String getBuyPrice() {
		return buyPrice;
	}

	public void setBuyPrice(String buyPrice) {
		this.buyPrice = buyPrice;
	}

	public String getIva() {
		return iva;
	}

	public void setIva(String iva) {
		this.iva = iva;
	}

	public String getSellPrice() {
		return sellPrice;
	}

	public void setSellPrice(String sellPrice) {
		this.sellPrice = sellPrice;
	}

	@Override
	public String toString() {
		return "Producto [id=" + id + ", productCode=" + productCode + ", productName=" + productName + ", supplierNit="
				+ supplierNit + ", buyPrice=" + buyPrice + ", iva=" + iva + ", sellPrice=" + sellPrice + "]";
	}
	
}