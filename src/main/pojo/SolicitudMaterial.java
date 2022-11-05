package main.pojo;

import java.util.ArrayList;

public class SolicitudMaterial {

    private String solicitante;
    private String idSolicitante;
    private String id;
    private String fecha;

    private ArrayList<Item> items = new ArrayList<Item>();
    private String estatus;

    public SolicitudMaterial() {

    }

    public SolicitudMaterial(String solicitante, String idSolicitante, String id, String fecha, ArrayList<Item> items, String estatus) {
        this.solicitante = solicitante;
        this.idSolicitante = idSolicitante;
        this.id = id;
        this.fecha = fecha;
        this.items = items;
        this.estatus = estatus;
    }

    public String getSolicitante() {
        return solicitante;
    }

    public void setSolicitante(String solicitante) {
        this.solicitante = solicitante;
    }

    public String getIdSolicitante() {
        return idSolicitante;
    }

    public void setIdSolicitante(String idSolicitante) {
        this.idSolicitante = idSolicitante;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public ArrayList<Item> getItems() {
        return items;
    }

    public void setItems(ArrayList<Item> items) {
        this.items = items;
    }

    public String getEstatus() {
        return estatus;
    }

    public void setEstatus(String estatus) {
        this.estatus = estatus;
    }

    @Override
    public String toString() {
        return "SolicitudMaterial{" +
                "solicitante='" + solicitante + '\'' +
                ", idSolicitante='" + idSolicitante + '\'' +
                ", id='" + id + '\'' +
                ", fecha=" + fecha +
                ", items=" + items +
                ", estatus='" + estatus + '\'' +
                '}';
    }
}
