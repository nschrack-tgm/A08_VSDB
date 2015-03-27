package iKnown.model;


import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import java.util.List;

@Entity
public class Beitrag {

    @Id
    private String titel;

    private String inhalt;

    @ManyToMany(mappedBy = "beitraege")
    private List<Tag> tags;


    public Beitrag(String titel) {
        this.titel = titel;
    }

    public Beitrag() {
    }

    public String getTitel() {
        return titel;
    }

    public void setTitel(String titel) {
        this.titel = titel;
    }

    public String getInhalt() {
        return inhalt;
    }

    public void setInhalt(String inhalt) {
        this.inhalt = inhalt;
    }
}
