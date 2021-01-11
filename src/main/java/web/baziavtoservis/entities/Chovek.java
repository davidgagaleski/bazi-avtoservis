package web.baziavtoservis.entities;

import com.sun.istack.NotNull;
import javax.persistence.*;


@Entity
public class Chovek {

    @Id
    @NotNull
    private String EMBG;

    @NotNull
    private String Ime;

    @NotNull
    private String Prezime;


    public Chovek(String EMBG, String ime, String prezime) {
        this.EMBG = EMBG;
        Ime = ime;
        Prezime = prezime;
    }

    public Chovek(){

    }

    public String getEMBG() {
        return EMBG;
    }

    public void setEMBG(String EMBG) {
        this.EMBG = EMBG;
    }

    public String getIme() {
        return Ime;
    }

    public void setIme(String ime) {
        Ime = ime;
    }

    public String getPrezime() {
        return Prezime;
    }

    public void setPrezime(String prezime) {
        Prezime = prezime;
    }
}
