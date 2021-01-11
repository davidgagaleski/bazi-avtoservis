package web.baziavtoservis.entities;

import com.sun.istack.NotNull;

import javax.persistence.*;

@Entity
@Table(name = "potreben_del")
public class PotrebenDel {

    @Id
    @NotNull
    @Column(name = "id_defekt")
    @OneToOne(mappedBy = "id_defekt")
    private String id_defekt_id;

    @Id
    @NotNull
    @Column(name = "potreben_del")
    private String potreben_del;

    public String getId_defekt_id() {
        return id_defekt_id;
    }

    public void setId_defekt_id(String id_defekt_id) {
        this.id_defekt_id = id_defekt_id;
    }

    public String getPotreben_del() {
        return potreben_del;
    }

    public void setPotreben_del(String potreben_del) {
        this.potreben_del = potreben_del;
    }
}
