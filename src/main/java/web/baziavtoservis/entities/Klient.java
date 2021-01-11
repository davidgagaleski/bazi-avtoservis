package web.baziavtoservis.entities;

import com.sun.istack.NotNull;

public class Klient extends Chovek {

    private String telefon;

    public Klient(String EMBG, String ime, String prezime, String telefon) {
        super(EMBG, ime, prezime);
        this.telefon = telefon;
    }

    public Klient(String telefon) {
        this.telefon = telefon;
    }

    public String getTelefon() {
        return telefon;
    }

    public void setTelefon(String telefon) {
        this.telefon = telefon;
    }
}
