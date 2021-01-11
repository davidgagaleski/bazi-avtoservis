package web.baziavtoservis.entities;

import com.sun.istack.NotNull;

import javax.persistence.*;
import java.sql.Date;

@Entity
@Table(name = "poprava")
public class Poprava {

    @Id
    @NotNull
    @Column(name = "embg")
    @OneToMany(mappedBy = "avtomehanicar_embg")
    private String defekt_avtomeh_embg;

    @Id
    @NotNull
    @Column(name = "defekt")
    @OneToMany(mappedBy = "id_defekt")
    private String defekt;

    @Column(name = "datum_servis")
    private Date date;

    public String getDefekt_avtomeh_embg() {
        return defekt_avtomeh_embg;
    }

    public void setDefekt_avtomeh_embg(String defekt_avtomeh_embg) {
        this.defekt_avtomeh_embg = defekt_avtomeh_embg;
    }

    public String getDefekt() {
        return defekt;
    }

    public void setDefekt(String defekt) {
        this.defekt = defekt;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
}
