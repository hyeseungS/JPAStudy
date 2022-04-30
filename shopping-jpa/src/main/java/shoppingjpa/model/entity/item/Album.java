package shoppingjpa.model.entity.item;


import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("A")
public class Album extends Item {
    private String artist;
    private String etc;

    // Getter, Setter
    public String getArtist() {
        return artist;
    }

    public String getEtc() {
        return etc;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public void setEtc(String etc) {
        this.etc = etc;
    }
}
