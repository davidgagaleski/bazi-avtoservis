package web.baziavtoservis.entities;

import com.sun.istack.NotNull;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Entity
@Table(name = "avtomehanicar")
public class Avtomehanicar {

    @Id
    @NotNull
    @Column(name = "embg_avtomehanicar")
//    @OneToOne(cascade = CascadeType.ALL)
//    @JoinColumn(name = "fk_avtomehanicar")
//    @ManyToOne
//    @JoinColumn(name = "defekt_avtomeh_embg")
    private String avtomehanicar_embg;

    @ManyToMany
    private List<Defekt> defekti;

    @Column(name = "datum_vrabotuvanje")
    @NotNull
    private Date datum_vrabotuvanje;

    @Column(name = "id_dogovor")
    @NotNull
    private int id_dogovor;

    public String getAvtomehanicar_embg() {
        return avtomehanicar_embg;
    }

    public void setAvtomehanicar_embg(String avtomehanicar_embg) {
        this.avtomehanicar_embg = avtomehanicar_embg;
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