package co.edu.unbosque.lagenericiclo4.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "clientes")
public class Cliente {

    @Id
    private String clientId;
    private String clientAddress;
    private String clientEmail;
    private String clientName;
    private String clientPhone;

    public Cliente() {
        this.clientId = "";
        this.clientAddress = "";
        this.clientEmail = "";
        this.clientName = "";
        this.clientPhone = "";
    }

    public Cliente(String clientId, String clientAddress, String clientEmail, String clientName, String clientPhone) {
        this.clientId = clientId;
        this.clientAddress = clientAddress;
        this.clientEmail = clientEmail;
        this.clientName = clientName;
        this.clientPhone = clientPhone;
    }

    public String getClientId() {
        return clientId;
    }

    public void setClientId(String clientId) {
        this.clientId = clientId;
    }

    public String getClientAddress() {
        return clientAddress;
    }

    public void setClientAddress(String clientAddress) {
        this.clientAddress = clientAddress;
    }

    public String getClientEmail() {
        return clientEmail;
    }

    public void setClientEmail(String clientEmail) {
        this.clientEmail = clientEmail;
    }

    public String getClientName() {
        return clientName;
    }

    public void setClientName(String clientName) {
        this.clientName = clientName;
    }

    public String getClientPhone() {
        return clientPhone;
    }

    public void setClientPhone(String clientPhone) {
        this.clientPhone = clientPhone;
    }

    @Override
    public String toString() {
        return "Cliente{" + "clientId='" + clientId + '\'' + ", clientAddress='" + clientAddress + '\''
                + ", clientEmail='" + clientEmail + '\'' + ", clientName='" + clientName + '\'' + ", clientPhone='"
                + clientPhone + '\'' + '}';
    }
}