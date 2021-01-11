package web.baziavtoservis.entities;

import javax.persistence.Id;

public class Avtomobil {

    @Id
    private String id_avtomobil;

    private String marka;
    private String model;
    private String EMBGKlient;

    public Avtomobil(String id_avtomobil, String marka, String model, String EMBGKlient) {
        this.id_avtomobil = id_avtomobil;
        this.marka = marka;
        this.model = model;
        this.EMBGKlient = EMBGKlient;
    }

    public String getId_avtomobil() {
        return id_avtomobil;
    }

    public void setId_avtomobil(String id_avtomobil) {
        this.id_avtomobil = id_avtomobil;
    }

    public String getMarka() {
        return marka;
    }

    public void setMarka(String marka) {
        this.marka = marka;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getEMBGKlient() {
        return EMBGKlient;
    }

    public void setEMBGKlient(String EMBGKlient) {
        this.EMBGKlient = EMBGKlient;
    }
}
