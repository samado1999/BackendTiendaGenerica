package co.edu.unbosque.lagenericiclo4.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "proveedores")
public class Proveedor {

    @Id
    private String id;
    private String supplierNit;
    private String supplierCity;
    private String supplierAddress;
    private String supplierName;
    private String supplierPhone;

    public Proveedor() {
    }

    public Proveedor(String supplierNit, String supplierCity, String supplierAddress, String supplierName,String supplierPhone) {
        this.supplierNit = supplierNit;
        this.supplierCity = supplierCity;
        this.supplierAddress = supplierAddress;
        this.supplierName = supplierName;
        this.supplierPhone = supplierPhone;
    }

    public String getSupplierNit() {
        return supplierNit;
    }

    public void setSupplierNit(String supplierNit) {
        this.supplierNit = supplierNit;
    }

    public String getSupplierCity() {
        return supplierCity;
    }

    public void setSupplierCity(String supplierCity) {
        this.supplierCity = supplierCity;
    }

    public String getSupplierAddress() {
        return supplierAddress;
    }

    public void setSupplierAddress(String supplierAddress) {
        this.supplierAddress = supplierAddress;
    }

    public String getSupplierName() {
        return supplierName;
    }

    public void setSupplierName(String supplierName) {
        this.supplierName = supplierName;
    }

    public String getSupplierPhone() {
        return supplierPhone;
    }

    public void setSupplierPhone(String supplierPhone) {
        this.supplierPhone = supplierPhone;
    }

    @Override
    public String toString() {
        return "Proveedor{" + "supplierNit='" + supplierNit + '\'' + ", supplierCity='" + supplierCity + '\''
                + ", supplierAddress='" + supplierAddress + '\'' + ", supplierName='" + supplierName + '\''
                + ", supplierPhone='" + supplierPhone + '\'' + '}';
    }

}
