package co.edu.unbosque.lagenericiclo4.model;

import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "consolidados")
public class Consolidado {
    private String id;
    private String city;
    private String totalSales;

    public Consolidado() {
        this.id = "";
        this.city = "";
        this.totalSales = "";
    }

    public Consolidado(String id, String city, String totalSales) {
        this.id = id;
        this.city = city;
        this.totalSales = totalSales;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getTotalSales() {
        return totalSales;
    }

    public void setTotalSales(String totalSales) {
        this.totalSales = totalSales;
    }

    @Override
    public String toString() {
        return "Consolidado{" + "id='" + id + '\'' + ", city='" + city + '\'' + ", totalSales='" + totalSales + '\''
                + '}';
    }
}