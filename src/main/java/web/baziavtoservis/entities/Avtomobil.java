package web.baziavtoservis.entities;

import javax.persistence.*;

@Entity
@Table(name = "avtomobil")
public class Avtomobil {

    @Id
    @Column(name = "id_avtomobil")
    @OneToMany(mappedBy = "defekt_avto_id")
    private String id_avtomobil;

    @Column(name = "marka")
    private String marka;

    @Column(name = "model")
    private String model;

    @Column(name = "embg_klient")
    @ManyToOne
    @JoinColumn(name = "embg_klient")
    private String avtomobil_embg;

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

    public String getAvtomobil_embg() {
        return avtomobil_embg;
    }

    public void setAvtomobil_embg(String avtomobil_embg) {
        this.avtomobil_embg = avtomobil_embg;
    }
}
