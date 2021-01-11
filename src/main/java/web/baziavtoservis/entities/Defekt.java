package web.baziavtoservis.entities;

import javax.persistence.Id;

public class Defekt {
    private String opis;

    @Id
    private String id_defekt;

    private String id_avtomobil;
    private boolean popraven;

    public Defekt(String opis, String id_defekt, String id_avtomobil) {
        this.opis = opis;
        this.id_defekt = id_defekt;
        this.id_avtomobil = id_avtomobil;
        this.popraven = false;
    }

    public String getOpis() {
        return opis;
    }

    public void setOpis(String opis) {
        this.opis = opis;
    }

    public String getId_defekt() {
        return id_defekt;
    }

    public void setId_defekt(String id_defekt) {
        this.id_defekt = id_defekt;
    }

    public String getId_avtomobil() {
        return id_avtomobil;
    }

    public void setId_avtomobil(String id_avtomobil) {
        this.id_avtomobil = id_avtomobil;
    }

    public boolean isPopraven() {
        return popraven;
    }

    public void setPopraven(boolean popraven) {
        this.popraven = popraven;
    }
}