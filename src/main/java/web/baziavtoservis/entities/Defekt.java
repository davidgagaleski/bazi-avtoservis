package web.baziavtoservis.entities;

import com.sun.istack.NotNull;

import javax.persistence.*;

@Entity
@Table(name = "defekt")
public class Defekt {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @NotNull
    @Column(name = "id_defekt")
    @ManyToOne
    @JoinColumn(name = "defekt_avtomeh_embg")
    @OneToOne
    @JoinColumn(name = "id_defekt_id")
    private String id_defekt;

    @Column(name = "opis")
    private String opis;

    @Column(name = "id_avtomobil_defekt")
    @OneToMany
    @JoinColumn(name = "id_avtomobil")
    private String defekt_avto_id;

    @Column(name = "popraven")
    private boolean popraven;

    public String getId_defekt() {
        return id_defekt;
    }

    public void setId_defekt(String id_defekt) {
        this.id_defekt = id_defekt;
    }

    public String getOpis() {
        return opis;
    }

    public void setOpis(String opis) {
        this.opis = opis;
    }

    public String getDefekt_avto_id() {
        return defekt_avto_id;
    }

    public void setDefekt_avto_id(String defekt_avto_id) {
        this.defekt_avto_id = defekt_avto_id;
    }

    public boolean isPopraven() {
        return popraven;
    }

    public void setPopraven(boolean popraven) {
        this.popraven = popraven;
    }
}