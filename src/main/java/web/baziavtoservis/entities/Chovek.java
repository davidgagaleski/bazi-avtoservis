package web.baziavtoservis.entities;

import com.sun.istack.NotNull;

import javax.persistence.*;


@Entity
@Table(name = "chovek")
public class Chovek {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @NotNull
    @Column(name = "embg")
    @OneToOne(mappedBy = "avtomehanicar_embg")
    private String embg;

    @NotNull
    @Column(name = "ime")
    private String ime;

    @NotNull
    @Column(name = "prezime")
    private String prezime;


    public String getEmbg() {
        return embg;
    }

    public void setEmbg(String embg) {
        this.embg = embg;
    }

    public String getIme() {
        return ime;
    }

    public void setIme(String ime) {
        this.ime = ime;
    }

    public String getPrezime() {
        return prezime;
    }

    public void setPrezime(String prezime) {
        this.prezime = prezime;
    }
}