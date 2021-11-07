package co.edu.unbosque.lagenericiclo4.model;

import java.util.List;

import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "Ventas")
public class Venta {
    private String clientId;
    private String sellId;
    private List<DetalleVenta> sellsDetail;
    private double sellIva;
    private double sellTotal;
    private double sellSubtotal;

    public Venta() {
        this.clientId = "";
        this.sellId = "";
        this.sellsDetail = null;
        this.sellIva = 0.0;
        this.sellTotal = 0.0;
        this.sellSubtotal = 0.0;
    }

    public Venta(String clientId, String sellId, List<DetalleVenta> sellsDetail, double sellIva, double sellTotal,
            double sellSubtotal) {
        this.clientId = clientId;
        this.sellId = sellId;
        this.sellsDetail = sellsDetail;
        this.sellIva = sellIva;
        this.sellTotal = sellTotal;
        this.sellSubtotal = sellSubtotal;
    }

    public String getClientId() {
        return clientId;
    }

    public void setClientId(String clientId) {
        this.clientId = clientId;
    }

    public String getSellId() {
        return sellId;
    }

    public void setSellId(String sellId) {
        this.sellId = sellId;
    }

    public List<DetalleVenta> getSellsDetail() {
        return sellsDetail;
    }

    public void setSellsDetail(List<DetalleVenta> sellsDetail) {
        this.sellsDetail = sellsDetail;
    }

    public double getSellIva() {
        return sellIva;
    }

    public void setSellIva(double sellIva) {
        this.sellIva = sellIva;
    }

    public double getSellTotal() {
        return sellTotal;
    }

    public void setSellTotal(double sellTotal) {
        this.sellTotal = sellTotal;
    }

    public double getSellSubtotal() {
        return sellSubtotal;
    }

    public void setSellSubtotal(double sellSubtotal) {
        this.sellSubtotal = sellSubtotal;
    }

    @Override
    public String toString() {
        return "Venta [clientId=" + clientId + ", sellId=" + sellId + ", sellsDetail=" + sellsDetail + ", sellIva="
                + sellIva + ", sellTotal=" + sellTotal + ", sellSubtotal=" + sellSubtotal + "]";
    }

}