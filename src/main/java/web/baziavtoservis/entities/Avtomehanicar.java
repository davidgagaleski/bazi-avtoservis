package web.baziavtoservis.entities;

import com.sun.istack.NotNull;

import java.util.Date;

public class Avtomehanicar extends Chovek {

    @NotNull
    private Date datum_vrabotuvanje;

    @NotNull
    private int id_dogovor;

    public Avtomehanicar(String EMBG, String ime, String prezime, Date datum_vrabotuvanje, int id_dogovor) {
        super(EMBG, ime, prezime);
        this.datum_vrabotuvanje = datum_vrabotuvanje;
        this.id_dogovor = id_dogovor;
    }

    public Avtomehanicar(Date datum_vrabotuvanje, int id_dogovor) {
        this.datum_vrabotuvanje = datum_vrabotuvanje;
        this.id_dogovor = id_dogovor;
    }

    public Date getDatum_vrabotuvanje() {
        return datum_vrabotuvanje;
    }

    public void setDatum_vrabotuvanje(Date datum_vrabotuvanje) {
        this.datum_vrabotuvanje = datum_vrabotuvanje;
    }

    public int getId_dogovor() {
        return id_dogovor;
    }

    public void setId_dogovor(int id_dogovor) {
        this.id_dogovor = id_dogovor;
    }
}
