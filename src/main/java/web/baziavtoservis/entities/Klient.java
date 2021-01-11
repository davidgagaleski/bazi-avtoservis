package web.baziavtoservis.entities;


import com.sun.istack.NotNull;

import javax.persistence.*;

@Entity
@Table(name = "klient")
public class Klient {

    @Id
    @NotNull
    @Column(name = "embg_klient")
    @OneToMany(mappedBy = "avtomobil_embg")
    private String embg_klient;

    public String getEmbg_klient() {
        return embg_klient;
    }

    public void setEmbg_klient(String embg_klient) {
        this.embg_klient = embg_klient;
    }


}
